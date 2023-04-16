package com.yxcorp.gifshow.share.service.VideoShareObserverService;
import android.app.Service;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.share.service.VideoShareObserver;
import com.yxcorp.gifshow.share.service.VideoShareObserver$VideoObserverListener;
import java.io.File;
import android.content.Intent;
import android.os.IBinder;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.service.VideoShareObserverService$a;

public class VideoShareObserverService extends Service	// class@001c75
{
    public VideoShareObserver b;
    public VideoShareObserver$VideoObserverListener c;
    public String d;

    public void VideoShareObserverService(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, VideoShareObserverService.class, "2")) {
          return;
       }
       this.b = (Build$VERSION.SDK_INT < 29)? new VideoShareObserver(this.d, this.c): new VideoShareObserver(new File(this.d), this.c);
       this.b.startWatching();
       return;
    }
    public IBinder onBind(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoShareObserverService.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.d = p0.getStringExtra("FILE_PATH");
       return new VideoShareObserverService$a(this);
    }
}
