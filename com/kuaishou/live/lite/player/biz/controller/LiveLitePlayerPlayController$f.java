package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$f;
import erd.g;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController;
import java.lang.Object;
import vs5.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.live.log.b;

public final class LiveLitePlayerPlayController$f implements g	// class@000a93
{
    public final LiveLitePlayerPlayController b;

    public void LiveLitePlayerPlayController$f(LiveLitePlayerPlayController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayerPlayController$f.class, "1")) {
       }else {
          a.p(p0, "event");
          LiveLitePlayerPlayController$f tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveLitePlayerPlayController.class, "12") && !p0.a(tb.z)) {
             LiveLitePlayerPlayController k = tb.k;
             a.o(k, "livePlayConfig");
             b.S(LiveLiteLogTag.PLAYER.appendTag(tb.j), "handleNewLivePlayEvent mute", "liveStreamId", k.getLiveStreamId());
             tb.z.mute();
          }
       }
       return;
    }
}
