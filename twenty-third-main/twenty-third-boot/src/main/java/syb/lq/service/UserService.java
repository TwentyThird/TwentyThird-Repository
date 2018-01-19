package syb.lq.service;

import java.util.List;

import syb.lq.model.UserInfo;

public interface UserService {
	
	public List selectuser(Integer start, Integer pageSize);
	
	public UserInfo selectById(Integer id);
	
	public void updInfo(UserInfo userInfo);
}
