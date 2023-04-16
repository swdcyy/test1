package h80.k;
import java.lang.Object;
import h80.c;
import h80.f;
import h80.h;
import h80.j;

public class k	// class@00210b
{
    public static f a;
    public static c b;
    public static h c;
    public static j d;

    public void k(){
       super();
    }
    public static c a(){
       _monitor_enter(k.class);
       _monitor_exit(k.class);
       return k.b;
    }
    public static f b(){
       _monitor_enter(k.class);
       _monitor_exit(k.class);
       return k.a;
    }
    public static h c(){
       _monitor_enter(k.class);
       _monitor_exit(k.class);
       return k.c;
    }
    public static j d(){
       _monitor_enter(k.class);
       _monitor_exit(k.class);
       return k.d;
    }
    public static void e(c p0){
       _monitor_enter(k.class);
       k.b = p0;
       _monitor_exit(k.class);
    }
    public static void f(h p0){
       _monitor_enter(k.class);
       k.c = p0;
       _monitor_exit(k.class);
    }
}
