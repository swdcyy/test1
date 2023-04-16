package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatLockedController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import java.lang.Object;
import jt2.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ts2.j$d;
import ts2.j;

public final class MicSeatLockedController$viewModel$2 extends Lambda implements a	// class@0016c0
{
    public final f $micSeatStateService;

    public void MicSeatLockedController$viewModel$2(f p0){
       this.$micSeatStateService = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, MicSeatLockedController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(this.$micSeatStateService, j$d.a);
    }
}
