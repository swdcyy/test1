package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserMutedController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserMutedController;
import brd.t;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserMutedModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ts2.f;

public final class MicSeatUserMutedController$viewModel$2 extends Lambda implements a	// class@0016f3
{
    public final t $userMutedInfoObservable;
    public final MicSeatUserMutedController this$0;

    public void MicSeatUserMutedController$viewModel$2(MicSeatUserMutedController p0,t p1){
       this.this$0 = p0;
       this.$userMutedInfoObservable = p1;
       super(0);
    }
    public final MicSeatUserMutedModel invoke(){
       Object obj = PatchProxy.apply(null, this, MicSeatUserMutedController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MicSeatUserMutedModel(this.this$0.k, this.$userMutedInfoObservable);
    }
    public Object invoke(){
       return this.invoke();
    }
}
