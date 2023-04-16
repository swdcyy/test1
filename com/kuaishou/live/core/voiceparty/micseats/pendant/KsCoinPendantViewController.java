package com.kuaishou.live.core.voiceparty.micseats.pendant.KsCoinPendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import brd.t;
import msd.p;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KsCoinPendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KsCoinPendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KsCoinPendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KsCoinPendantViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KsCoinPendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import it2.f0;
import java.lang.Enum;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import msd.l;
import android.view.View;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.GiftCounterView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import xh3.g;
import it2.g0;
import android.view.View$OnClickListener;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import it2.h0;
import androidx.lifecycle.Observer;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class KsCoinPendantViewController extends ViewController	// class@001612
{
    public final p j;
    public final MicSeatStyle k;
    public final p l;

    public void KsCoinPendantViewController(f p0,MicSeatStyle p1,t p2,p p3,LiveData p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "style");
       a.p(p2, "ksCoinInfoObservable");
       a.p(p3, "showContributorList");
       a.p(p4, "micSeatId");
       super();
       this.k = p1;
       this.l = p3;
       this.j = new ViewModelLazy(m0.d(KsCoinPendantViewModel.class), new KsCoinPendantViewController$viewModelDelegate$$inlined$viewModels$2(new KsCoinPendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new KsCoinPendantViewController$$special$$inlined$viewModelDelegate$1(new KsCoinPendantViewController$viewModel$2(p0, p2, p4)));
    }
    public void F2(){
       KsCoinPendantViewController ksCoinPendan = KsCoinPendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ksCoinPendan, "2")) {
          return;
       }
       int i = f0.a[this.k.ordinal()];
       if (i != 1) {
          i = (i != 2)? 0x7f0d16a1: 0x7f0d16b8;
       }else {
          i = 0x7f0d16ac;
       }
       this.S2(StyleKt.c(i, StyleKt.b(this.k)));
       if (!PatchProxy.applyVoid(objArray, this, ksCoinPendan, "3")) {
          GiftCounterView giftCounterV = this.A2(R.id.ks_coin_view);
          g.a(giftCounterV, this, this.V2().x0());
          giftCounterV.setOnClickListener(new g0(this));
          this.V2().y0().observe(this, new h0(this));
       }
       return;
    }
    public final KsCoinPendantViewModel V2(){
       Object obj = PatchProxy.apply(null, this, KsCoinPendantViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
