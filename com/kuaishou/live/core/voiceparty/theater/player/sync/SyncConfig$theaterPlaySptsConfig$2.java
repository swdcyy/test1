package com.kuaishou.live.core.voiceparty.theater.player.sync.SyncConfig$theaterPlaySptsConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TheaterPlaySptsConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.theater.player.sync.SyncConfig;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig;

public final class SyncConfig$theaterPlaySptsConfig$2 extends Lambda implements a	// class@0019b9
{
    public static final SyncConfig$theaterPlaySptsConfig$2 INSTANCE;

    static {
       SyncConfig$theaterPlaySptsConfig$2.INSTANCE = new SyncConfig$theaterPlaySptsConfig$2();
    }
    public void SyncConfig$theaterPlaySptsConfig$2(){
       super(0);
    }
    public final LiveVoicePartyTheaterCommonConfig$TheaterPlaySptsConfig invoke(){
       LiveVoicePartyTheaterCommonConfig obj = PatchProxy.apply(null, this, SyncConfig$theaterPlaySptsConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = SyncConfig.f.a().mTheaterPlaySptsConfig;
       if (obj == null) {
          LiveVoicePartyTheaterCommonConfig$TheaterPlaySptsConfig theaterPlayS = new LiveVoicePartyTheaterCommonConfig$TheaterPlaySptsConfig();
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
