package com.tu_dresden.tools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jade.core.Agent;
import jade.wrapper.StaleProxyException; //proxy exception for REST API

public class ContainerKiller {
	
	private static final Logger logger = LoggerFactory.getLogger(ContainerKiller.class);
	
	public static void killContainerOf(Agent agent)
	{
		final jade.wrapper.AgentContainer containerController = agent.getContainerController();
		agent.doDelete();
		
		new Thread(() -> {
			try 
			{
				containerController.kill();   // container is like a Docker container
				logger.info("Container object has been destroyed");
			} 
			catch(StaleProxyException ex)
			{
				ex.printStackTrace();
			}
		}).start();
	}
	
}
