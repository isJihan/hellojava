package co.dev;

public class Student {
	private int studNo;
	private String studName;
	private int score;

	Student(int studNo, String studName, int score) {
		this.studNo = studNo;
		this.studName = studName;
		this.score = score;

	}

	public int getStudNo() {
		return studNo;
	}

	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
