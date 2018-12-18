package Kevin_Liu;

public class Appointment {
    public TimeInterval interval;

    public Appointment(int startTime, int endTime)
    {
        this.interval = new TimeInterval(startTime, endTime);
    }
    public TimeInterval getTime()
    {
        return this.interval;
    }

    public boolean conflictsWith(Appointment Other)
    {
        if(Other.interval.overlapsWith(interval)) {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return "Start: " + this.interval.getStartTime() + ", End: " + this.interval.getEndTime() + "\n";
    }
}
