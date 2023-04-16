package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoUserStateController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoUserStateController;
import java.lang.Object;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import kotlin.jvm.internal.a;
import ts2.a;

public final class MicSeatVideoUserStateController$a implements Observer	// class@00171d
{
    public final MicSeatVideoUserStateController b;

    public void MicSeatVideoUserStateController$a(MicSeatVideoUserStateController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatVideoUserStateController$a.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.l.c(MicSeatPendantId.VideoUserState, p0);
       }
       return;
    }
}
