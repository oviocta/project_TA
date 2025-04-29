
package Componen;

import javax.swing.*;
import java.awt.*;

public class card extends JPanel {

    private int cornerRadius = 20;
    private Color backgroundColor = Color.WHITE;
    private Color shadowColor = new Color(0, 0, 0, 50);
    private int shadowOffset = 4;

    public card() {
        setOpaque(false);
    }

    public card(int cornerRadius, Color backgroundColor) {
        this.cornerRadius = cornerRadius;
        this.backgroundColor = backgroundColor;
        setOpaque(false);
    }

    public void setCornerRadius(int radius) {
        this.cornerRadius = radius;
        repaint();
    }

    public void setBackgroundColor(Color color) {
        this.backgroundColor = color;
        repaint();
    }

    public void setShadowColor(Color color) {
        this.shadowColor = color;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Bayangan (shadow)
        g2.setColor(shadowColor);
        g2.fillRoundRect(shadowOffset, shadowOffset, getWidth() - shadowOffset, getHeight() - shadowOffset, cornerRadius, cornerRadius);

        // Isi card
        g2.setColor(backgroundColor);
        g2.fillRoundRect(0, 0, getWidth() - shadowOffset, getHeight() - shadowOffset, cornerRadius, cornerRadius);

        super.paintComponent(g);
        g2.dispose();
    }
}
