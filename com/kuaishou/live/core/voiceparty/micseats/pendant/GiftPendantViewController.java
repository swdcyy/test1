package com.kuaishou.live.core.voiceparty.micseats.pendant.GiftPendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import qx1.a;
import java.lang.String;
import hf3.a;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.GiftPendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.GiftPendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.GiftPendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import it2.x;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.GiftPendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import av2.b;
import android.view.View;
import com.kuaishou.live.core.voiceparty.giftanimation.VoicePartyGiftAnimationView;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import it2.w;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class GiftPendantViewController extends ViewController	// class@001603
{
    public final p j;

    public void GiftPendantViewController(f p0,a p1,String p2,a p3,LiveData p4){
       a.p(p0, "micSeatStateService");
       a.p(p2, "anchorUserId");
       a.p(p3, "liveLongConnection");
       a.p(p4, "micSeatId");
       super();
       GiftPendantViewController$viewModel$2 oviewModel$2 = new GiftPendantViewController$viewModel$2(p0, p3, p1, p2, p4);
       this.j = new ViewModelLazy(m0.d(x.class), new GiftPendantViewController$viewModelDelegate$$inlined$viewModels$2(new GiftPendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new GiftPendantViewController$$special$$inlined$viewModelDelegate$1(v0));
    }
    public void F2(){
       GiftPendantViewController giftPendantV = GiftPendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, giftPendantV, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d16c4);
       x ox = PatchProxy.apply(objArray, this, giftPendantV, "1");
       if (ox == PatchProxyResult.class) {
          ox = this.j.getValue();
       }
       if (!PatchProxy.applyVoidOneRefs(ox, this, giftPendantV, "3")) {
          ox.x0().observe(this, new w(new b(this.A2(R.id.gift_anim_view))));
       }
       return;
    }
}
