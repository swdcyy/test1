package com.kuaishou.live.core.voiceparty.theater.player.sync.SyncConfig;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.live.core.voiceparty.theater.player.sync.SyncConfig$theaterCommonConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.core.voiceparty.theater.player.sync.SyncConfig$theaterPlaySptsConfig$2;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TheaterPlaySptsConfig;

public final class SyncConfig	// class@0019ba
{
    public static final long a;
    public static final long b;
    public static final long c;
    public static final p d;
    public static final p e;
    public static final SyncConfig f;

    static {
       SyncConfig.f = new SyncConfig();
       TimeUnit sECONDS = TimeUnit.SECONDS;
       SyncConfig.a = sECONDS.toMillis(5);
       SyncConfig.b = sECONDS.toMillis(5);
       SyncConfig.c = sECONDS.toMillis(3);
       LazyThreadSafetyMode nONE = LazyThreadSafetyMode.NONE;
       SyncConfig.d = s.b(nONE, SyncConfig$theaterCommonConfig$2.INSTANCE);
       SyncConfig.e = s.b(nONE, SyncConfig$theaterPlaySptsConfig$2.INSTANCE);
    }
    public void SyncConfig(){
       super();
    }
    public final LiveVoicePartyTheaterCommonConfig a(){
       Object obj = PatchProxy.apply(null, this, SyncConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SyncConfig.d.getValue();
    }
    public final LiveVoicePartyTheaterCommonConfig$TheaterPlaySptsConfig b(){
       Object obj = PatchProxy.apply(null, this, SyncConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SyncConfig.e.getValue();
    }
}
