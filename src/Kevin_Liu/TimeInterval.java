package Kevin_Liu;

public class TimeInterval {
    public int startTime;
    public int endTime;

    public TimeInterval(int startTime, int endTime)
    {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public boolean overlapsWith(TimeInterval interval)
    {
        if(interval.startTime >= startTime && interval.startTime <= endTime ||
        interval.endTime >= startTime && interval.endTime <= endTime)
        {
            return true;
        }
        return false;
    }
}
