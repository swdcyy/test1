package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$c;
import sj3.b;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import sj3.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import d61.g;
import java.lang.Throwable;

public final class LiveLitePlayConfigController$c implements b	// class@000a86
{
    public final LiveLitePlayConfigController b;

    public void LiveLitePlayConfigController$c(LiveLitePlayConfigController p0){
       this.b = p0;
       super();
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveLitePlayConfigController$c.class, "2")) {
          return;
       }
       LiveLitePlayConfigController$c tb = this.b;
       tb.i = true;
       LiveLiteLogTag pLAYER = LiveLiteLogTag.PLAYER;
       pLAYER.appendTag(tb.a);
       LiveLiteLogTag liveLiteLogT = pLAYER;
       b.P(liveLiteLogT, "LivePlayerReconnectListener onAfterConfigUpdated");
       this.b.a(true);
       return;
    }
    public void e(){
       a.d(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePlayConfigController$c.class, "1")) {
          return;
       }
       a.p(p0, "newConfig");
       a.p(p1, "oldConfig");
       g.l(this.b.k, p0);
       this.b.b(p0, true);
       return;
    }
    public void onError(Throwable p0){
       a.c(this, p0);
    }
}
