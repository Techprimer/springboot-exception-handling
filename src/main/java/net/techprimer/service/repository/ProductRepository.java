package net.techprimer.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.techprimer.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
