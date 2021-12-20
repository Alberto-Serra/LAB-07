package pt.up.fe.ldts.example6;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Tree {
    private Date plantedAt;
    private Location location;
    private List<Date> appraisalDates;

    public Tree(Date plantedAt) {
        this.plantedAt = plantedAt;
        this.appraisalDates = new ArrayList<>();
    }

    public String toString() {
        return "Tree planted at " + this.plantedAt.toString() + " in location " + location.getLocationLatitude() + "," + location.getLocationLongitude() + " (" + location.getLocationName() + ")";
    }

    public Date getPlantedAt() {
        return plantedAt;
    }

    public void setLocation(String locationLatitude, String locationLongitude, String locationName) {
        location = new Location(locationLatitude, locationLongitude, locationName);
    }

    public Location getLocation() {
        return location;
    }

    void addAppraisal(Date appraisalDate) {
        this.appraisalDates.add(appraisalDate);
    }

    public List<Date> getAppraisals() {
        return this.appraisalDates;
    }


    private Calendar getCalender(Date latestAppraisalDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(latestAppraisalDate);
        calendar.add(Calendar.MONTH, 3);
        return calendar;

    }

    private Date getNextAppraisalDate() {
        Date latestAppraisalDate = new Date();
        if (this.appraisalDates.size() > 0)
            latestAppraisalDate = this.appraisalDates.get(0);
        for (Date appraisalDate : this.appraisalDates)
            if (latestAppraisalDate.before(appraisalDate))
                latestAppraisalDate = appraisalDate;
        return latestAppraisalDate;
    }

    public boolean isNextAppraisalOverdue() {
        Calendar calendar = getCalender(getNextAppraisalDate());
        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        else
            calendar.add(Calendar.DAY_OF_MONTH, 2);
        return calendar.getTime().before(new Date());
    }
}
