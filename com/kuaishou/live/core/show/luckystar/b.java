package com.kuaishou.live.core.show.luckystar.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class b implements g	// class@000cb9
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LUCKY_STAR, "luckyStarAutoParticipate, requestLuckyStarCurrentInfo failed", p0);
    }
}
