package c.t.m.g.be;
import android.content.Context;
import java.lang.NullPointerException;
import java.lang.String;
import c.t.m.g.t;

public class be	// class@000be2
{
    public static boolean a;
    public static Context b;

    public static synchronized final Context a(){
       _monitor_enter(be.class);
       if (be.b == null) {
          throw new NullPointerException("u should init first.");
       }
       _monitor_exit(be.class);
       return be.b;
    }
    public static synchronized final void a(Context p0){
       _monitor_enter(be.class);
       if (be.b == null || be.b.getApplicationContext() == null) {
          if (p0 != null && p0.getApplicationContext() != null) {
             be.b = p0.getApplicationContext();
             t.a();
          }else {
             throw new NullPointerException("context cannot be null.");
          }
       }
       _monitor_exit(be.class);
       return;
    }
    public static final void a(boolean p0){
       be.a = p0;
    }
}
