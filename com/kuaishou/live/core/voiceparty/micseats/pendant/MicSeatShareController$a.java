package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatShareController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatShareController;
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

public final class MicSeatShareController$a implements Observer	// class@0016d9
{
    public final MicSeatShareController b;

    public void MicSeatShareController$a(MicSeatShareController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatShareController$a.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.l.c(MicSeatPendantId.Share, p0);
          b.P(LiveVoicePartyLogTag.MIC_SEAT.appendTag("MicSeatShare"), "更新麦位分享挂件："+p0);
       }
       return;
    }
}
