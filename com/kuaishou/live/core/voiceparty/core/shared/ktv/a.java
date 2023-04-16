package com.kuaishou.live.core.voiceparty.core.shared.ktv.a;
import erd.o;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyOrderedMusic;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.model.VoicePartyKtvPlayNextResponse;

public final class a implements o	// class@001443
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public Object apply(Object p0){
       VoicePartyKtvPlayNextResponse voicePartyKt = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (voicePartyKt != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          voicePartyKt = p0.a().mNextMusic;
       }
       return voicePartyKt;
    }
}
