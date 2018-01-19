package syb.lq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import syb.lq.model.UserInfo;

@Mapper
public interface UserDao {

	@Select("select id as id ,"
			+ "name as name ,"
			+ "sex as sex ,"
			+ "age as age ,"
			+ "bir as bir from userinfo limit #{start},#{pageSize}")
	List<UserInfo> selectuserBoot(@Param("start")Integer start, @Param("pageSize")Integer pageSize);

	@Select("select id as id ,"
			+ "name as name ,"
			+ "sex as sex ,"
			+ "age as age ,"
			+ "bir as bir from userinfo where id = #{id}")
	UserInfo selectByIdBoot(@Param("id")Integer id);

	
	@Update(" update userinfo set "
			+ " name = #{name},"
			+ " age = #{age},"
			+ " sex = #{sex},"
			+ " bir = #{bir} where id = #{id}")
	void updInfoboot(UserInfo userInfo);

}
