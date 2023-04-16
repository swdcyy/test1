package c.t.m.g.m;
import java.lang.String;
import c.t.m.g.cb;
import android.os.Build$VERSION;

public class m	// class@000c9d
{
    public static String a = "";

    public static String a(){
       if (m.e()) {
          return m.a;
       }
       return cb.b();
    }
    public static String b(){
       if (m.e()) {
          return m.a;
       }
       return cb.e();
    }
    public static String c(){
       if (m.e()) {
          return "";
       }
       return cb.c();
    }
    public static String d(){
       String str = "";
       if (m.e()) {
          return str;
       }
       if (Build$VERSION.SDK_INT < 29) {
          str = cb.f();
       }
       return str;
    }
    public static boolean e(){
       return false;
    }
}
