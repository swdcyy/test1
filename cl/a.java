package cl.a;
import java.lang.String;
import java.util.TimeZone;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.lang.Math;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.IllegalArgumentException;
import java.lang.Exception;
import java.lang.Class;
import java.text.ParseException;
import java.lang.Throwable;
import java.lang.Character;
import java.lang.NumberFormatException;

public class a	// class@000d31
{
    public static final TimeZone a;

    static {
       a.a = TimeZone.getTimeZone("UTC");
    }
    public static boolean a(String p0,int p1,char p2){
       boolean b = (p1 < p0.length() && p0.charAt(p1) == p2)? true: false;
       return b;
    }
    public static Date b(String p0,ParsePosition p1){
       String message;
       ParseException parseExcepti;
       int i3;
       int i4;
       int i6;
       int i7;
       TimeZone a;
       String str = p0;
       ParsePosition parsePositio = p1;
       try{
          int index = p1.getIndex();
          int i = index + 4;
          index = a.c(str, index, i);
          char c = '-';
          if (a.a(str, i, c)) {
             i = i + 1;
          }
          int i1 = i + 2;
          i = a.c(str, i, i1);
          if (a.a(str, i1, c)) {
             i1 = i1 + 1;
          }
          int i2 = i1 + 2;
          i1 = a.c(str, i1, i2);
          int b = a.a(str, i2, 'T');
          if (!b && p0.length() <= i2) {
             parsePositio.setIndex(i2);
             return new GregorianCalendar(index, (i - 1), i1).getTime();
          }else {
             GregorianCalendar gregorianCal = 43;
             String str1 = 90;
             String str2 = 2;
             if (b) {
                i2 = i2 + 1;
                b = i2 + 2;
                i2 = a.c(str, i2, b);
                char c1 = ':';
                if (a.a(str, b, c1)) {
                   b = b + 1;
                }
                i3 = b + 2;
                b = a.c(str, b, i3);
                if (a.a(str, i3, c1)) {
                   i3 = i3 + 1;
                }
                if (p0.length() > i3) {
                   c1 = str.charAt(i3);
                   if (c1 != str1 && (c1 != gregorianCal && c1 != c)) {
                      i4 = i3 + 2;
                      i3 = a.c(str, i3, i4);
                      if (i3 > 59 && i3 < 63) {
                         i3 = 59;
                      }
                      if (a.a(str, i4, '.')) {
                         i4 = i4 + 1;
                         int i5 = i4 + 1;
                         while (true) {
                            if (i5 < p0.length()) {
                               char c2 = str.charAt(i5);
                               if (c2 < '0' || c2 > '9') {
                               label_00b9 :
                                  i6 = Math.min(i5, (i4 + 3));
                                  i7 = a.c(str, i4, i6);
                                  i6 = i6 - i4;
                                  if (i6 != 1) {
                                     if (i6 == str2) {
                                        i7 = i7 * 10;
                                     }
                                  }else {
                                     i7 = i7 * 100;
                                  }
                                  i4 = i5;
                               }else {
                                  i5 = i5 + 1;
                                  i6 = 45;
                               }
                            }else {
                               i5 = p0.length();
                               goto label_00b9 ;
                            }
                         }
                      }else {
                         i7 = 0;
                      }
                   }
                }
                i6 = i2;
                i2 = i3;
             label_00d7 :
                i4 = i2;
                i7 = 0;
                i3 = 0;
                i2 = i6;
             }else {
                i6 = 0;
                b = 0;
                goto label_00d7 ;
             }
             if (p0.length() > i4) {
                c = str.charAt(i4);
                String str3 = 5;
                if (c == str1) {
                   a = a.a;
                   i4 = i4 + 1;
                }else if(c == gregorianCal || c == '-'){
                   String str4 = str.substring(i4);
                   if (str4.length() < str3) {
                      str4 = str4+"00";
                   }
                   i4 = i4 + str4.length();
                   if (("+0000").equals(str4) || ("+00:00").equals(str4)) {
                      a = a.a;
                   }else {
                      str4 = "GMT"+str4;
                      TimeZone timeZone = TimeZone.getTimeZone(str4);
                      str1 = timeZone.getID();
                      if (str1.equals(str4) || (str1.replace(":", "")).equals(str4)) {
                         a = timeZone;
                      }else {
                         throw new IndexOutOfBoundsException("Mismatching time zone indicator: "+str4+" given, resolves to "+timeZone.getID());
                      }
                   }
                }else {
                   throw new IndexOutOfBoundsException("Invalid time zone indicator \'"+c+"\'");
                }
                gregorianCal = new GregorianCalendar(a);
                gregorianCal.setLenient(false);
                gregorianCal.set(1, index);
                gregorianCal.set(2, (i - 1));
                gregorianCal.set(5, i1);
                gregorianCal.set(11, i2);
                gregorianCal.set(12, b);
                gregorianCal.set(13, i3);
                gregorianCal.set(14, i7);
                parsePositio.setIndex(i4);
                return gregorianCal.getTime();
             }else {
                throw new IllegalArgumentException("No time zone indicator");
             }
          }
       }catch(java.lang.IndexOutOfBoundsException e0){
       }catch(java.lang.NumberFormatException e0){
       }catch(java.lang.IllegalArgumentException e0){
       }
       if (message.isEmpty()) {
          message = "\("+e0.getClass().getName()+"\)";
       }
    }
    public static int c(String p0,int p1,int p2){
       int i1;
       int i2;
       if (p1 < 0 || (p2 > p0.length() || p1 > p2)) {
          throw new NumberFormatException(p0);
       }
       int i = 10;
       if (p1 < p2) {
          i1 = p1 + 1;
          i2 = Character.digit(p0.charAt(p1), i);
          if (i2 >= 0) {
             i2 = - i2;
          }else {
             throw new NumberFormatException("Invalid number: "+p0.substring(p1, p2));
          }
       }else {
          i1 = p1;
          i2 = 0;
       }
       while (true) {
          if (i1 >= p2) {
             return (- i2);
          }
          int i3 = i1 + 1;
          i1 = Character.digit(p0.charAt(i1), i);
          if (i1 >= 0) {
             i2 = i2 * 10;
             i2 = i2 - i1;
             i1 = i3;
          }else {
             break ;
          }
       }
       throw new NumberFormatException("Invalid number: "+p0.substring(p1, p2));
    }
}
