package pojo;

import java.util.List;

/**
*  @类名 Dept.java
*  @作者 SHENG
*  @日期 2019年7月3日-下午7:14:46
*  @描述 
*/
public class Dept {
	private int deptno;
	private String dname;
	private String loc;
	private List<Emp> emps;
	
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", emps=" + emps + "]";
	}
	
	

}
