package okhttp3.internal.http.HttpDate;
import okhttp3.internal.http.HttpDate$1;
import java.lang.String;
import java.text.DateFormat;
import java.lang.Object;
import java.util.Date;
import java.lang.ThreadLocal;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Locale;
import okhttp3.internal.Util;
import java.util.TimeZone;

public final class HttpDate	// class@001f89
{
    public static final DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS;
    public static final String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
    public static final ThreadLocal STANDARD_DATE_FORMAT;

    static {
       HttpDate.STANDARD_DATE_FORMAT = new HttpDate$1();
       String[] stringArray = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz","EEEE, dd-MMM-yy HH:mm:ss zzz","EEE MMM d HH:mm:ss yyyy","EEE, dd-MMM-yyyy HH:mm:ss z","EEE, dd-MMM-yyyy HH-mm-ss z","EEE, dd MMM yy HH:mm:ss z","EEE dd-MMM-yyyy HH:mm:ss z","EEE dd MMM yyyy HH:mm:ss z","EEE dd-MMM-yyyy HH-mm-ss z","EEE dd-MMM-yy HH:mm:ss z","EEE dd MMM yy HH:mm:ss z","EEE,dd-MMM-yy HH:mm:ss z","EEE,dd-MMM-yyyy HH:mm:ss z","EEE, dd-MM-yyyy HH:mm:ss z","EEE MMM d yyyy HH:mm:ss z"};
       HttpDate.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = stringArray;
       DateFormat[] uDateFormatA = new DateFormat[stringArray.length];
       HttpDate.BROWSER_COMPATIBLE_DATE_FORMATS = uDateFormatA;
    }
    public void HttpDate(){
       super();
    }
    public static String format(Date p0){
       return HttpDate.STANDARD_DATE_FORMAT.get().format(p0);
    }
    public static Date parse(String p0){
       Date uDate1;
       if (!p0.length()) {
          return null;
       }
       ParsePosition parsePositio = new ParsePosition(0);
       Date uDate = HttpDate.STANDARD_DATE_FORMAT.get().parse(p0, parsePositio);
       if (parsePositio.getIndex() == p0.length()) {
          return uDate;
       }
       String[] bROWSER_COMP = HttpDate.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
       _monitor_enter(bROWSER_COMP);
       int len = bROWSER_COMP.length;
       int i = 0;
       while (true) {
          if (i < len) {
             DateFormat[] bROWSER_COMP1 = HttpDate.BROWSER_COMPATIBLE_DATE_FORMATS;
             object oobject = bROWSER_COMP1[i];
             if (oobject == null) {
                oobject = new SimpleDateFormat(HttpDate.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[i], Locale.US);
                oobject.setTimeZone(Util.UTC);
                bROWSER_COMP1[i] = oobject;
             }
             parsePositio.setIndex(0);
             uDate1 = oobject.parse(p0, parsePositio);
             if (parsePositio.getIndex()) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             _monitor_exit(bROWSER_COMP);
             return null;
          }
       }
       _monitor_exit(bROWSER_COMP);
       return uDate1;
    }
}
