package com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogFetchPhoneNumInterceptor$launchDialog$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import z1d.d;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import b3d.v;
import n3d.a;
import b3d.b0;
import java.lang.IllegalStateException;

public final class DialogFetchPhoneNumInterceptor$launchDialog$1 extends SuspendLambda implements p	// class@001b80
{
    public final d $launcher;
    public int label;
    public k0 p$;

    public void DialogFetchPhoneNumInterceptor$launchDialog$1(d p0,c p1){
       this.$launcher = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       DialogFetchPhoneNumInterceptor$launchDialog$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, DialogFetchPhoneNumInterceptor$launchDialog$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new DialogFetchPhoneNumInterceptor$launchDialog$1(this.$launcher, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DialogFetchPhoneNumInterceptor$launchDialog$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DialogFetchPhoneNumInterceptor$launchDialog$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = this.$launcher;
       if (v.c(p0.d(), p0.e())) {
          b0.a(p0.d(), p0.e(), p0.b());
       }else {
          b0.b(p0.d(), p0.e(), p0.b());
       }
       return l1.a;
    }
}
