package com.nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import com.nLayeredDemo.entities.concretes.Product;

public interface ProductDao {

	void add(Product product);

	void update(Product product);

	void delete(Product product);

	Product get(int id);

	List<Product> getAll();
}
