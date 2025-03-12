package ma.enset.gestion_consultations_patients.service;

import ma.enset.gestion_consultations_patients.dao.ConsultationDao;
import ma.enset.gestion_consultations_patients.dao.PatientDao;
import ma.enset.gestion_consultations_patients.entities.Patient;

import java.sql.SQLOutput;
import java.util.List;

public class ServiceTest {
    public static void main(String[] args) {
        ICabinetService service=new CabinetService(new PatientDao(), new ConsultationDao());
        //Create new patients
       /* Patient patient = new Patient();
        patient.setNom("Sanae");
        patient.setPrenom("soumi");
        patient.setTel("06576676");
        service.addPatient(patient);*/
        // Lister les patients
        /*List<Patient> patients=service.getAllPatients();
        patients.forEach(patient -> System.out.println(patient));*/

        // lister les patients par Id
        /*Patient patient=service.getPatientById(1L);
        System.out.println(patient);*/

        // Modifier un patient
        Patient patient=service.getPatientById(1L);
        patient.setTel("0000000000");
        service.updatePatient(patient);


    }
}
