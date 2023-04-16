package com.kuaishou.live.external.m;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.external.p;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class m implements g	// class@001ba9
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_PLUGIN, "loadLivePlugin fail", p0);
    }
}
