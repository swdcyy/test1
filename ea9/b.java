package ea9.b;
import java.util.WeakHashMap;
import g79.a;
import android.app.Application;
import ea9.b$a;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;

public final class b	// class@00215b
{
    public static final Map a;
    public static final b b;

    static {
       b.b = new b();
       b.a = new WeakHashMap();
       a.c.b().registerActivityLifecycleCallbacks(new b$a());
    }
    public void b(){
       super();
    }
}
