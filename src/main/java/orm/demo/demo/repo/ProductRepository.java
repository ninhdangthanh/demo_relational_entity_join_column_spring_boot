package orm.demo.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import orm.demo.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
