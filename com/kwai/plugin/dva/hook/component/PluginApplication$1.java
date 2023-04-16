package com.kwai.plugin.dva.hook.component.PluginApplication$1;
import android.content.ComponentCallbacks2;
import com.kwai.plugin.dva.hook.component.PluginApplication;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import java.lang.Integer;

public class PluginApplication$1 implements ComponentCallbacks2	// class@00132c
{
    public final PluginApplication this$0;

    public void PluginApplication$1(PluginApplication p0){
       this.this$0 = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginApplication$1.class, "2")) {
          return;
       }
       this.this$0.onConfigurationChanged(p0);
       return;
    }
    public void onLowMemory(){
       if (PatchProxy.applyVoid(null, this, PluginApplication$1.class, "3")) {
          return;
       }
       this.this$0.onLowMemory();
       return;
    }
    public void onTrimMemory(int p0){
       if (PatchProxy.isSupport(PluginApplication$1.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PluginApplication$1.class, "1")) {
          return;
       }
       this.this$0.onTrimMemory(p0);
       return;
    }
}
