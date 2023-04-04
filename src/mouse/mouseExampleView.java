package mouse;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
// import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mouseExampleView extends JFrame{
    private mouseExampleModel mouseModel;
    private JLabel jLabel_x;
    private JLabel jLabel_CntClick;
    private JLabel jLabel_y ;
    private JLabel jLabel_checkIn;
    private JLabel jLabel_Empty1;

    private MouseArea jPanel_Mouse;
    public mouseExampleView(){
        this.mouseModel = new  mouseExampleModel();
        this.inIt();
    }
    public void inIt(){
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);
        setBackground(Color.black);
        Controller_mouse sr = new Controller_mouse(this);
        jPanel_Mouse = new MouseArea();
        jPanel_Mouse.addMouseListener(sr);
        jPanel_Mouse.addMouseMotionListener(sr);


        AreaView jPanel_info = new AreaView();
        jPanel_info.setLayout(new GridLayout(3,3));
        
        JLabel jLabel_Position = new JLabel(" 	Position  ");
        jLabel_Position.setFont(new java.awt.Font("sansserif", 3, 14));
        
        JLabel jLabel_Click = new JLabel(" 	Number of Onclicks ");
        jLabel_Click.setFont(new java.awt.Font("sansserif", 3, 14));
        
        JLabel jLabel_check = new JLabel(" 	Mouse is in component ? ");
        jLabel_check.setFont(new java.awt.Font("sansserif", 3, 14));
        
        
        jLabel_x = new JLabel("indexX");jLabel_x.setFont(new java.awt.Font("sansserif", 6, 14));
        jLabel_y = new JLabel("indexY");jLabel_y.setFont(new java.awt.Font("sansserif", 6, 14));
        jLabel_CntClick = new JLabel("0");jLabel_CntClick.setFont(new java.awt.Font("sansserif", 6, 14));
        jLabel_checkIn = new JLabel("null");jLabel_checkIn.setFont(new java.awt.Font("sansserif", 6, 14));
        jLabel_Empty1 = new JLabel();

        
        jPanel_info.add(jLabel_Position);
        jPanel_info.add(jLabel_x);
        jPanel_info.add(jLabel_y);
        jPanel_info.add(jLabel_Click);
        jPanel_info.add(jLabel_CntClick);
        jPanel_info.add(jLabel_Empty1);
        jPanel_info.add(jLabel_check);
        jPanel_info.add(jLabel_checkIn);



        this.setLayout(new BorderLayout());
        this.add(jPanel_info,BorderLayout.SOUTH);
        this.add(jPanel_Mouse,BorderLayout.CENTER);
        this.setVisible(true);
    }
    public void Click(){
        this.mouseModel.countClick();
        this.jLabel_CntClick.setText(this.mouseModel.getCoUnt()+"");
    }
    public void enTer(){
        this.mouseModel.enTer();
        this.jLabel_checkIn.setText(this.mouseModel.getCheckIn()+"");
    }
    public void exIt(){
        this.mouseModel.exIt();
        this.jLabel_checkIn.setText(this.mouseModel.getCheckIn()+"");
    }
    public void upDate(int x,int y){
        this.mouseModel.setX(x);
        this.mouseModel.setY(y);
        this.jLabel_x.setText("X:	"+this.mouseModel.getX());
        this.jLabel_y.setText("Y:	"+this.mouseModel.getY()+"");
    }
}
