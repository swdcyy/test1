package com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl$Companion$enqueueActivity$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kuaishou.live.core.voiceparty.d0;

public final class VoicePartyChannelFeedServiceImpl$Companion$enqueueActivity$1 extends Lambda implements l	// class@001370
{
    public static final VoicePartyChannelFeedServiceImpl$Companion$enqueueActivity$1 INSTANCE;

    static {
       VoicePartyChannelFeedServiceImpl$Companion$enqueueActivity$1.INSTANCE = new VoicePartyChannelFeedServiceImpl$Companion$enqueueActivity$1();
    }
    public void VoicePartyChannelFeedServiceImpl$Companion$enqueueActivity$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(WeakReference p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyChannelFeedServiceImpl$Companion$enqueueActivity$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.get() == null || d0.k(p0.get()))? true: false;
       return b;
    }
}
