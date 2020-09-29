package org.zerock.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CommonController {
	
	public void accessDenied(Authentication auth, Model model) {
		log.info("access Denied : " +auth);
		
		model.addAttribute("msg", "Access Denied");
	}
}
