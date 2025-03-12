module ma.enset.gestion_consultations_patients {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires org.kordamp.bootstrapfx.core;

    opens ma.enset.gestion_consultations_patients.entities to javafx.base;


    exports ma.enset.gestion_consultations_patients;
    exports ma.enset.gestion_consultations_patients.presentation;
}