package com.kuaishou.live.core.basic.activity.i;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class i implements g	// class@00183e
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final void accept(Object p0){
       b.c0(LiveLogTag.LIVE_POST_PLUGIN, "rxAsyncLoad", "success", p0);
    }
}
