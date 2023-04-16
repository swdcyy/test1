package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.PrepareInterceptor;
import a2d.a;
import z1d.d;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.PrepareInterceptor$intercept$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kuaishou.weapon.i.WeaponHI;
import v0d.g;
import com.kwai.feature.api.social.login.model.LoginParams;
import h3b.a;
import z1d.d$a;
import v0d.j;
import android.content.Context;
import h4d.a;
import qrd.l1;

public final class PrepareInterceptor extends a	// class@001b78
{

    public void PrepareInterceptor(){
       super();
    }
    public Object a(d p0,c p1){
       boolean b;
       PrepareInterceptor$intercept$1 l$1;
       PrepareInterceptor$intercept$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, PrepareInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof PrepareInterceptor$intercept$1) {
          obj = p1;
          PrepareInterceptor$intercept$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             PrepareInterceptor$intercept$1 result = obj.result;
             Object obj1 = b.h();
             PrepareInterceptor$intercept$1 label1 = obj.label;
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
             WeaponHI.t(15);
             g.c();
             a.r(l$1.e().mLoginSource);
             result.a = a.c();
             d$a uoa = l$1.c();
             boolean b1 = (j.d() && a.d(l$1.d()))? true: false;
             uoa.b = b1;
             uoa = l$1.c();
             if (!j.c() || !a.b(l$1.d())) {
                b = false;
             }
             uoa.c = b;
             return l1.a;
          }
       }
       obj = new PrepareInterceptor$intercept$1(this, p1);
       goto label_0025 ;
    }
}
