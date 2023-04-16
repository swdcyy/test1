package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.FetchPhoneNumInterceptor$intercept$2$a;
import ov5.c;
import ftd.k;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.FetchPhoneNumInterceptor$intercept$2;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.api.social.login.model.PrePhoneNumModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import b2d.a;
import z1d.d$b;
import z1d.d;
import kotlin.Result;
import asd.c;

public final class FetchPhoneNumInterceptor$intercept$2$a implements c	// class@001b66
{
    public final k a;
    public final FetchPhoneNumInterceptor$intercept$2 b;

    public void FetchPhoneNumInterceptor$intercept$2$a(k p0,FetchPhoneNumInterceptor$intercept$2 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(boolean p0,Object p1,String p2){
       Object obj = p1;
       if (!PatchProxy.isSupport2(FetchPhoneNumInterceptor$intercept$2$a.class, "1") || !PatchProxy.applyVoidThreeRefsWithListener(Boolean.valueOf(p0), obj, p2, this, FetchPhoneNumInterceptor$intercept$2$a.class, "1")) {
          if (p0) {
             this.b.$launcher.a(a.a);
             this.a.resumeWith(Result.constructor-impl(Boolean.TRUE));
          }else {
             this.a.resumeWith(Result.constructor-impl(Boolean.FALSE));
          }
          PatchProxy.onMethodExit(FetchPhoneNumInterceptor$intercept$2$a.class, "1");
       }
       return;
    }
}
