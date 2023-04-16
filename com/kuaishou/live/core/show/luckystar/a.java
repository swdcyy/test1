package com.kuaishou.live.core.show.luckystar.a;
import erd.g;
import java.lang.Object;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class a implements g	// class@000cb8
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       b.B(LiveLogTag.LUCKY_STAR, "luckyStarAutoParticipate, requestLuckyStarCurrentInfo success");
    }
}
