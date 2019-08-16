package ru.larionov.hospital.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.larionov.hospital.dao.DAO;

@Component
public class Nurse {

    @Autowired
    protected DAO dao;

    public boolean appointMedicines(int numPatient, String medicines){
        dao.appointMedicines(dao.getListOfPatients(),numPatient,medicines);
        return true;
    }

    public boolean appointProcedures(int numPatient, String procedures){
        dao.appointProcedures(dao.getListOfPatients(), numPatient, procedures);
        return true;
    }

}
