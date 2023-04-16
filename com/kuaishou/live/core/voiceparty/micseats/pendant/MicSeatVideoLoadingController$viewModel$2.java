package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoLoadingController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoLoadingController;
import java.util.Set;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoLoadingViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ts2.f;
import brd.t;

public final class MicSeatVideoLoadingController$viewModel$2 extends Lambda implements a	// class@001715
{
    public final Set $needLoadingMicSeatIds;
    public final MicSeatVideoLoadingController this$0;

    public void MicSeatVideoLoadingController$viewModel$2(MicSeatVideoLoadingController p0,Set p1){
       this.this$0 = p0;
       this.$needLoadingMicSeatIds = p1;
       super(0);
    }
    public final VideoLoadingViewModel invoke(){
       Object obj = PatchProxy.apply(null, this, MicSeatVideoLoadingController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       MicSeatVideoLoadingController$viewModel$2 tthis$0 = this.this$0;
       return new VideoLoadingViewModel(tthis$0.k, tthis$0.n, this.$needLoadingMicSeatIds);
    }
    public Object invoke(){
       return this.invoke();
    }
}
