package f85.b;
import java.lang.Runnable;
import java.lang.Object;
import f85.f;
import java.util.Map;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;
import android.os.SystemClock;
import java.util.Collection;
import java.util.Iterator;
import f85.g;

public final class b implements Runnable	// class@0015e4
{
    public final int b;

    public void b(int p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       if (f.c == tb) {
       }else {
          f.c = tb;
          Map a = f.a;
          if (!a.isEmpty()) {
             if (f.c != 2) {
                f.c();
             }else {
                a.e("TagManager", "onLinkEventConnectStateChanged, sync all requests");
                long l = SystemClock.elapsedRealtime();
                Iterator iterator = a.values().iterator();
                while (iterator.hasNext()) {
                   iterator.next().c(l);
                }
                f.b();
             }
          }
       }
       return;
    }
}
