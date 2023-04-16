package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.CancelAccountInterceptor$a;
import z1d.d$b;
import java.lang.Object;
import z1d.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.CancelAccountInterceptor$a$a;
import com.yxcorp.login.util.LoginPageLauncher$b;

public final class CancelAccountInterceptor$a implements d$b	// class@001b5f
{
    public static final CancelAccountInterceptor$a a;

    static {
       CancelAccountInterceptor$a.a = new CancelAccountInterceptor$a();
    }
    public void CancelAccountInterceptor$a(){
       super();
    }
    public final void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CancelAccountInterceptor$a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       d.f(p0, LoginPageLauncher$LoginType.PHONE_LOGIN, 0, CancelAccountInterceptor$a$a.a, 2, null);
       return;
    }
}
