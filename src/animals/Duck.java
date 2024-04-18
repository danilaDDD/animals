package animals;

import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal {
    private int wingsCount;

    public Duck(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int wingsCount) {
        super(name, birthDate, vaccinations, illness, owner);
        this.wingsCount = wingsCount;
    }

    public int getWingsCount() {
        return wingsCount;
    }
}
