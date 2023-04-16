package com.kuaishou.live.core.basic.activity.h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class h implements g	// class@00183c
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_POST_PLUGIN, "rxAsyncLoad fail", p0);
    }
}
