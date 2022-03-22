package com.nLayeredDemo.business.abstracts;

import java.util.List;

import com.nLayeredDemo.entities.concretes.Product;

public interface ProductService {

	void add(Product product);

	void update(Product product);

	void delete(Product product);

	Product get(int id);

	List<Product> getAll();
}
