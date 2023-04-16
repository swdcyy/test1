package com.yxcorp.plugin.setting.krn.KrnPushSettingsBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import my5.a;
import com.yxcorp.plugin.setting.krn.a;
import java.lang.Runnable;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.yxcorp.gifshow.helper.h;

public class KrnPushSettingsBridge extends KrnBridge	// class@0008c6
{

    public void KrnPushSettingsBridge(ReactApplicationContext p0){
       super(p0);
    }
    public String getName(){
       return "PushSettings";
    }
    public void onPushPermissionDialogShow(){
       if (PatchProxy.applyVoid(null, this, KrnPushSettingsBridge.class, "1")) {
          return;
       }
       a.a(k1.i());
       k1.o(a.b);
       return;
    }
    public void openPushPermission(){
       if (PatchProxy.applyVoid(null, this, KrnPushSettingsBridge.class, "2")) {
          return;
       }
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv != null && !h.a()) {
          h.c(currentActiv);
       }
       return;
    }
}
