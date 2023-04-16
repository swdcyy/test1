package com.kuaishou.live.core.voiceparty.playway.shared.VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt;

public final class VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$2 extends Lambda implements l	// class@00186f
{
    public final t $micSeatChangedInfoObservable;

    public void VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$2(t p0){
       this.$micSeatChangedInfoObservable = p0;
       super(1);
    }
    public final t invoke(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return TransformerKt.f(p0, this.$micSeatChangedInfoObservable);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
