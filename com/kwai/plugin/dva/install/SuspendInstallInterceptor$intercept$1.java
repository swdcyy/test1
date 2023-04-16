package com.kwai.plugin.dva.install.SuspendInstallInterceptor$intercept$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kwai.plugin.dva.install.SuspendInstallInterceptor;
import java.lang.String;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;

public final class SuspendInstallInterceptor$intercept$1 extends SuspendLambda implements p	// class@001349
{
    public final String $pluginName;
    public int label;
    public final SuspendInstallInterceptor this$0;

    public void SuspendInstallInterceptor$intercept$1(SuspendInstallInterceptor p0,String p1,c p2){
       this.this$0 = p0;
       this.$pluginName = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, SuspendInstallInterceptor$intercept$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new SuspendInstallInterceptor$intercept$1(this.this$0, this.$pluginName, p1);
    }
    public final Object invoke(k0 p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SuspendInstallInterceptor$intercept$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SuspendInstallInterceptor$intercept$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       SuspendInstallInterceptor$intercept$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.label = 1;
          if (this.this$0.b(this.$pluginName, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
