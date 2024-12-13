package gruau.dice.service;

import gruau.dice.model.Dice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiceService {

    public int roll() {
        Dice dice = new Dice();
        return dice.roll();
        //TODO log
    }

    public List<Integer> roll(int value) {
        Dice dice = new Dice();
        return dice.roll(value);
        //TODO log
    }
}
