package com.anu.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("producer")
@Slf4j
public class ProducerController {
	
	@GetMapping("/getMessage/{name}")
	public String getProducerMessage(@PathVariable("name") String name)
	{
		log.info("inside ProducerController:getProducerMessage"+name);
		log.debug("inside ProducerController:getProducerMessage"+name);
		return "Hello "+name+" Welcome To Springboot Tutorial";
	}

}
