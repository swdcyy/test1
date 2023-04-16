package b7.d;
import android.content.Context;
import java.lang.String;
import g6.a;
import g6.b;
import b7.c;

public class d	// class@000ae5
{

    public static a a(Context p0,String p1){
       if (p0 == null) {
          return null;
       }
       if (b.a == null) {
          _monitor_enter(c.class);
          if (c.d == null) {
             c.d = new c(p0, p1);
          }
          _monitor_exit(c.class);
          b.b = c.d;
          b.a = new b();
       }
       return b.a;
    }
}
