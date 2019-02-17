package accesSpecifier;

public class PointApp {

    public static void main(String[] args) {
        Point point = new Point(0,0);
        PointController pointController = new PointController();

        pointController.addX(point);

        System.out.println(point.getX());
        System.out.println(point.getY());

        pointController.addY(point);

        System.out.println(point.getX());
        System.out.println(point.getY());


    }

}
