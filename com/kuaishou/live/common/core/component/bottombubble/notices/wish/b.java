package com.kuaishou.live.common.core.component.bottombubble.notices.wish.b;
import erd.g;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.d;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class b implements g	// class@00101d
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       b.P(LiveLogTag.LIVE_COMMENT_NOTICE.appendTag("LiveWishLightNotice"), "sendBlessings:success");
    }
}
