package com.dxc.controller;

import java.rmi.RemoteException;

import javax.servlet.http.HttpServletRequest;

import org.apache.axis2.AxisFault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dxc.model.xsd.User;
import com.dxc.services.impl.GetAllUserDocument;
import com.dxc.services.impl.GetAllUserDocument.GetAllUser;
import com.dxc.services.impl.GetAllUserResponseDocument;
import com.dxc.services.impl.GetAllUserResponseDocument.GetAllUserResponse;
import com.dxc.ws.UserServiceStub;

@Controller
public class UserController {

	@GetMapping("/user")
	public String getAllUser(HttpServletRequest request){
		UserServiceStub serviceStub = null;
		try{
			serviceStub = new UserServiceStub();
		}catch(AxisFault e){
			e.printStackTrace();
		}
		GetAllUserDocument requestDoc = GetAllUserDocument.Factory.newInstance();
		GetAllUser req = GetAllUser.Factory.newInstance();
		requestDoc.setGetAllUser(req);
		
		GetAllUserResponseDocument responseDoc = null;
		try{
			responseDoc = serviceStub.getAllUser(requestDoc); 
		}catch (RemoteException e) {
			e.printStackTrace();
		}
		GetAllUserResponse userResponse = responseDoc.getGetAllUserResponse();
		User[] resutl = userResponse.getReturnArray();
		for(User user: resutl){
			System.out.println(user.getName());
		}
		request.setAttribute("users", resutl);
		return "user";
	}
}
