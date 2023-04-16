package com.kwai.android.register.core.register.ChannelInitInterceptor$intercept$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kwai.android.register.core.register.ChannelInitInterceptor;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwai.android.register.core.register.RegisterChain;
import asd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import ftd.j2;
import ftd.z0;
import com.kwai.android.register.core.register.ChannelInitInterceptor$intercept$1$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;
import com.kwai.android.common.intercept.Chain;

public final class ChannelInitInterceptor$intercept$1 extends SuspendLambda implements p	// class@0009f8
{
    public final RegisterChain $chain;
    public final Ref$ObjectRef $register;
    public int label;
    public final ChannelInitInterceptor this$0;

    public void ChannelInitInterceptor$intercept$1(ChannelInitInterceptor p0,Ref$ObjectRef p1,RegisterChain p2,c p3){
       this.this$0 = p0;
       this.$register = p1;
       this.$chain = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       return new ChannelInitInterceptor$intercept$1(this.this$0, this.$register, this.$chain, p1);
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       ChannelInitInterceptor$intercept$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.label = 1;
          if (a.i(z0.g(), new ChannelInitInterceptor$intercept$1$1(this, null), this) == obj) {
             return obj;
          }
       }
       this.$chain.proceed();
       return l1.a;
    }
}
