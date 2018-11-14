package LogicBasedSolution.QwickCilverWorkbook;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SubscriptionCalculator {

    public Date subcriptionPeriodCalculator(){

        Calendar ca = Calendar.getInstance();
        SimpleDateFormat myFormat = new SimpleDateFormat("ss:mm:HH");
        System.out.println("Subscription Starting Date:"+ca.getTime());
        System.out.println(ca.getTimeZone().getID());
        System.out.println(ca.get(Calendar.DAY_OF_YEAR));
        ca.add(Calendar.YEAR,1);
        Date subExDate = ca.getTime();
        System.out.println("Subscription Expiration Date:"+subExDate);
        return subExDate;

    }
}
