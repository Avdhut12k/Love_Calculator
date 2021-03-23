package com.practiseApp.lc.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practiseApp.lc.api.EmailDTO;

@Controller
public class EmailProcessController {
//when u pass {} spring thinks that its any parameter 
	//@RequestMapping("/show-email-page/{userName}")
	//public String showEmailPage(/* @RequestParam String userName, */@PathVariable("userName") String userName/*any name we can give*/,
	/*		@PathVariable Map<String,String> pathVar,
			@ModelAttribute("emailDTO") EmailDTO emailDTO, Model model) {
		model.addAttribute("userName", userName);
		String uname = pathVar.get("userName");
		System.out.println(userName);
		// this is also one scenario as query String parameter we need a userName to
		// this show-email-page //System.out.println(userName);
		return "process-email-page";

	}*/
	
	@RequestMapping("/show-email-page")
	public String showEmailPage(
			@ModelAttribute("emailDTO") EmailDTO emailDTO, Model model) {
		
		return "process-email-page";

	}
	
	
	

	@RequestMapping("/result-email-page")
	public String resultEmailPage(@ModelAttribute("emailDTO") EmailDTO emailDTO) {

		return "result-email";
	}

}
