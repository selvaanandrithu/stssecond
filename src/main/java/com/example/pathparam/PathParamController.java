package com.example.pathparam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
@RestController
public class PathParamController {
	
	@GetMapping(value = "/accessCheck")
	public String getAcesss(@PathParam("username")  String userName, @PathParam("password") String password) {
		if (userName.equals("selva") && password.equals("selva16")) {
			return "access grandted";
		} else {
			return "access not granted";
		}
	}

}
