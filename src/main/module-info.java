module at.ac.fhcampuswien.hangmanmaven {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;

    opens at.ac.fhcampuswien.hangmanmaven to javafx.fxml;
    exports at.ac.fhcampuswien.hangmanmaven;
}