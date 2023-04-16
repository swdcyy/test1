package com.kuaishou.live.core.voiceparty.micseats.pendant.HatPendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import brd.t;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.HatPendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.HatPendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.HatPendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.HatPendantViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.HatPendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import msd.l;
import android.view.View;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.VoicePartyHatView;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import it2.d0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class HatPendantViewController extends ViewController	// class@001609
{
    public final p j;
    public final MicSeatStyle k;

    public void HatPendantViewController(f p0,t p1,MicSeatStyle p2,LiveData p3){
       a.p(p0, "micSeatStateService");
       a.p(p1, "usersHatInfoObservable");
       a.p(p2, "style");
       a.p(p3, "micSeatId");
       super();
       this.k = p2;
       this.j = new ViewModelLazy(m0.d(HatPendantViewModel.class), new HatPendantViewController$viewModelDelegate$$inlined$viewModels$2(new HatPendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new HatPendantViewController$$special$$inlined$viewModelDelegate$1(new HatPendantViewController$viewModel$2(p0, p1, p3)));
    }
    public void F2(){
       HatPendantViewController hatPendantVi = HatPendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, hatPendantVi, "2")) {
          return;
       }
       this.S2(StyleKt.c(R.layout.arg_RES_7f0d16cc, StyleKt.b(this.k)));
       if (!PatchProxy.applyVoid(objArray, this, hatPendantVi, "3")) {
          VoicePartyHatView voicePartyHa = this.A2(R.id.hat_view);
          HatPendantViewModel hatPendantVi1 = PatchProxy.apply(objArray, this, hatPendantVi, "1");
          if (hatPendantVi1 == PatchProxyResult.class) {
             hatPendantVi1 = this.j.getValue();
          }
          hatPendantVi1.i.observe(this, new d0(voicePartyHa));
       }
       return;
    }
}
