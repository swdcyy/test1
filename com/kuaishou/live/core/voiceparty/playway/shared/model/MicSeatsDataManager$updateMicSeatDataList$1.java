package com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$updateMicSeatDataList$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;

public final class MicSeatsDataManager$updateMicSeatDataList$1 extends Lambda implements l	// class@00187b
{
    public final boolean $isManual;
    public final MicSeatsDataManager this$0;

    public void MicSeatsDataManager$updateMicSeatDataList$1(MicSeatsDataManager p0,boolean p1){
       this.this$0 = p0;
       this.$isManual = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(MicSeatsDataManager$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatsDataManager$updateMicSeatDataList$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.b(this.this$0.k(), this.$isManual);
       return;
    }
}
