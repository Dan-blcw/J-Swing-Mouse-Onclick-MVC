package mouse;

import javax.swing.UIManager;

public class test {
    public static void main(String[] args) {
        try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new mouseExampleView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
