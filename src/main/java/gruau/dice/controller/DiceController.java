package gruau.dice.controller;

import gruau.dice.service.DiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class DiceController {

    @Autowired
    DiceService diceService;

    public DiceController(DiceService diceService) {
        this.diceService = diceService;
    }

    @GetMapping("rollDice")
    public int roll() {
        return this.diceService.roll();
    }

    @GetMapping("rollDices/{value}")
    public List<Integer> rolls(@PathVariable int value) {
        return this.diceService.roll(value);
    }

    @GetMapping("diceLogs")
    public String diceLogs() {
        return "Dice logs";
    }

}
