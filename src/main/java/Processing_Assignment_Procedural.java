import processing.core.PApplet;

public class Processing_Assignment_Procedural extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int NumberOfBalls = 4;


    public static void main(String[] args) {
        PApplet.main("Processing_Assignment_Procedural", args);

    }

    int[][] circle = new int[NumberOfBalls][2];

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {
        for (int i = 0; i < NumberOfBalls; i++) {
            circle[i][0] = 0;
            circle[i][1] = i + 1;
        }
    }

    @Override
    public void draw() {
        for (int i = 0; i < circle.length; i++) {
            drawcircle(circle[i]);
            circle[i][0] += circle[i][1];
        }
    }

    private void drawcircle(int[] circle) {

        ellipse(circle[0],
                (HEIGHT * circle[1]) / 5,
                DIAMETER,
                DIAMETER);
    }
}
