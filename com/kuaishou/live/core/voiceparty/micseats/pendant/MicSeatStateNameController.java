package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatStateNameController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatStateNameController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatStateNameController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatStateNameController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import it2.t0;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatStateNameController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatStateNameController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatStateNameController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;

public final class MicSeatStateNameController extends ViewController	// class@0016e6
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final MicSeatStyle n;
    public final boolean o;

    public void MicSeatStateNameController(f p0,a p1,h p2,MicSeatStyle p3,boolean p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.j = new ViewModelLazy(m0.d(t0.class), new MicSeatStateNameController$viewModelDelegate$$inlined$viewModels$2(new MicSeatStateNameController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatStateNameController$$special$$inlined$viewModelDelegate$1(new MicSeatStateNameController$viewModel$2(this)));
    }
    public void F2(){
       MicSeatStateNameController micSeatState = MicSeatStateNameController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatState, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.StateName, new MicSeatStateNameController$onCreate$1(this));
       t0 ot0 = PatchProxy.apply(objArray, this, micSeatState, "1");
       if (ot0 == PatchProxyResult.class) {
          ot0 = this.j.getValue();
       }
       ot0.a.observe(this, new MicSeatStateNameController$a(this));
       return;
    }
}
