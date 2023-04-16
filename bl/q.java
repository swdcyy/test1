package bl.q;
import java.text.DateFormat;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class q	// class@000b4f
{

    public static DateFormat a(int p0,int p1){
       String str1;
       StringBuilder str = "";
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 == 3) {
                   str1 = "M/d/yy";
                }else {
                   throw new IllegalArgumentException("Unknown DateFormat style: "+p0);
                }
             }else {
                str1 = "MMM d, yyyy";
             }
          }else {
             str1 = "MMMM d, yyyy";
          }
       }else {
          str1 = "EEEE, MMMM d, yyyy";
       }
       str = str+str1+" ";
       if (p1 && p1 != 1) {
          if (p1 != 2) {
             if (p1 == 3) {
                str1 = "h:mm a";
             }else {
                throw new IllegalArgumentException("Unknown DateFormat style: "+p1);
             }
          }else {
             str1 = "h:mm:ss a";
          }
       }else {
          str1 = "h:mm:ss a z";
       }
       return new SimpleDateFormat(str+str1, Locale.US);
    }
}
