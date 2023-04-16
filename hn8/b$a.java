package hn8.b$a;
import ze.e;
import hn8.b;
import com.facebook.react.bridge.ReactContext;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Object;
import df.b;
import java.util.List;
import java.util.ArrayList;
import hn8.b$c;
import hn8.e;
import in8.m;
import java.util.Queue;
import java.util.LinkedList;
import hn8.c;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicBoolean;

public class b$a extends e	// class@0025b6
{
    public final b d;

    public void b$a(b p0,ReactContext p1){
       this.d = p0;
       super(p1);
    }
    public void c(long p0){
       b l;
       b$a td = this.d;
       td.o = (double)p0 / 1000000.00f;
       while (!td.m.isEmpty()) {
          td.c(td.m.poll());
       }
       if (!td.l.isEmpty()) {
          l = td.l;
          td.l = new ArrayList(l.size());
          int i = l.size();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             l.get(i1).a();
          }
       }
       if (td.n != null) {
          m.runUpdates(td.p);
       }
       if (!td.s.isEmpty()) {
          l = td.s;
          td.s = new LinkedList();
          b j = td.j;
          j.runOnNativeModulesQueueThread(new c(td, j, l));
       }
       td.h.set(false);
       td.n = false;
       if (!td.l.isEmpty() || !td.m.isEmpty()) {
          td.f();
       }
       return;
    }
}
