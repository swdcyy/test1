package com.kwai.component.upgrade.f;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import zjd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import zjd.c$a;
import oe6.c;
import wkd.b;
import j80.c;
import java.io.File;
import com.yxcorp.utility.AbiUtil;
import zjd.d;
import com.kwai.component.upgrade.f$a;
import zjd.g;
import com.kwai.component.upgrade.f$b;
import bkd.a;
import java.lang.Integer;
import bkd.a$a;
import o56.a;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Long;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import ai5.b;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.kwai.component.upgrade.UpgradeLog$UpgradeInstallInfo;
import k2b.u1;
import java.lang.System;
import com.kwai.component.upgrade.e;
import tkd.b;
import tkd.d;
import ai5.e;
import java.lang.Runnable;
import bkd.b;
import ai5.h;
import ekd.k1;

public final class f	// class@000c03
{
    public static final long a;
    public static final long b;
    public static final long c;
    public static final List d;
    public static final List e;
    public static long f;
    public static boolean g;
    public static a h;

    static {
       TimeUnit dAYS = TimeUnit.DAYS;
       f.a = dAYS.toMillis(2);
       f.b = dAYS.toMillis(7);
       f.c = TimeUnit.HOURS.toMillis(1);
       String[] stringArray = new String[]{"com.yxcorp.gifshow.v3.EditorActivity","com.kuaishou.live.anchor.basic.activity.LivePushActivity","com.yxcorp.gifshow.activity.share.ShareActivity","com.kuaishou.commercial.splash.SplashV2Activity","com.kuaishou.commercial.splash.v3.view.SplashV3Activity","com.yxcorp.plugin.qrcode.AuthorizationActivity","com.yxcorp.login.authorization.AuthActivity"};
       f.d = Arrays.asList(stringArray);
       stringArray = new String[]{"com.kuaishou.live.core.basic.activity.LivePlayActivity","com.kuaishou.live.anchor.basic.activity.LivePushActivity"};
       f.e = Arrays.asList(stringArray);
       f.f = 0;
       f.g = false;
    }
    public void f(){
       super();
    }
    public static c a(boolean p0){
       c$a obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, uof, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new c$a();
       obj.g = false;
       obj.f = p0;
       obj.b = f.b;
       obj.a = f.a;
       obj.d = f.d;
       obj.e = f.e;
       obj.c = c.a();
       obj.h = false;
       obj.i = b.a(-1504323719).o().getAbsolutePath();
       obj.j = AbiUtil.c();
       c uoc = PatchProxy.apply(null, obj, c$a.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c(obj);
       }
       return uoc;
    }
    public static d b(){
       Object obj = PatchProxy.apply(null, null, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f$a();
    }
    public static g c(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, uof, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f$b(p0);
    }
    public static a d(int p0,boolean p1){
       a$a obj;
       a uoa;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), null, uof, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a$a();
       obj.c = a.k;
       obj.b = a.m;
       obj.g = a.q;
       obj.d = a.a;
       obj.f = a.j;
       obj.e = a.p;
       obj.h = p0;
       obj.i = p1;
       obj.j = AbiUtil.c();
       if (QCurrentUser.me() != null) {
          try{
             obj.a(Long.parseLong(QCurrentUser.me().getId()));
          }catch(java.lang.NumberFormatException e0){
             obj.a(0);
          }
       }
    }
    public static void e(RequestTiming p0){
       long f;
       if (PatchProxy.applyVoidOneRefs(p0, null, f.class, "1")) {
          return;
       }
       SharedPreferences a = b.a;
       int i = 0;
       int intx = a.getInt("currentInstallVersionCode", i);
       int intx1 = a.getInt("willInstallVersionCode", i);
       if (intx && intx1) {
          String str = "ks://upgrade_dialog_install";
          if (intx1 == a.q) {
             u1.Q(str, new Gson().q(new UpgradeLog$UpgradeInstallInfo(i, intx, intx1, a.q)));
          }else {
             u1.Q(str, new Gson().q(new UpgradeLog$UpgradeInstallInfo(1, intx, intx1, a.q)));
          }
       }
       b.a(i);
       b.e(i);
       f.g = i;
       long l = System.currentTimeMillis();
       f = f.f;
       if (f && ((l - f) - f.c < 0 && (l - f) >= 0)) {
          return;
       }else {
          f.f = l;
          e uoe = new e(p0);
          e uoe1 = d.a(-658191065);
          if (uoe1 != null && uoe1.isAvailable()) {
             uoe1.fR(uoe);
          }else {
             uoe.run();
          }
          return;
       }
    }
    public static void f(b p0,boolean p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uof, "2")) {
          return;
       }
       f.g = true;
       k1.o(new h(p0, p1));
       return;
    }
}
