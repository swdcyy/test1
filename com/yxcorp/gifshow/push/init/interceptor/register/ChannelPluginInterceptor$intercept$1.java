package com.yxcorp.gifshow.push.init.interceptor.register.ChannelPluginInterceptor$intercept$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import t6c.c;
import com.kwai.android.register.core.register.RegisterChain;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.push.init.interceptor.register.DvaPluginLoader;
import java.lang.Boolean;
import kotlinx.coroutines.c;
import java.lang.StringBuilder;
import kotlin.Result;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.entity.Plugin;
import java.lang.ClassLoader;
import java.lang.Throwable;
import com.kwai.android.common.intercept.Chain;

public final class ChannelPluginInterceptor$intercept$1 extends SuspendLambda implements p	// class@001664
{
    public final RegisterChain $chain;
    public int I$0;
    public Object L$0;
    public int label;
    public k0 p$;
    public final c this$0;

    public void ChannelPluginInterceptor$intercept$1(c p0,RegisterChain p1,c p2){
       this.this$0 = p0;
       this.$chain = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       ChannelPluginInterceptor$intercept$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, ChannelPluginInterceptor$intercept$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new ChannelPluginInterceptor$intercept$1(this.this$0, this.$chain, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ChannelPluginInterceptor$intercept$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       ChannelPluginInterceptor$intercept$1 ointercept$1;
       l1 obj1;
       int i3;
       Plugin obj = PatchProxy.applyOneRefs(p0, this, ChannelPluginInterceptor$intercept$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       ChannelPluginInterceptor$intercept$1 tlabel = this.label;
       int i = 2;
       int i1 = 1;
       if (tlabel != null) {
          if (tlabel != i1) {
             if (tlabel == i) {
                tlabel = this.I$0;
                j0.n(p0);
                p0 = this.L$0;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             i3 = this.I$0;
             j0.n(p0);
             ChannelPluginInterceptor$intercept$1 ointercept$11 = this.L$0;
             ointercept$1 = this;
          label_005d :
             if (!p0.booleanValue()) {
                ointercept$1.L$0 = ointercept$11;
                ointercept$1.I$0 = i3;
                ointercept$1.label = i;
                if (c.a(0x2710, ointercept$1) == obj) {
                   return obj;
                }else {
                   p0 = ointercept$11;
                label_0041 :
                   int i2 = tlabel + 1;
                   if (tlabel < 6) {
                      ointercept$1.L$0 = p0;
                      ointercept$1.I$0 = i2;
                      ointercept$1.label = i1;
                      obj1 = ointercept$1.this$0.a().c(ointercept$1);
                      if (obj1 == obj) {
                         return obj;
                      }else {
                         ointercept$11 = p0;
                         p0 = obj1;
                         i3 = i2;
                         goto label_005d ;
                      }
                   }else {
                   label_0077 :
                      ointercept$1.this$0.a().d(ointercept$1.this$0.e(), '['+ointercept$1.this$0.c()+"] proceed after"+' '+ointercept$11+" times", "INTERCEPT");
                      p0 = ointercept$1.$chain;
                      obj = Dva.instance().getPlugin(ointercept$1.this$0.c());
                      a.m(obj);
                      a.o(obj, "Dva.instance\(\).getPlugin\(getPluginName\(\)\)!!");
                      ClassLoader classLoader = obj.getClassLoader();
                      a.m(classLoader);
                      Object obj2 = Result.constructor-impl(classLoader);
                      if (Result.exceptionOrNull-impl(obj2) != null) {
                         ointercept$1.this$0.a().d(ointercept$1.this$0.d(), "dva plugin ["+ointercept$1.this$0.c()+"] classloader is "+"null", "INTERCEPT");
                         obj1 = l1.a;
                      }
                      j0.n(obj2);
                      p0.setRegisterClassLoader(obj2);
                      ointercept$1.$chain.proceed();
                      ointercept$1.this$0.a().d(ointercept$1.this$0.e(), "load ["+ointercept$1.this$0.c()+"] progress proceed", "INTERCEPT");
                      return l1.a;
                   }
                }
             }else {
                ointercept$11 = i3;
                goto label_0077 ;
             }
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          i3 = 0;
       }
       ointercept$1 = this;
       goto label_0041 ;
    }
}
