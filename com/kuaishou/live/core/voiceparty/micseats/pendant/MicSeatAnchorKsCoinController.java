package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAnchorKsCoinController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import brd.t;
import msd.p;
import lk2.c;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAnchorKsCoinController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAnchorKsCoinController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAnchorKsCoinController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import lv2.a;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAnchorKsCoinController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAnchorKsCoinController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAnchorKsCoinController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class MicSeatAnchorKsCoinController extends ViewController	// class@00163c
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final t n;
    public final p o;
    public final c p;

    public void MicSeatAnchorKsCoinController(f p0,a p1,h p2,t p3,p p4,c p5,String p6){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "ksCoinInfoObservable");
       a.p(p4, "showContributorList");
       a.p(p6, "anchorId");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.j = new ViewModelLazy(m0.d(a.class), new MicSeatAnchorKsCoinController$viewModelDelegate$$inlined$viewModels$2(new MicSeatAnchorKsCoinController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatAnchorKsCoinController$$special$$inlined$viewModelDelegate$1(new MicSeatAnchorKsCoinController$viewModel$2(this, p6)));
    }
    public void F2(){
       MicSeatAnchorKsCoinController micSeatAncho = MicSeatAnchorKsCoinController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatAncho, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.AnchorKsCoin, new MicSeatAnchorKsCoinController$onCreate$1(this));
       a uoa = PatchProxy.apply(objArray, this, micSeatAncho, "1");
       if (uoa == PatchProxyResult.class) {
          uoa = this.j.getValue();
       }
       uoa.u0().observe(this, new MicSeatAnchorKsCoinController$a(this));
       return;
    }
}
