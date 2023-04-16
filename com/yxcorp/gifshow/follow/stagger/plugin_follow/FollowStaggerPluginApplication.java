package com.yxcorp.gifshow.follow.stagger.plugin_follow.FollowStaggerPluginApplication;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class FollowStaggerPluginApplication extends Application	// class@0011bd
{

    public void FollowStaggerPluginApplication(){
       super();
    }
    public static void doRegister(){
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, FollowStaggerPluginApplication.class, "1")) {
          return;
       }
       super.onCreate();
       FollowStaggerPluginApplication.doRegister();
       return;
    }
}
