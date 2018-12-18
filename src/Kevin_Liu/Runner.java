package Kevin_Liu;

public class Runner {
    public static void main(String[] args) {
        Appointment a0 = new Appointment(0,5);
        Appointment a1 = new Appointment(2, 3);
        Appointment a2 = new Appointment(3, 5);
        Appointment a3 = new Appointment(5, 10);
        Appointment a4 = new Appointment(12, 13);
        Appointment a5 = new Appointment(14, 17);
        Appointment a6 = new Appointment(20, 21);
        Appointment a7 = new Appointment(22, 23);
        Appointment a8 = new Appointment(23, 24);

        DailySchedule schedule = new DailySchedule();

        schedule.addAppt(a0, false);
        schedule.addAppt(a1, false);
        schedule.addAppt(a2, false);
        schedule.addAppt(a3, false);
        schedule.addAppt(a4, false);
        schedule.addAppt(a5, false);
        schedule.addAppt(a6, false);
        schedule.addAppt(a7, false);
        schedule.addAppt(a8, false);

        Appointment conflictAppt = new Appointment(6, 8);

        schedule.clearConflicts(conflictAppt);

        Appointment emergencyAppt = new Appointment(15, 16);

        schedule.addAppt(emergencyAppt, true);

        System.out.println(schedule);
    }
}
