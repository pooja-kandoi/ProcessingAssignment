import processing.core.PApplet;

public class Processing_Assignment_OOP extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    public static class MovingBall{
        int xAxis;
        int yAxis;
        int speed;

        public MovingBall(int x, int y, int speed){
            this.xAxis=x;
            this.yAxis=y;
            this.speed=speed;
        }
    }
    MovingBall[] Balls;
    public static void main(String[] args){
        PApplet.main("Processing_Assignment_OOP",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        Balls=new MovingBall[4];
        for(int i=0;i<4;i++){
            Balls[i]=new MovingBall(0,(HEIGHT*(i+1))/5,i+1);
        }
    }

    @Override
    public void draw() {
        for (MovingBall ball : Balls) {
            drawCircle(ball);
            ball.xAxis += ball.speed;
        }
    }

    private void drawCircle(MovingBall ball) {
        ellipse(ball.xAxis,ball.yAxis,DIAMETER,DIAMETER);
    }
}
