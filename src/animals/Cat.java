package animals;

import interfaces.Goable;
import interfaces.Swimable;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Goable, Swimable {
    private int legsCount;
    public Cat(String name, LocalDate birthDate, List<String> vaccinations,
               String illness, String owner, int legsCount) {
        super(name, birthDate, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public double run() {
        System.out.printf("%s run\n", getType());
        return 10;
    }

    @Override
    public double swim() {
        System.out.printf("%s swim\n", getType());
        return 3;
    }
}
