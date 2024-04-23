package clinic;

import animals.Animal;
import interfaces.Flyable;
import interfaces.Goable;
import interfaces.Swimable;
import persons.Doctor;
import persons.Nurse;
import persons.Staff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class VeterinaryClinic {
    private final List<Animal> patients = new ArrayList<>();
    private final List<Staff> staffs = new ArrayList<>();

    public void addStaffs(Staff...staffs){
        Collections.addAll(this.staffs, staffs);
    }

    public List<Staff> getStaffs(){
        return staffs;
    }

    public List<Doctor> getDoctors(){
       return staffs.stream()
               .filter(staff -> staff instanceof Doctor).map(staff -> (Doctor) staff)
               .collect(Collectors.toList());
    }

    public List<Nurse> getNurses(){
        return staffs.stream()
                .filter(staff -> staff instanceof Nurse).map(staff -> (Nurse) staff)
                .collect(Collectors.toList());
    }

    public void addPatients(Animal ...patients){
        Collections.addAll(this.patients, patients);
    }

    public List<Goable> getGoable(){
        List<Goable> goableList = new ArrayList<>();
        for (Animal animal:patients)
            if(animal instanceof Goable)
                goableList.add((Goable) animal);

        return goableList;

    }

    public List<Flyable> getFlyable(){
        List<Flyable> flyableList = new ArrayList<>();
        for (Animal animal:patients)
            if(animal instanceof Flyable)
                flyableList.add((Flyable) animal);

        return flyableList;

    }

    public List<Swimable> getSwimable(){
        List<Swimable> swimableList = new ArrayList<>();
        for (Animal animal:patients)
            if(animal instanceof Swimable)
                swimableList.add((Swimable) animal);

        return swimableList;

    }


}
