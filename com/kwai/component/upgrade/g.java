package com.kwai.component.upgrade.g;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.component.upgrade.UpgradeInstallHintHelper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ai5.j;
import zjd.d;
import zjd.e;
import zjd.f;
import o56.a;
import ai5.b;
import android.content.SharedPreferences;
import java.lang.System;
import com.kwai.component.upgrade.UpgradeInstallHintHelper$a;
import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;

public final class g implements Runnable	// class@000c04
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final void run(){
       SharedPreferences a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, UpgradeInstallHintHelper.class, "1")) {
       }else {
          f uof = e.a(new j()).b();
          UpgradeInstallHintHelper.f = uof;
          int i = uof.h(0xf731400);
          UpgradeInstallHintHelper.h = i;
          if (i == -1 || i <= a.q) {
             UpgradeInstallHintHelper.b();
          }else {
             a = b.a;
             long l = 0;
             long longx = a.getLong("upgrade_install_hint_dialog_show_time", l);
             if (!longx - l) {
                UpgradeInstallHintHelper.d = true;
                UpgradeInstallHintHelper.c = false;
             }else if(a.getBoolean("upgrade_install_notification_bar_should_show", true) && (System.currentTimeMillis() - longx) - 0x1499700 >= 0){
                UpgradeInstallHintHelper.e = true;
             }else {
                UpgradeInstallHintHelper.b();
             }
             if (UpgradeInstallHintHelper.b == null) {
                UpgradeInstallHintHelper.b = new UpgradeInstallHintHelper$a(objArray);
                a.b().registerActivityLifecycleCallbacks(UpgradeInstallHintHelper.b);
             }
             UpgradeInstallHintHelper.a(ActivityContext.g().e());
          }
       }
       return;
    }
}
