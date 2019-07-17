package test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mapper.UserinfoMapper;
import pojo.User;

/**
*  @类名 TestUser.java
*  @作者 SHENG
*  @日期 2019年7月3日-下午7:00:03
*  @描述 
*/
public class TestUser {

	public static void main(String[] args) throws Exception {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession(true);
		UserinfoMapper um = session.getMapper(UserinfoMapper.class);
		
		System.out.println(um.insert(new User("张三","111")));
		System.out.println(um.insert(new User("李四","333")));
		System.out.println(um.insert(new User("王五","333")));
		
		System.out.println(um.deleteById(3));
		
		System.out.println(um.updateById(new User(2,"路人","444")));
		
		System.out.println(um.selectById(1));

	}

}
