package pojo;
/**
*  @类名 User.java
*  @作者 SHENG
*  @日期 2019年7月3日-下午6:51:56
*  @描述 
*/
public class User {

	private int uid;
	private String uname;
	private String password;
	
	public User() {
		super();
	}
	public User(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}
	public User(int uid, String uname, String password) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
