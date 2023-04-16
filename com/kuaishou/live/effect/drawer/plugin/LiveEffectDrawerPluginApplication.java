package com.kuaishou.live.effect.drawer.plugin.LiveEffectDrawerPluginApplication;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveEffectDrawerPluginApplication extends Application	// class@001af6
{

    public void LiveEffectDrawerPluginApplication(){
       super();
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, LiveEffectDrawerPluginApplication.class, "1")) {
          return;
       }
       super.onCreate();
       return;
    }
}
