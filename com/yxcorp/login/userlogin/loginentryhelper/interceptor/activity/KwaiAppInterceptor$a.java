package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.KwaiAppInterceptor$a;
import z1d.d$b;
import java.lang.Object;
import z1d.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$b;

public final class KwaiAppInterceptor$a implements d$b	// class@001b71
{
    public static final KwaiAppInterceptor$a a;

    static {
       KwaiAppInterceptor$a.a = new KwaiAppInterceptor$a();
    }
    public void KwaiAppInterceptor$a(){
       super();
    }
    public final void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiAppInterceptor$a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       d.f(p0, LoginPageLauncher$LoginType.KWAI_APP_LOGIN, 0, null, 6, null);
       return;
    }
}
