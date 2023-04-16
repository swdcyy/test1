package com.kuaishou.live.audience.plugin.LiveAudiencePluginApplication;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.d;
import b41.a;
import com.kuaishou.live.lite.adapter.component.plugin.LiveLiteAdapterPluginGetterImpl;

public class LiveAudiencePluginApplication extends Application	// class@000c47
{

    public void LiveAudiencePluginApplication(){
       super();
    }
    public static void doRegister(){
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, LiveAudiencePluginApplication.class, "1")) {
          return;
       }
       super.onCreate();
       if (d.i) {
          LiveAudiencePluginApplication.doRegister();
          if (!PatchProxy.applyVoid(null, null, a.class, "1")) {
             LiveLiteAdapterPluginGetterImpl liveLiteAdap = new LiveLiteAdapterPluginGetterImpl();
          }
       }
       return;
    }
}
