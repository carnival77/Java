package chap03.types.encapsulate;

public class MyDate {

	private int year = 2020;
	private int month = 1;
	private int day = 1;
	// public -> private : 이 클래스 외에는 변수값 변경 불가능.

//	default constructor
//	: 생성자 이름이 클래스와 반드시 같아야 한다.
//	    리턴 타입은 없다. ( void도 아님 )
//	  객체 생성되는 시점에 호출된다.
//	  역할 : 인스턴스 변수 초기화

	public MyDate() {
		System.out.println("기본 생성자 호출됨.");
		year = 2022;
		month = 12;
		day = 20;
	}

	// Constructor Overloading (생성자 중복 정의)
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
//		this.month = month;
//		this.day = day;
		setMonth(month);
		setDay(day);
	}
	// 생성자가 임의로 정의되어 있을 경우, 기본 생성자는 만들어지지 않는다.

	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		if (month >= 1 & month <= 12) {
			this.month = month;
		} else {
			System.out.println("Invalid Month Value");
		}
	}

	public void setDay(int day) {
		if (day >= 1 & day <= 31) {
			this.day = day;
		} else {
			System.out.println("Invalid Day Value");
		}
	}

}
