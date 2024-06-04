module com.example.helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.helloworldfx to javafx.fxml;
    exports com.example.helloworldfx;
}