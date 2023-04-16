package com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.a;
import z1d.d$b;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogFetchPhoneNumInterceptor$intercept$2$a;
import java.lang.Object;
import z1d.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogFetchPhoneNumInterceptor$intercept$2;
import java.util.Objects;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogFetchPhoneNumInterceptor;
import ftd.j2;
import ftd.z0;
import kotlin.coroutines.CoroutineContext;
import ftd.k0;
import ftd.l0;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogFetchPhoneNumInterceptor$launchDialog$1;
import asd.c;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;

public final class a implements d$b	// class@001b8b
{
    public final DialogFetchPhoneNumInterceptor$intercept$2$a a;

    public void a(DialogFetchPhoneNumInterceptor$intercept$2$a p0){
       this.a = p0;
       super();
    }
    public final void a(d p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "launcher");
       DialogFetchPhoneNumInterceptor$intercept$2 this$0 = this.a.b.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(p0, this$0, DialogFetchPhoneNumInterceptor.class, "2")) {
          a.f(l0.a(z0.g()), null, null, new DialogFetchPhoneNumInterceptor$launchDialog$1(p0, null), 3, null);
       }
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
}
