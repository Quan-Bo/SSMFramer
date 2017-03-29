package com.hand.server.serverImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.dto.Actor;
import com.hand.mapping.ActorMapper;
import com.hand.server.ActorServer;


@Service
@Transactional
public class ActorServerImp implements ActorServer {

	@Autowired
	private ActorMapper actorMapper;

	public List<Actor> FindActor() {
		// TODO Auto-generated method stub
		List<Actor> actorList=actorMapper.FindActor();
		return actorList;
	}
}
