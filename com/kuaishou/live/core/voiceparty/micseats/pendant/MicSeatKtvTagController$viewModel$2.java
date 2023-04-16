package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKtvTagController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKtvTagController;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKtvTagModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ts2.f;
import brd.t;

public final class MicSeatKtvTagController$viewModel$2 extends Lambda implements a	// class@0016ae
{
    public final MicSeatKtvTagController this$0;

    public void MicSeatKtvTagController$viewModel$2(MicSeatKtvTagController p0){
       this.this$0 = p0;
       super(0);
    }
    public final MicSeatKtvTagModel invoke(){
       Object obj = PatchProxy.apply(null, this, MicSeatKtvTagController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       MicSeatKtvTagController$viewModel$2 tthis$0 = this.this$0;
       return new MicSeatKtvTagModel(tthis$0.k, tthis$0.n, tthis$0.o);
    }
    public Object invoke(){
       return this.invoke();
    }
}
