package mapper;

import java.util.List;

import pojo.Dept;
import pojo.Emp;

/**
*  @类名 EmpDeptMapper.java
*  @作者 SHENG
*  @日期 2019年7月3日-下午7:18:43
*  @描述 
*/
public interface EmpDeptMapper {
	
	List<Dept> selectDeptAndEmp();
	
	List<Emp> selectEmp();

}
