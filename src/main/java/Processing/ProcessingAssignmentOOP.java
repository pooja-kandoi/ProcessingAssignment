package Processing;

import processing.core.PApplet;

public class ProcessingAssignmentOOP extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int numberOfBalls = 4;


    MovingBall[] Balls;

    public static void main(String[] args) {
        PApplet.main("Processing.ProcessingAssignmentOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        Balls = new MovingBall[numberOfBalls];
        for (int ballId = 0; ballId < numberOfBalls; ballId++) {
            Balls[ballId] = new MovingBall(0, (HEIGHT * (ballId + 1)) / (numberOfBalls + 1), ballId + 1);
        }
    }

    @Override
    public void draw() {
        for (MovingBall ball : Balls) {
            drawCircle(ball);
            ball.moveBall();
        }
    }

    private void drawCircle(MovingBall ball) {
        ellipse(ball.xAxis, ball.yAxis, DIAMETER, DIAMETER);
    }
}
