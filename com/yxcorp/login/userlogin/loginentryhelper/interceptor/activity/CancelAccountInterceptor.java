package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.CancelAccountInterceptor;
import a2d.a;
import z1d.d;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.CancelAccountInterceptor$intercept$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kwai.feature.api.social.login.model.LoginParams;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.CancelAccountInterceptor$a;
import z1d.d$b;
import qrd.l1;

public final class CancelAccountInterceptor extends a	// class@001b61
{

    public void CancelAccountInterceptor(){
       super();
    }
    public Object a(d p0,c p1){
       CancelAccountInterceptor$intercept$1 l$1;
       CancelAccountInterceptor$intercept$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, CancelAccountInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof CancelAccountInterceptor$intercept$1) {
          obj = p1;
          CancelAccountInterceptor$intercept$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             CancelAccountInterceptor$intercept$1 result = obj.result;
             Object obj1 = b.h();
             CancelAccountInterceptor$intercept$1 label1 = obj.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$1 = obj.L$1;
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
             if (l$1.e().mLoginSource == 85) {
                l$1.a(CancelAccountInterceptor$a.a);
             }
             return l1.a;
          }
       }
       obj = new CancelAccountInterceptor$intercept$1(this, p1);
       goto label_0025 ;
    }
}
