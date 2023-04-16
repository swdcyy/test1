package com.yxcorp.plugin.setting.krn.KrnSettingsPlatformModule;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class KrnSettingsPlatformModule extends KrnBridge	// class@0008ca
{

    public void KrnSettingsPlatformModule(ReactApplicationContext p0){
       super(p0);
    }
    public String getName(){
       return "SettingsPlatform";
    }
    public void goBack(){
       if (PatchProxy.applyVoid(null, this, KrnSettingsPlatformModule.class, "1")) {
          return;
       }
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv != null) {
          currentActiv.onBackPressed();
       }
       return;
    }
}
