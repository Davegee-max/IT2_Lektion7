package comparable;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoctorSorter {
    public static void main(String[] args) {
        List<Doctor> doctors =new ArrayList<>();
        doctors.add(new Doctor("Brian","Doktor","10"));
        doctors.add(new Doctor("Christian","Budtz","9"));
        doctors.add(new Doctor("Anne","Radiolog","11"));
        System.out.println(doctors);
        Collections.sort(doctors);
        System.out.println(doctors);

    }
}
