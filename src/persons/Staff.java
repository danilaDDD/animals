package persons;

import address.Address;

import java.time.LocalDate;

public class Staff {
    private String fio;
    private LocalDate birthDate;
    private String passportCode;
    private PositionEnum position;
    private Address address;

    public Staff(String fio, LocalDate birthDate, String passportCode, PositionEnum position, Address address) {
        this.fio = fio;
        this.birthDate = birthDate;
        this.passportCode = passportCode;
        this.position = position;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "fio='" + fio + '\'' +
                ", birthDate=" + birthDate +
                ", passportCode='" + passportCode + '\'' +
                ", position=" + position +
                ", address=" + address +
                '}';
    }
}
