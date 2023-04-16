package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatLockedController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatLockedController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatLockedController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatLockedController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import jt2.d;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatLockedController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatLockedController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatLockedController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class MicSeatLockedController extends ViewController	// class@0016c3
{
    public final p j;
    public final a k;
    public final h l;
    public final MicSeatStyle m;

    public void MicSeatLockedController(f p0,a p1,h p2,MicSeatStyle p3){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       super();
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.j = new ViewModelLazy(m0.d(d.class), new MicSeatLockedController$viewModelDelegate$$inlined$viewModels$2(new MicSeatLockedController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatLockedController$$special$$inlined$viewModelDelegate$1(new MicSeatLockedController$viewModel$2(p0)));
    }
    public void F2(){
       MicSeatLockedController micSeatLocke = MicSeatLockedController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatLocke, "2")) {
          return;
       }
       this.l.a(MicSeatPendantId.Locked, new MicSeatLockedController$onCreate$1(this));
       d uod = PatchProxy.apply(objArray, this, micSeatLocke, "1");
       if (uod == PatchProxyResult.class) {
          uod = this.j.getValue();
       }
       uod.u0().observe(this, new MicSeatLockedController$a(this));
       return;
    }
}
