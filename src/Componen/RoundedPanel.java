
package Componen;


import javax.swing.*;
import java.awt.*;

public class RoundedPanel extends JPanel {

    private int cornerRadius = 25;

    // Warna gradasi sesuai gambar
    private Color colorStart = new Color(255, 141, 141);     // Peach-pink (#FF8D8D)
    private Color colorEnd = new Color(255, 155, 127, 240);  // Oranye lembut transparan (#FF9B7FF0)

    public RoundedPanel() {
        super();
        setOpaque(false);
    }

    public RoundedPanel(int radius, Color start, Color end) {
        this.cornerRadius = radius;
        this.colorStart = start;
        this.colorEnd = end;
        setOpaque(false);
    }

    public void setCornerRadius(int radius) {
        this.cornerRadius = radius;
        repaint();
    }

    public void setGradientColors(Color start, Color end) {
        this.colorStart = start;
        this.colorEnd = end;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Gradasi diagonal (kiri atas ke kanan bawah)
        GradientPaint gradient = new GradientPaint(
            0, 0, colorStart,
            getWidth(), getHeight(), colorEnd
        );

        g2.setPaint(gradient);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        super.paintComponent(g);
        g2.dispose();
    }
}