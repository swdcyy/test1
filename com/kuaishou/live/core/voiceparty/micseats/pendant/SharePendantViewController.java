package com.kuaishou.live.core.voiceparty.micseats.pendant.SharePendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import co2.f2;
import qu2.a;
import mt2.a;
import msd.l;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.SharePendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.SharePendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.SharePendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import it2.d1;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.SharePendantViewController$viewModelDelegate$$inlined$viewModels$2;
import it2.r0;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import it2.f1;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import android.view.View;
import it2.z0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.image.KwaiImageView;
import it2.a1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import android.widget.TextView;
import it2.b1;
import it2.c1;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import it2.y0$b;
import it2.y0;
import qrd.p;

public final class SharePendantViewController extends ViewController	// class@001741
{
    public final p j;
    public boolean k;
    public final r0 l;
    public final f2 m;
    public final a n;
    public final a o;
    public final l p;
    public final MicSeatStyle q;

    public void SharePendantViewController(f p0,f2 p1,a p2,a p3,l p4,MicSeatStyle p5,LiveData p6){
       a.p(p0, "micSeatStateService");
       a.p(p1, "voicePartyContext");
       a.p(p2, "liveContextWrapper");
       a.p(p3, "shareManager");
       a.p(p4, "showShareDialog");
       a.p(p5, "style");
       a.p(p6, "micSeatId");
       super();
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.p = p4;
       this.q = p5;
       this.j = new ViewModelLazy(m0.d(d1.class), new SharePendantViewController$viewModelDelegate$$inlined$viewModels$2(new SharePendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new SharePendantViewController$$special$$inlined$viewModelDelegate$1(new SharePendantViewController$viewModel$2(this, p0, p6)));
       this.l = new r0();
    }
    public void F2(){
       int i1;
       SharePendantViewController sharePendant = SharePendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, sharePendant, "2")) {
          return;
       }
       int i = 0x7f0d16c8;
       SharePendantViewController tq = this.q;
       Object obj = PatchProxy.applyOneRefs(tq, objArray, StyleKt.class, "5");
       if (obj != PatchProxyResult.class) {
          i1 = obj.intValue();
       }else {
          a.p(tq, "style");
          i1 = f1.d[tq.ordinal()];
          if (i1 != 1) {
             if (i1 != 2) {
                if (i1 != 3) {
                   if (i1 == 4) {
                      i1 = 0x7f11045e;
                   }else {
                      throw new NoWhenBranchMatchedException();
                   }
                }else {
                   i1 = 0x7f110462;
                }
             }else {
                i1 = 0x7f11045d;
             }
          }else {
             i1 = 0x7f110460;
          }
       }
       this.S2(StyleKt.c(i, i1));
       if (!PatchProxy.applyVoid(objArray, this, sharePendant, "4")) {
          this.P2().setOnClickListener(new z0(this));
          this.V2().j.observe(this, new a1(this, this.A2(R.id.mic_seat_share_animation_view), this.A2(R.id.mic_seat_share_icon_view)));
          this.V2().i.observe(this, new b1(this.A2(R.id.mic_seat_share_tip_text_view)));
          this.V2().k.observe(this, new c1(this));
       }
       return;
    }
    public void M2(){
       if (PatchProxy.applyVoid(null, this, SharePendantViewController.class, "3")) {
          return;
       }
       this.V2().x0(y0$b.a);
       return;
    }
    public final d1 V2(){
       Object obj = PatchProxy.apply(null, this, SharePendantViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
