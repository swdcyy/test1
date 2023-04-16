package com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogPrePhoneNumInterceptor$a;
import z1d.d$b;
import java.lang.Object;
import z1d.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import b3d.v;
import n3d.a;
import b3d.b0;

public final class DialogPrePhoneNumInterceptor$a implements d$b	// class@001b88
{
    public static final DialogPrePhoneNumInterceptor$a a;

    static {
       DialogPrePhoneNumInterceptor$a.a = new DialogPrePhoneNumInterceptor$a();
    }
    public void DialogPrePhoneNumInterceptor$a(){
       super();
    }
    public final void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogPrePhoneNumInterceptor$a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       if (v.c(p0.d(), p0.e())) {
          b0.a(p0.d(), p0.e(), p0.b());
       }else {
          b0.b(p0.d(), p0.e(), p0.b());
       }
       return;
    }
}
