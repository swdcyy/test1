package com.kwai.component.taskdispatcher.strategy.simple.DefaultAsyncStrategy;
import lh5.b;
import java.lang.Object;
import com.kwai.component.taskdispatcher.strategy.simple.DefaultAsyncStrategy$asyncExecutor$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lh5.b$a;
import eh5.a;
import eh5.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import eh5.u;
import com.kwai.component.taskdispatcher.strategy.simple.DefaultAsyncStrategy$put$1;
import msd.l;
import eh5.u$a;
import java.lang.Boolean;
import java.lang.Long;

public final class DefaultAsyncStrategy implements b	// class@000bbc
{
    public final p b;

    public void DefaultAsyncStrategy(){
       super();
       this.b = s.c(DefaultAsyncStrategy$asyncExecutor$2.INSTANCE);
    }
    public void a(long[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultAsyncStrategy.class, "5")) {
          return;
       }
       a.p(p0, "taskIds");
       b$a.b(this, p0);
       return;
    }
    public void c(long p0){
    }
    public void d(long p0,a p1){
    }
    public long f(q p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DefaultAsyncStrategy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       a.p(p0, "task");
       return u.o0.a(p0, new DefaultAsyncStrategy$put$1(this, p0));
    }
    public boolean g(long p0){
       return false;
    }
    public void h(boolean p0){
    }
    public void i(boolean p0,long[] p1){
       if (PatchProxy.isSupport(DefaultAsyncStrategy.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, DefaultAsyncStrategy.class, "3")) {
          return;
       }
       a.p(p1, "taskIds");
       return;
    }
    public void j(long p0){
       DefaultAsyncStrategy uDefaultAsyn = DefaultAsyncStrategy.class;
       if (PatchProxy.isSupport(uDefaultAsyn) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uDefaultAsyn, "4")) {
          return;
       }
       b$a.a(this, p0);
       return;
    }
}
