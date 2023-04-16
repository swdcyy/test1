package com.kuaishou.live.core.voiceparty.micseats.pendant.UserSpeakingPendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import brd.t;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserSpeakingPendantViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UserSpeakingPendantViewController$viewModel$2 extends Lambda implements a	// class@001757
{
    public final LiveData $micSeatId;
    public final f $micSeatStateService;
    public final t $speakingUsersObservable;
    public final t $voiceWaveInfoObservable;

    public void UserSpeakingPendantViewController$viewModel$2(f p0,t p1,t p2,LiveData p3){
       this.$micSeatStateService = p0;
       this.$speakingUsersObservable = p1;
       this.$voiceWaveInfoObservable = p2;
       this.$micSeatId = p3;
       super(0);
    }
    public final UserSpeakingPendantViewModel invoke(){
       Object obj = PatchProxy.apply(null, this, UserSpeakingPendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new UserSpeakingPendantViewModel(this.$micSeatStateService, this.$speakingUsersObservable, this.$voiceWaveInfoObservable, this.$micSeatId);
    }
    public Object invoke(){
       return this.invoke();
    }
}
