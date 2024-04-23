package persons;

import address.Address;

import java.time.LocalDate;

public class Nurse extends Staff {
    public Nurse(String fio, LocalDate birthDate, String passportCode, Address address) {
        super(fio, birthDate, passportCode, PositionEnum.NORSE, address);
    }
}
