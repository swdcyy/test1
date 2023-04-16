package com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogPrePhoneNumInterceptor$intercept$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogPrePhoneNumInterceptor;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z1d.d;

public final class DialogPrePhoneNumInterceptor$intercept$1 extends ContinuationImpl	// class@001b89
{
    public Object L$0;
    public Object L$1;
    public int label;
    public Object result;
    public final DialogPrePhoneNumInterceptor this$0;

    public void DialogPrePhoneNumInterceptor$intercept$1(DialogPrePhoneNumInterceptor p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DialogPrePhoneNumInterceptor$intercept$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.a(null, this);
    }
}
