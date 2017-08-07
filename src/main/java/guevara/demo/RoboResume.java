package guevara.demo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;


public class RoboResume {


    @NotNull(message = "You must enter a Name")
    @Size(min = 1, max = 45, message = "Item Name can be between 1 and 30 characters")
    private String roboName;
    @NotNull(message = "You must enter an Email")
    @Size(min = 1, max = 30, message = "Item Name can be between 1 and 30 characters")
    private String roboEmail;
    @NotNull(message = "You must enter a Organization")
    @Size(min = 1, max = 30, message = "Item Name can be between 1 and 30 characters")
    private String roboOrgan;
    private String date1;
    private String date2;


  //  @DateTimeFormat(pattern = "yyyy-MM-dd")


    public String getRoboName() {
        return roboName;
    }

    public void setRoboName(String roboName) {
        this.roboName = roboName;
    }

    public String getRoboEmail() {
        return roboEmail;
    }

    public void setRoboEmail(String roboEmail) {
        this.roboEmail = roboEmail;
    }

    public String getRoboOrgan() {
        return roboOrgan;
    }


    public void setRoboOrgan(String roboOrgan) {

        this.roboOrgan = roboOrgan;
    }


    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }


    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;

    }

    {
        try {
            //String date1 = "08/9/2017";
            //String date2 = "08/7/2017";

            String format = "MM/dd/yyyy";

            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Date dateObj1 = sdf.parse(date1);
            Date dateObj2 = sdf.parse(date2);

            System.out.println("Date 1:" + dateObj1);
            System.out.println("Date 2:" + dateObj2 + "n");

            // For thousand separator
            DecimalFormat decimalFormatter = new DecimalFormat("###,###");

            long diffInMilliSeconds = dateObj2.getTime() - dateObj1.getTime();

            System.out.println("difference in milliseconds: " + decimalFormatter.format(diffInMilliSeconds));

            int diffsec = (int) (diffInMilliSeconds / (1000));
            System.out.println("difference in seconds: " + decimalFormatter.format(diffsec));

            int diffInMin = (int) (diffInMilliSeconds / (60 * 1000));
            System.out.println("difference in minutes: " + decimalFormatter.format(diffInMin));

            int diffInHours = (int) (diffInMilliSeconds / (60 * 60 * 1000));
            System.out.println("difference in hours: " + decimalFormatter.format(diffInHours));

            int diffInDays = (int) (diffInMilliSeconds / (24 * 60 * 60 * 1000));
            System.out.println("difference in days: " + diffInDays);

            String diffdays = Integer.toString(diffInDays); // to display in the HTML...

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

