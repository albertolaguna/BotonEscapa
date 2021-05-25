import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BotonImposible extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private static final Integer WINDOW_WIDTH = 500;
	private static final Integer WINDOW_HEIGHT = 500;
	private static final Integer BTN_WIDTH = 150;
	private static final Integer BTN_HEIGHT = 50;
	
	private JLabel titleLbl;
	private JLabel userLbl;
	private JButton noBtn;
	private JButton yesBtn;
	private JPanel panel;
	private Font titleFont;
	private Font userFont;
	private Font buttonFont;
	private Random random;
	
	public BotonImposible() {
		initComponents();
		buildWindow();
		setButtonActions();
		setTitle("Sigueme en TikTok");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initComponents() {
		titleLbl = new JLabel("¿Me regalas un follow en TikTok?");
		userLbl = new JLabel("@jalagunam");
		yesBtn = new JButton("Por supuesto!");
		noBtn = new JButton("No quiero :(");
		panel = new JPanel();
		titleFont = new Font("Serif", Font.BOLD, 30);
		userFont = new Font("Serif", Font.BOLD, 20);
		buttonFont = new Font("Serif", Font.BOLD, 20);
		random = new Random();
	}
	
	private void buildWindow() {
		panel.setLayout(null);
		titleLbl.setFont(titleFont);
		titleLbl.setBounds(0, 100, 490, 50);
		titleLbl.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		panel.add(titleLbl);
		userLbl.setFont(userFont);
		userLbl.setBounds(0, 150, 490, 50);
		userLbl.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		panel.add(userLbl);
		yesBtn.setBounds(50,  250, BTN_WIDTH, BTN_HEIGHT);
		yesBtn.setFont(buttonFont);
		yesBtn.setFocusable(false);
		panel.add(yesBtn);
		noBtn.setBounds(290,  250, BTN_WIDTH, BTN_HEIGHT);
		noBtn.setFont(buttonFont);
		noBtn.setFocusable(false);
		panel.add(noBtn);
		add(panel);
	}
	
	private void setButtonActions() {
		yesBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Gracias! Aprendamos juntos");
				System.exit(0);
			}
		});
		
		noBtn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Integer nextX = random.nextInt(WINDOW_WIDTH - BTN_WIDTH +1);
				Integer nextY = random.nextInt(WINDOW_HEIGHT - BTN_HEIGHT +1);
				noBtn.setBounds(nextX, nextY, BTN_WIDTH, BTN_HEIGHT);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
