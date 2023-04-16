package com.kuaishou.tuna_plc_plugin.PlcDvaPluginApplication;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class PlcDvaPluginApplication extends Application	// class@00116e
{

    public void PlcDvaPluginApplication(){
       super();
    }
    public final void doRegister(){
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, PlcDvaPluginApplication.class, "1")) {
          return;
       }
       super.onCreate();
       this.doRegister();
       return;
    }
}
