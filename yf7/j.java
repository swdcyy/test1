package yf7.j;
import java.util.concurrent.ConcurrentHashMap;
import yf7.j$a;
import java.lang.Object;
import java.lang.String;
import yf7.w;
import kotlin.jvm.internal.a;
import android.os.Looper;
import android.util.Printer;
import java.util.Map;

public final class j	// class@0028a1
{
    public static ConcurrentHashMap a;
    public static Printer b;
    public static final j c;

    static {
       j.c = new j();
       j.a = new ConcurrentHashMap();
       j.b = j$a.a;
    }
    public void j(){
       super();
    }
    public static final void a(String p0,w p1){
       a.q(p0, "tag");
       a.q(p1, "printer");
       if (j.a.isEmpty()) {
          Looper.getMainLooper().setMessageLogging(j.b);
       }
       j.a.put(p0, p1);
       return;
    }
    public static final void b(String p0){
       a.q(p0, "tag");
       j.a.remove(p0);
       if (j.a.isEmpty()) {
          Looper.getMainLooper().setMessageLogging(null);
       }
       return;
    }
}
