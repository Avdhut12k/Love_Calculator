package com.practiseApp.lc.controllers;



import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practiseApp.lc.api.SignInInfo;
import com.practiseApp.lc.api.UserInfoDTO;

@Controller
public class LCAppController {
	// data-binding -> is two way binding we can read the data and we can write the data
	
	/*@RequestMapping("/")
	public String showHomePage(/*Model model*/ /*@ModelAttribute("userInfo") UserInfoDTO userInfoDTO ,HttpServletRequest request ) {
		
		//UserInfoDTO dto=new UserInfoDTO();
		
		//model.addAttribute("userInfo", dto);
		
		Cookie[] allCookies =  request.getCookies();
		
		for(Cookie temp:allCookies) {
			if(temp.getName().equals("lcApp.userName")) {
				String myUserName = temp.getValue();
				userInfoDTO.setUserName(myUserName);
			}
		}
		
		return "home-page";
		
	}*/
	
	
	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO  ) {
		
		
		
		return "home-page";
		
	}
	
	
	/*
	
	@RequestMapping("/process-home-page")
	public String showProcessPage(@RequestParam String userName,
			@RequestParam String crushName,Model model ) {
		System.out.println("userName :"+userName);
		System.out.println("crushName :"+crushName);
		
		model.addAttribute("userName", userName);
		model.addAttribute("crushName", crushName);
		
		return "result-page";
		
	}*/
	
	/*@RequestMapping("/process-home-page")
	public String showProcessPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO,
			BindingResult result,HttpServletResponse response) {
		
		System.out.println(userInfoDTO.getTermAndConditions());
		
		if(result.hasErrors()) {
			
			System.out.println("into the error part from the form ");
			
			List<ObjectError> obj =	result.getAllErrors();
			
			for(ObjectError er: obj) {
				System.out.println(er);
			}
			
			return "home-page";
			
		}
		
//		System.out.println(userInfoDTO.getUserName());
//		
//		System.out.println(userInfoDTO.getCrushName());
//		
//		model.addAttribute("userInfo", userInfoDTO);
		
		//create a cookie and send this cookie back to the client
		Cookie cookie = new Cookie("lcApp.userName",userInfoDTO.getUserName());
		
		cookie.setMaxAge(60*60*24);
		
		response.addCookie(cookie);
		
		
		return "result-page";
		
	}*/
	
	
	@RequestMapping("/process-home-page")
	public String showProcessPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO,
			BindingResult result,HttpSession session/*,HttpServletRequest request*/) {
		
		
		
		if(result.hasErrors()) {
			
			System.out.println("into the error part from the form ");
			
			List<ObjectError> obj =	result.getAllErrors();
			
			for(ObjectError er: obj) {
				System.out.println(er);
			}
			
			return "home-page";
			
		}
		
		//Session session = request.getSession();
		
		session.setAttribute("userNameFromFirstPage", userInfoDTO.getUserName());
		
		
		
		
		return "result-page";
		
	}
	
	
	@RequestMapping("/sign-in-processing")
	public String signInProcess(@ModelAttribute("sign-In-Info") SignInInfo signIn) {
		return "sign-in";
	}
	
	
	
	@RequestMapping("/saveSignInInfo")
	public String processSignIn(@ModelAttribute("signInfo") SignInInfo sign) {
		
		return "confirmation-page";
	}

}
