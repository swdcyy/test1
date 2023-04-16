package com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter;
import eh5.o;
import trd.j;
import com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter$mHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import eh5.a;
import com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter$cancelTaskByBatchId$$inlined$synchronized$lambda$1;
import java.util.List;
import msd.l;
import trd.y;
import eh5.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import eh5.u;
import com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter$put$1;
import eh5.u$a;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Handler;
import java.lang.Integer;
import com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter$quit$1$1;
import android.os.Looper;
import qrd.l1;
import android.os.Message;

public class AsyncStageScatter extends o	// class@000bb9
{
    public final j c;
    public final p d;

    public void AsyncStageScatter(){
       super();
       this.c = new j();
       this.d = s.c(new AsyncStageScatter$mHandler$2(this));
    }
    public void c(long p0){
       AsyncStageScatter uAsyncStageS = AsyncStageScatter.class;
       if (PatchProxy.isSupport(uAsyncStageS) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAsyncStageS, "9")) {
          return;
       }
       this.m(p0);
       return;
    }
    public void d(long p0,a p1){
       AsyncStageScatter uAsyncStageS = AsyncStageScatter.class;
       if (PatchProxy.isSupport(uAsyncStageS) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uAsyncStageS, "11")) {
          return;
       }
       AsyncStageScatter tc = this.c;
       _monitor_enter(tc);
       y.K0(this.c, new AsyncStageScatter$cancelTaskByBatchId$$inlined$synchronized$lambda$1(this, p0));
       _monitor_exit(tc);
       return;
    }
    public long f(q p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AsyncStageScatter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       a.p(p0, "task");
       return u.o0.a(p0, new AsyncStageScatter$put$1(this));
    }
    public boolean g(long p0){
       Iterator obj;
       boolean b;
       Object obj1;
       AsyncStageScatter uAsyncStageS = AsyncStageScatter.class;
       if (PatchProxy.isSupport(uAsyncStageS)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAsyncStageS, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.c.iterator();
       while (true) {
          b = true;
          if (obj.hasNext()) {
             obj1 = obj.next();
             Object obj2 = (!obj1.d() - p0)? 1: null;
             if (!obj2) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          if (obj1 == null) {
             b = false;
             break ;
          }
          break ;
       }
       return b;
    }
    public void h(boolean p0){
       AsyncStageScatter uAsyncStageS = AsyncStageScatter.class;
       if (PatchProxy.isSupport(uAsyncStageS) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAsyncStageS, "7")) {
          return;
       }
       this.b().set(-2);
       this.n().removeCallbacksAndMessages(Integer.valueOf(0));
       uAsyncStageS = this.c;
       _monitor_enter(uAsyncStageS);
       y.K0(this.c, AsyncStageScatter$quit$1$1.INSTANCE);
       _monitor_exit(uAsyncStageS);
       if (p0) {
          this.n().getLooper().quitSafely();
       }else {
          this.n().getLooper().quit();
       }
       return;
    }
    public void i(boolean p0,long[] p1){
       AsyncStageScatter uAsyncStageS = AsyncStageScatter.class;
       if (PatchProxy.isSupport(uAsyncStageS) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uAsyncStageS, "8")) {
          return;
       }
       a.p(p1, "taskIds");
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          this.m(p1[i]);
       }
       return;
    }
    public final void m(long p0){
       Object obj;
       AsyncStageScatter uAsyncStageS = AsyncStageScatter.class;
       if (PatchProxy.isSupport(uAsyncStageS) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAsyncStageS, "10")) {
          return;
       }
       this.n().removeMessages((int)((p0 >> 32) ^ p0));
       uAsyncStageS = this.c;
       _monitor_enter(uAsyncStageS);
       Iterator iterator = this.c.iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next();
             Object obj1 = (!obj.d() - p0)? 1: null;
             if (!obj1) {
                continue ;
             }
          }else {
             obj = null;
          }
          if (obj != null) {
             this.r(obj);
             l1 a = l1.a;
             break ;
          }
          break ;
       }
       _monitor_exit(uAsyncStageS);
       return;
    }
    public final Handler n(){
       Object obj = PatchProxy.apply(null, this, AsyncStageScatter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final j o(){
       return this.c;
    }
    public void p(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AsyncStageScatter.class, "4")) {
          return;
       }
       a.p(p0, "task");
       p0.run();
       this.r(p0);
       return;
    }
    public final Message q(q p0){
       Message obj = PatchProxy.applyOneRefs(p0, this, AsyncStageScatter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "task");
       obj = Message.obtain();
       obj.obj = p0;
       long l = p0.d();
       obj.what = (int)(l ^ (l >> 32));
       a.o(obj, "Message.obtain\(\).apply {бн task.id.hashCode\(\)\n    }");
       return obj;
    }
    public final void r(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AsyncStageScatter.class, "3")) {
          return;
       }
       a.p(p0, "task");
       AsyncStageScatter tc = this.c;
       _monitor_enter(tc);
       this.c.remove(p0);
       p0.h();
       _monitor_exit(tc);
       return;
    }
}
