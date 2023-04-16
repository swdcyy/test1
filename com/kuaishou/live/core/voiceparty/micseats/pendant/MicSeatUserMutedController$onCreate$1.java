package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserMutedController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserMutedController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import it2.u0;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;

public final class MicSeatUserMutedController$onCreate$1 extends Lambda implements l	// class@0016f2
{
    public final MicSeatUserMutedController this$0;

    public void MicSeatUserMutedController$onCreate$1(MicSeatUserMutedController p0){
       this.this$0 = p0;
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatUserMutedController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new u0(this.this$0.n);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
