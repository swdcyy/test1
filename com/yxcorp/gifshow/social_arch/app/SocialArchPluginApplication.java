package com.yxcorp.gifshow.social_arch.app.SocialArchPluginApplication;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class SocialArchPluginApplication extends Application	// class@001d74
{

    public void SocialArchPluginApplication(){
       super();
    }
    public final void doRegister(){
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, SocialArchPluginApplication.class, "1")) {
          return;
       }
       super.onCreate();
       this.doRegister();
       return;
    }
}
