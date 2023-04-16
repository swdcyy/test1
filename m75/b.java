package m75.b;
import java.lang.Runnable;
import java.lang.Object;
import m75.h;
import android.os.SystemClock;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;

public final class b implements Runnable	// class@001e46
{
    public final int b;

    public void b(int p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       h.b = tb;
       long l = SystemClock.elapsedRealtime();
       long l1 = l - h.g;
       boolean b = (l1 - 6000 >= 0)? true: false;
       if (b || (l - h.i) - 0x2710 >= 0) {
          h.d = h.b();
          h.i = l;
       }
       a.e("AliveMonitor", "onLinkEventConnectStateChanged, oldState="+h.a+", newState="+tb+", oldNetAvailable="+h.c+", newNetAvailable="+h.d);
       if (h.E) {
          h.g(l, l1, b);
       }
       h.c = h.d;
       h.a = h.b;
       return;
    }
}
