package com.nLayeredDemo.business.concretes;

import java.util.List;

import com.nLayeredDemo.business.abstracts.ProductService;
import com.nLayeredDemo.core.LoggerService;
import com.nLayeredDemo.dataAccess.abstracts.ProductDao;
import com.nLayeredDemo.entities.concretes.Product;

public class ProductManeger implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManeger(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	public ProductManeger(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		productDao.add(product);
		loggerService.logSystem(product.getName() + " Sisteme eklendi");

	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
