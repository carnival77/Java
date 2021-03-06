package movie.vo;

import java.sql.Timestamp;

public class MovieVO {
	private int id;
	private String title;
	private String genre;
	private String director;
	private int runningtime;
	private Timestamp opendate;

	public MovieVO(String title, String genre, String director, int runningtime) {
		super();
		this.title = title;
		this.genre = genre;
		this.director = director;
		this.runningtime = runningtime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MovieVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MovieVO [id=" + id + ", title=" + title + ", genre=" + genre + ", director=" + director
				+ ", runningtime=" + runningtime + ", opendate=" + opendate + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getRunningtime() {
		return runningtime;
	}

	public void setRunningtime(int runningtime) {
		this.runningtime = runningtime;
	}

	public Timestamp getOpendate() {
		return opendate;
	}

	public void setOpendate(Timestamp opendate) {
		this.opendate = opendate;
	}
}
