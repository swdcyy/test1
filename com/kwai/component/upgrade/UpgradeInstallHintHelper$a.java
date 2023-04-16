package com.kwai.component.upgrade.UpgradeInstallHintHelper$a;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import ai5.j;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.upgrade.UpgradeInstallHintHelper;
import zjd.f;

public class UpgradeInstallHintHelper$a implements Application$ActivityLifecycleCallbacks	// class@000bf3
{

    public void UpgradeInstallHintHelper$a(){
       super();
    }
    public void UpgradeInstallHintHelper$a(j p0){
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UpgradeInstallHintHelper$a.class, "3")) {
          return;
       }
       if (p0 == UpgradeInstallHintHelper.g) {
          UpgradeInstallHintHelper.b();
       }
       return;
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UpgradeInstallHintHelper$a.class, "2")) {
          return;
       }
       if (p0 != UpgradeInstallHintHelper.g || (!PatchProxy.applyVoid(null, null, UpgradeInstallHintHelper.class, "5") && UpgradeInstallHintHelper.c)) {
          UpgradeInstallHintHelper.c = false;
          UpgradeInstallHintHelper.f.g();
       }
    label_0027 :
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UpgradeInstallHintHelper$a.class, "1")) {
          return;
       }
       UpgradeInstallHintHelper.a(p0);
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
    }
    public void onActivityStopped(Activity p0){
    }
}
