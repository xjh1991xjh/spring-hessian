package org.xjh.spring.hessian.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.xjh.spring.hessian.api.ProductRemoteService;
import org.xjh.spring.hessian.dto.Product;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRemoteService productRemoteService;
	
	@RequestMapping(value="/product/get/{id}", method=RequestMethod.GET)
	public Product get(@PathVariable("id") String id){
		Product product = productRemoteService.get(id);
		return product;
	}

}
