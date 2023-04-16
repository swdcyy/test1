package com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogHistoryInterceptor;
import a2d.a;
import z1d.d;
import asd.c;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogHistoryInterceptor$intercept$1;
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
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogHistoryInterceptor$a;
import z1d.d$b;
import qrd.l1;

public final class DialogHistoryInterceptor extends a	// class@001b84
{

    public void DialogHistoryInterceptor(){
       super();
    }
    public Object a(d p0,c p1){
       boolean b;
       DialogHistoryInterceptor$intercept$1 l$1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DialogHistoryInterceptor uDialogHisto = DialogHistoryInterceptor.class;
       DialogHistoryInterceptor$intercept$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, uDialogHisto, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p1 instanceof DialogHistoryInterceptor$intercept$1) {
          obj = p1;
          DialogHistoryInterceptor$intercept$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             DialogHistoryInterceptor$intercept$1 result = obj.result;
             Object obj1 = b.h();
             DialogHistoryInterceptor$intercept$1 label1 = obj.label;
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
             if (PatchProxy.isSupport(uDialogHisto)) {
                Object obj2 = PatchProxy.applyOneRefs(Integer.valueOf(i1), obj, uDialogHisto, "2");
                if (obj2 != patchProxyRe) {
                   i1 = obj2.booleanValue();
                label_00af :
                   if (i1) {
                      l$1.a(DialogHistoryInterceptor$a.a);
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
       obj = new DialogHistoryInterceptor$intercept$1(this, p1);
       goto label_0025 ;
    }
}
