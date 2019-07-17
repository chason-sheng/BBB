package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mapper.EmpDeptMapper;
import mapper.UserinfoMapper;
import pojo.Dept;
import pojo.Emp;

/**
*  @类名 TestEmpDept.java
*  @作者 SHENG
*  @日期 2019年7月3日-下午7:29:08
*  @描述 
*/
public class TestEmpDept {

	public static void main(String[] args) throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession(true);
		EmpDeptMapper dem = session.getMapper(EmpDeptMapper.class);
		
		List<Dept> deptList = dem.selectDeptAndEmp();
		System.out.println(deptList);
		
		List<Emp> empList = dem.selectEmp();
		System.out.println(empList);

	}

}
