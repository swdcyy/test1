package fyd.a$b;
import fyd.a$c;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Throwable;
import java.lang.StackTraceElement;
import java.lang.IllegalStateException;
import android.util.Log;
import java.lang.Math;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import android.os.Build$VERSION;

public class a$b extends a$c	// class@000ef5
{
    public static final Pattern b;

    static {
       a$b.b = Pattern.compile("\(\\$\\d+\)+$");
    }
    public void a$b(){
       super();
    }
    public final String a(){
       String str = super.a();
       if (str != null) {
          return str;
       }
       StackTraceElement[] stackTrace = new Throwable().getStackTrace();
       if (stackTrace.length > 5) {
          return this.e(stackTrace[5]);
       }
       throw new IllegalStateException("Synthetic stacktrace didn\'t have enough elements: are you using proguard?");
    }
    public void c(int p0,String p1,String p2,Throwable p3){
       if (p2.length() < 4000) {
          if (p0 == 7) {
             Log.wtf(p1, p2);
          }
          return;
       }else {
          int i = 0;
          int i1 = p2.length();
          while (i < i1) {
             int i2 = p2.indexOf(10, i);
             if (i2 == -1) {
                i2 = i1;
             }
             int i3 = i + 4000;
             i3 = Math.min(i2, i3);
             String str = p2.substring(i, i3);
             while (p0 == 7) {
                Log.wtf(p1, str);
                break ;
                i = i3;
             }
             if (i3 >= i2) {
                i = i3 + 1;
             }else {
                goto label_0035 ;
             }
          }
          return;
       }
    }
    public String e(StackTraceElement p0){
       String className = p0.getClassName();
       Matcher matcher = a$b.b.matcher(className);
       if (matcher.find()) {
          className = matcher.replaceAll("");
       }
       className = className.substring((className.lastIndexOf(46) + 1));
       if (className.length() > 23 && Build$VERSION.SDK_INT < 24) {
          className = className.substring(0, 23);
       }
       return className;
    }
}
