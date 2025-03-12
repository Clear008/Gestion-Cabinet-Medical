package ma.enset.gestion_consultations_patients;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import ma.enset.gestion_consultations_patients.presentation.MainView;
import ma.enset.gestion_consultations_patients.presentation.PatientView;
import ma.enset.gestion_consultations_patients.presentation.ConsultationView;
import ma.enset.gestion_consultations_patients.presentation.PatientController;
import ma.enset.gestion_consultations_patients.presentation.ConsultationController;
import ma.enset.gestion_consultations_patients.service.ICabinetService;
import ma.enset.gestion_consultations_patients.service.CabinetService;
import ma.enset.gestion_consultations_patients.dao.IPatientDao;
import ma.enset.gestion_consultations_patients.dao.IConsultationDao;
import ma.enset.gestion_consultations_patients.dao.PatientDao;
import ma.enset.gestion_consultations_patients.dao.ConsultationDao;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        try {
            // Initialisation des DAO
            IPatientDao patientDao = new PatientDao();
            IConsultationDao consultationDao = new ConsultationDao();

            // Initialisation du service avec les DAO
            ICabinetService cabinetService = new CabinetService(patientDao, consultationDao);

            // Création de la vue principale
            MainView mainView = new MainView();

            // Récupération des vues créées dans MainView
            PatientView patientView = mainView.getPatientView();
            ConsultationView consultationView = mainView.getConsultationView();

            // Initialisation des contrôleurs avec leurs vues et le service
            PatientController patientController = new PatientController(patientView, cabinetService);
            ConsultationController consultationController = new ConsultationController(consultationView, cabinetService);

            // Initialisation du ComboBox de patients dans la vue des consultations
            consultationView.setPatients(cabinetService.getAllPatients());

            // Configuration de la scène
            Scene scene = new Scene(mainView, 1000, 700);
            stage.setTitle("Gestion des Consultations Médicales");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            showErrorAlert("Erreur de démarrage", "Une erreur est survenue lors du démarrage de l'application", e.getMessage());
        }
    }

    private void showErrorAlert(String title, String header, String content) {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch();
    }
}