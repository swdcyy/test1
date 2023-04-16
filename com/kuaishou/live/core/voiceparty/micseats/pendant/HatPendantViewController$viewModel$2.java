package com.kuaishou.live.core.voiceparty.micseats.pendant.HatPendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import brd.t;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.HatPendantViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HatPendantViewController$viewModel$2 extends Lambda implements a	// class@001606
{
    public final LiveData $micSeatId;
    public final f $micSeatStateService;
    public final t $usersHatInfoObservable;

    public void HatPendantViewController$viewModel$2(f p0,t p1,LiveData p2){
       this.$micSeatStateService = p0;
       this.$usersHatInfoObservable = p1;
       this.$micSeatId = p2;
       super(0);
    }
    public final HatPendantViewModel invoke(){
       Object obj = PatchProxy.apply(null, this, HatPendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HatPendantViewModel(this.$micSeatStateService, this.$usersHatInfoObservable, this.$micSeatId);
    }
    public Object invoke(){
       return this.invoke();
    }
}
