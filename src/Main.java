import animals.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(List.of(
                new Spyder("spyder", LocalDate.of(2019, 12, 2),
                        new ArrayList<>(), "", "Dmitry", 8),
                new Cat("cat", LocalDate.of(2019, 12, 2),
                        new ArrayList<>(), "", "Dmitry", 8),
                new Duck("duck", LocalDate.of(2019, 12, 2),
                        new ArrayList<>(), "", "Dmitry", 8),
                new Eagle("eagle", LocalDate.of(2019, 12, 2),
                        new ArrayList<>(), "", "Dmitry"),
                new Snake("snake", LocalDate.of(2019, 12, 2),
                        new ArrayList<>(), "", "Dmitry")

        ));

        for (Animal animal: animals){
            System.out.println(animal.getName());
            if(animal.ifToGo())
               animal.toGo();
           else if (animal.ifFly())
               animal.fly();
           else if (animal.ifSwim())
               animal.swim();

        }
    }
}