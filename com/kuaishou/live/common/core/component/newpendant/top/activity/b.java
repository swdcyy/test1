package com.kuaishou.live.common.core.component.newpendant.top.activity.b;
import msd.l;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class b implements l	// class@0016b9
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object invoke(Object p0){
       b.y(LiveLogTag.LIVE_TOP_PENDANT.appendTag("LiveTopActivityTkPendantPresenter"), "load Tk Bundle failed", p0);
       return null;
    }
}
