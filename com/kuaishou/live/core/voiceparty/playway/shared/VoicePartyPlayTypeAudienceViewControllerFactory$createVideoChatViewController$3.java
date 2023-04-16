package com.kuaishou.live.core.voiceparty.playway.shared.VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import co2.f2;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt;

public final class VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$3 extends Lambda implements l	// class@001870
{
    public final f2 $voicePartyContext;

    public void VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$3(f2 p0){
       this.$voicePartyContext = p0;
       super(1);
    }
    public final t invoke(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return TransformerKt.b(p0, this.$voicePartyContext, null, 4, null);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
