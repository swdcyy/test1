package com.kuaishou.live.common.core.component.bottombubble.notices.wish.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.d;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@00101e
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       b.y(LiveLogTag.LIVE_COMMENT_NOTICE.appendTag("LiveWishLightNotice"), "sendBlessings:fail", p0);
    }
}
