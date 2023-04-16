package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoController;
import ts2.f;
import java.util.Set;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;

public final class MicSeatVideoController$viewModel$2 extends Lambda implements a	// class@00170d
{
    public final Set $forceOpenVideoUsers;
    public final f $micSeatStateService;
    public final MicSeatVideoController this$0;

    public void MicSeatVideoController$viewModel$2(MicSeatVideoController p0,f p1,Set p2){
       this.this$0 = p0;
       this.$micSeatStateService = p1;
       this.$forceOpenVideoUsers = p2;
       super(0);
    }
    public final MicSeatVideoModel invoke(){
       Object obj = PatchProxy.apply(null, this, MicSeatVideoController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MicSeatVideoModel(this.$micSeatStateService, this.this$0.m, this.$forceOpenVideoUsers);
    }
    public Object invoke(){
       return this.invoke();
    }
}
