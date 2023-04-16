package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.FetchPhoneNumInterceptor;
import a2d.a;
import z1d.d;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.FetchPhoneNumInterceptor$intercept$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.FetchPhoneNumInterceptor$intercept$2;
import msd.p;
import kotlinx.coroutines.TimeoutKt;
import qrd.l1;

public final class FetchPhoneNumInterceptor extends a	// class@001b68
{

    public void FetchPhoneNumInterceptor(){
       super();
    }
    public Object a(d p0,c p1){
       FetchPhoneNumInterceptor$intercept$1 l$1;
       FetchPhoneNumInterceptor$intercept$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, FetchPhoneNumInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof FetchPhoneNumInterceptor$intercept$1) {
          obj = p1;
          FetchPhoneNumInterceptor$intercept$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             FetchPhoneNumInterceptor$intercept$1 result = obj.result;
             Object obj1 = b.h();
             FetchPhoneNumInterceptor$intercept$1 label1 = obj.label;
             int i1 = 1;
             if (label1 != null) {
                if (label1 != i1) {
                   if (label1 == 2) {
                      j0.n(result);
                   label_007b :
                      return l1.a;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   l$1 = obj.L$1;
                   label1 = obj.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                obj.L$0 = this;
                obj.L$1 = p0;
                obj.label = i1;
                if (super.a(p0, obj) == obj1) {
                   return obj1;
                }else {
                   label1 = this;
                }
             }
             obj.L$0 = label1;
             obj.L$1 = l$1;
             obj.label = 2;
             if (TimeoutKt.e(3000, new FetchPhoneNumInterceptor$intercept$2(l$1, null), obj) == obj1) {
                return obj1;
             }else {
                goto label_007b ;
             }
          }
       }
       obj = new FetchPhoneNumInterceptor$intercept$1(this, p1);
       goto label_0025 ;
    }
}
