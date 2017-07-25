package com.dream.service;

import javax.annotation.PostConstruct

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@Scope("session")
public class SampleBean {

	String name;

	Long age;

	public String submitForm(){
		println ("Submit form Called with data Name : "+name+" and Age "+age)
		return "/data.xhtml"
	}
}
