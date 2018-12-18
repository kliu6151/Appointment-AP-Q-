package Kevin_Liu;

import java.util.ArrayList;

public class DailySchedule {
    private ArrayList<Appointment> apptList;

    public DailySchedule()
    {
        apptList = new ArrayList();
    }

    public void clearConflicts(Appointment appt)
    {
        for(int i = 0;i<apptList.size();i++)
        {
            if(appt.conflictsWith(apptList.get(i)));
            {
                apptList.remove(i);
            }
        }
    }

    public boolean addAppt(Appointment appt, boolean emergency)
    {
        if(emergency == true)
        {
            clearConflicts(appt);
            apptList.add(appt);
            return true;
        }
        else
        {
            boolean conflicts = false;
            for (Appointment curAppt : apptList){
                if(appt.conflictsWith(curAppt) && !conflicts) conflicts = true;
            }
            if (!conflicts) apptList.add(appt);
            return conflicts;
        }
    }

    public String toString()
    {
        return apptList.toString();
    }
}
