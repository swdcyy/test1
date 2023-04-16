package com.kuaishou.live.core.voiceparty.playway.shared.VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$6;
import msd.a;
import kotlin.jvm.internal.Lambda;
import qu2.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$6 extends Lambda implements a	// class@001871
{
    public final a $liveBaseContext;

    public void VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$6(a p0){
       this.$liveBaseContext = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$6.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$liveBaseContext.getLiveStreamId();
    }
}
