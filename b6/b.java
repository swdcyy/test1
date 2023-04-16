package b6.b;
import java.util.concurrent.ConcurrentHashMap;
import android.app.Activity;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import s6.b;
import android.content.Context;

public final class b	// class@000ae0
{
    public boolean a;
    public final Activity b;
    public b$a c;
    public final Handler d;
    public static final Map e;
    public static long f;

    static {
       b.e = new ConcurrentHashMap();
       b.f = -1;
    }
    public void b(Activity p0){
       super();
       this.a = false;
       this.d = new Handler(Looper.getMainLooper());
       this.b = p0;
       b.d().a(p0);
    }
}
