package com.kuaishou.live.lite.debuginfo.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class b implements g	// class@0008d1
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLiteLogTag.PLAYER_DEBUG_INFO, "DebugInfoViewController.refresh failed", p0);
    }
}
