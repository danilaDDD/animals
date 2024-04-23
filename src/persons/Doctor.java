package persons;

import address.Address;

import java.time.LocalDate;

public class Doctor extends Staff {
    /*
    * Может получиться так что медсестры не будет на операции, она заболеет или операция будет слишком простой может просто осмотр
    * Добавлен сеттер, медсестра закреплена за доктором но может меняться в жизни клиники
    * */
    private Nurse nurse;

    public Doctor(String fio, LocalDate birthDate, String passportCode, Address address) {
        super(fio, birthDate, passportCode, PositionEnum.DOCTOR, address);
    }

    public Doctor(String fio, LocalDate birthDate, String passportCode, Address address, Nurse nurse) {
        this(fio, birthDate, passportCode, address);
        this.nurse = nurse;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
}
