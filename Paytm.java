package travelsphere;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;

public class Paytm extends JFrame {

    public Paytm() {
        initComponents();
    }

    private void initComponents() {
        final JFXPanel fxPanel = new JFXPanel();
        getContentPane().add(fxPanel, BorderLayout.CENTER);
        Platform.runLater(() -> {
            WebView webView = new WebView();
            webView.getEngine().load("https://paytm.com/rent-payment");
            VBox vBox = new VBox(webView);
            Scene scene = new Scene(vBox);
            fxPanel.setScene(scene);
        });

        JButton back = new JButton("Back");
        back.addActionListener(e -> setVisible(false));
        getContentPane().add(back, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocation(600, 220);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Paytm::new);
    }
}
