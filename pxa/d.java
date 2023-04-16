package pxa.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zb6.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.SharedPreferences;
import pkd.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams$Builder;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import o56.a;
import android.content.Context;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.init.b;
import com.kuaishou.security.kste.logic.base.SecKSTEDidProxy;
import pxa.d$a;
import com.kuaishou.security.kste.export.IKSTECallback;
import com.kuaishou.security.kste.export.KSTEApi;
import o56.d;
import ekd.v0;
import com.kwai.framework.security.a;
import com.kuaishou.android.security.base.exception.KSException;
import java.lang.Throwable;
import java.lang.Exception;
import com.kwai.framework.exceptionhandler.safemode.e;
import java.lang.System;
import com.yxcorp.gifshow.init.module.WeaponSdkInitModule;
import com.kuaishou.android.security.KSecurity;
import com.yxcorp.gifshow.init.a;
import pxa.c;
import com.kuaishou.android.security.internal.common.KSecurityContext$Mode;
import com.kuaishou.android.security.internal.init.SecDidProxy;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import com.yxcorp.gifshow.init.d;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.kwai.framework.deviceid.h;
import h30.a;
import android.app.Application;
import com.kuaishou.romid.inlet.OaidHelper;
import com.yxcorp.utility.RomUtils;
import fg6.a;
import com.google.gson.Gson;

public class d	// class@002212
{

    public void d(){
       super();
    }
    public static void a(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, objArray, d.class, "5")) {
          return;
       }
       String obj = PatchProxy.applyOneRefs("disable_kste_android_kuaishou_gt10440", objArray, d.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = d.b.getString("security_last_launch_app_version", "");
          String e = a.e;
          if (!TextUtils.isEmpty(e) && (!e.equals("UNKNOWN") && (!TextUtils.isEmpty(obj) && TextUtils.equals(e, obj)))) {
             objArray = Boolean.valueOf(d.b.getBoolean(d.b("host_se_te_d_ks"), false));
          }
       label_005a :
          if (objArray == null) {
             objArray = Boolean.FALSE;
          }
          objArray.booleanValue();
          b = objArray.booleanValue();
       }
       if (!b) {
          KSTEApi.registerBizId("d7b7d042-d4f2-4012-be60-d97ff2429c17", a.x, "df4467a3-f97e-4fc9-aefd-1777e813ca8c");
          KSTEApi.registerBizId("d7b7d042-d4f2-4012-be60-d97ff2429c17", a.x, "50ec6f77-56e7-47b3-9fe2-6d2471008a81");
          KSTEApi.registerBizId("d7b7d042-d4f2-4012-be60-d97ff2429c17", a.x, "ad1867aa-d1c9-48ec-ac4a-8b649bd26591");
          KSTEApi.initialize(InitCommonKSTEParams.builder().appkey("d7b7d042-d4f2-4012-be60-d97ff2429c17").context(a.B).did(a.a).userId(QCurrentUser.me().getId()).appKPN(a.x).appVer(a.m).didProxy(b.a).initCallback(new d$a()));
       }
       PatchProxy.onMethodExit(d.class, "5");
       return;
    }
    public static void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, objArray, d.class, "1")) {
          return;
       }
       if (d.i) {
          d.class.b("kwsgmain");
          d.class.b("ksse");
       }else {
          d.class.b("kwsgmain");
       }
       if (!d.i || e.p().c == null) {
          String str = "4";
          if (!PatchProxy.applyVoidWithListener(objArray, objArray, d.class, str)) {
             try{
                WeaponSdkInitModule.r = System.currentTimeMillis();
                a.a = System.currentTimeMillis();
                KSecurity.setAppStartTime(System.currentTimeMillis());
                KSecurity.InitializeKuaiShou(a.B, "d7b7d042-d4f2-4012-be60-d97ff2429c17", "lD6We1E8i", "", a.a, new c(), KSecurityContext$Mode.SYNC);
                e.g(d.b, "KSTEInitModule");
             }catch(com.kuaishou.android.security.base.exception.KSException e4){
                a.a(e4);
                a.g(0);
             }
             PatchProxy.onMethodExit(d.class, str);
          }
       }
       if (d.i) {
          if (h.h()) {
             a.h();
          }
          Application uApplication = a.b();
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidTwoRefs(uApplication, Boolean.FALSE, objArray, a.class, "21")) {
             OaidHelper.getSingletonInstance().initOAIDImpl(uApplication);
          }
       }
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
    public static void c(){
       if (PatchProxy.applyVoidWithListener(null, null, d.class, "3")) {
          return;
       }
       RomUtils.e();
       a.a.q(null);
       PatchProxy.onMethodExit(d.class, "3");
       return;
    }
}
