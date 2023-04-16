package com.yxcorp.gifshow.ad.webview.jshandler.AdReserveAppHandler;
import zl9.b;
import com.yxcorp.gifshow.ad.webview.jshandler.AdReserveAppHandler$a;
import nsd.u;
import p59.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import zl9.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.webview.jshandler.AdReserveAppHandler$handleJsCall$1;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import p59.k;
import msd.a;
import android.content.Context;
import n3d.a;
import zl9.a;

public final class AdReserveAppHandler implements b	// class@0018e3
{
    public final t a;
    public static final AdReserveAppHandler$a b;

    static {
       AdReserveAppHandler.b = new AdReserveAppHandler$a(null);
    }
    public void AdReserveAppHandler(t p0){
       a.p(p0, "mJsBridgeContext");
       super();
       this.a = p0;
    }
    public void e(String p0,e p1){
       AdReserveAppHandler uAdReserveAp = AdReserveAppHandler.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uAdReserveAp, "1")) {
          return;
       }
       a.p(p1, "function");
       int i = -1;
       if (this.a.d == null) {
          p1.onError(i, "feed is null");
          return;
       }else if(p0 == null){
          p1.onError(i, "date null");
          return;
       }else {
          AdReserveAppHandler$handleJsCall$1 ohandleJsCal = new AdReserveAppHandler$handleJsCall$1(this, p0, p1);
          if (!PatchProxy.applyVoidTwoRefs(ohandleJsCal, p1, this, uAdReserveAp, "3")) {
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             if (!mE.isLogined()) {
                LoginParams$a uoa = new LoginParams$a();
                uoa.d(a1.p(R.string.arg_RES_7f10307f));
                d.a(-1712118428).x00(this.a.a, 14, uoa.a(), new k(ohandleJsCal, p1));
             }else {
                ohandleJsCal.invoke();
             }
          }
          return;
       }
    }
    public Object f(String p0,Class p1,e p2){
       return a.b(this, p0, p1, p2);
    }
    public String getKey(){
       return "adReserveApp";
    }
    public void onDestroy(){
       a.a(this);
    }
}
