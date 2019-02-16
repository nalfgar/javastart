package methodsAndConstructors;

public class CalculateTime {


    public static void main(String[] args) {
        Time time = new Time();

        System.out.println(time.hours2minutes(1));
        System.out.println(time.minutes2seconds(time.hours2minutes(1)));
        System.out.println(time.minutes2miliseconds(time.minutes2seconds(time.hours2minutes(1))));

        System.out.println(time.hours2minutes(24));
        System.out.println(time.minutes2seconds(time.hours2minutes(24)));
        System.out.println(time.minutes2miliseconds(time.minutes2seconds(time.hours2minutes(24))));

    }

}
