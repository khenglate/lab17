module com.example.lab17 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.lab17 to javafx.fxml;
    exports com.example.lab17;
}