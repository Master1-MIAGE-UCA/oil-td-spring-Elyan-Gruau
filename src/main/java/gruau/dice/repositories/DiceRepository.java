package gruau.dice.repositories;

import gruau.dice.entities.DiceRollLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiceRepository extends JpaRepository<DiceRollLog, Long> {
}
