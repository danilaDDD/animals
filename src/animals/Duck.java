package animals;

import interfaces.Flyable;
import interfaces.Goable;
import interfaces.Swimable;

import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Goable, Swimable, Flyable {
    private int wingsCount;

    public Duck(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int wingsCount) {
        super(name, birthDate, vaccinations, illness, owner);
        this.wingsCount = wingsCount;
    }

    public int getWingsCount() {
        return wingsCount;
    }

    @Override
    public double fly() {
        System.out.printf("%s fly\n", getType());
        return 5;
    }

    @Override
    public double run() {
        System.out.printf("%s run\n", getType());
        return 3;
    }

    @Override
    public double swim() {
        System.out.printf("%s swim\n", getType());
        return 5;
    }
}
