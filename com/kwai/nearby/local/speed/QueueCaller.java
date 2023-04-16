package com.kwai.nearby.local.speed.QueueCaller;
import com.kwai.nearby.local.speed.QueueCaller$a;
import nsd.u;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import com.kwai.nearby.local.speed.QueueCaller$runnableInterval$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.concurrent.ConcurrentLinkedQueue;
import com.kwai.nearby.local.speed.QueueCaller$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Queue;
import java.lang.Runnable;
import gd7.a;
import lsb.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class QueueCaller	// class@000fe3
{
    public final Handler a;
    public Activity b;
    public final p c;
    public final Queue d;
    public boolean e;
    public final a f;
    public static final QueueCaller$a g;

    static {
       QueueCaller.g = new QueueCaller$a(null);
    }
    public void QueueCaller(){
       super();
       this.a = new Handler(Looper.getMainLooper());
       this.c = s.c(new QueueCaller$runnableInterval$2(this));
       this.d = new ConcurrentLinkedQueue();
       this.f = new QueueCaller$b(this);
    }
    public final void a(){
       long l;
       QueueCaller queueCaller = QueueCaller.class;
       if (PatchProxy.applyVoid(null, this, queueCaller, "5")) {
          return;
       }
       Runnable runnable = this.d.poll();
       if (runnable != null) {
          QueueCaller ta = this.a;
          a uoa = new a(runnable, this.f);
          Object obj = PatchProxy.apply(null, this, queueCaller, "2");
          if (obj != PatchProxyResult.class) {
             l = obj.longValue();
          }else if(this.b == null){
             l = 32;
          }else {
             Number number = PatchProxy.apply(null, this, queueCaller, "3");
             if (number == PatchProxyResult.class) {
                number = this.c.getValue();
             }
             l = number.longValue();
          }
          ta.postDelayed(uoa, l);
       }
       return;
    }
}
