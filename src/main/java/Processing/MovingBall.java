public class MovingBall {
    int xAxis;
    final int yAxis;
    final int speed;

    public MovingBall(int x, int y, int speed) {
        this.xAxis = x;
        this.yAxis = y;
        this.speed = speed;
    }

    public void moveBall() {
        this.xAxis += this.speed;
    }
}

