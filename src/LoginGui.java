import javax.swing.*;

public class LoginGui extends JFrame {
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userText;
    private JPasswordField passwordText;
    private JButton loginButton;

    public LoginGui() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        userLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        userText = new JTextField(20);
        passwordText = new JPasswordField(20);
        loginButton = new JButton("Login");

        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(loginButton);

        add(panel);

        loginButton.addActionListener(e -> {
            String username = userText.getText();
            String password = new String(passwordText.getPassword());

            if (username.equals("login") && password.equals("password")) {
                JOptionPane.showMessageDialog(null, "Welcome");
                // Open a new window here
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
            }
        });
    }

    public static void main(String[] args) {
        LoginGui gui = new LoginGui();
        gui.setVisible(true);
    }
}
