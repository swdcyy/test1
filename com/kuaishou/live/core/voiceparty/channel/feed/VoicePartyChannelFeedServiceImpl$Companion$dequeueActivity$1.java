package com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl$Companion$dequeueActivity$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.app.Activity;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class VoicePartyChannelFeedServiceImpl$Companion$dequeueActivity$1 extends Lambda implements l	// class@00136f
{
    public final Activity $activity;

    public void VoicePartyChannelFeedServiceImpl$Companion$dequeueActivity$1(Activity p0){
       this.$activity = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(WeakReference p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyChannelFeedServiceImpl$Companion$dequeueActivity$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.get() == null || a.g(p0.get(), this.$activity))? true: false;
       return b;
    }
}
