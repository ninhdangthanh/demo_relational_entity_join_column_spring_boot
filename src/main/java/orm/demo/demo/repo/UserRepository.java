package orm.demo.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import orm.demo.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
