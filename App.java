import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton button1;
    private JTextField textField1;
    private JPanel panel;
    private JLabel label1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public App() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField1.getText();
                label1.setText(text);
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }
}
