package m75.g;
import java.lang.Runnable;
import java.lang.Object;
import android.os.SystemClock;
import m75.h;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;

public final class g implements Runnable	// class@001e4b
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final void run(){
       long l = SystemClock.elapsedRealtime();
       long l1 = l - h.g;
       boolean b = (l1 - 6000 >= 0)? true: false;
       if (b || (l - h.i) - 0x2710 >= 0) {
          h.d = h.b();
          h.i = l;
       }
       if (h.d != h.c) {
          a.e("AliveMonitor", "onTimer, oldNetAvailable="+h.c+", newNetAvailable="+h.d);
       }
       h.g(l, l1, b);
       h.c = h.d;
       h.j();
       return;
    }
}
