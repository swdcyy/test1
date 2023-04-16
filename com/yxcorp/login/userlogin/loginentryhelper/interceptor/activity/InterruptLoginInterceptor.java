package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.InterruptLoginInterceptor;
import a2d.a;
import z1d.d;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.InterruptLoginInterceptor$intercept$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.yxcorp.login.userlogin.loginentryhelper.LoginEntrancePageManager;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import qrd.l1;

public final class InterruptLoginInterceptor extends a	// class@001b70
{

    public void InterruptLoginInterceptor(){
       super();
    }
    public Object a(d p0,c p1){
       InterruptLoginInterceptor$intercept$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, InterruptLoginInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof InterruptLoginInterceptor$intercept$1) {
          obj = p1;
          InterruptLoginInterceptor$intercept$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             InterruptLoginInterceptor$intercept$1 result = obj.result;
             Object obj1 = b.h();
             InterruptLoginInterceptor$intercept$1 label1 = obj.label;
             if (label1 != null) {
                if (label1 == true) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                obj.L$0 = this;
                obj.L$1 = p0;
                obj.label = 1;
                if (super.a(p0, obj) == obj1) {
                   return obj1;
                }
             }
             LoginEntrancePageManager e = LoginEntrancePageManager.e;
             Objects.requireNonNull(e);
             if (!PatchProxy.applyVoid(null, e, LoginEntrancePageManager.class, "2")) {
                LoginEntrancePageManager.b.set(true);
             }
             return l1.a;
          }
       }
       obj = new InterruptLoginInterceptor$intercept$1(this, p1);
       goto label_0025 ;
    }
}
