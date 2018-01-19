package syb.lq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import syb.lq.dao.UserDao;
import syb.lq.model.UserInfo;

public class UserServiceImpl implements UserService{

	
	@Autowired
	UserDao userDao;
	

	@Override
	public List selectuser(Integer start, Integer pageSize) {
		// TODO Auto-generated method stub
		
		
		return userDao.selectUserInfo(start,pageSize);
	}


	@Override
	public UserInfo selectById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.selectById(id);
	}


	@Override
	public void updInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		userDao.updateByPrimaryKeySelective(userInfo);
	}


}
