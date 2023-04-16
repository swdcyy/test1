package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserNameController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserNameController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserNamePendantViewController;
import ts2.f;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;

public final class MicSeatUserNameController$onCreate$1 extends Lambda implements l	// class@0016fc
{
    public final MicSeatUserNameController this$0;

    public void MicSeatUserNameController$onCreate$1(MicSeatUserNameController p0){
       this.this$0 = p0;
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatUserNameController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       MicSeatUserNameController$onCreate$1 tthis$0 = this.this$0;
       return new UserNamePendantViewController(tthis$0.k, tthis$0.n, p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
