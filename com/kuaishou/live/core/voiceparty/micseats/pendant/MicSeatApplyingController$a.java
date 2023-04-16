package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatApplyingController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatApplyingController;
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

public final class MicSeatApplyingController$a implements Observer	// class@00163f
{
    public final MicSeatApplyingController b;

    public void MicSeatApplyingController$a(MicSeatApplyingController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatApplyingController$a.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.k.c(MicSeatPendantId.Applying, p0);
          b.P(LiveVoicePartyLogTag.MIC_SEAT.appendTag("Applying"), "更新正在申请上麦挂件："+p0);
       }
       return;
    }
}
