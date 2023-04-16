package com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$a;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader;
import java.lang.Object;
import jw7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import ekd.k1;
import qrd.l1;
import io.reactivex.subjects.PublishSubject;

public final class LiveLitePresenterScatterLoader$a implements LivePlayerRenderListener	// class@00092c
{
    public final LiveLitePresenterScatterLoader b;

    public void LiveLitePresenterScatterLoader$a(LiveLitePresenterScatterLoader p0){
       this.b = p0;
       super();
    }
    public void onAudioRenderingStart(){
       a.a(this);
    }
    public void onLivePlayViewShow(){
       a.b(this);
    }
    public void onRenderingStartAfterResume(){
       a.c(this);
    }
    public void onSwitchToAudioStreamFromVideoStream(){
       a.d(this);
    }
    public void onSwitchToVideoStreamFromAudioStream(){
       a.e(this);
    }
    public void onVideoRenderingStart(){
       if (PatchProxy.applyVoid(null, this, LiveLitePresenterScatterLoader$a.class, "1")) {
          return;
       }
       b.Z(LiveLiteLogTag.LITE_FRAMEWORK_LOADER, this.b.h+" onVideoRenderingStart");
       k1.n(this.b.k);
       this.b.i.onNext(l1.a);
       return;
    }
}
