package com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudienceController$a$a;
import d61.k0$a;
import java.lang.Object;
import op2.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.TheaterEpisodeInfo;
import kotlin.jvm.internal.a;

public final class VoicePartyTheaterAudienceController$a$a implements k0$a	// class@001950
{
    public static final VoicePartyTheaterAudienceController$a$a a;

    static {
       VoicePartyTheaterAudienceController$a$a.a = new VoicePartyTheaterAudienceController$a$a();
    }
    public void VoicePartyTheaterAudienceController$a$a(){
       super();
    }
    public Object get(Object p0){
       TheaterEpisodeInfo theaterEpiso = PatchProxy.applyOneRefs(p0, this, VoicePartyTheaterAudienceController$a$a.class, "1");
       if (theaterEpiso != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          theaterEpiso = p0.a();
       }
       return theaterEpiso;
    }
}
