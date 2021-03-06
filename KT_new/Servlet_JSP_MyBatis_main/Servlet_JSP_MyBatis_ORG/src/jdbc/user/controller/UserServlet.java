package jdbc.user.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.user.dao.UserDAOMyBatis;
import jdbc.user.vo.UserVO;

/**
 * Servlet implementation class UserServlet
 */
//@WebServlet("/controller")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDAOMyBatis dao;   
    
    public UserServlet() {
        super();
    }
    
    @Override
    public void init() throws ServletException {
    	System.out.println("UserServlet Init()");
    	dao = new UserDAOMyBatis();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("UserServlet doGet() " + request.getMethod());
    	
		//response(응답) 데이터에 대한 content type 설정 , 한글인코딩
		//response.setContentType("text/html;charset=utf-8");
		//클라이언트에게 전달할 html를 담아 줄 수 있는 스트림 생성
//		PrintWriter out = response.getWriter();
//		out.println("<h1>Hello 서블릿</h1>");
//		Date date = new Date();
//		out.println("<h3>현재시간은 " + date + "</h3>");
//		out.close();
    	
    	//Request(요청) 데이터 인코딩
    	request.setCharacterEncoding("UTF-8");
    	
    	//1. Query String 추출
    	String cmd = request.getParameter("cmd");
    	String jspPageName = "";
    	if (cmd.equals("userList")) {
    		jspPageName = userList(request, response);
    	}else if (cmd.equals("userDetail")) {
    		jspPageName = userDetail(request, response);
    	}else if (cmd.equals("userInsertForm")) {
    		jspPageName = "/userInsert.jsp";
    	}else if (cmd.equals("userInsert")) {
    		jspPageName = userInsert(request, response);
    	}
    	
    	//3. RequestDispatcher의 forward() 메서들 호출해서 userList.jsp로 포워딩한다.
    	RequestDispatcher rd = request.getRequestDispatcher(jspPageName);
    	rd.forward(request, response);
	}

	private String userInsert(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1. form data 추출해서 UserVO 저장
		UserVO user = new UserVO(
				request.getParameter("userid"), 
				request.getParameter("name"), 
				request.getParameter("gender"), 
				request.getParameter("city"));
		//2. UserDAO 의 호출
		int cnt = dao.insertUser(user);
		
		if (cnt == 1) {
			return userList(request, response);
		}else {
			return "";
		}
	}
	
	private String userDetail(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1. Query String 추출
		String userid = request.getParameter("userid");
		//1. DAO의 메서드 호출
    	UserVO user = dao.getUser(userid);
    	//2. List객체를 Request 객체에 저장한다.
    	request.setAttribute("userOne", user);
    	
    	return "/userDetail.jsp";
	}

	private String userList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1. DAO의 메서드 호출
    	List<UserVO> users = dao.getUsers();
    	//2. List객체를 Request 객체에 저장한다.
    	request.setAttribute("users", users);
    	
    	return "/userList.jsp";
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("UserServlet doPost() " + request.getMethod());
		doGet(request, response);
	}

}
