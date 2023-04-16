package com.kwai.component.photo.detail.core.media.MediaButtonService;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.String;
import android.os.Bundle;
import androidx.media.MediaBrowserServiceCompat$e;
import androidx.media.MediaBrowserServiceCompat$i;
import android.content.Intent;
import android.os.IBinder;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.photo.detail.core.media.MediaButtonService$b;
import android.content.ComponentName;
import android.app.Service;
import androidx.media.session.MediaButtonReceiver;
import com.kwai.component.photo.detail.core.media.MediaButtonService$a;
import id5.o;
import com.kwai.logger.KwaiLog;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.Exception;
import java.lang.Boolean;
import a76.j;
import android.os.Handler;

public class MediaButtonService extends MediaBrowserServiceCompat	// class@000a34
{
    public MediaSessionCompat j;
    public Runnable k;

    public void MediaButtonService(){
       super();
    }
    public MediaBrowserServiceCompat$e e(String p0,int p1,Bundle p2){
       return null;
    }
    public void f(String p0,MediaBrowserServiceCompat$i p1){
    }
    public IBinder onBind(Intent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, MediaButtonService.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new MediaButtonService$b(this);
    }
    public void onCreate(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, MediaButtonService.class, "1")) {
          return;
       }
       super.onCreate();
       this.k = new MediaButtonService$a(this, new ComponentName(this.getPackageName(), MediaButtonReceiver.class.getName()));
       int i = 0;
       if (o.b()) {
          objArray = new Object[i];
          KwaiLog.b("MediaButtonService", "onCreate\(\) async init", objArray);
          e.g(this.k, "MediaButtonService");
       }else {
          objArray = new Object[i];
          KwaiLog.b("MediaButtonService", "onCreate\(\) sync init", objArray);
          this.k.run();
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MediaButtonService.class, "4")) {
          return;
       }
       super.onDestroy();
       MediaButtonService tj = this.j;
       if (tj != null) {
          try{
             tj.e();
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public boolean onUnbind(Intent p0){
       MediaButtonService obj = PatchProxy.applyOneRefs(p0, this, MediaButtonService.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (o.b()) {
          obj = this.k;
          if (!PatchProxy.applyVoidOneRefs(obj, null, e.class, "9")) {
             e.d.post(new j(obj));
          }
       }
       return super.onUnbind(p0);
    }
}
