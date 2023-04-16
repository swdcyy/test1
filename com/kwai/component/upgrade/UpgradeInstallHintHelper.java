package com.kwai.component.upgrade.UpgradeInstallHintHelper;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.upgrade.j;
import zjd.b;
import zjd.f;
import java.lang.System;
import ai5.b;
import com.kwai.framework.activitycontext.ActivityContext;
import android.view.View;
import android.os.IBinder;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup;
import i2b.a;
import com.kwai.component.upgrade.h;
import android.view.View$OnClickListener;
import com.kwai.component.upgrade.i;
import android.widget.PopupWindow;
import android.app.Application;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;

public final class UpgradeInstallHintHelper	// class@000bf4
{
    public static PopupWindow a;
    public static UpgradeInstallHintHelper$a b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static f f;
    public static Activity g;
    public static int h;

    public void UpgradeInstallHintHelper(){
       super();
    }
    public static void a(Activity p0){
       UpgradeInstallHintHelper upgradeInsta = UpgradeInstallHintHelper.class;
       PopupWindow obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, upgradeInsta, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (!(p0.getClass().getName()).compareTo("com.yxcorp.gifshow.HomeActivity")) {
          UpgradeInstallHintHelper.g = p0;
          if (!PatchProxy.applyVoid(obj, obj, upgradeInsta, "6")) {
             if (UpgradeInstallHintHelper.d) {
                UpgradeInstallHintHelper.c = true;
                UpgradeInstallHintHelper.d = false;
                UpgradeInstallHintHelper.f.c(new j());
                b.c(System.currentTimeMillis());
             }else if(!UpgradeInstallHintHelper.e || (PatchProxy.applyVoid(obj, obj, upgradeInsta, "8") || UpgradeInstallHintHelper.a != null)){
                p0 = ActivityContext.g().e();
                if (p0 != null) {
                   View view = p0.findViewById(0x1020002);
                   if (view != null && view.getWindowToken() != null) {
                      View view1 = a.i(new FrameLayout(p0), R.layout.arg_RES_7f0d1649);
                      view1.findViewById(R.id.tv_upgrade_now).setOnClickListener(h.b);
                      view1.findViewById(R.id.iv_close).setOnClickListener(i.b);
                      obj = new PopupWindow(view1, -1, -2);
                      UpgradeInstallHintHelper.a = obj;
                      obj.showAtLocation(view, 80, false, false);
                   }
                }
             }
          }
       }
       return;
    }
    public static void b(){
       PopupWindow a;
       UpgradeInstallHintHelper upgradeInsta = UpgradeInstallHintHelper.class;
       if (PatchProxy.applyVoid(null, null, upgradeInsta, "2")) {
          return;
       }
       if (UpgradeInstallHintHelper.b != null) {
          a.b().unregisterActivityLifecycleCallbacks(UpgradeInstallHintHelper.b);
          UpgradeInstallHintHelper.b = null;
       }
       if (!PatchProxy.applyVoid(null, null, upgradeInsta, "7")) {
          if (UpgradeInstallHintHelper.c) {
             UpgradeInstallHintHelper.f.g();
             UpgradeInstallHintHelper.c = false;
          }else if(PatchProxy.applyVoid(null, null, upgradeInsta, "9")){
             a = UpgradeInstallHintHelper.a;
             if (a != null) {
                a.dismiss();
                UpgradeInstallHintHelper.a = null;
             }
          }
       }
       UpgradeInstallHintHelper.d = false;
       UpgradeInstallHintHelper.e = false;
       UpgradeInstallHintHelper.f = null;
       return;
    }
}
