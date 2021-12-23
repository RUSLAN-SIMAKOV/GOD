package ruslan.simakov.human.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ruslan.simakov.human.model.Human;

public interface HumanRepository extends JpaRepository<Human, Long> {
}
