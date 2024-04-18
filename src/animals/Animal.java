package animals;

import java.time.LocalDate;
import java.util.List;

public class Animal {
    private String name;
    private LocalDate birthDate;
    private List<String> vaccinations;
    private String illness;
    private String owner;

    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
    }


    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwner() {
        return owner;
    }

    public void toGo(){
        System.out.println("go");
    }

    public boolean ifToGo(){
        return true;
    }

    public void fly(){
        System.out.println("fly");
    }

    public boolean ifFly(){
        return true;
    }

    public void swim(){
        System.out.println("swim");
    }

    public boolean ifSwim(){
        return true;
    }
}
