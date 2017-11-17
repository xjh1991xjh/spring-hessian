package org.xjh.spring.hessian.api;

import org.xjh.spring.hessian.dto.Product;

public interface ProductRemoteService {
	public Product get(String id);
}
