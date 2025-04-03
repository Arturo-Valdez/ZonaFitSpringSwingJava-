package gm.zona_fit;

import com.formdev.flatlaf.FlatDarculaLaf;
import gm.zona_fit.gui.ZonaFitForma;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;
//@SpringBootApplication
public class ZonaFitSwing {
    public static void main(String[] args) {
        //Configuracion tema oscuro
        FlatDarculaLaf.setup();

        // Instanciar la fabrica de spring
        ConfigurableApplicationContext contexSpring =
                new SpringApplicationBuilder(ZonaFitSwing.class).
                        headless(false).
                        web(WebApplicationType.NONE).
                        run(args);

        //Crear un objeto de Swing
        SwingUtilities.invokeLater(() -> {
            ZonaFitForma zonaFitForma = contexSpring.getBean(ZonaFitForma.class);
            zonaFitForma.setVisible(true);
        });

    }
}
