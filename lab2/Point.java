package lab2;

public class Point {
    int x;
    int y;

    public Point(int x_t , int y_t){
        x = x_t;
        y = y_t;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        Point p = new Point(x,y);

        System.out.println(p.getX());
        System.out.println(p.getY());
        
        scanner.close();
    }
}
