package com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.AnchorMutedPendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import brd.t;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserMutedPendantViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AnchorMutedPendantViewController$viewModel$2 extends Lambda implements a	// class@0018e4
{
    public final LiveData $micSeatId;
    public final f $micSeatStateService;
    public final t $userMutedInfoObservable;

    public void AnchorMutedPendantViewController$viewModel$2(f p0,t p1,LiveData p2){
       this.$micSeatStateService = p0;
       this.$userMutedInfoObservable = p1;
       this.$micSeatId = p2;
       super(0);
    }
    public final UserMutedPendantViewModel invoke(){
       Object obj = PatchProxy.apply(null, this, AnchorMutedPendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new UserMutedPendantViewModel(this.$micSeatStateService, this.$userMutedInfoObservable, this.$micSeatId);
    }
    public Object invoke(){
       return this.invoke();
    }
}
