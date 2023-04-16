package com.kuaishou.live.core.basic.activity.g;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class g implements g	// class@00183a
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_POST_PLUGIN, "rxAsyncLoad fail", p0);
    }
}
