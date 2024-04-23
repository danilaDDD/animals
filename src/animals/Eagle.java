package animals;

import interfaces.Flyable;
import interfaces.Goable;

import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements Goable, Flyable {
    public Eagle(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double fly() {
        System.out.printf("%s fly\n", getType());
        return 10;
    }

    @Override
    public double run() {
        System.out.printf("%s run\n", getType());
        return 10;
    }
}
