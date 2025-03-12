package ma.enset.gestion_consultations_patients.service;

import ma.enset.gestion_consultations_patients.entities.Consultation;
import ma.enset.gestion_consultations_patients.entities.Patient;

import java.util.List;

public interface ICabinetService {
    void addPatient(Patient patient);
    void deletePatient(Patient patient);
    void updatePatient(Patient patient);
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);

    void addConsultation(Consultation consultation);
    void deleteConsultation(Consultation consultation);
    void updateConsultation(Consultation consultation);
    List<Consultation> getAllConsultations();
    Consultation getConsultationById(Long id);
}
