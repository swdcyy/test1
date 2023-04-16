package com.yxcorp.plugin.setting.plugin.SettingPluginApplication;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class SettingPluginApplication extends Application	// class@0008ce
{

    public void SettingPluginApplication(){
       super();
    }
    public static void doRegister(){
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, SettingPluginApplication.class, "1")) {
          return;
       }
       super.onCreate();
       SettingPluginApplication.doRegister();
       return;
    }
}
