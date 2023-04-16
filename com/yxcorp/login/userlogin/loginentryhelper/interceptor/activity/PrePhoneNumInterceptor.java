package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.PrePhoneNumInterceptor;
import a2d.a;
import z1d.d;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.PrePhoneNumInterceptor$intercept$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kwai.feature.api.social.login.model.PrePhoneNumModel;
import java.lang.reflect.Type;
import h3b.a;
import android.content.Context;
import z2d.i;
import z2d.f;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.PrePhoneNumInterceptor$a;
import z1d.d$b;
import qrd.l1;

public final class PrePhoneNumInterceptor extends a	// class@001b76
{

    public void PrePhoneNumInterceptor(){
       super();
    }
    public Object a(d p0,c p1){
       PrePhoneNumInterceptor$intercept$1 l$1;
       PrePhoneNumInterceptor$intercept$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, PrePhoneNumInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof PrePhoneNumInterceptor$intercept$1) {
          obj = p1;
          PrePhoneNumInterceptor$intercept$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             PrePhoneNumInterceptor$intercept$1 result = obj.result;
             Object obj1 = b.h();
             PrePhoneNumInterceptor$intercept$1 label1 = obj.label;
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
             PrePhoneNumModel prePhoneNumM = a.f(PrePhoneNumModel.class);
             if (i.f(l$1.d()) && f.p(prePhoneNumM)) {
                l$1.a(PrePhoneNumInterceptor$a.a);
             }
             return l1.a;
          }
       }
       obj = new PrePhoneNumInterceptor$intercept$1(this, p1);
       goto label_0025 ;
    }
}
