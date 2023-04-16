package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$e;
import erd.g;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController;
import java.lang.Object;
import zca.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import kc3.b;
import com.kwai.video.waynelive.LivePlayerController;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.Lifecycle$State;
import ec3.f;
import qc3.d;

public final class LiveLitePlayerPlayController$e implements g	// class@000a92
{
    public final LiveLitePlayerPlayController b;

    public void LiveLitePlayerPlayController$e(LiveLitePlayerPlayController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayerPlayController$e.class, "1")) {
       }else {
          a.p(p0, "event");
          LiveLitePlayerPlayController$e tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveLitePlayerPlayController.class, "16")) {
             LiveLiteLogTag pLAYER = LiveLiteLogTag.PLAYER;
             pLAYER.appendTag(tb.j);
             LiveLiteLogTag liveLiteLogT = pLAYER;
             LiveLitePlayerPlayController k = tb.k;
             a.o(k, "livePlayConfig");
             String liveStreamId = k.getLiveStreamId();
             b.T(liveLiteLogT, "handleSlidingPanelEvent", "liveStreamId", liveStreamId, "open", Boolean.valueOf(p0.a));
             b = false;
             if (p0.a != null) {
                if (b.b()) {
                   b = true;
                }
             }else if(!tb.z.isPlaying() && tb.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.RESUMED)){
                tb.Y2(b, "SlidingPanel");
             }
             if (f.a()) {
                tb.w.h(p0, b);
             }
             if (b) {
                tb.X2(1, "SlidingPanel");
             }
          }
       }
       return;
    }
}
