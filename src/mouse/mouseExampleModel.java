package mouse;

public class mouseExampleModel {
    private int x,y;
    private int coUnt;
    private String checkIn;//yes, no
    public mouseExampleModel(){
        this.x=0;
        this.y=0;
        this.coUnt = 0;
        this.checkIn = "No";
    }
    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }
    public void setCoUnt(int coUnt) {
        this.coUnt = coUnt;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String getCheckIn() {
        return checkIn;
    }
    public int getCoUnt() {
        return coUnt;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void countClick(){
        this.coUnt++;
    }
    public void enTer(){
        this.checkIn = "Yeah, it is in coverage";
    }
    public void exIt(){
        this.checkIn = "Nahh, it's not in the coverage area";
    }
}
