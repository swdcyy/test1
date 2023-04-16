package m75.f;
import java.lang.Runnable;
import java.lang.Object;
import android.os.SystemClock;
import m75.h;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;

public final class f implements Runnable	// class@001e4a
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final void run(){
       long l = SystemClock.elapsedRealtime();
       long l1 = l - h.g;
       boolean b = (l1 - 6000 >= 0)? true: false;
       h.d = h.b();
       a.e("AliveMonitor", "onNetworkChanged, oldNetAvailable="+h.c+", newNetAvailable="+h.d);
       if (h.E) {
          h.g(l, l1, b);
       }
       h.c = h.d;
       return;
    }
}
