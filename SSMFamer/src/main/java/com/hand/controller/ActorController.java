package com.hand.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hand.dto.Actor;
import com.hand.server.ActorServer;

@Controller
public class ActorController {
	
	@Autowired
	private ActorServer actorServer;
	@RequestMapping("/showMain")
	public String toLogin(Model index){
		System.out.println("ads");
		List<Actor> list=actorServer.FindActor();
		index.addAttribute("actor", list);
		return "login";
	}
}
