package com.kuaishou.live.core.voiceparty.micseats.pendant.UserSpeakingPendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import brd.t;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserSpeakingPendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserSpeakingPendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserSpeakingPendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserSpeakingPendantViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserSpeakingPendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import msd.l;
import px2.a;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import it2.i1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class UserSpeakingPendantViewController extends ViewController	// class@00175a
{
    public final p j;
    public final MicSeatStyle k;

    public void UserSpeakingPendantViewController(f p0,MicSeatStyle p1,t p2,t p3,LiveData p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "style");
       a.p(p2, "speakingUsersObservable");
       a.p(p3, "voiceWaveInfoObservable");
       a.p(p4, "micSeatId");
       super();
       this.k = p1;
       this.j = new ViewModelLazy(m0.d(UserSpeakingPendantViewModel.class), new UserSpeakingPendantViewController$viewModelDelegate$$inlined$viewModels$2(new UserSpeakingPendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new UserSpeakingPendantViewController$$special$$inlined$viewModelDelegate$1(new UserSpeakingPendantViewController$viewModel$2(p0, p2, p3, p4)));
    }
    public void F2(){
       UserSpeakingPendantViewController userSpeaking = UserSpeakingPendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, userSpeaking, "2")) {
          return;
       }
       this.S2(StyleKt.c(R.layout.arg_RES_7f0d16cd, StyleKt.b(this.k)));
       if (!PatchProxy.applyVoid(objArray, this, userSpeaking, "3")) {
          a uoa = new a(this.A2(0x7f0a4499));
          UserSpeakingPendantViewModel userSpeaking1 = PatchProxy.apply(objArray, this, userSpeaking, "1");
          if (userSpeaking1 == PatchProxyResult.class) {
             userSpeaking1 = this.j.getValue();
          }
          userSpeaking1.i.observe(this, new i1(uoa));
       }
       return;
    }
}
