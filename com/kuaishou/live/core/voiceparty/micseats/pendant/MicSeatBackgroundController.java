package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBackgroundController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBackgroundController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBackgroundController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBackgroundController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import jt2.a;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBackgroundController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBackgroundController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBackgroundController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class MicSeatBackgroundController extends ViewController	// class@001657
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final MicSeatStyle n;
    public final String o;

    public void MicSeatBackgroundController(f p0,a p1,h p2,MicSeatStyle p3,String p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "viewManager");
       a.p(p3, "style");
       a.p(p4, "anchorId");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.j = new ViewModelLazy(m0.d(a.class), new MicSeatBackgroundController$viewModelDelegate$$inlined$viewModels$2(new MicSeatBackgroundController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatBackgroundController$$special$$inlined$viewModelDelegate$1(new MicSeatBackgroundController$viewModel$2(this)));
    }
    public void F2(){
       MicSeatBackgroundController micSeatBackg = MicSeatBackgroundController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatBackg, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.Background, new MicSeatBackgroundController$onCreate$1(this));
       a uoa = PatchProxy.apply(objArray, this, micSeatBackg, "1");
       if (uoa == PatchProxyResult.class) {
          uoa = this.j.getValue();
       }
       uoa.u0().observe(this, new MicSeatBackgroundController$a(this));
       return;
    }
}
