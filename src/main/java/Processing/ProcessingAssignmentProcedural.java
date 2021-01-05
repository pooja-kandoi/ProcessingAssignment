import processing.core.PApplet;

public class Processing_Assignment_Procedural extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int NumberOfBalls = 4;


    public static void main(String[] args) {
        PApplet.main("Processing_Assignment_Procedural", args);

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
        for (int ball_id = 0; ball_id < Balls.length; ball_id++) {
            drawCircle(Balls[ball_id]);
            Balls[ball_id][0] += Balls[ball_id][1];
        }
    }

    private void drawCircle(int[] Ball) {

        ellipse(Ball[0],
                (HEIGHT * Ball[1]) / 5,
                DIAMETER,
                DIAMETER);
    }
}
