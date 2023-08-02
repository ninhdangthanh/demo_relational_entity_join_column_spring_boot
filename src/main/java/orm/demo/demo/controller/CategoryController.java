package orm.demo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import orm.demo.demo.entity.Category;
import orm.demo.demo.entity.Product;
import orm.demo.demo.repo.CategoryRepository;
import orm.demo.demo.repo.ProductRepository;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@GetMapping
	public List<Category> getAll() {
		return categoryRepository.findAll();
	}
	
	@PostMapping
	public Product create(@RequestBody Product product) {
		Category category = categoryRepository.findAll().stream().findFirst().orElseThrow();
		product.setNhanhCategoryId(category.getNhanhId());
		return productRepository.save(product);
	}
}
