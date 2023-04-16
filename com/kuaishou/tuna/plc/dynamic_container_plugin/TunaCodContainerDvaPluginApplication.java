package com.kuaishou.tuna.plc.dynamic_container_plugin.TunaCodContainerDvaPluginApplication;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TunaCodContainerDvaPluginApplication extends Application	// class@001025
{

    public void TunaCodContainerDvaPluginApplication(){
       super();
    }
    public final void doRegister(){
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, TunaCodContainerDvaPluginApplication.class, "1")) {
          return;
       }
       super.onCreate();
       this.doRegister();
       return;
    }
}
