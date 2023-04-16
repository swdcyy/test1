package com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl$a;
import fw8.b;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl;
import com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl$Companion;

public final class VoicePartyChannelFeedServiceImpl$a extends b	// class@001372
{

    public void VoicePartyChannelFeedServiceImpl$a(){
       super();
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyChannelFeedServiceImpl$a.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       VoicePartyChannelFeedServiceImpl.n.a(p0);
       return;
    }
    public void onActivityStarted(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyChannelFeedServiceImpl$a.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       VoicePartyChannelFeedServiceImpl.n.a(p0);
       return;
    }
}
