package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.VirtualUserLoginInterceptor;
import a2d.a;
import z1d.d;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.VirtualUserLoginInterceptor$intercept$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import tkd.b;
import tkd.d;
import ayb.l;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.VirtualUserLoginInterceptor$a;
import z1d.d$b;
import qrd.l1;

public final class VirtualUserLoginInterceptor extends a	// class@001b7c
{

    public void VirtualUserLoginInterceptor(){
       super();
    }
    public Object a(d p0,c p1){
       VirtualUserLoginInterceptor$intercept$1 l$1;
       VirtualUserLoginInterceptor$intercept$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, VirtualUserLoginInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof VirtualUserLoginInterceptor$intercept$1) {
          obj = p1;
          VirtualUserLoginInterceptor$intercept$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             VirtualUserLoginInterceptor$intercept$1 result = obj.result;
             Object obj1 = b.h();
             VirtualUserLoginInterceptor$intercept$1 label1 = obj.label;
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
             if (d.a(0x38955e85).CO()) {
                l$1.a(new VirtualUserLoginInterceptor$a(l$1));
             }
             return l1.a;
          }
       }
       obj = new VirtualUserLoginInterceptor$intercept$1(this, p1);
       goto label_0025 ;
    }
}
