package ru.larionov.hospital.dao;

import ru.larionov.hospital.entity.Patient;

import java.util.List;

public interface DAO {
    List<Patient> getListOfPatients();
    boolean dischargePatient(int numPatient, String finishDiagnosis);
    boolean appointMedicines(List<Patient> patientList, int numPatient, String Medicines);
    boolean appointProcedures(List<Patient> patientList, int numPatient, String procedures);
    boolean determineDiagnosis(List<Patient> patientList, int numPatient, String diagnosis);
    boolean appointOperation(List<Patient> patientList, int numPatient, String operation);
}
