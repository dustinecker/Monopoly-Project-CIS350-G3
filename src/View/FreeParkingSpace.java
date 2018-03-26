package View;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


/**********************************************************************
 * The FreeParkingSpace class creates a JPanel that resembles a Free
 * Parking Square from the game of Monopoly.
 *
 * @author Dustin Ecker
 * @version 3/26/2018
 *********************************************************************/
public class FreeParkingSpace extends JPanel {

	/**
	 * A static int constant to track the length of an edge in the square.
	 */
	private static final int LENGTH = 400;

	/**
	 * An image to hold the image of the Free Parking icon.
	 */
	private static Image freeParkingImg;

	/********************************************************************
	 * The constructor initializes the image.
	 *
	 * @throws IOException If there is an error in loading the image.
	 *******************************************************************/
	public FreeParkingSpace() throws IOException {
		freeParkingImg = ImageIO.read(new File("res/freeParkingImg.png"));
	}

	/********************************************************************
	 * The paintComponent draws Free Parking image onto the JPanel.
	 *
	 * @param g Graphics component of this panel.
	 ********************************************************************/
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(freeParkingImg, 0, 0, LENGTH, LENGTH, null);
	}

	/********************************************************************
	 * The getPreferredSize method is used to Lock the size of the Panel
	 * to the correct size.
	 * @return The dimensions of the FreeParkingSquare.
	 *******************************************************************/
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(LENGTH, LENGTH);
	}

	/********************************************************************
	 * The getMinimumSize method refers to the getPreferredSize method
	 * to lock the size of the panel.
	 * @return getPreferredSize the dimensions of the FreeParkingSquare.
	 *******************************************************************/
	@Override
	public Dimension getMinimumSize() {
		return getPreferredSize();
	}

	/********************************************************************
	 * The getMaximumSize method refers to the getPreferredSize method
	 * to lock the size of the panel.
	 * @return getPreferredSize the dimensions of the FreeParkingSquare.
	 *******************************************************************/
	@Override
	public Dimension getMaximumSize() {
		return getPreferredSize();
	}
}
