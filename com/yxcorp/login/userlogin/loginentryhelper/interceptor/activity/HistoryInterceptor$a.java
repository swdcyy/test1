package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.HistoryInterceptor$a;
import z1d.d$b;
import java.lang.Object;
import z1d.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$b;

public final class HistoryInterceptor$a implements d$b	// class@001b6c
{
    public static final HistoryInterceptor$a a;

    static {
       HistoryInterceptor$a.a = new HistoryInterceptor$a();
    }
    public void HistoryInterceptor$a(){
       super();
    }
    public final void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HistoryInterceptor$a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       d.f(p0, LoginPageLauncher$LoginType.HISTORY_ONE_KEY_LOGIN, 0, null, 6, null);
       return;
    }
}
