/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
/**
 *
 * @author aliff
 */

public class ScrollPanel extends JFrame{
    JFrame frame = new JFrame();
    JScrollPane scroll = new JScrollPane();
    JLabel label = new JLabel();
    JPanel panel = new JPanel();
   
    public ScrollPanel(){
        label.setPreferredSize(new Dimension(1440, 891));
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setViewportBorder(new LineBorder(Color.BLACK));
        scroll.getViewport().add(label, null);
        frame.setSize(1440,891);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.add(scroll);
    }
public static void main (String[] args){
    new ScrollPanel();
}
}

