package be.vdab.taak;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Venster extends JFrame {
    public Venster() {
        super("Adapter oefening");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        addMouseListener(new MuisAdapter());
        pack();
    }
    private class MuisAdapter extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(Venster.this, String.valueOf(e.getX()));
        }
    }
}
