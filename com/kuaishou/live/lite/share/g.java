package com.kuaishou.live.lite.share.g;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class g implements g	// class@000b1a
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLiteLogTag.SHARE, "LiveLiteShareListener.reportShareResult failed", p0);
    }
}
