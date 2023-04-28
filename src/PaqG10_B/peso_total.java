package PaqG10_B;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class peso_total extends JFrame {
    private JPanel panelpeso;
    private JTextField elPesoTotalEsTextField;
    private JTextField textField2;
    private JButton xButton;

public peso_total(Puerto hub) {
    setContentPane(panelpeso);
    setTitle("peso hub");
    setSize(640,420);
    setVisible(true);

    int suma_peso=0;
    for(int i=0;i<10;i++){
        for(int j=0;j<12;j++){
            suma_peso = suma_peso + hub.almacen[i][j].getPeso() ;

        }
    }
    xButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {









        }
    });
}
}

