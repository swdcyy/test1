package com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter$a;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import b93.d;
import androidx.lifecycle.Lifecycle$State;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import hf3.a;

public final class LiveLiteLongConnectionPresenter$a implements LivePlayerStateChangeListener	// class@0009fa
{
    public final LiveLiteLongConnectionPresenter b;

    public void LiveLiteLongConnectionPresenter$a(LiveLiteLongConnectionPresenter p0){
       this.b = p0;
       super();
    }
    public final void onStateChange(LivePlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteLongConnectionPresenter$a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       if (p0 == LivePlayerState.STOP) {
          Lifecycle lifecycle = this.b.getLifecycle();
          a.o(lifecycle, "lifecycle");
          if (!lifecycle.getCurrentState().isAtLeast(Lifecycle$State.STARTED)) {
             b.P(LiveLogTag.LIVE_SOCKET.appendTag(this.b.v), "lite is invisible and play stop, exit longconnection");
             LiveLiteLongConnectionPresenter.c9(this.b).a();
          }
       }
       return;
    }
}
