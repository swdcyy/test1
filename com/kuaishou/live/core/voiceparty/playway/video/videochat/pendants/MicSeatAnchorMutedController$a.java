package com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorMutedController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorMutedController;
import java.lang.Object;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import kotlin.jvm.internal.a;
import ts2.a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public final class MicSeatAnchorMutedController$a implements Observer	// class@0018ea
{
    public final MicSeatAnchorMutedController b;

    public void MicSeatAnchorMutedController$a(MicSeatAnchorMutedController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatAnchorMutedController$a.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.l.c(MicSeatPendantId.AnchorMuted, p0);
          b.P(LiveVoicePartyLogTag.MIC_SEAT.appendTag("AnchorMuted"), "¸üÐÂAnchorMuted¹Ò¼þ£º"+p0);
       }
       return;
    }
}
