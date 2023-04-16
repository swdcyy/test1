package com.yxcorp.gifshow.music.radio.notification.MusicRadioForegroundService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.radio.notification.MusicRadioForegroundService$a;
import com.yxcorp.gifshow.music.radio.notification.MusicNotificationHelper;

public class MusicRadioForegroundService extends Service	// class@002074
{
    public MusicNotificationHelper b;

    public void MusicRadioForegroundService(){
       super();
    }
    public IBinder onBind(Intent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, MusicRadioForegroundService.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new MusicRadioForegroundService$a(this);
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, MusicRadioForegroundService.class, "1")) {
          return;
       }
       super.onCreate();
       this.b = new MusicNotificationHelper(this);
       return;
    }
}
