package com.jcvh;

import com.jcvh.domain.Doctor;
import com.jcvh.domain.Patient;
import com.jcvh.domain.User;
import com.jcvh.ui.UIMenu;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        UIMenu.showMenu();

        /*Doctor myDoctor = new Doctor("Juan Camilo", "jc@email.com");
        myDoctor.setSpeciality("Neurocirugano");
        myDoctor.setPhoneNumber("456789");
        myDoctor.setAddress("Street always alive");
        System.out.println(myDoctor.getName());
        System.out.println(myDoctor.getSpeciality());

        myDoctor.addAvailableAppointment(new Date(), "16:00");
        myDoctor.addAvailableAppointment(new Date(), "10:00");
        myDoctor.addAvailableAppointment(new Date(), "13:00");
        System.out.println(myDoctor.toString());

        User user = new Doctor("Camilo", "camilo@gmail.com");
        user.showDataUser();

        User userPatient = new Patient("Juaquis", "juako@mail.com");
        userPatient.showDataUser();*/

    }
}