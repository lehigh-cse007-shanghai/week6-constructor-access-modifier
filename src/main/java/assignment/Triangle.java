package assignment;

public class Triangle {
    private Point p1, p2, p3;
    private Segment s1, s2, s3;

    Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.s1 = new Segment(p1, p2);
        this.s2 = new Segment(p2, p3);
        this.s3 = new Segment(p1, p3);
    }
}
