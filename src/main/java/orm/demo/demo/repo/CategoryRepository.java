package orm.demo.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import orm.demo.demo.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
