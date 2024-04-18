package animals;

import java.time.LocalDate;
import java.util.List;

public class Spyder extends Animal{
    private int legsCount;

    public Spyder(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthDate, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount(){
        return  legsCount;
    }


    @Override
    public boolean ifFly() {
        return false;
    }
}
