package syb.lq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import syb.lq.dao.UserDao;
import syb.lq.model.UserInfo;

@Service("userService")
public class UserServiceImpl implements UserService{

	
	@Autowired
	UserDao userDao;
	
	@Override
	public List<UserInfo> selectuserBoot(Integer start, Integer pageSize) {

		return userDao.selectuserBoot(start,pageSize);
	}

	@Override
	public UserInfo selectByIdBoot(Integer id) {
		// TODO Auto-generated method stub
		return userDao.selectByIdBoot(id);
	}

	@Override
	public void updInfoboot(UserInfo userInfo) {
		// TODO Auto-generated method stub
		userDao.updInfoboot(userInfo);
	}

}
