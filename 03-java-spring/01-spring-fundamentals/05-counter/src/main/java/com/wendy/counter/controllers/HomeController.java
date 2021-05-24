package com.wendy.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/your_server")
public class HomeController {
	@RequestMapping("")
	public String index(HttpSession session){      
        if(session.getAttribute("count") == null) {        
            session.setAttribute("count", 0);
        }
        return "index.jsp";
    }
	
	@RequestMapping("/counter")
	public String showCount(HttpSession session) {
		Integer currentCount = (Integer) session.getAttribute("count");
		currentCount++;
		
		session.setAttribute("count", currentCount);
		return "counter.jsp";
	}
	
	@RequestMapping("/counter_two")
	public String newCount(HttpSession session) {
		Integer currentCount = (Integer) session.getAttribute("count");
		currentCount+=2;
		
		session.setAttribute("count", currentCount);
		return "counter_two.jsp";
	}
	// Create a reset button to set the counter back to zero
	@RequestMapping("/clear")
	public String clearCount(HttpSession session) {
		session.setAttribute("count", 0);// Will reset count to 0
		return "redirect:/counter";
	}

}