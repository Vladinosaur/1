import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HW extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int m, n;
	int array[][];
	int arrayMod[][];
	public void loading() {
		
		try {
			Scanner sc = new Scanner(new File("E://File1.txt"));
			m = sc.nextInt();
			n = sc.nextInt();
			array = new int[m][n];
			arrayMod = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					array[i][j] = sc.nextInt();
					arrayMod[i][j] = array[i][j];
				}
			}
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n - 1; j++) {
					if (arrayMod[i][j + 1] % 2 == 0) {
						arrayMod[i][j] = arrayMod[i][j] / 2;
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void paint(Graphics g) {
		//final Random random = new Random();
		int x = 100, y = 100;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				switch(array[i][j]) {
					case(1):
					Color RED = new Color (255, 0 , 0);
					g.setColor(RED);
					g.fillRect(x, y, 50, 50);
					break;
					case(2):
					Color GREEN = new Color (0, 255 , 0);
					g.setColor(GREEN);
					g.fillRect(x, y, 50, 50);
					break;
					case(3):
					Color BLUE = new Color (0, 0, 255);
					g.setColor(BLUE);
					g.fillRect(x, y, 50, 50);
					break;
					case(4):
					Color YELLOW = new Color (255, 255, 0);
					g.setColor(YELLOW);
					g.fillRect(x, y, 50, 50);
					break;
					case(5):
					Color PINK = new Color (255, 0, 255);
					g.setColor(PINK);
					g.fillRect(x, y, 50, 50);
					break;
					case(6):
					Color TURQUOISE = new Color (0, 255, 255);
					g.setColor(TURQUOISE);
					g.fillRect(x, y, 50, 50);
					break;
					case(7):
					Color BLACK = new Color (0, 0 , 0);
					g.setColor(BLACK);
					g.fillRect(x, y, 50, 50);
					break;
					case(8):
					Color GREY = new Color (217, 225, 199);
					g.setColor(GREY);
					g.fillRect(x, y, 50, 50);
					break;
					case(9):
					Color BROWN = new Color (95, 27, 18);
					g.setColor(BROWN);
					g.fillRect(x, y, 50, 50);
					break;
				}
				
				x += 50;
			}
			
				y += 50;
				x = 100;

		}
		y = 300;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				switch(arrayMod[i][j]) {
					case(0):
					Color RE = new Color (255, 255, 255);
					g.setColor(RE);
					g.fillRect(x, y, 50, 50);
					case(1):
					Color RED = new Color (255, 0 , 0);
					g.setColor(RED);
					g.fillRect(x, y, 50, 50);
					break;
					case(2):
					Color GREEN = new Color (0, 255 , 0);
					g.setColor(GREEN);
					g.fillRect(x, y, 50, 50);
					break;
					case(3):
					Color BLUE = new Color (0, 0, 255);
					g.setColor(BLUE);
					g.fillRect(x, y, 50, 50);
					break;
					case(4):
					Color YELLOW = new Color (255, 255, 0);
					g.setColor(YELLOW);
					g.fillRect(x, y, 50, 50);
					break;
					case(5):
					Color PINK = new Color (255, 0, 255);
					g.setColor(PINK);
					g.fillRect(x, y, 50, 50);
					break;
					case(6):
					Color TURQUOISE = new Color (0, 255, 255);
					g.setColor(TURQUOISE);
					g.fillRect(x, y, 50, 50);
					break;
					case(7):
					Color BLACK = new Color (0, 0 , 0);
					g.setColor(BLACK);
					g.fillRect(x, y, 50, 50);
					break;
					case(8):
					Color GREY = new Color (217, 225, 199);
					g.setColor(GREY);
					g.fillRect(x, y, 50, 50);
					break;
					case(9):
					Color BROWN = new Color (95, 27, 18);
					g.setColor(BROWN);
					g.fillRect(x, y, 50, 50);
					break;
				}
				
				x += 50;
			}
			
				y += 50;
				x = 100;

		}
		
	}


}
