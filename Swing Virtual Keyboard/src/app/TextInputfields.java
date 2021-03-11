package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class TextInputfields {

	private static JFrame frame;
	private static JTextField textField;
	private static JTextArea textArea;
	private static JPasswordField passwordField;
	private static PopupKeyboard keyboard;
	public static JButton submit;
	
	public static void main(String[] args) {
		
		frame = new JFrame();
		frame.setBounds(0, 0, 1404, 970);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 702, 936);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFocusable(false);
		textField.setFont(new Font("Roboto", Font.PLAIN, 15));
		textField.setBounds(200, 100, 200, 30);
		panel.add(textField);
		
		
		
		textField.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {	
            	keyboard = new PopupKeyboard(textField);
                Point p = textField.getLocationOnScreen();
                p.y += 1000;
                keyboard.setLocation(p);
                keyboard.setVisible(true);
            }
        });
		
		JLabel lblNewLabel = new JLabel("Text Field");
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		lblNewLabel.setBounds(100, 100, 100, 25);
		panel.add(lblNewLabel);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Roboto", Font.PLAIN, 15));
		textArea.setBounds(200, 200, 200, 25);
		panel.add(textArea);
		
		textArea.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {	
            	keyboard = new PopupKeyboard(textArea);
                Point p = textArea.getLocationOnScreen();
                p.y += 1000;
                keyboard.setLocation(p);
                keyboard.setVisible(true);
            }
        }); 
		
		JLabel lblNewLabel_1 = new JLabel("Text Area");
		lblNewLabel_1.setFont(new Font("Roboto", Font.BOLD, 15));
		lblNewLabel_1.setBounds(100, 200, 100, 25);
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Roboto", Font.PLAIN, 15));
		passwordField.setBounds(200, 300, 200, 25);
		panel.add(passwordField);
		
		passwordField.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {	
            	keyboard = new PopupKeyboard(passwordField);
                Point p = passwordField.getLocationOnScreen();
                p.y += 1000;
                keyboard.setLocation(p);
                keyboard.setVisible(true);
            }
        });
		
		
		
		
		JLabel lblPasswordField = new JLabel("Password Field");
		lblPasswordField.setFont(new Font("Roboto", Font.BOLD, 15));
		lblPasswordField.setBounds(75, 300, 125, 25);
		panel.add(lblPasswordField);
		
		submit = new JButton("submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				demo();
			}
		});
		submit.setBounds(221, 374, 117, 25);
		panel.add(submit);
		frame.setVisible(true);
	}
	
	public static void demo() {
		System.out.println(textField.getText());
		System.out.println(textArea.getText());
		System.out.println(passwordField.getText());
	}
}
