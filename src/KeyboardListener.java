import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class KeyboardListener {

	public static void main(String[] args) {

		// Create a JFrame to capture keyboard events
		JFrame frame = new JFrame("Key Listener Example");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add a key listener to the frame
		frame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// Print details about the key pressed
				System.out.println("Key Pressed: (" + e.getExtendedKeyCode() + ") " + KeyEvent.getKeyText(e.getExtendedKeyCode()));
			}
		});

		// Make the frame visible
		frame.setVisible(true);
	}

}
