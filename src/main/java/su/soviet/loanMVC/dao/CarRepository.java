package su.soviet.loanMVC.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import su.soviet.loanMVC.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
