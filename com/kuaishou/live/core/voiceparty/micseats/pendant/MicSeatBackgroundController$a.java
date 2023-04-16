package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBackgroundController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBackgroundController;
import java.lang.Object;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import kotlin.jvm.internal.a;
import ts2.a;

public final class MicSeatBackgroundController$a implements Observer	// class@001652
{
    public final MicSeatBackgroundController b;

    public void MicSeatBackgroundController$a(MicSeatBackgroundController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatBackgroundController$a.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.l.c(MicSeatPendantId.Background, p0);
       }
       return;
    }
}
