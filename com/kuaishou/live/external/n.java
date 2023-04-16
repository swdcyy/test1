package com.kuaishou.live.external.n;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.live.external.p;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class n implements g	// class@001baa
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public final void accept(Object p0){
       b.c0(LiveLogTag.LIVE_PLUGIN, "loadLivePlugin", "success", p0);
    }
}
