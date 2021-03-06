package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.core.utilities.result.SuccesDataResult;
import kodlamaio.northwind.core.utilities.result.SuccesResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

@Service
public class ProductManeger implements ProductService {

	private ProductDao productDao;

	@Autowired
	public ProductManeger(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<Product>>(this.productDao.findAll(), "Data listelendi");
	}

	@Override
	public Result add(Product product) {
		// TODO Auto-generated method stub
		productDao.save(product);
		return new SuccesResult("Ürün eklendi");
	}

	@Override
	public DataResult<Product> getByProductName(String productName) {
		// TODO Auto-generated method stub
		return new SuccesDataResult<Product>(this.productDao.getByProductName(productName), "Data listelendi");
	}

	@Override
	public DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int categoryId) {
		// TODO Auto-generated method stub
		return new SuccesDataResult<Product>(
				this.productDao.getByProductNameAndCategory_CategoryId(productName, categoryId), "Data listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int categoryId) {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<Product>>(
				this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId), "Data listelendi");
	}

	@Override
	public DataResult<List<Product>> getByCategory_CategoryIdIn(List<Integer> categories) {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<Product>>(this.productDao.getByCategory_CategoryIdIn(categories),
				"Data listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<Product>>(this.productDao.getByProductNameContains(productName),
				"Data listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<Product>>(this.productDao.getByProductNameStartsWith(productName),
				"Data listelendi");
	}

	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<Product>>(this.productDao.getByNameAndCategory(productName, categoryId),
				"Data listelendi");
	}

	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		return new SuccesDataResult<List<Product>>(this.productDao.findAll(pageable).getContent(), "Data listelendi");
	}

	@Override
	public DataResult<List<Product>> getAllSorted() {
		// TODO Auto-generated method stub
		Sort sort = Sort.by(Sort.Direction.DESC, "productName");
		return new SuccesDataResult<List<Product>>(this.productDao.findAll(sort), "Data listelendi");
	}

	@Override
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<ProductWithCategoryDto>>(this.productDao.getProductWithCategoryDetails(),
				"Data listelendi");
	}

}
