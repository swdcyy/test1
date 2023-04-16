package com.kuaishou.live.external.r;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class r implements g	// class@001bba
{
    public static final r b;

    static {
       r.b = new r();
    }
    public void r(){
       super();
    }
    public final void accept(Object p0){
       b.B(LiveLogTag.LIVE_PLUGIN, "handleButton fail, error is"+p0);
    }
}
