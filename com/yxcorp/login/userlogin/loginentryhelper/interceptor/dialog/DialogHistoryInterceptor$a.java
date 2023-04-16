package com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogHistoryInterceptor$a;
import z1d.d$b;
import java.lang.Object;
import z1d.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import n3d.a;
import b3d.b0;
import b3d.a0;
import com.yxcorp.login.userlogin.fragment.b;
import com.kwai.robust.PatchProxyResult;
import ou5.a;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.c;
import android.app.Activity;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;

public final class DialogHistoryInterceptor$a implements d$b	// class@001b82
{
    public static final DialogHistoryInterceptor$a a;

    static {
       DialogHistoryInterceptor$a.a = new DialogHistoryInterceptor$a();
    }
    public void DialogHistoryInterceptor$a(){
       super();
    }
    public final void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogHistoryInterceptor$a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Context uContext = p0.d();
       LoginParams loginParams = p0.e();
       a uoa = p0.b();
       if (!PatchProxy.applyVoidThreeRefs(uContext, loginParams, uoa, null, b0.class, "1")) {
          a0 uoa0 = new a0(loginParams);
          b uob = PatchProxy.applyFourRefs(uContext, loginParams, uoa0, uoa, null, b.class, "1");
          if (uob != PatchProxyResult.class) {
          }else {
             uob = new b(uContext, loginParams, uoa0, uoa);
          }
          c uoc = new c(uContext);
          uoc.L(uob);
          uoc.B(true);
          uoc.k().Z();
       }
       return;
    }
}
