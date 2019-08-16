package ru.larionov.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.larionov.hospital.dao.DAOimpl;
import ru.larionov.hospital.entity.Doctor;

@SpringBootApplication
public class DemoService {
    @Autowired
    private Doctor doctor;
    @Autowired
    private DAOimpl daOimpl;

    public void run() {
        System.out.println(doctor.appointOperation(0, "No operation scheduled"));
        System.out.println(doctor.determineDiagnosis(0, "Diabetes"));
        System.out.println(doctor.appointMedicines(0, "Insulin"));
        System.out.println(doctor.appointProcedures(0, "electrophoresis"));
        System.out.println(daOimpl.getListOfPatients().get(0));
    }
}
