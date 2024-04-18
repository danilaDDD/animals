package animals;

import java.time.LocalDate;
import java.util.List;

public class Snake extends Animal{

    public Snake(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public boolean ifToGo() {
        return false;
    }

    @Override
    public boolean ifFly() {
        return false;
    }

    @Override
    public boolean ifSwim() {
        return false;
    }

    public void crawls(){
        System.out.println("I am crawls");
    }
}
