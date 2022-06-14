module com.aryachauhan172.assignment01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.aryachauhan172.assignment01 to javafx.fxml;
    exports com.aryachauhan172.assignment01;
}