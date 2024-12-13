package gruau.dice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Timestamp;
import java.util.List;

@Entity
public class DiceRollLog {
    @Id
    @GeneratedValue
    private Long id;

    private int diceCount;
//    private List<Integer> results;
    private Timestamp timestamp;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
