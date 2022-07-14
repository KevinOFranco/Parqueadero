module com.parqueadero.parqueadero {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.parqueadero.modelo to javafx.fxml;
    exports com.parqueadero.modelo;
}