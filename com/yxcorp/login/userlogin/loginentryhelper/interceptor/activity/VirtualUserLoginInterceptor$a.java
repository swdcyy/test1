package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.VirtualUserLoginInterceptor$a;
import z1d.d$b;
import z1d.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ayb.l;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.social.login.model.LoginParams;
import java.util.Map;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.VirtualUserLoginInterceptor$a$a;
import com.yxcorp.login.util.LoginPageLauncher$b;

public final class VirtualUserLoginInterceptor$a implements d$b	// class@001b7a
{
    public final d a;

    public void VirtualUserLoginInterceptor$a(d p0){
       this.a = p0;
       super();
    }
    public final void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VirtualUserLoginInterceptor$a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       int i = 0x38955e85;
       String str = d.a(i).vj();
       if (!TextUtils.x(str)) {
          LoginParams mPreFillData = this.a.e().mPreFillData;
          String str1 = "launcher.mLoginParams.mPreFillData";
          a.o(mPreFillData, str1);
          mPreFillData.put("data_fill_email", str);
          LoginParams mPreFillData1 = this.a.e().mPreFillData;
          a.o(mPreFillData1, str1);
          mPreFillData1.put("data_fill_password", d.a(i).OG());
       }
       d.f(p0, LoginPageLauncher$LoginType.EMAIL_LOGIN, 0, VirtualUserLoginInterceptor$a$a.a, 2, null);
       return;
    }
}
