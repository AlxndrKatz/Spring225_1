package su.soviet.loanMVC.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import su.soviet.loanMVC.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
