package com.yxcorp.gifshow.share.service.b;
import erd.g;
import java.lang.Object;
import rq4.d;
import com.yxcorp.gifshow.share.service.VideoShareObserverService$ShareObserverController;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import java.io.File;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import com.yxcorp.gifshow.share.service.VideoShareObserverService;
import android.content.Context;
import com.yxcorp.gifshow.share.service.VideoShareObserverService$ShareObserverController$a;
import com.yxcorp.gifshow.share.service.VideoShareObserverService$ShareObserverController$VideoShareObserverListener;
import com.yxcorp.gifshow.share.service.VideoShareObserver$VideoObserverListener;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;

public final class b implements g	// class@001c77
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       VideoShareObserverService$ShareObserverController.h.f = p0;
       p0 = VideoShareObserverService$ShareObserverController.h;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, VideoShareObserverService$ShareObserverController.class, "4")) {
       }else {
          long l = 0;
          long l1 = a.t().b("videoShareObserverChooseConfig", l);
          p0.c = l1;
          if (l1 - l) {
             VideoShareObserverService$ShareObserverController b = p0.b;
             if (b != null && b.exists()) {
                GifshowActivity gifshowActiv = p0.a.get();
                if (gifshowActiv != null) {
                   Intent intent = new Intent(gifshowActiv, VideoShareObserverService.class);
                   intent.putExtra("FILE_PATH", p0.b.getAbsolutePath());
                   VideoShareObserverService$ShareObserverController$a shareObserve = new VideoShareObserverService$ShareObserverController$a(p0, new VideoShareObserverService$ShareObserverController$VideoShareObserverListener(p0.f, p0.a));
                   p0.e = shareObserve;
                   a.a(gifshowActiv, intent, shareObserve, 1);
                }
             }
          }
       }
       return;
    }
}
