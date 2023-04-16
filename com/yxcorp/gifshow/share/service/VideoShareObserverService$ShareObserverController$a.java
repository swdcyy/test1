package com.yxcorp.gifshow.share.service.VideoShareObserverService$ShareObserverController$a;
import android.content.ServiceConnection;
import com.yxcorp.gifshow.share.service.VideoShareObserverService$ShareObserverController;
import com.yxcorp.gifshow.share.service.VideoShareObserver$VideoObserverListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.share.service.VideoShareObserverService;
import com.yxcorp.gifshow.share.service.VideoShareObserver;
import android.content.ComponentName;
import android.os.IBinder;
import com.yxcorp.gifshow.share.service.VideoShareObserverService$a;
import java.util.concurrent.TimeUnit;
import brd.t;
import vic.a;
import erd.g;
import crd.b;
import lnc.b9;

public class VideoShareObserverService$ShareObserverController$a implements ServiceConnection	// class@001c72
{
    public VideoShareObserverService b;
    public b c;
    public final VideoShareObserver$VideoObserverListener d;
    public final VideoShareObserverService$ShareObserverController e;

    public void VideoShareObserverService$ShareObserverController$a(VideoShareObserverService$ShareObserverController p0,VideoShareObserver$VideoObserverListener p1){
       this.e = p0;
       super();
       this.d = p1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, VideoShareObserverService$ShareObserverController$a.class, "4")) {
          return;
       }
       VideoShareObserverService$ShareObserverController$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, VideoShareObserverService.class, "3")) {
          tb.b.stopWatching();
          tb.c = null;
       }
       return;
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoShareObserverService$ShareObserverController$a.class, "1")) {
          return;
       }
       VideoShareObserverService$a a = p1.a;
       this.b = a;
       a.c = this.d;
       if (!PatchProxy.applyVoid(null, this, VideoShareObserverService$ShareObserverController$a.class, "3")) {
          this.b.a();
       }
       a.d = true;
       this.c = t.timer(this.e.c, TimeUnit.SECONDS).subscribe(new a(this));
       return;
    }
    public void onServiceDisconnected(ComponentName p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoShareObserverService$ShareObserverController$a.class, "2")) {
          return;
       }
       b9.a(this.c);
       return;
    }
}
