public class TimeCalc {
    public static void main(String[] args) {
        String[] time_arts = args[0].split(":");
        int hours = Integer.parseInt(time_arts[0]);
        int minutes = Integer.parseInt(time_arts[1]);
        int minutes_add = Integer.parseInt(args[1]);

        int total_minutes = hours * 60 + minutes + minutes_add;
        int newHours = (total_minutes / 60) % 24;
        int newMinutes = total_minutes % 60;

        System.out.printf("%02d:%02d\n", newHours, newMinutes);
    }
}
