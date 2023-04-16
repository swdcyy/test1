package com.kuaishou.live.core.voiceparty.micseats.pendant.PKFireAnimationPendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import tu2.f;
import brd.t;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.PKFireAnimationPendantViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PKFireAnimationPendantViewController$viewModel$2 extends Lambda implements a	// class@001734
{
    public final LiveData $micSeatId;
    public final f $micSeatStateService;
    public final f $pkAnimationDispatchService;
    public final t $teamInfo;

    public void PKFireAnimationPendantViewController$viewModel$2(f p0,f p1,t p2,LiveData p3){
       this.$micSeatStateService = p0;
       this.$pkAnimationDispatchService = p1;
       this.$teamInfo = p2;
       this.$micSeatId = p3;
       super(0);
    }
    public final PKFireAnimationPendantViewModel invoke(){
       Object obj = PatchProxy.apply(null, this, PKFireAnimationPendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PKFireAnimationPendantViewModel(this.$micSeatStateService, this.$pkAnimationDispatchService, this.$teamInfo, this.$micSeatId);
    }
    public Object invoke(){
       return this.invoke();
    }
}
