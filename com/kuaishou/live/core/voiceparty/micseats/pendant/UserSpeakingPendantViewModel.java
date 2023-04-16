package com.kuaishou.live.core.voiceparty.micseats.pendant.UserSpeakingPendantViewModel;
import jt2.c;
import ts2.f;
import brd.t;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.BackpressureStrategy;
import yu2.c;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserSpeakingPendantViewModel$voiceEffectUrls$1;
import msd.q;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import d61.c0;

public final class UserSpeakingPendantViewModel extends c	// class@00175c
{
    public final LiveData g;
    public final LiveData h;
    public final LiveData i;

    public void UserSpeakingPendantViewModel(f p0,t p1,t p2,LiveData p3){
       a.p(p0, "micSeatStateService");
       a.p(p1, "speakingUsersObservable");
       a.p(p2, "voiceWaveInfoObservable");
       a.p(p3, "micSeatId");
       super(p0, p3);
       LiveData liveData = c.a(p1, null, 1, null);
       this.g = liveData;
       LiveData liveData1 = c.a(p2, null, 1, null);
       this.h = liveData1;
       this.i = LiveDataOperators.a(this.v0(), liveData, liveData1, new UserSpeakingPendantViewModel$voiceEffectUrls$1(this));
    }
    public final String x0(boolean p0){
       UserSpeakingPendantViewModel userSpeaking = UserSpeakingPendantViewModel.class;
       if (PatchProxy.isSupport(userSpeaking)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, userSpeaking, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = (p0)? c0.a.b("udata/pkg/LIVE-CDN/voiceparty/voice_party_female_speaking_anim2.webp"): c0.a.b("udata/pkg/LIVE-CDN/voiceparty/voice_party_male_speaking_anim2.webp");
       return str;
    }
}
