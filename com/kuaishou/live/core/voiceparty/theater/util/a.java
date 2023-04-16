package com.kuaishou.live.core.voiceparty.theater.util.a;
import ok.x;
import java.lang.Object;
import ix2.f;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.lang.Boolean;

public final class a implements x	// class@001a4f
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       LiveVoicePartyTheaterCommonConfig liveVoicePar = a.P(LiveVoicePartyTheaterCommonConfig.class);
       boolean b = (liveVoicePar != null && liveVoicePar.mEnableVoicePartyMovieChannelV2 != null)? true: false;
       return Boolean.valueOf(b);
    }
}
