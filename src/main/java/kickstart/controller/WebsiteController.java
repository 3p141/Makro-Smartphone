package kickstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebsiteController {

	@GetMapping("/")
	public String index() {
		return "start";
	}

	@GetMapping("/client")
	public String showClient(){
		return "client";
	}
}
