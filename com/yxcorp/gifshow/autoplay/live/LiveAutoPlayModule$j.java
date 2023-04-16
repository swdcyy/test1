package com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$j;
import erd.g;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import u99.d;
import com.kwai.video.waynelive.LivePlayerController;
import java.util.Objects;
import t99.w;
import com.kwai.framework.model.feed.BaseFeed;
import t99.w$a;
import java.util.Iterator;
import java.lang.Iterable;
import t99.y;

public final class LiveAutoPlayModule$j implements g	// class@001c07
{
    public final LiveAutoPlayModule b;

    public void LiveAutoPlayModule$j(LiveAutoPlayModule p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlayModule$j.class, "1")) {
       }else {
          String str = "LiveAutoPlayModule";
          d.h(str, "timerFinished", this.b.Q());
          p0 = this.b.k;
          if (p0 != null && p0.isPlaying() == true) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, LiveAutoPlayModule.class, "61")) {
                d.h(str, "onPlayTimeFinished", p0.Q());
                w.a.a(false, p0.s);
                p0 = p0.e.iterator();
                while (p0.hasNext()) {
                   p0.next().onPlayTimeFinished();
                }
             }
             this.b.stopPlay("playTimeFinished");
          }
       }
       return;
    }
}
