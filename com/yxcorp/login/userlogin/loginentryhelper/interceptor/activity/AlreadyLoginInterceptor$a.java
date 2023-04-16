package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.AlreadyLoginInterceptor$a;
import z1d.d$b;
import java.lang.Object;
import z1d.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$b;

public final class AlreadyLoginInterceptor$a implements d$b	// class@001b5b
{
    public static final AlreadyLoginInterceptor$a a;

    static {
       AlreadyLoginInterceptor$a.a = new AlreadyLoginInterceptor$a();
    }
    public void AlreadyLoginInterceptor$a(){
       super();
    }
    public final void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlreadyLoginInterceptor$a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       d.f(p0, LoginPageLauncher$LoginType.PHONE_LOGIN, 0, null, 6, null);
       return;
    }
}
