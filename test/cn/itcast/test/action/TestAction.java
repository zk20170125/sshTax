package cn.itcast.test.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.test.service.TestService;


public class TestAction extends ActionSupport{

	private static final long serialVersionUID = 8030953177716437488L;
	
	@Resource
	TestService testService;


	public String execute(){
			testService.say();
			return SUCCESS;
			
	}
}
