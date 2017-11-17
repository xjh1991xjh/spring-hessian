package org.xjh.spring.hessian.provider.service;

import org.springframework.stereotype.Service;
import org.xjh.spring.hessian.api.ProductRemoteService;
import org.xjh.spring.hessian.dto.Product;

@Service
public class ProductService implements ProductRemoteService{

	@Override
	public Product get(String id) {
		return new Product("1", "苹果");
	}

}
