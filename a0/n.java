package a0.n;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Locale;
import android.util.Log;
import java.lang.StringBuilder;

public class n	// class@00000b
{

    public static void a(String p0,String p1,Object[] p2){
       Throwable throwable = n.d(p2);
       n.b(p1, throwable, p2);
       if (throwable != null) {
          n.g(p0);
       }else {
          n.g(p0);
       }
       return;
    }
    public static String b(String p0,Throwable p1,Object[] p2){
       if (p2 != null && (p1 != null || (p2.length > 0 || p2.length > 1))) {
          p0 = String.format(Locale.US, p0, p2);
       }
       return p0;
    }
    public static String c(Throwable p0){
       return Log.getStackTraceString(p0);
    }
    public static Throwable d(Object[] p0){
       if (p0 == null || !p0.length) {
          return null;
       }
       object oobject = p0[(p0.length - 1)];
       if (!oobject instanceof Throwable) {
          return null;
       }
       return oobject;
    }
    public static void e(String p0,String p1,Object[] p2){
       Throwable throwable = n.d(p2);
       n.b(p1, throwable, p2);
       if (throwable != null) {
          n.g(p0);
       }else {
          n.g(p0);
       }
       return;
    }
    public static boolean f(String p0,int p1){
       return Log.isLoggable(p0, p1);
    }
    public static String g(String p0){
       String str = "cr_";
       if (p0.startsWith(str)) {
          return p0;
       }
       int i = 0;
       if (p0.startsWith("cr.")) {
          i = 3;
       }
       return str+p0.substring(i, p0.length());
    }
    public static void h(String p0,String p1,Object[] p2){
       Throwable throwable = n.d(p2);
       n.b(p1, throwable, p2);
       if (throwable != null) {
          n.g(p0);
       }else {
          n.g(p0);
       }
       return;
    }
}
