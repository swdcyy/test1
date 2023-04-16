package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatShareController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import co2.f2;
import qu2.a;
import mt2.a;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatShareController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatShareController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatShareController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import it2.s0;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatShareController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.statechart.StateChart;
import com.kuaishou.live.core.voiceparty.micseats.share.MicSeatShareStateEvent$MicSeatShareEnterStartEvent;
import ut7.e;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatShareController$onCreate$1;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatShareController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import ut7.h;

public final class MicSeatShareController extends ViewController	// class@0016de
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final MicSeatStyle n;
    public final f2 o;
    public final a p;
    public final a q;
    public final l r;

    public void MicSeatShareController(f p0,a p1,h p2,MicSeatStyle p3,f2 p4,a p5,a p6,l p7){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       a.p(p4, "voicePartyContext");
       a.p(p5, "liveContextWrapper");
       a.p(p6, "shareManager");
       a.p(p7, "showShareDialog");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.q = p6;
       this.r = p7;
       this.j = new ViewModelLazy(m0.d(s0.class), new MicSeatShareController$viewModelDelegate$$inlined$viewModels$2(new MicSeatShareController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatShareController$$special$$inlined$viewModelDelegate$1(new MicSeatShareController$viewModel$2(this)));
    }
    public void F2(){
       MicSeatShareController micSeatShare = MicSeatShareController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatShare, "2")) {
          return;
       }
       MicSeatShareController tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(objArray, tq, a.class, "1")) {
          tq.d.s();
          tq.d.n(MicSeatShareStateEvent$MicSeatShareEnterStartEvent.a);
       }
       this.m.a(MicSeatPendantId.Share, new MicSeatShareController$onCreate$1(this));
       s0 os0 = PatchProxy.apply(objArray, this, micSeatShare, "1");
       if (os0 == PatchProxyResult.class) {
          os0 = this.j.getValue();
       }
       os0.a.observe(this, new MicSeatShareController$a(this));
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MicSeatShareController.class, "3")) {
          return;
       }
       MicSeatShareController tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(objArray, tq, a.class, "2")) {
          tq.d.t(h.b);
       }
       return;
    }
}
