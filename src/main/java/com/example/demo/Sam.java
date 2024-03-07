package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sam {
@GetMapping("/get/{a}")
public Integer find(@PathVariable int a) {
//	List<Integer> newli = new ArrayList<>(); 

 List<Integer> li = Arrays.asList(10,3,4,5,22);
 for(Integer x :li) {
	 if(x>a) {
//   newli.add(x);
		 return x;
	 }
 }
// return newli;
return a;
}
@GetMapping("/getValues/{num1}/{num2}")
public List<Integer> find(@PathVariable int num1,@PathVariable int num2) {
	List<Integer> newli = new ArrayList<>(); 

 List<Integer> li = Arrays.asList(10,30,47,5,22);
 for(Integer x :li) {
	 if(x>num1&&x<=num2) {
   newli.add(x);
	 }
 }
 return newli;
}
}
