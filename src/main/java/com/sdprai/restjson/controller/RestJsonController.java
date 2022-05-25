package com.sdprai.restjson.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("restjson")
public class RestJsonController {

	@GetMapping(value="list", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<String> getValues(){
		String value1 = "{\"name\":\"John\", \"age\":30}";
		String value2 = "{\"name\":\"Tom\", \"age\":21}";
		
		return Arrays.asList(value1, value2);
		//returns: ["{\"name\":\"John\", \"age\":30}","{\"name\":\"Tom\", \"age\":21}"]
	}

	@GetMapping(value="single", produces = {MediaType.APPLICATION_JSON_VALUE})
	public String getValue(){
		String value1 = "{\"name\":\"John\", \"age\":30}";
		String value2 = "{\"name\":\"Tom\", \"age\":21}";
		
		return value1.concat(value2);
		//returns: {"name":"John", "age":30}{"name":"Tom", "age":21}
	}
}
