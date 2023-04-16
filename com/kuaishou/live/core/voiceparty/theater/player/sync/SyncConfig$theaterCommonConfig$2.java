package com.kuaishou.live.core.voiceparty.theater.player.sync.SyncConfig$theaterCommonConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Type;
import wg3.a;

public final class SyncConfig$theaterCommonConfig$2 extends Lambda implements a	// class@0019b8
{
    public static final SyncConfig$theaterCommonConfig$2 INSTANCE;

    static {
       SyncConfig$theaterCommonConfig$2.INSTANCE = new SyncConfig$theaterCommonConfig$2();
    }
    public void SyncConfig$theaterCommonConfig$2(){
       super(0);
    }
    public final LiveVoicePartyTheaterCommonConfig invoke(){
       LiveVoicePartyTheaterCommonConfig obj = PatchProxy.apply(null, this, SyncConfig$theaterCommonConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.P(LiveVoicePartyTheaterCommonConfig.class);
       if (obj == null) {
          obj = new LiveVoicePartyTheaterCommonConfig();
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
