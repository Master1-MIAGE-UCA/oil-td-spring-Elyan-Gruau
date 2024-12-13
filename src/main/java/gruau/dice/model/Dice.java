package gruau.dice.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class Dice {

    private int faces;

    public Dice(){
        this.faces = 6;
    }

    public ArrayList<Integer> roll(int amount) {
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            results.add(rollNewValue());
        }
        return  results;
    }

    public int roll() {
        return rollNewValue();
    }

    private int rollNewValue() {
        return (int) (Math.random() * 6) + 1;
    }
}
