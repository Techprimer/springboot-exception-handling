package net.techprimer.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import net.techprimer.entity.Product;
import net.techprimer.exception.ItemNotFoundException;
import net.techprimer.service.ProductService;
import net.techprimer.service.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product addProduct(Product product) {
		product = productRepository.save(product);
		return product;
	}

	@Override
	public Product getProduct(Long productId) {
		Optional<Product> product = productRepository.findById(productId);
		if (product.isEmpty()) {
			throw new ItemNotFoundException("Item doesn't exists!!");
		} else {

			return product.get();
		}
	}

}
