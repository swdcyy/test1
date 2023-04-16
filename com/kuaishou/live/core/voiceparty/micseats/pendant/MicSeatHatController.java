package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatHatController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatHatController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatHatController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatHatController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatHatModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatHatController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatHatController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatHatController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;

public final class MicSeatHatController extends ViewController	// class@00169e
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final MicSeatStyle n;
    public final t o;

    public void MicSeatHatController(f p0,a p1,h p2,MicSeatStyle p3,t p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       a.p(p4, "usersHatInfoObservable");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.j = new ViewModelLazy(m0.d(MicSeatHatModel.class), new MicSeatHatController$viewModelDelegate$$inlined$viewModels$2(new MicSeatHatController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatHatController$$special$$inlined$viewModelDelegate$1(new MicSeatHatController$viewModel$2(this)));
    }
    public void F2(){
       MicSeatHatController micSeatHatCo = MicSeatHatController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatHatCo, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.Hat, new MicSeatHatController$onCreate$1(this));
       MicSeatHatModel micSeatHatMo = PatchProxy.apply(objArray, this, micSeatHatCo, "1");
       if (micSeatHatMo == PatchProxyResult.class) {
          micSeatHatMo = this.j.getValue();
       }
       micSeatHatMo.b.observe(this, new MicSeatHatController$a(this));
       return;
    }
}
