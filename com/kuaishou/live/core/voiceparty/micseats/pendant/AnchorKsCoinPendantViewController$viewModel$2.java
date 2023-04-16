package com.kuaishou.live.core.voiceparty.micseats.pendant.AnchorKsCoinPendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import brd.t;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KsCoinPendantViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AnchorKsCoinPendantViewController$viewModel$2 extends Lambda implements a	// class@0015c5
{
    public final t $ksCoinInfoObservable;
    public final LiveData $micSeatId;
    public final f $micSeatStateService;

    public void AnchorKsCoinPendantViewController$viewModel$2(f p0,t p1,LiveData p2){
       this.$micSeatStateService = p0;
       this.$ksCoinInfoObservable = p1;
       this.$micSeatId = p2;
       super(0);
    }
    public final KsCoinPendantViewModel invoke(){
       Object obj = PatchProxy.apply(null, this, AnchorKsCoinPendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KsCoinPendantViewModel(this.$micSeatStateService, this.$ksCoinInfoObservable, this.$micSeatId);
    }
    public Object invoke(){
       return this.invoke();
    }
}
