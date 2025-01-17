package lim.spring.test.java;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JsonPost {
	private static final Logger logger = LoggerFactory.getLogger(JsonPost.class);
	@RequestMapping(value="/jsonp", method = RequestMethod.POST, consumes = "application/json")
	public void ajax_send(@RequestBody Map<String, Object> data, HttpServletResponse response) {
		logger.info("메서드 실행" + data);
		response.setStatus(HttpServletResponse.SC_NO_CONTENT);
	}
	@RequestMapping("/ajaxtest")
	public String ajax_request() {
		return "jsontextp";
	}
}
