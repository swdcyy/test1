package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.DefaultPageInterceptor;
import a2d.a;
import z1d.d;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.DefaultPageInterceptor$intercept$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kwai.feature.api.social.login.model.LoginParams;
import z1d.d$a;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.DefaultPageInterceptor$a;
import z1d.d$b;
import qrd.l1;

public final class DefaultPageInterceptor extends a	// class@001b64
{

    public void DefaultPageInterceptor(){
       super();
    }
    public Object a(d p0,c p1){
       boolean b;
       DefaultPageInterceptor$intercept$1 l$1;
       DefaultPageInterceptor$intercept$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, DefaultPageInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof DefaultPageInterceptor$intercept$1) {
          obj = p1;
          DefaultPageInterceptor$intercept$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             DefaultPageInterceptor$intercept$1 result = obj.result;
             Object obj1 = b.h();
             DefaultPageInterceptor$intercept$1 label1 = obj.label;
             b = true;
             if (label1 != null) {
                if (label1 == b) {
                   l$1 = obj.L$1;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                obj.L$0 = this;
                obj.L$1 = p0;
                obj.label = b;
                if (super.a(p0, obj) == obj1) {
                   return obj1;
                }
             }
             LoginParams loginParams = l$1.e();
             if (l$1.c().a() != 11) {
                b = false;
             }
             loginParams.mIsPasswordLogin = b;
             l$1.a(DefaultPageInterceptor$a.a);
             return l1.a;
          }
       }
       obj = new DefaultPageInterceptor$intercept$1(this, p1);
       goto label_0025 ;
    }
}
