package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatHatController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatHatController;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatHatModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ts2.f;
import brd.t;

public final class MicSeatHatController$viewModel$2 extends Lambda implements a	// class@00169b
{
    public final MicSeatHatController this$0;

    public void MicSeatHatController$viewModel$2(MicSeatHatController p0){
       this.this$0 = p0;
       super(0);
    }
    public final MicSeatHatModel invoke(){
       Object obj = PatchProxy.apply(null, this, MicSeatHatController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       MicSeatHatController$viewModel$2 tthis$0 = this.this$0;
       return new MicSeatHatModel(tthis$0.k, tthis$0.o);
    }
    public Object invoke(){
       return this.invoke();
    }
}
