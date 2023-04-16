package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.HistoryInterceptor;
import a2d.a;
import z1d.d;
import asd.c;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.HistoryInterceptor$intercept$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import z1d.d$a;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Boolean;
import oe6.e;
import h3b.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.System;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.HistoryInterceptor$a;
import z1d.d$b;
import qrd.l1;

public final class HistoryInterceptor extends a	// class@001b6e
{

    public void HistoryInterceptor(){
       super();
    }
    public Object a(d p0,c p1){
       boolean b;
       HistoryInterceptor$intercept$1 l$1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HistoryInterceptor historyInter = HistoryInterceptor.class;
       HistoryInterceptor$intercept$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, historyInter, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p1 instanceof HistoryInterceptor$intercept$1) {
          obj = p1;
          HistoryInterceptor$intercept$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             HistoryInterceptor$intercept$1 result = obj.result;
             Object obj1 = b.h();
             HistoryInterceptor$intercept$1 label1 = obj.label;
             b = true;
             if (label1 != null) {
                if (label1 == b) {
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
                obj.label = b;
                if (super.a(p0, obj) == obj1) {
                   return obj1;
                }else {
                   obj = this;
                }
             }
             boolean i1 = l$1.c().a();
             Objects.requireNonNull(obj);
             if (PatchProxy.isSupport(historyInter)) {
                Object obj2 = PatchProxy.applyOneRefs(Integer.valueOf(i1), obj, historyInter, "2");
                if (obj2 != patchProxyRe) {
                   i1 = obj2.booleanValue();
                label_00af :
                   if (i1) {
                      l$1.a(HistoryInterceptor$a.a);
                   }
                   return l1.a;
                }
             }
             if (e.i() && (i1 == -1 || (!a.i() || (TextUtils.x(a.g()) || (a.h() - System.currentTimeMillis() <= 0 || !a.t().d("enableHistoryLogin", b)))))) {
                b = 0;
             }
             i1 = b;
             goto label_00af ;
          }
       }
       obj = new HistoryInterceptor$intercept$1(this, p1);
       goto label_0025 ;
    }
}
