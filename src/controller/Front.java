package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Front {
	@RequestMapping(value = "/")
	public String front() {
		return "index";
	}
}
