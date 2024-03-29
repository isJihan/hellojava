package co.edu.vo;

public class MemberVO {
	private String id;
	private String passwd;
	private String name;
	private String email;
	private String responsibility;

	public MemberVO() {
		super();
	}

	public MemberVO(String id, String passwd, String name, String email, String responsibility) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.responsibility = responsibility;
	}

	public MemberVO(String id, String passwd, String name, String email) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
	}

	public MemberVO(String id, String passwd, String name) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
	}

	public MemberVO(String id, String passwd) {
		super();
		this.id = id;
		this.passwd = passwd;
	}

	public MemberVO(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", passwd=" + passwd + ", name=" + name + ", email=" + email + ", responsibility="
				+ responsibility + "]";
	}

}
