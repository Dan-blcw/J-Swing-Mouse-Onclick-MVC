package mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Controller_mouse implements MouseListener, MouseMotionListener {
    private mouseExampleView mouseView;
    public Controller_mouse(mouseExampleView mouseView){
        this.mouseView = mouseView;
    }
    public void setMouseView(mouseExampleView mouseView) {
        this.mouseView = mouseView;
    }
    public mouseExampleView getMouseView() {
        return mouseView;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        this.mouseView.Click();        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.mouseView.enTer();        

        int x = e.getX();
        int y = e.getY();
        this.mouseView.upDate(x,y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.mouseView.exIt();   
        
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        this.mouseView.upDate(x,y);
        
    }
    
}
