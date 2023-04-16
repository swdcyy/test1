package com.kuaishou.live.core.voiceparty.micseats.pendant.BubbleGuidePendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import bt2.e;
import msd.p;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.BubbleGuidePendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.BubbleGuidePendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.BubbleGuidePendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import it2.o;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.BubbleGuidePendantViewController$viewModelDelegate$$inlined$viewModels$2;
import it2.p0;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import msd.l;
import android.view.View;
import it2.l;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.unionlive.guide.VoicePartyUnionGuideBreathTextView;
import it2.m;
import android.widget.TextView;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import com.kuaishou.live.core.voiceparty.micseats.pendant.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import it2.n;
import it2.c0$b;
import it2.c0;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class BubbleGuidePendantViewController extends ViewController	// class@0015e5
{
    public final p j;
    public p0 k;
    public final p l;
    public final MicSeatStyle m;

    public void BubbleGuidePendantViewController(f p0,e p1,p p2,boolean p3,MicSeatStyle p4,LiveData p5){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatsGuideManager");
       a.p(p2, "followAction");
       a.p(p4, "style");
       a.p(p5, "micSeatId");
       super();
       this.l = p2;
       this.m = p4;
       this.j = new ViewModelLazy(m0.d(o.class), new BubbleGuidePendantViewController$viewModelDelegate$$inlined$viewModels$2(new BubbleGuidePendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new BubbleGuidePendantViewController$$special$$inlined$viewModelDelegate$1(new BubbleGuidePendantViewController$viewModel$2(p0, p1, p3, p5)));
    }
    public static final p0 V2(BubbleGuidePendantViewController p0){
       p0 = p0.k;
       if (p0 == null) {
          a.S("micGuideHelper");
       }
       return p0;
    }
    public void F2(){
       BubbleGuidePendantViewController uBubbleGuide = BubbleGuidePendantViewController.class;
       if (PatchProxy.applyVoid(null, this, uBubbleGuide, "2")) {
          return;
       }
       this.S2(StyleKt.c(R.layout.arg_RES_7f0d16c1, StyleKt.b(this.m)));
       o oo = this.W2();
       BubbleGuidePendantViewController tl = this.l;
       if (!PatchProxy.applyVoidTwoRefs(oo, tl, this, uBubbleGuide, "4")) {
          this.P2().setOnClickListener(new l(oo));
          VoicePartyUnionGuideBreathTextView voicePartyUn = this.A2(R.id.bubble_guide_tip_view);
          voicePartyUn.setOnClickListener(new m(oo));
          this.k = new p0(voicePartyUn, this.P2());
          oo.x0().observe(this, new a(this, oo));
          oo.k.observe(this, new n(tl));
       }
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoid(null, this, BubbleGuidePendantViewController.class, "3")) {
          return;
       }
       BubbleGuidePendantViewController tk = this.k;
       if (tk == null) {
          a.S("micGuideHelper");
       }
       tk.a();
       this.W2().y0(c0$b.a);
       return;
    }
    public final o W2(){
       Object obj = PatchProxy.apply(null, this, BubbleGuidePendantViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
