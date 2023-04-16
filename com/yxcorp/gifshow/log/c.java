package com.yxcorp.gifshow.log.c;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import hkd.b;
import java.lang.String;
import java.util.concurrent.ThreadPoolExecutor$DiscardPolicy;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.RejectedExecutionHandler;
import com.google.protobuf.nano.MessageNano;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.util.Pair;
import java.lang.Boolean;
import java.util.Queue;
import com.yxcorp.gifshow.log.c$a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import com.yxcorp.gifshow.log.n;
import java.util.Objects;
import k2b.s0;
import android.os.Handler;
import java.lang.RuntimeException;
import java.util.Collection;
import ekd.q;
import com.kuaishou.client.log.packages.nano.ClientLog$BatchReportEvent;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import java.lang.Exception;

public class c	// class@001af8
{
    public AtomicBoolean a;
    public AtomicInteger b;
    public AtomicInteger c;
    public int d;
    public int e;
    public long f;
    public Queue g;
    public n h;
    public final ScheduledExecutorService i;
    public static c j;

    static {
       c.j = new c();
    }
    public void c(){
       super();
       this.a = new AtomicBoolean(true);
       this.b = new AtomicInteger(0);
       this.c = new AtomicInteger(0);
       this.d = 0x4b000;
       this.e = 100;
       this.f = 1000;
       this.g = new ConcurrentLinkedQueue();
       this.h = null;
       this.i = new ScheduledThreadPoolExecutor(true, new b("log_intercepor"), new ThreadPoolExecutor$DiscardPolicy());
    }
    public static c c(){
       return c.j;
    }
    public void a(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       this.g.add(new Pair(p0, Boolean.FALSE));
       this.b.incrementAndGet();
       p0.toString();
       if (this.g.size() >= this.e) {
          this.d();
       }
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "6")) {
          return;
       }
       this.b.get();
       this.c.get();
       this.a.set(false);
       if (this.c.get() < this.b.get()) {
          this.g.toString();
          this.i.submit(new c$a(this));
       }
       try{
          this.i.shutdown();
          c th = this.h;
          if (th != null) {
             th.X0();
             th = this.h;
             Objects.requireNonNull(th);
             if (!PatchProxy.applyVoid(objArray, th, n.class, "138")) {
                th.b.post(new s0(th));
             }
          }
       }catch(java.lang.RuntimeException e0){
          e0.getMessage();
       }
       this.b.get();
       this.c.get();
       return;
    }
    public synchronized void d(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       if (q.f(this.g)) {
          return;
       }
       this.g.size();
       ClientLog$BatchReportEvent uBatchReport = new ClientLog$BatchReportEvent();
       int i = this.g.size();
       ClientLog$ReportEvent[] reportEventA = new ClientLog$ReportEvent[i];
       uBatchReport.event = reportEventA;
       int i1 = 0;
       c uoc = null;
       while (i1 < i) {
          uoc = this.c;
          try{
             uoc.incrementAndGet();
             uBatchReport.event[i1] = this.g.remove().first;
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
          i1 = i1 + 1;
          uoc = 1;
       }
       if (uoc != null) {
          this.h.k1(uBatchReport, false, "kwai");
       }
       return;
    }
}
