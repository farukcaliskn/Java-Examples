package com.nLayeredDemo;

import com.nLayeredDemo.business.abstracts.ProductService;
import com.nLayeredDemo.business.concretes.ProductManeger;
import com.nLayeredDemo.core.JLoggerManegerAdapter;
import com.nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import com.nLayeredDemo.entities.concretes.Product;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ProductService productService = new ProductManeger(new HibernateProductDao(), new JLoggerManegerAdapter());
		Product product = new Product(1, 2, "kalem", 5.5, 50);
		productService.add(product);

	}
}
