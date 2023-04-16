package com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.utility.RomUtils;
import java.lang.CharSequence;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import java.lang.Exception;

public final class ThanosAdAutoJumpMonitorPresenter$c implements Runnable	// class@0016c3
{
    public final ThanosAdAutoJumpMonitorPresenter b;

    public void ThanosAdAutoJumpMonitorPresenter$c(ThanosAdAutoJumpMonitorPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       String str;
       if (PatchProxy.applyVoid(null, this, ThanosAdAutoJumpMonitorPresenter$c.class, "1")) {
          return;
       }
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       if (uActivityCon.h()) {
          this.b.P8("app is on foreground");
          return;
       }else if(!SystemUtil.T(a.b())){
          this.b.P8("screen is locked");
          return;
       }else if(RomUtils.s()){
          str = "com.nearme.instant.platform";
       }else if(RomUtils.w()){
          str = "com.vivo.hybrid";
       }else if(RomUtils.p() || RomUtils.m()){
          str = "com.huawei.fastapp";
       }else {
          str = "";
       }
       int i = 0;
       Application uApplication = (!str.length())? 1: null;
       if (uApplication) {
          return;
       }else {
          try{
             uApplication = a.B;
             a.o(uApplication, "AppEnv.APP");
             ApplicationInfo applicationI = uApplication.getPackageManager().getApplicationInfo(str, i);
             a.o(applicationI, "AppEnv.APP.packageManage¡­ationInfo\(packageName, 0\)");
             if (!(applicationI.flags & 0x200000)) {
                this.b.P8("quick app is running, report auto jump");
                this.b.R8();
             }else {
                this.b.P8("quick app is not running");
             }
          }catch(java.lang.Exception e0){
             this.b.P8("get application info error");
             e0.printStackTrace();
          }
          return;
       }
    }
}
