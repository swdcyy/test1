package com.kwai.plugin.dva.work.FutureTaskWork$execute$_run$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kwai.plugin.dva.work.FutureTaskWork;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.util.Objects;
import com.kwai.plugin.dva.work.ListenableWork;

public final class FutureTaskWork$execute$_run$1 extends SuspendLambda implements p	// class@001395
{
    public int label;
    public final FutureTaskWork this$0;

    public void FutureTaskWork$execute$_run$1(FutureTaskWork p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, FutureTaskWork$execute$_run$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new FutureTaskWork$execute$_run$1(this.this$0, p1);
    }
    public final Object invoke(k0 p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FutureTaskWork$execute$_run$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Object invokeSuspend(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       Object obj = PatchProxy.applyOneRefs(p0, this, FutureTaskWork$execute$_run$1.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = b.h();
       FutureTaskWork$execute$_run$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.this$0;
          this.label = 1;
          Objects.requireNonNull(p0);
          Object obj1 = PatchProxy.applyOneRefs(this, p0, ListenableWork.class, str);
          if (obj1 == patchProxyRe) {
             obj1 = ListenableWork.g(p0, this);
          }
          if (obj1 == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
