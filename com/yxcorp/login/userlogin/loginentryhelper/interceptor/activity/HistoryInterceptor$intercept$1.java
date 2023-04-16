package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.HistoryInterceptor$intercept$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.HistoryInterceptor;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z1d.d;

public final class HistoryInterceptor$intercept$1 extends ContinuationImpl	// class@001b6d
{
    public Object L$0;
    public Object L$1;
    public int label;
    public Object result;
    public final HistoryInterceptor this$0;

    public void HistoryInterceptor$intercept$1(HistoryInterceptor p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HistoryInterceptor$intercept$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.a(null, this);
    }
}
