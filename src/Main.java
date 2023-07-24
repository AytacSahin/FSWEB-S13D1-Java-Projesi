public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        System.out.println(shouldWakeUp(true, 1));
//        System.out.println(shouldWakeUp(false, 2));
//        System.out.println(shouldWakeUp(true, 8));
//        System.out.println(shouldWakeUp(true, -1));
//
//        System.out.println(hasTeen(9, 99, 19));
//        System.out.println(hasTeen(23, 15, 42));
//        System.out.println(hasTeen(22, 23, 34));

//        System.out.println(isCatPlaying(true, 10));
//        System.out.println(isCatPlaying(false, 36));
//        System.out.println(isCatPlaying(false, 35));

//        System.out.println(area(5.0, 4.0));
//        System.out.println(area(-1.0, 4.0));

//        System.out.println(area(5.0));

    }

    ;

    public static boolean shouldWakeUp(boolean mode, int inTime) {
        return ((mode && (inTime > 20 || inTime < 8) && (inTime >= 0 && inTime < 24)));
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return (num1 > 13 && num1 <= 19 || num2 > 13 && num2 <= 19 || num3 > 13 && num3 <= 19);
    }

    ;

    public static boolean isCatPlaying(boolean mode, int degree) {
        return ((mode && 25 <= degree && degree <= 45) || (!mode && 25 <= degree && degree <= 35));
    }

    ;

    public static double area(double a, double b) {
        return (a < 0 || b < 0) ? -1 : (a * b);
    }

    ;

    public static double area(double radius) {
        return (radius < 0) ? -1 : (radius * radius * Math.PI);
    }

    ;


}

