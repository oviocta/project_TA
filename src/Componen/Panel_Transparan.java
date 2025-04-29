
package Componen;

import javax.swing.*;
import java.awt.*;

public class Panel_Transparan extends JPanel {

    private int cornerRadius = 25;
    private Color backgroundColor = new Color(255, 255, 255, 179); // Putih dengan alpha 70%

    public Panel_Transparan() {
        super();
        setOpaque(false);
    }

    public Panel_Transparan(int radius, Color bgColor) {
        this.cornerRadius = radius;
        this.backgroundColor = new Color(bgColor.getRed(), bgColor.getGreen(), bgColor.getBlue(), 179);
        setOpaque(false);
    }

    public void setCornerRadius(int radius) {
        this.cornerRadius = radius;
        repaint();
    }

    public void setBackgroundColor(Color bgColor) {
        // Set alpha 70% (179) meskipun warna dari luar full solid
        this.backgroundColor = new Color(bgColor.getRed(), bgColor.getGreen(), bgColor.getBlue(), 179);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(backgroundColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        super.paintComponent(g);
        g2.dispose();
    }
}