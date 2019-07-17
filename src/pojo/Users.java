package pojo;
/**
*  @类名 Users.java
*  @作者 SHENG
*  @日期 2019年7月2日-下午7:26:16
*  @描述 
*/
public class Users {
	private Integer id;
	private String name;
	private String pwd;
	
	public Users() {
		super();
	}
	public Users(Integer id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
	
}
