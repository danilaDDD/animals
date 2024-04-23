import address.Address;
import animals.*;
import clinic.VeterinaryClinic;
import interfaces.Flyable;
import interfaces.Goable;
import interfaces.Swimable;
import persons.Doctor;
import persons.Nurse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static VeterinaryClinic clinic;
    public static void main(String[] args) {
        clinic = new VeterinaryClinic();

        addPatients();
        launchPatientsWithMoveType();
//          animals.Spyder run
//        animals.Cat run
//        animals.Duck run
//        animals.Eagle run
//        animals.Spyder swim
//        animals.Cat swim
//        animals.Duck swim
//        animals.Fish swim
//        animals.Duck fly
//        animals.Eagle fly

        addStaffs();
        printStaffInfo();
//        Doctors
//        Staff{fio='Dmitry Ivanov', birthDate=1980-08-05, passportCode='6523565625623', position=DOCTOR, address=Address{street='Петровская', houseNumber='1A'}}
//        Staff{fio='Ily Petrov', birthDate=1980-08-05, passportCode='6523565625623', position=DOCTOR, address=Address{street='Ивановская', houseNumber='10В'}}
//        Staff{fio='Peter Peter', birthDate=1980-08-05, passportCode='6523565625623', position=DOCTOR, address=Address{street='Столейная', houseNumber='1'}}
//        Nurses
//        Staff{fio='Olga Ivanov', birthDate=1980-08-05, passportCode='6523565625623', position=NORSE, address=Address{street='Петровская', houseNumber='1A'}}
//        Staff{fio='Olga Ivanov', birthDate=1980-08-05, passportCode='6523565625623', position=NORSE, address=Address{street='Петровская', houseNumber='1A'}}

    }

    private static void printStaffInfo(){
        System.out.println("Doctors");
        for(Doctor doctor: clinic.getDoctors())
            System.out.println(doctor);
        System.out.println("Nurses");
        for(Nurse nurse: clinic.getNurses())
            System.out.println(nurse);
    }

    private static void addStaffs(){
        Doctor doctor1, doctor2, doctor3;
        Nurse nurse1, nurse2;

        nurse1 = new Nurse("Olga Ivanov", LocalDate.of(1980, 8, 5),
                "6523565625623", new Address("Петровская", "1A"));
        nurse2 = new Nurse("Olga Ivanov", LocalDate.of(1980, 8, 5),
                "6523565625623", new Address("Петровская", "1A"));

        doctor1 = new Doctor("Dmitry Ivanov", LocalDate.of(1980, 8, 5),
                "6523565625623", new Address("Петровская", "1A"), nurse1);
        doctor2 = new Doctor("Ily Petrov", LocalDate.of(1980, 8, 5),
                "6523565625623", new Address("Ивановская", "10В"), nurse2);
        doctor3 = new Doctor("Peter Peter", LocalDate.of(1980, 8, 5),
                "6523565625623", new Address("Столейная", "1"));
        clinic.addStaffs(doctor1, doctor2, nurse1, nurse2, doctor3);

    }

    private static void addPatients(){
        clinic.addPatients(
                new Spyder("spyder", LocalDate.of(2019, 12, 1),
                        new ArrayList<>(), "", "Dmitry", 8),
                new Cat("cat", LocalDate.of(2019, 11, 2),
                        new ArrayList<>(), "", "Dmitry", 8),
                new Duck("duck", LocalDate.of(2018, 12, 2),
                        new ArrayList<>(), "", "Dmitry", 8),
                new Eagle("eagle", LocalDate.of(2019, 10, 2),
                        new ArrayList<>(), "", "Dmitry"),
                new Fish("eagle", LocalDate.of(2019, 12, 10),
                        new ArrayList<>(), "", "Dmitry")

        );
    }

    private static void launchPatientsWithMoveType(){
        for(Goable goable: clinic.getGoable())
            goable.run();

        for(Swimable swimable: clinic.getSwimable())
            swimable.swim();

        for(Flyable flyable: clinic.getFlyable())
            flyable.fly();
    }
}