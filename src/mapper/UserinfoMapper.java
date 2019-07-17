package mapper;

import org.apache.ibatis.annotations.*;

import pojo.User;

/**
*  @类名 Userinfo.java
*  @作者 SHENG
*  @日期 2019年7月3日-下午6:47:56
*  @描述 
*/
public interface UserinfoMapper {
	
	@Insert("insert into userinfo(uname,password) values (#{uname},#{password})")
	int insert(User user);
	
	@Delete("delete from userinfo where uid = #{uid}")
	int deleteById(int uid);
	
	@Update("update userinfo set uname=#{uname},password=#{password} where uid=#{uid}")
	int updateById(User user);
	
	@Select("select * from userinfo where uid = #{uid}")
	User selectById(int uid);

}
