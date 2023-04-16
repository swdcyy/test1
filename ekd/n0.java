package ekd.n0;
import java.lang.String;
import java.lang.Object;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.text.DateFormatSymbols;
import java.lang.CharSequence;
import android.text.TextUtils;

public class n0	// class@001560
{

    public static String a(String p0,Object[] p1){
       return String.format(Locale.US, p0, p1);
    }
    public static DecimalFormat b(String p0){
       return new DecimalFormat(p0, new DecimalFormatSymbols(Locale.US));
    }
    public static SimpleDateFormat c(String p0){
       return new SimpleDateFormat(p0, new DateFormatSymbols(Locale.US));
    }
    public static String d(String p0){
       if (TextUtils.isEmpty(p0)) {
          return p0;
       }
       return p0.toLowerCase(Locale.US);
    }
    public static String e(String p0){
       if (TextUtils.isEmpty(p0)) {
          return p0;
       }
       return p0.toUpperCase(Locale.US);
    }
}
