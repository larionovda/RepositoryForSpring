package ru.larionov.hospital.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.larionov.hospital.entity.Patient;

import java.util.ArrayList;
import java.util.List;

@Component
public class DAOimpl implements DAO {

    List<Patient> patientList = new ArrayList<>();

    @Autowired
    public DAOimpl(Patient patient, Patient patient1, Patient patient2, Patient patient3) {
        this.patientList.add(patient);
        this.patientList.add(patient1);
        this.patientList.add(patient2);
        this.patientList.add(patient3);
    }

    @Override
    public List<Patient> getListOfPatients() {
        return patientList;
    }

    @Override
    public boolean dischargePatient(int numPatient, String finishDiagnosis) {
        patientList.get(numPatient).setDiagnosis(finishDiagnosis);
        patientList.remove(numPatient);
        return true;
    }

    @Override
    public boolean appointMedicines(List<Patient> patientList, int numPatient, String Medicines) {
        patientList.get(numPatient).setMedicines(Medicines);
        return true;
    }

    @Override
    public boolean appointProcedures(List<Patient> patientList, int numPatient, String procedures) {
        patientList.get(numPatient).setProcedures(procedures);
        return true;
    }

    @Override
    public boolean determineDiagnosis(List<Patient> patientList, int numPatient, String diagnosis) {
        patientList.get(numPatient).setDiagnosis(diagnosis);
        return true;
    }

    @Override
    public boolean appointOperation(List<Patient> patientList, int numPatient, String operation) {
        patientList.get(numPatient).setOperations(operation);
        return true;
    }
}
