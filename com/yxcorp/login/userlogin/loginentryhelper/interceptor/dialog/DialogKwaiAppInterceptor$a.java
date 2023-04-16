package com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogKwaiAppInterceptor$a;
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
import b3d.c0;
import com.yxcorp.login.userlogin.fragment.d;
import com.kwai.robust.PatchProxyResult;
import ou5.a;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.c;
import android.app.Activity;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;

public final class DialogKwaiAppInterceptor$a implements d$b	// class@001b85
{
    public static final DialogKwaiAppInterceptor$a a;

    static {
       DialogKwaiAppInterceptor$a.a = new DialogKwaiAppInterceptor$a();
    }
    public void DialogKwaiAppInterceptor$a(){
       super();
    }
    public final void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogKwaiAppInterceptor$a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Context uContext = p0.d();
       LoginParams loginParams = p0.e();
       a uoa = p0.b();
       if (!PatchProxy.applyVoidThreeRefs(uContext, loginParams, uoa, null, b0.class, "3")) {
          c0 uoc0 = new c0(loginParams);
          d uod = PatchProxy.applyFourRefs(uContext, loginParams, uoc0, uoa, null, d.class, "1");
          if (uod != PatchProxyResult.class) {
          }else {
             uod = new d(uContext, loginParams, uoc0, uoa);
          }
          c uoc = new c(uContext);
          uoc.L(uod);
          uoc.B(true);
          uoc.k().Z();
       }
       return;
    }
}
