package com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask;
import sf7.a;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask$a;
import nsd.u;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask$mCountLatch$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.ArrayList;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask$c;
import java.lang.Object;
import java.util.List;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask$b;
import java.util.concurrent.atomic.AtomicInteger;
import qrd.l1;
import android.os.Looper;
import kotlin.jvm.internal.a;
import java.lang.String;
import tf7.b;

public abstract class BarrierTask extends DependencyTask implements a	// class@000da3
{
    public long o;
    public long p;
    public final p q;
    public List r;
    public static final BarrierTask$a s;

    static {
       BarrierTask.s = new BarrierTask$a(null);
    }
    public void BarrierTask(){
       super();
       this.q = s.c(new BarrierTask$mCountLatch$2(this));
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new BarrierTask$c(this));
       this.r = uArrayList;
    }
    public final BarrierTask$b C(){
       return this.q.getValue();
    }
    public boolean H7(){
       return true;
    }
    public void a(){
       BarrierTask$b uob = this.C();
       _monitor_enter(uob);
       if (this.r() == 2) {
          _monitor_exit(uob);
          return;
       }else {
          BarrierTask$b uob1 = this.C();
          BarrierTask$b b = uob1.b;
          _monitor_enter(b);
          if (!uob1.a.get()) {
             _monitor_exit(b);
          }else if(!uob1.a.decrementAndGet()){
             uob1.b.notifyAll();
          }
          _monitor_exit(b);
          _monitor_exit(uob);
          return;
       }
    }
    public void f(){
       this.A((a.g(Looper.myLooper(), Looper.getMainLooper()) ^ 0x01));
       this.name();
       new b(this.r, 0).a();
    }
    public void h(){
       BarrierTask$b uob = this.C();
       _monitor_enter(uob);
       if (this.r() == 2) {
          _monitor_exit(uob);
          return;
       }else {
          BarrierTask$b uob1 = this.C();
          BarrierTask$b b = uob1.b;
          _monitor_enter(b);
          uob1.a.incrementAndGet();
          _monitor_exit(b);
          _monitor_exit(uob);
          return;
       }
    }
    public void n(){
    }
    public int priority(){
       return Integer.MAX_VALUE;
    }
}
