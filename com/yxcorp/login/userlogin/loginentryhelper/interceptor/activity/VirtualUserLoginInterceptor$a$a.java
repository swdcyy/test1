package com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.VirtualUserLoginInterceptor$a$a;
import com.yxcorp.login.util.LoginPageLauncher$b;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class VirtualUserLoginInterceptor$a$a implements LoginPageLauncher$b	// class@001b79
{
    public static final VirtualUserLoginInterceptor$a$a a;

    static {
       VirtualUserLoginInterceptor$a$a.a = new VirtualUserLoginInterceptor$a$a();
    }
    public void VirtualUserLoginInterceptor$a$a(){
       super();
    }
    public final void a(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VirtualUserLoginInterceptor$a$a.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       p0.putExtra("login_force_email", true);
       return;
    }
}
