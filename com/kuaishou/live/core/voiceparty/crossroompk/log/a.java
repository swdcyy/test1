package com.kuaishou.live.core.voiceparty.crossroompk.log.a;
import ok.h;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveVoicePartyPkTeamStatistic;
import java.lang.Long;

public final class a implements h	// class@001479
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       return Long.valueOf(p0.score);
    }
}
