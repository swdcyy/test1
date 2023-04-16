package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatActionBridgeController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import java.lang.Object;
import jt2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MicSeatActionBridgeController$viewModel$2 extends Lambda implements a	// class@001631
{
    public final f $micSeatStateService;

    public void MicSeatActionBridgeController$viewModel$2(f p0){
       this.$micSeatStateService = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, MicSeatActionBridgeController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.$micSeatStateService);
    }
}
