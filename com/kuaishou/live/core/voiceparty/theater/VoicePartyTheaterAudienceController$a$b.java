package com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudienceController$a$b;
import d61.k0$a;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.TheaterEpisodeInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class VoicePartyTheaterAudienceController$a$b implements k0$a	// class@001951
{
    public static final VoicePartyTheaterAudienceController$a$b a;

    static {
       VoicePartyTheaterAudienceController$a$b.a = new VoicePartyTheaterAudienceController$a$b();
    }
    public void VoicePartyTheaterAudienceController$a$b(){
       super();
    }
    public Object get(Object p0){
       TheaterEpisodeInfo theaterEpiso = PatchProxy.applyOneRefs(p0, this, VoicePartyTheaterAudienceController$a$b.class, "1");
       if (theaterEpiso != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          theaterEpiso = p0.watermark;
       }
       return theaterEpiso;
    }
}
