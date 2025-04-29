
package Componen;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class CustomButton extends JButton {

    public CustomButton() {
        // Set tampilan default
        setText("Tombol Custom");
        setFont(new Font("Segoe UI", Font.BOLD, 14));
        setBackground(new Color(70, 130, 180));
        setForeground(Color.WHITE);
        setFocusPainted(false);
        setBorderPainted(false);

        // Hover effect
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setBackground(new Color(100, 149, 237)); // warna saat hover
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                setBackground(new Color(70, 130, 180)); // balik ke warna awal
            }
        });
    }
}