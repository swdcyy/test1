package com.kwai.android.register.core.register.ChannelInitInterceptor$intercept$1$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kwai.android.register.core.register.ChannelInitInterceptor$intercept$1;
import asd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qrd.l1;
import csd.b;
import qrd.j0;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwai.android.register.Register;
import com.kwai.android.register.core.register.RegisterChain;
import com.kwai.android.register.core.register.ChannelInitInterceptor;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.android.register.Register$Companion;
import com.kwai.android.common.bean.Channel;
import java.lang.Boolean;
import dsd.a;
import java.util.Map;
import java.lang.IllegalStateException;

public final class ChannelInitInterceptor$intercept$1$1 extends SuspendLambda implements p	// class@0009f7
{
    public int label;
    public final ChannelInitInterceptor$intercept$1 this$0;

    public void ChannelInitInterceptor$intercept$1$1(ChannelInitInterceptor$intercept$1 p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       return new ChannelInitInterceptor$intercept$1$1(this.this$0, p1);
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = this.this$0;
       if (!p0.this$0.doRegister(p0.$register.element, p0.$chain)) {
          p0 = a.a(Register.Companion.getRegisterSuccessChannel().remove(this.this$0.$chain.getChannel()));
       }else {
          p0 = this.this$0;
          p0.this$0.registerInstances.put(p0.$chain.getChannel(), this.this$0.$register.element);
          p0 = l1.a;
       }
       return p0;
    }
}
