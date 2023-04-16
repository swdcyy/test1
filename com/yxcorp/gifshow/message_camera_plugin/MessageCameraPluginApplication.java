package com.yxcorp.gifshow.message_camera_plugin.MessageCameraPluginApplication;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class MessageCameraPluginApplication extends Application	// class@001dd7
{

    public void MessageCameraPluginApplication(){
       super();
    }
    public static void doRegister(){
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, MessageCameraPluginApplication.class, "1")) {
          return;
       }
       super.onCreate();
       MessageCameraPluginApplication.doRegister();
       return;
    }
}
