package org.sid.security;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SecurityContoller {
	
	@RequestMapping(value="/login")
	public String login(){
		return "login";
	}
	@RequestMapping(value="/")
	public String home(){
		
		return "redirect:/villes";
	}	
	

	
	@RequestMapping(value="/403")
	public String accessDenied(){
		
		return "403";
	}
	
}
