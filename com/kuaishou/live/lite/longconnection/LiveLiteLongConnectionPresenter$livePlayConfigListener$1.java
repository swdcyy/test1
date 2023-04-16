package com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter$livePlayConfigListener$1;
import ds5.c;
import com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.android.live.model.QLivePlayConfig;
import ds5.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.Lifecycle;
import b93.d;
import androidx.lifecycle.Lifecycle$State;
import com.kwai.video.waynelive.LivePlayerController;
import ec3.f;
import com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter$livePlayConfigListener$1$onAfterConfigUpdated$1;
import msd.a;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import java.lang.Throwable;

public final class LiveLiteLongConnectionPresenter$livePlayConfigListener$1 implements c	// class@0009ff
{
    public final LiveLiteLongConnectionPresenter b;

    public void LiveLiteLongConnectionPresenter$livePlayConfigListener$1(LiveLiteLongConnectionPresenter p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return "LongConnection";
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       b.c(this, p0, p1);
    }
    public void ff(QLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteLongConnectionPresenter$livePlayConfigListener$1.class, "1")) {
          return;
       }
       a.p(p0, "config");
       b.P(LiveLogTag.LIVE_SOCKET.appendTag(this.b.v), "onAfterConfigUpdated, resumeLongConnection");
       Lifecycle lifecycle = this.b.getLifecycle();
       String str = "lifecycle";
       a.o(lifecycle, str);
       Lifecycle$State sTARTED = Lifecycle$State.STARTED;
       if (!lifecycle.getCurrentState().isAtLeast(sTARTED)) {
          lifecycle = this.b.getLifecycle();
          a.o(lifecycle, str);
          if (!lifecycle.getCurrentState().isAtLeast(sTARTED) && (LiveLiteLongConnectionPresenter.d9(this.b).isPreparing() || LiveLiteLongConnectionPresenter.d9(this.b).isPlaying())) {
          label_0061 :
             if (f.h()) {
                LiveLiteLongConnectionPresenter h = this.b.H;
                if (h == null) {
                   a.S("mLiveLiteScatterLoadManager");
                }
                h.ll("resumeLongConnection", new LiveLiteLongConnectionPresenter$livePlayConfigListener$1$onAfterConfigUpdated$1(this));
             }else {
                this.b.e9();
             }
          }
       }else {
          goto label_0061 ;
       }
       return;
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public boolean xi(){
       return true;
    }
}
