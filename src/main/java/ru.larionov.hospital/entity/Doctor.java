package ru.larionov.hospital.entity;

import org.springframework.stereotype.Component;

@Component
public class Doctor extends Nurse {

    public boolean determineDiagnosis(int numPatient, String diagnosis) {
        dao.determineDiagnosis(dao.getListOfPatients(), numPatient, diagnosis);
        return true;
    }

    public boolean appointOperation(int numPatient, String operation) {
        dao.appointOperation(dao.getListOfPatients(), numPatient, operation);
        return true;
    }

    public boolean dischargePatient(int numPatient, String finishDiagnosis){
        dao.dischargePatient(numPatient,finishDiagnosis);
        return true;
    }

}
