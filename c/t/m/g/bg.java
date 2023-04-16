package c.t.m.g.bg;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class bg	// class@000be4
{
    public static final HashMap a;

    static {
       bg.a = new HashMap();
    }
    public static synchronized void a(String p0,Object p1){
       _monitor_enter(bg.class);
       bg.a.put(p0, p1);
       _monitor_exit(bg.class);
    }
    public static synchronized Object b(String p0,Object p1){
       _monitor_enter(bg.class);
       p0 = bg.a.get(p0);
       if (p0 == null) {
       }else {
          p1 = p0;
       }
       _monitor_exit(bg.class);
       return p1;
    }
}
