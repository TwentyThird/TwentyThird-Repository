package syb.lq.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import syb.lq.model.UserInfo;
import syb.lq.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	
	@Autowired 
	private UserService userService;
	
	@RequestMapping("selectuser")
	@ResponseBody
	public String selectuser(HttpServletRequest hp,HttpServletResponse response,Integer start,Integer pageSize){
		List list = userService.selectuser(start,pageSize);
		JSONObject json=new JSONObject();
		json.toJSONStringWithDateFormat(list, "yyyy-MM-dd");
		json.put("rows", list);
		return json.toString();
	}
	
	@RequestMapping("selectuserBoot")
	@ResponseBody
	public String selectuserBoot(Integer start,Integer pageSize){
		List<UserInfo> list = userService.selectuserBoot(start,pageSize);
		JSONObject json=new JSONObject();
		
		json.put("rows", list);
		return json.toString();
	}
	
	
	@RequestMapping("selectById")
	@ResponseBody
	public String selectById(Integer id){
		
		UserInfo userInfo = userService.selectById(id);
		String jsonStringWithDateFormat = JSON.toJSONStringWithDateFormat(userInfo, "yyyy-MM-dd");
		return jsonStringWithDateFormat;
	}
	
	@RequestMapping("selectByIdBoot")
	@ResponseBody
	public String selectByIdBoot(Integer id){
		
		UserInfo userInfo = userService.selectByIdBoot(id);
		String jsonStringWithDateFormat = JSON.toJSONStringWithDateFormat(userInfo, "yyyy-MM-dd");
		return jsonStringWithDateFormat;
	}
	
	
	@RequestMapping(value="updInfoboot")
	@ResponseBody
	public String updInfoboot(UserInfo userInfo){
		 userService.updInfoboot(userInfo);
		return "1";
	}
	
	@RequestMapping(value="updInfo")
	@ResponseBody
	public String updInfo(UserInfo userInfo){
		userService.updInfo(userInfo);
		return "1";
	}
	

	
}
