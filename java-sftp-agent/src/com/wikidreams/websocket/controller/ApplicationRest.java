package com.wikidreams.websocket.controller;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("")
public class ApplicationRest extends Application {

	private Set<Class<?>> classes = new HashSet<>();
	private Set<Object> singletons = new HashSet<>();
	
	public ApplicationRest() {
		classes.add( RestDownload.class);
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}
	
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
	
}
