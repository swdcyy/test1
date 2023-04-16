package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.AlreadyLoginInterceptor$intercept$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.AlreadyLoginInterceptor;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z1d.d;

public final class AlreadyLoginInterceptor$intercept$1 extends ContinuationImpl	// class@001b5c
{
    public Object L$0;
    public Object L$1;
    public int label;
    public Object result;
    public final AlreadyLoginInterceptor this$0;

    public void AlreadyLoginInterceptor$intercept$1(AlreadyLoginInterceptor p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AlreadyLoginInterceptor$intercept$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.a(null, this);
    }
}
