package lhk.hari.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lhk.hari.demo.entity.User;


@Repository
public interface UserRepository  extends JpaRepository<User, Long>{
        
	Boolean existsByEmail(String email);
	Optional<User> findByEmail(String email);
}
