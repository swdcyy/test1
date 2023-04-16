package com.kwai.framework.plugin.PluginManager$LazyInitSuspendInterceptor;
import com.kwai.plugin.dva.install.SuspendInstallInterceptor;
import java.lang.String;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.PluginManager$LazyInitSuspendInterceptor$suspendIntercept$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kwai.framework.plugin.PluginManager;
import com.kwai.framework.plugin.util.DisposableSuspendLatch;
import qrd.l1;
import java.util.concurrent.CountDownLatch;
import java.lang.StringBuilder;
import qj7.d;

public final class PluginManager$LazyInitSuspendInterceptor extends SuspendInstallInterceptor	// class@000c5f
{

    public void PluginManager$LazyInitSuspendInterceptor(){
       super();
    }
    public Object b(String p0,c p1){
       PluginManager$LazyInitSuspendInterceptor$suspendIntercept$1 l$1;
       PluginManager$LazyInitSuspendInterceptor$suspendIntercept$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, PluginManager$LazyInitSuspendInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof PluginManager$LazyInitSuspendInterceptor$suspendIntercept$1) {
          obj = p1;
          PluginManager$LazyInitSuspendInterceptor$suspendIntercept$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             PluginManager$LazyInitSuspendInterceptor$suspendIntercept$1 result = obj.result;
             Object obj1 = b.h();
             PluginManager$LazyInitSuspendInterceptor$suspendIntercept$1 label1 = obj.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$1 = obj.L$1;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                PluginManager h = PluginManager.H;
                if (!PluginManager.d(h).b()) {
                   return l1.a;
                }else {
                   h.f();
                   d.c(p0+" suspendIntercept start");
                   obj.L$0 = this;
                   obj.L$1 = p0;
                   obj.label = 1;
                   if (PluginManager.d(h).a(obj) == obj1) {
                      return obj1;
                   }
                }
             }
             d.c(l$1+" suspendIntercept end");
             return l1.a;
          }
       }
       obj = new PluginManager$LazyInitSuspendInterceptor$suspendIntercept$1(this, p1);
       goto label_0025 ;
    }
}
