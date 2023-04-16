package com.kwai.framework.plugin.util.DisposableSuspendLatch;
import java.lang.Object;
import ptd.e;
import kotlinx.coroutines.sync.SemaphoreKt;
import java.util.concurrent.atomic.AtomicBoolean;
import asd.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.util.DisposableSuspendLatch$await$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import qrd.l1;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class DisposableSuspendLatch	// class@000cd1
{
    public final e a;
    public final AtomicBoolean b;

    public void DisposableSuspendLatch(){
       super();
       this.a = SemaphoreKt.f(1, 1);
       this.b = new AtomicBoolean(1);
    }
    public final Object a(c p0){
       DisposableSuspendLatch$await$1 obj = PatchProxy.applyOneRefs(p0, this, DisposableSuspendLatch.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof DisposableSuspendLatch$await$1) {
          obj = p0;
          DisposableSuspendLatch$await$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             DisposableSuspendLatch$await$1 result = obj.result;
             Object obj1 = b.h();
             DisposableSuspendLatch$await$1 label1 = obj.label;
             if (label1 != null) {
                if (label1 == 1) {
                   obj = obj.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                if (!this.b()) {
                   return l1.a;
                }else {
                   obj.L$0 = this;
                   obj.label = 1;
                   if (this.a.a(obj) == obj1) {
                      return obj1;
                   }else {
                      DisposableSuspendLatch uDisposableS = this;
                   }
                }
             }
             obj.a.release();
             return l1.a;
          }
       }
       obj = new DisposableSuspendLatch$await$1(this, p0);
       goto label_0025 ;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, DisposableSuspendLatch.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.get();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DisposableSuspendLatch.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.toString()+"[isLocked = "+this.b()+']';
    }
}
