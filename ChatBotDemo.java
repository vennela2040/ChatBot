import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Chatbot extends JFrame implements ActionListener {
    private JTextArea ca = new JTextArea();
    private JTextField cf = new JTextField();
    private JButton b = new JButton("SEND"); // Changed the button initialization
    private JLabel l = new JLabel();

    Chatbot() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Changed to JFrame.EXIT_ON_CLOSE
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setSize(400, 400);
        f.getContentPane().setBackground(Color.cyan);
        f.setTitle("ChatBot");

        f.add(ca);
        f.add(cf);

        ca.setSize(300, 310);
        ca.setLocation(1, 1);
        ca.setBackground(Color.BLACK);
        
        cf.setSize(300, 20);
        cf.setLocation(1, 320);
        
        b.setSize(400, 20);
        b.setLocation(300, 320);
        f.add(b);

        b.addActionListener(this); // Using 'this' as the ActionListener
        
        ca.setEditable(false); // Making JTextArea non-editable
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            String text = cf.getText().toLowerCase();
            ca.setForeground(Color.GREEN);
            ca.append("You--> " + text + "\n");
            cf.setText("");
            
            switch (text) {
                case "hi":
                    replyMeth("Hi there");
                    break;
                case "how are you":
                    replyMeth("I'm Good ;) Thank you for asking. What about you?");
                    break;
                case "what is your name":
                    replyMeth("I am trending BINOD");
                    break;
                case "gender":
                    replyMeth("I am a female. Don't try to flirt with me. You Fell in love :)");
                    break;
                case "love you":
                    replyMeth("I'm feeling shy. Love you too");
                    break;
                case "bye":
                    replyMeth("Too soon ;( Anyways STAY home STAY safe");
                    break;
                default:
                    replyMeth("I can't Understand");
                    break;
            }
        }
    }

    public void replyMeth(String s) {
        ca.append("ChatBot--> " + s + "\n");
    }
}

public class ChatBotDemo {
    public static void main(String[] args) {
        new Chatbot();
    }
}
