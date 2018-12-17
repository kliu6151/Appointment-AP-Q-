package Kevin_Liu;

public class Appointment {
    public TimeInterval interval;

    public Appointment(TimeInterval interval)
    {
        this.interval = interval;
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
}
