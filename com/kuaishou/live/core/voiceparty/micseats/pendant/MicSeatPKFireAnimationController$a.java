package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatPKFireAnimationController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatPKFireAnimationController;
import java.lang.Object;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import kotlin.jvm.internal.a;
import ts2.a;

public final class MicSeatPKFireAnimationController$a implements Observer	// class@0016d1
{
    public final MicSeatPKFireAnimationController b;

    public void MicSeatPKFireAnimationController$a(MicSeatPKFireAnimationController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatPKFireAnimationController$a.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.l.c(MicSeatPendantId.PKFireAnimation, p0);
       }
       return;
    }
}
