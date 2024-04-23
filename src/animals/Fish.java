package animals;

import interfaces.Swimable;

import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal implements Swimable {
    public Fish(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double swim() {
        System.out.printf("%s swim\n", getType());
        return 9;
    }
}
