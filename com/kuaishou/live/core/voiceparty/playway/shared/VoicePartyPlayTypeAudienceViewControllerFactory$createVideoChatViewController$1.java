package com.kuaishou.live.core.voiceparty.playway.shared.VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.b;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt;

public final class VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$1 extends Lambda implements l	// class@00186e
{
    public final b $micSeatDispatcher;

    public void VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$1(b p0){
       this.$micSeatDispatcher = p0;
       super(1);
    }
    public final t invoke(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return TransformerKt.c(p0, this.$micSeatDispatcher);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
