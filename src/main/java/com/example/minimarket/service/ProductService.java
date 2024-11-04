package com.example.minimarket.service;

import com.example.minimarket.model.Product;
import com.example.minimarket.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /** 모든 상품 목록 가져오기 */
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /** ID로 상품 조회하기 */
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    /** 새로운 상품 추가하기 */
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    /** 상품 업데이트하기 */
    public Product updateProduct(Long id, Product productDetails) {
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            Product product = productOptional.get();
            product.setName(productDetails.getName());
            product.setPrice(productDetails.getPrice());
            product.setDescription(productDetails.getDescription());
            return productRepository.save(product);
        } else {
            throw new RuntimeException("해당 ID에 맞는 상품을 찾을 수 없습니다. id : " + id);
        }
    }

    /** 상품 삭제하기 */
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
