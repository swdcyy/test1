package com.kuaishou.live.core.voiceparty.micseats.pendant.AnchorKsCoinPendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import brd.t;
import msd.p;
import lk2.c;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AnchorKsCoinPendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AnchorKsCoinPendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AnchorKsCoinPendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KsCoinPendantViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AnchorKsCoinPendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.live.core.basic.widget.LiveDrawableCenterTextView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import xh3.g;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.StickerhelperKt;
import it2.f;
import android.view.View$OnClickListener;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import it2.g;
import androidx.lifecycle.Observer;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class AnchorKsCoinPendantViewController extends ViewController	// class@0015c8
{
    public final p j;
    public final p k;
    public final c l;

    public void AnchorKsCoinPendantViewController(f p0,t p1,p p2,c p3,LiveData p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "ksCoinInfoObservable");
       a.p(p2, "showContributorList");
       a.p(p4, "micSeatId");
       super();
       this.k = p2;
       this.l = p3;
       this.j = new ViewModelLazy(m0.d(KsCoinPendantViewModel.class), new AnchorKsCoinPendantViewController$viewModelDelegate$$inlined$viewModels$2(new AnchorKsCoinPendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new AnchorKsCoinPendantViewController$$special$$inlined$viewModelDelegate$1(new AnchorKsCoinPendantViewController$viewModel$2(p0, p1, p4)));
    }
    public void F2(){
       AnchorKsCoinPendantViewController uAnchorKsCoi = AnchorKsCoinPendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAnchorKsCoi, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d16f6);
       if (!PatchProxy.applyVoid(objArray, this, uAnchorKsCoi, "3")) {
          LiveDrawableCenterTextView liveDrawable = this.A2(R.id.ks_coin_view);
          g.a(liveDrawable, this, this.V2().x0());
          AnchorKsCoinPendantViewController tl = this.l;
          if (tl != null) {
             StickerhelperKt.a(tl, liveDrawable, this);
          }
          liveDrawable.setOnClickListener(new f(this));
          this.V2().y0().observe(this, new g(this));
       }
       return;
    }
    public final KsCoinPendantViewModel V2(){
       Object obj = PatchProxy.apply(null, this, AnchorKsCoinPendantViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
