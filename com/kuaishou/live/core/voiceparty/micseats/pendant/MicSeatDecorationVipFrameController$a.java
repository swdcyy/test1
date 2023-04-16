package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameController;
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

public final class MicSeatDecorationVipFrameController$a implements Observer	// class@00166f
{
    public final MicSeatDecorationVipFrameController b;

    public void MicSeatDecorationVipFrameController$a(MicSeatDecorationVipFrameController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatDecorationVipFrameController$a.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.k.c(MicSeatPendantId.DecorationVipFrame, p0);
          b.P(LiveVoicePartyLogTag.MIC_SEAT.appendTag("DecorationVipFrame"), "更新贵宾位Vip挂件："+p0);
       }
       return;
    }
}
