import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WeekDay {
    public static void main(String[] args) {


        Date date=new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        
        /*Calendar c = Calendar.getInstance();
        static int set.Date()
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        for (int i = 0; i < 7; i++) {

                System.out.println(df.format(c.getTime()));
                c.add(Calendar.DATE, 1);

        }*/
    }
}
