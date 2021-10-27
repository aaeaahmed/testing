import java.util.ArrayList;
import java.util.HashSet;

/**
 * Class OfficeHourSchedule. 
 * It keeps information about available office hours at MUN.
 *
 * @author course instructor
 * @version 2021.02.11
 */
public class OfficeHourSchedule
{
    private ArrayList<OfficeHour> officeHours;

    /**
     * Constructor for objects of class OfficeHourSchedule
     */
    public OfficeHourSchedule()
    {
        officeHours = new ArrayList<>();
        addOfficeHoursFromFile("office.csv");
    }
    
    /**
     * Prints names of instructors who have office hours on the given day
     * @param day The day of the week.
     */
    public void printIsInOn(String day)
    {
        // put your code here
        officeHour.forEach(officeHours -> System.out.println(day.getInstructor()));
                          
    }
    
    /**
     * Checks if instructor is available during the week for at least the given time
     * @param instructor The name of the instructor
     * @param minutes The time threashold
     * @return TRUE if instructor is available for the given threashold; otherwise FALSE
     */
    public boolean isAvailableFor(String instructor, int minutes)
    {
        // put your code here
        
        if (officeHours.steam() 
                             .filter(s-> 
    }
    
    /**
     * Add the office hours recorded in the given filename to the schedule.
     * @param filename A CSV file of OfficeHour records.
     */
    private void addOfficeHoursFromFile(String filename)
    {
        OfficeHourReader reader = new OfficeHourReader();
        officeHours.addAll(reader.getOfficeHours(filename));
    }

    /**
     * Prints for all office hours the corresponding info
     */
    public void printAllOfficeHours()
    {
        for (OfficeHour officeh : officeHours)
        {
            officeh.printInfo();
            System.out.println();
        }
    }
    
    public void findInstructorsOnAfter (String campus,int hour) 
    {
       file = new ArrayList<>();
       
        OfficeHour.stream()
                  .filter(officeHours ->officeHours.getStartHour(hour))
                  .filter(officeHours ->officeHours.getCampus(campus))
                  .map(officeHours -> officeHours.add(file))
                  .removeif(this.instructor.equals(this.instructor))
                  .reduce()
                  file.forEach(file -> System.out.println(file))
           
                  
                  
    }
}