package com.kuaishou.live.longconnection.connector.RunnablePipeline;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.lang.Object;
import java.util.concurrent.LinkedBlockingQueue;
import com.kuaishou.live.longconnection.connector.RunnablePipeline$Status;
import com.kuaishou.live.longconnection.connector.RunnablePipeline$a;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Queue;
import java.lang.Long;
import android.os.SystemClock;
import com.kuaishou.live.longconnection.connector.RunnablePipeline$b;
import java.util.Iterator;

public class RunnablePipeline	// class@000c59
{
    public final Queue a;
    public final Queue b;
    public RunnablePipeline$Status c;
    public boolean d;
    public Runnable e;
    public static ExecutorService f;

    static {
       RunnablePipeline.f = c.c();
    }
    public void RunnablePipeline(){
       super();
       this.a = new LinkedBlockingQueue();
       this.b = new LinkedBlockingQueue();
       this.c = RunnablePipeline$Status.IDLE;
       this.e = new RunnablePipeline$a(this);
    }
    public void a(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RunnablePipeline.class, "2")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public void b(Runnable p0,long p1){
       RunnablePipeline runnablePipe = RunnablePipeline.class;
       if (PatchProxy.isSupport(runnablePipe) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, runnablePipe, "3")) {
          return;
       }
       long l = SystemClock.elapsedRealtime() + p1;
       if (!PatchProxy.isSupport(runnablePipe) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(l), this, runnablePipe, "4")) {
          RunnablePipeline tb = this.b;
          _monitor_enter(tb);
          this.b.add(new RunnablePipeline$b(p0, l));
          _monitor_exit(tb);
       }
       return;
    }
    public void c(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RunnablePipeline.class, "5")) {
          return;
       }
       this.a.remove(p0);
       RunnablePipeline tb = this.b;
       _monitor_enter(tb);
       Iterator iterator = this.b.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (p0 == iterator.next().c) {
                break ;
             }
          }else {
             _monitor_exit(tb);
             return;
          }
       }
       iterator.remove();
       _monitor_exit(tb);
       return;
    }
}
