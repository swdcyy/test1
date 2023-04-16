package com.kuaishou.live.core.voiceparty.crossroompk.log.b;
import ok.h;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveVoicePartyPkTeamStatistic;
import java.lang.Long;

public final class b implements h	// class@00147a
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object apply(Object p0){
       return Long.valueOf(p0.score);
    }
}
