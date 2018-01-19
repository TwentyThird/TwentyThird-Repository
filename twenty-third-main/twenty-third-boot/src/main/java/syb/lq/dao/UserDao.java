package syb.lq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import syb.lq.model.UserInfo;

public interface UserDao {

	List<UserInfo> selectUserInfo(@Param("start")Integer start, @Param("pageSize")Integer pageSize);

	UserInfo selectById(@Param("id")Integer id);


	int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
	
}
