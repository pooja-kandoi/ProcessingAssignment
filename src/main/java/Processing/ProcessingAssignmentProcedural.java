package Processing;

import processing.core.PApplet;

public class ProcessingAssignmentProcedural extends PApplet {
    static final int WIDTH = 640;
    static final int HEIGHT = 480;
    static final int DIAMETER = 10;
    static final int NumberOfBalls = 4;


    public static void main(String[] args) {
        PApplet.main("Processing.ProcessingAssignmentProcedural", args);

    }

    int[][] Balls = new int[NumberOfBalls][2];

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {
        for (int i = 0; i < NumberOfBalls; i++) {
            Balls[i][0] = 0;
            Balls[i][1] = i + 1;
        }
    }

    @Override
    public void draw() {
        for (int ballId = 0; ballId < Balls.length; ballId++) {
            drawCircle(Balls[ballId]);
            Balls[ballId][0] += Balls[ballId][1];
        }
    }

    private void drawCircle(int[] Ball) {

        ellipse(Ball[0],
                (HEIGHT * Ball[1]) / (NumberOfBalls + 1),
                DIAMETER,
                DIAMETER);
    }
}
