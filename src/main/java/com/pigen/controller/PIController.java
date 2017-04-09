package com.pigen.controller;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/getPi")
public class PIController {

	@RequestMapping(method=RequestMethod.GET, value="/radius/{radius}/n/{n}")
	public String getPi(@RequestParam("radius") double radius, @RequestParam("n") double n) {
		return radius+"";
	}
}
