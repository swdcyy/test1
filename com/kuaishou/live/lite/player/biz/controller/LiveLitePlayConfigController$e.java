package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$e;
import erd.g;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController;
import java.lang.Object;
import vs5.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveLitePlayConfigController$e implements g	// class@000a88
{
    public final LiveLitePlayConfigController b;

    public void LiveLitePlayConfigController$e(LiveLitePlayConfigController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayConfigController$e.class, "1")) {
       }else {
          LiveLitePlayConfigController$e tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveLitePlayConfigController.class, "10") && ((tb.d.getLiveStreamId()).equals(p0.a) || (tb.d.getLiveStreamId()).equals(p0.b))) {
             LiveLiteLogTag pLAYER = LiveLiteLogTag.PLAYER;
             pLAYER.appendTag(tb.a);
             b.T(pLAYER, "LiveStreamIdChangeEvent", "mOldLiveStreamId", p0.a, "mNewLiveStreamId", p0.b);
             tb.e();
          }
       }
       return;
    }
}
