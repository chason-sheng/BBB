package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pojo.Users;

/**
*  @类名 Test1.java
*  @作者 SHENG
*  @日期 2019年7月2日-下午7:40:58
*  @描述 
*/
public class Test1 {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream("mybatis.xml");
			
			SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
			SqlSession session = sf.openSession(true);
//			1）增加用户数据 
			Users user1 = new Users(1,"张三","111");
			Users user2 = new Users(2,"李四","222");
			Users user3 = new Users(3,"王五","333");
//			session.insert("test.insert",user1);
//			session.insert("test.insert",user2);
//			session.insert("test.insert",user3);
			List<Users> list = new ArrayList<>();
			list.add(user1);
			list.add(user2);
			list.add(user3);
			session.insert("test.insertList",list);
//			2）查询编号为2的用户信息
			Users selectOne = session.selectOne("test.selectById", 2);
			System.out.println(selectOne);
//			3）删除编号为2的用户
			int num = session.delete("test.deleteById",2);
			System.out.println(num);
//			4）查询“张”姓开头的用户
			List<Users> list2 = session.selectList("test.selectByName", "张");
			list2.forEach(System.out::println);
//			5）修改用户信息
			Users user4 = new Users(1,"王五","333");
			int num2 = session.update("test.update",user4);
			System.out.println(num2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
