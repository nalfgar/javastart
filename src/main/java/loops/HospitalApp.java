package loops;

public class HospitalApp {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        hospital.addPatient(new Patient("Aaaa", "Bbbb"));
        hospital.addPatient(new Patient("Cccc", "Dddd"));

//        TODO
//        write mainloop

        hospital.listHospital();
    }
}
