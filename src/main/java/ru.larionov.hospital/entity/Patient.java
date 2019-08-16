package ru.larionov.hospital.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Patient {
    private String diagnosis;
    private String medicines;
    private String procedures;
    private String operation;

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    public void setProcedures(String procedures) {
        this.procedures = procedures;
    }

    public void setOperations(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "diagnosis='" + diagnosis + '\'' +
                ", medicines='" + medicines + '\'' +
                ", procedures='" + procedures + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }
}
