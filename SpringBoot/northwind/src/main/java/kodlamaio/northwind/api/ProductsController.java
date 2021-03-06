package kodlamaio.northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	private ProductService productService;

	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getAll")
	public DataResult<List<Product>> getAll() {
		return productService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return productService.add(product);
	}

	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName) {
		return productService.getByProductName(productName);
	}

	@GetMapping("/getByProductNameAndCategory_CategoryId")
	public DataResult<Product> getByProductNameAndCategory_CategoryId(@RequestParam("productName") String productName,
			@RequestParam("categoryId") int categoryId) {
		return productService.getByProductNameAndCategory_CategoryId(productName, categoryId);
	}

	@GetMapping("/getByProductNameOrCategory_CategoryId")

	public DataResult<List<Product>> getByProductNameOrCategory_CategoryId(
			@RequestParam("productName") String productName, @RequestParam("categoryId") int categoryId) {
		return productService.getByProductNameOrCategory_CategoryId(productName, categoryId);
	}

	@GetMapping("getByCategoryIn")
	public DataResult<List<Product>> getByCategory_CategoryIdIn(@RequestParam List<Integer> categories) {
		return productService.getByCategory_CategoryIdIn(categories);
	}

	@GetMapping("getByProductNameContains")
	public DataResult<List<Product>> getByProductNameContains(@RequestParam("productName") String productName) {
		return productService.getByProductNameContains(productName);
	}

	@GetMapping("getByProductNameStartsWith")
	public DataResult<List<Product>> getByProductNameStartsWith(@RequestParam("productName") String productName) {
		return productService.getByProductNameStartsWith(productName);
	}

	@GetMapping("getByNameAndCategory")
	public DataResult<List<Product>> getByNameAndCategory(@RequestParam("productName") String productName,
			@RequestParam("categoryId") int categoryId) {
		return productService.getByNameAndCategory(productName, categoryId);
	}

	@GetMapping("getAllByPage")
	public DataResult<List<Product>> getAll(@RequestParam("pageNo") int pageNo,
			@RequestParam("pageSize") int pageSize) {
		return productService.getAll(pageNo, pageSize);
	}

	@GetMapping("/getAllSorted")
	public DataResult<List<Product>> getAllSorted() {
		return productService.getAllSorted();
	}

	@GetMapping("/ProductWithCategoryDto")
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
		return productService.getProductWithCategoryDetails();
	}
}
