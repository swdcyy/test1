package com.yxcorp.dynamicfeature.video.VideoPluginApplication;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.dynamicfeature.video.VideoPluginInitModule;
import com.yxcorp.gifshow.camerasdk.CameraSdkInitModule;
import wkd.b;
import a76.d;
import bl0.c;
import vi7.a;
import java.util.Collection;
import java.util.Iterator;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import rg.c;
import com.yxcorp.dynamicfeature.video.VideoPluginApplication$a;
import rg.c$c;

public class VideoPluginApplication extends Application	// class@0011cf
{

    public void VideoPluginApplication(){
       super();
    }
    public static void doRegister(){
    }
    public final void executeInitModule(){
       if (PatchProxy.applyVoid(null, this, VideoPluginApplication.class, "2")) {
          return;
       }
       b.a(-2118755940).m(new VideoPluginInitModule());
       b.a(-2118755940).m(new CameraSdkInitModule());
       return;
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, VideoPluginApplication.class, "1")) {
          return;
       }
       super.onCreate();
       Collection uCollection = a.a.a("video");
       Iterator iterator = uCollection.iterator();
       String str = "";
       while (iterator.hasNext()) {
          str = str+","+iterator.next();
       }
       Log.g("VideoPlugin", "feature so list="+str);
       c.a().b(new VideoPluginApplication$a(this, uCollection));
       VideoPluginApplication.doRegister();
       this.executeInitModule();
       return;
    }
}
