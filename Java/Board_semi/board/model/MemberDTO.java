package lim.board.model;

public class MemberDTO {
	private int num;
	private String id;
	private String passwd;
	private String name;
	private int age;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	private String email;

	@Override // 검증을 위해서 선언한다.
	public String toString() {
		return "MemberDTO [getNum()=" + getNum() + ", getId()=" + getId() + ", getPasswd()=" + getPasswd()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getEmail()=" + getEmail() + "]";
	}

}
