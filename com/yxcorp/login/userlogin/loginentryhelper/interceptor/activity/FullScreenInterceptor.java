package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.FullScreenInterceptor;
import a2d.a;
import z1d.d;
import asd.c;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.FullScreenInterceptor$intercept$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.util.Objects;
import java.lang.Boolean;
import z1d.d$a;
import rkd.b;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.FullScreenInterceptor$a;
import z1d.d$b;
import qrd.l1;

public final class FullScreenInterceptor extends a	// class@001b6b
{

    public void FullScreenInterceptor(){
       super();
    }
    public Object a(d p0,c p1){
       FullScreenInterceptor$intercept$1 l$1;
       boolean b;
       FullScreenInterceptor$intercept$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, FullScreenInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof FullScreenInterceptor$intercept$1) {
          obj = p1;
          FullScreenInterceptor$intercept$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             FullScreenInterceptor$intercept$1 result = obj.result;
             Object obj1 = b.h();
             FullScreenInterceptor$intercept$1 label1 = obj.label;
             int i1 = 1;
             if (label1 != null) {
                if (label1 == i1) {
                   l$1 = obj.L$1;
                   obj = obj.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                obj.L$0 = this;
                obj.L$1 = p0;
                obj.label = i1;
                if (super.a(p0, obj) == obj1) {
                   return obj1;
                }else {
                   obj = this;
                }
             }
             Objects.requireNonNull(obj);
             result = PatchProxy.applyOneRefs(l$1, obj, FullScreenInterceptor.class, "2");
             if (result != PatchProxyResult.class) {
                b = result.booleanValue();
             }else if(l$1.c().b != null || l$1.c().c != null){
                i1 = 0;
             }
             b = i1;
             if (b && !b.g()) {
                l$1.a(FullScreenInterceptor$a.a);
             }
             return l1.a;
          }
       }
       obj = new FullScreenInterceptor$intercept$1(this, p1);
       goto label_0025 ;
    }
}
