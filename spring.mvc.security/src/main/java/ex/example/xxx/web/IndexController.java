package ex.example.xxx.web;

import javax.servlet.http.PushBuilder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String indexPage(PushBuilder pushBuilder) {
		
		if(pushBuilder != null) {	
			pushBuilder.path("resources/img/common/logo.png").addHeader("content-type", "image/png").push();
		}
		
		return "index";
	}
	
}