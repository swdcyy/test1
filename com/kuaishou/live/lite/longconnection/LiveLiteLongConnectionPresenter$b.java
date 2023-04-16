package com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter$b;
import mq5.h;
import com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import hf3.a;

public final class LiveLiteLongConnectionPresenter$b implements h	// class@0009fb
{
    public final LiveLiteLongConnectionPresenter b;

    public void LiveLiteLongConnectionPresenter$b(LiveLiteLongConnectionPresenter p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, LiveLiteLongConnectionPresenter$b.class, "1")) {
          return;
       }
       b.P(LiveLogTag.LIVE_SOCKET.appendTag(this.b.v), "live end, exit longconnection");
       LiveLiteLongConnectionPresenter.c9(this.b).a();
       return;
    }
}
