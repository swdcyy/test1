package com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class h implements g	// class@000b09
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void accept(Object p0){
       b.y(LiveLogTag.GIFT.appendTag("LiveAudienceBottomBarGiftAnimationController"), "fail to loadUpdatedGifts", p0);
    }
}
