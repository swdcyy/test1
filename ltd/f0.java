package ltd.f0;
import java.lang.Object;
import msd.a;
import nsd.c0;

public final class f0	// class@001cc8
{

    public static void a(){
    }
    public static final Object b(Object p0,a p1){
       _monitor_enter(p0);
       c0.d(1);
       _monitor_exit(p0);
       c0.c(1);
       return p1.invoke();
    }
}
