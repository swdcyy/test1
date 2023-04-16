package com.kuaishou.live.audience.component.gift.gift.audience.v2.j;
import brd.w;
import java.lang.Object;
import brd.y;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import com.kuaishou.live.core.basic.model.LiveGiftPanelRefreshConfig;
import rm1.g;

public final class j implements w	// class@000b1d
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final void subscribe(y p0){
       LiveGiftPanelRefreshConfig liveGiftPane = new LiveGiftPanelRefreshConfig();
       liveGiftPane.mDelayRequestMillis = g.c();
       p0.onNext(liveGiftPane);
    }
}
