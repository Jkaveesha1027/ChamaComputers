module lk.ijse.chama.chamacomputers {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.ijse.chama.chamacomputers to javafx.fxml;
    exports lk.ijse.chama.chamacomputers;
}