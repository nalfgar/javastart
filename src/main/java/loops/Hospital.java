package loops;

import java.util.LinkedList;
import java.util.List;

public class Hospital {

    private List<Patient> list = new LinkedList<>();

    public void addPatient(Patient patient){
        list.add(patient);
    }

    public void listHospital(){
        for (Patient patient : list) {
            System.out.println(patient);
        }
    }
}
