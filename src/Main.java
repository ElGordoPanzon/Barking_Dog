public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(int hoursOfDay) {
        if (hoursOfDay < 0 || hoursOfDay > 23) {
            return false;
        }
        return false; // <--why false here?
    }

    public static boolean barking(boolean barking) {
        if (barking && (hoursOfDay < 8 || hoursOfDay > 22)) {
            return true;
        } else {
            return false;
        }

    }
}