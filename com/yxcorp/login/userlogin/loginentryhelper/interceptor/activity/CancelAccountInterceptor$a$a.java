package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.CancelAccountInterceptor$a$a;
import com.yxcorp.login.util.LoginPageLauncher$b;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class CancelAccountInterceptor$a$a implements LoginPageLauncher$b	// class@001b5e
{
    public static final CancelAccountInterceptor$a$a a;

    static {
       CancelAccountInterceptor$a$a.a = new CancelAccountInterceptor$a$a();
    }
    public void CancelAccountInterceptor$a$a(){
       super();
    }
    public final void a(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CancelAccountInterceptor$a$a.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       p0.putExtra("login_with_phone", true);
       p0.putExtra("IS_PHONE_PASSWORD_LOGIN", false);
       p0.putExtra("HIDE_PHONE_LOGIN_MOBILE", true);
       return;
    }
}
