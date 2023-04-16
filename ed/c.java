package ed.c;
import java.lang.Runtime;
import java.lang.Math;
import java.lang.Object;
import ed.b;

public class c	// class@00152d
{
    public static final int a;
    public static int b;
    public static b c;

    static {
       int i = (int)Math.min(Runtime.getRuntime().maxMemory(), 0x7fffffff);
       i = ((long)i - 0x1000000 > 0)? (i / 4) * 3: i / 2;
       c.a = i;
       c.b = 384;
    }
    public void c(){
       super();
    }
    public static b a(){
       if (c.c == null) {
          c uoc = c.class;
          _monitor_enter(uoc);
          if (c.c == null) {
             c.c = new b(c.b, c.a);
          }
          _monitor_exit(uoc);
       }
       return c.c;
    }
}
