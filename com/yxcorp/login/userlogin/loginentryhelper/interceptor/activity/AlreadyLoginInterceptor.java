package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.AlreadyLoginInterceptor;
import a2d.a;
import z1d.d;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.AlreadyLoginInterceptor$intercept$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.AlreadyLoginInterceptor$a;
import z1d.d$b;
import qrd.l1;

public final class AlreadyLoginInterceptor extends a	// class@001b5d
{

    public void AlreadyLoginInterceptor(){
       super();
    }
    public Object a(d p0,c p1){
       AlreadyLoginInterceptor$intercept$1 l$1;
       AlreadyLoginInterceptor$intercept$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, AlreadyLoginInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof AlreadyLoginInterceptor$intercept$1) {
          obj = p1;
          AlreadyLoginInterceptor$intercept$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             AlreadyLoginInterceptor$intercept$1 result = obj.result;
             Object obj1 = b.h();
             AlreadyLoginInterceptor$intercept$1 label1 = obj.label;
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
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             if (qCurrentUser.isLogined()) {
                l$1.a(AlreadyLoginInterceptor$a.a);
             }
             return l1.a;
          }
       }
       obj = new AlreadyLoginInterceptor$intercept$1(this, p1);
       goto label_0025 ;
    }
}
