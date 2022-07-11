module com.esame.esame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.esame.esame to javafx.fxml;
    exports com.esame.esame;
}