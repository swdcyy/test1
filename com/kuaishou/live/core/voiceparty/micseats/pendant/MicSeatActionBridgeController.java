package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatActionBridgeController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatActionBridgeController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatActionBridgeController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatActionBridgeController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import jt2.a;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatActionBridgeController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatActionBridgeController$onCreate$1;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatActionBridgeController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class MicSeatActionBridgeController extends ViewController	// class@001634
{
    public final p j;
    public final a k;
    public final h l;
    public final l m;

    public void MicSeatActionBridgeController(f p0,a p1,h p2,l p3){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "viewManager");
       a.p(p3, "onClick");
       super();
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.j = new ViewModelLazy(m0.d(a.class), new MicSeatActionBridgeController$viewModelDelegate$$inlined$viewModels$2(new MicSeatActionBridgeController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatActionBridgeController$$special$$inlined$viewModelDelegate$1(new MicSeatActionBridgeController$viewModel$2(p0)));
    }
    public void F2(){
       MicSeatActionBridgeController micSeatActio = MicSeatActionBridgeController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatActio, "2")) {
          return;
       }
       this.l.a(MicSeatPendantId.ActionBridge, new MicSeatActionBridgeController$onCreate$1(this));
       a uoa = PatchProxy.apply(objArray, this, micSeatActio, "1");
       if (uoa == PatchProxyResult.class) {
          uoa = this.j.getValue();
       }
       uoa.u0().observe(this, new MicSeatActionBridgeController$a(this));
       return;
    }
}
