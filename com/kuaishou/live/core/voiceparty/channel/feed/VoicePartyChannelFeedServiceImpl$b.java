package com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl$b;
import wr2.a;
import com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl$Companion;
import com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl$Companion$enqueueActivity$1;
import java.lang.Iterable;
import msd.l;
import trd.y;
import java.lang.ref.WeakReference;
import java.util.Deque;
import android.app.Activity;
import com.kuaishou.live.core.voiceparty.d0;

public final class VoicePartyChannelFeedServiceImpl$b implements a	// class@001373
{
    public final VoicePartyChannelFeedServiceImpl a;

    public void VoicePartyChannelFeedServiceImpl$b(VoicePartyChannelFeedServiceImpl p0){
       this.a = p0;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, VoicePartyChannelFeedServiceImpl$b.class, "1")) {
          return;
       }
       VoicePartyChannelFeedServiceImpl$Companion n = VoicePartyChannelFeedServiceImpl.n;
       VoicePartyChannelFeedServiceImpl g = this.a.g;
       Objects.requireNonNull(n);
       if (!PatchProxy.applyVoidOneRefs(g, n, VoicePartyChannelFeedServiceImpl$Companion.class, "2")) {
          Deque m = VoicePartyChannelFeedServiceImpl.m;
          y.F0(m, VoicePartyChannelFeedServiceImpl$Companion$enqueueActivity$1.INSTANCE);
          m.add(new WeakReference(g));
          int i = m.size() - 2;
          while (i > 0) {
             WeakReference weakReferenc = VoicePartyChannelFeedServiceImpl.m.pollFirst();
             if (weakReferenc != null) {
                Activity uActivity = weakReferenc.get();
                if (uActivity != null && !d0.k(uActivity)) {
                   uActivity.finish();
                }
             }
             i = i - 1;
          }
       }
       return;
    }
}
