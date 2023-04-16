package com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$d;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import u99.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayerState;
import t99.p;
import java.lang.Enum;
import java.util.Map;
import java.util.Iterator;
import java.lang.Iterable;
import t99.y;

public final class LiveAutoPlayModule$d implements LivePlayerStateChangeListener	// class@001c01
{
    public final LiveAutoPlayModule b;

    public void LiveAutoPlayModule$d(LiveAutoPlayModule p0){
       this.b = p0;
       super();
    }
    public final void onStateChange(LivePlayerState p0){
       LiveAutoPlayerState iDLE;
       LiveAutoPlayModule liveAutoPlay = LiveAutoPlayModule.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlayModule$d.class, "1")) {
          return;
       }
       String str = "newState";
       a.p(p0, str);
       d.h("LiveAutoPlayModule", "mLivePlayerStateChangeListener", this.b.Q());
       LiveAutoPlayModule$d tb = this.b;
       Objects.requireNonNull(tb);
       LiveAutoPlayerState liveAutoPlay1 = PatchProxy.applyOneRefs(p0, tb, liveAutoPlay, "50");
       if (liveAutoPlay1 != PatchProxyResult.class) {
       }else {
          switch (p.a[p0.ordinal()]){
              case 1:
                iDLE = LiveAutoPlayerState.IDLE;
                break;
              case 2:
                iDLE = LiveAutoPlayerState.PREPARING;
                break;
              case 3:
                iDLE = LiveAutoPlayerState.PLAYING;
                break;
              case 4:
                iDLE = LiveAutoPlayerState.STOP;
                break;
              case 5:
                iDLE = LiveAutoPlayerState.DESTROY;
                break;
              case 6:
                iDLE = LiveAutoPlayerState.ERROR;
                break;
              default:
                liveAutoPlay1 = LiveAutoPlayerState.ERROR;
          }
          liveAutoPlay1 = iDLE;
       }
       LiveAutoPlayModule$d tb1 = this.b;
       Objects.requireNonNull(tb1);
       if (!PatchProxy.applyVoidOneRefs(liveAutoPlay1, tb1, liveAutoPlay, "51")) {
          HashMap hashMap = tb1.Q();
          hashMap.put(str, liveAutoPlay1.name());
          d.h("LiveAutoPlayModule", "onStateChange", hashMap);
          Iterator iterator = tb1.e.iterator();
          while (iterator.hasNext()) {
             iterator.next().onVideoStateChange(liveAutoPlay1);
          }
       }
       return;
    }
}
