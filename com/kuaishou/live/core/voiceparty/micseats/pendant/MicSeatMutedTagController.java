package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatMutedTagController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatMutedTagController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatMutedTagController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatMutedTagController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import jt2.d;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatMutedTagController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatMutedTagController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatMutedTagController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class MicSeatMutedTagController extends ViewController	// class@0016cb
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final MicSeatStyle n;

    public void MicSeatMutedTagController(f p0,a p1,h p2,MicSeatStyle p3){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.j = new ViewModelLazy(m0.d(d.class), new MicSeatMutedTagController$viewModelDelegate$$inlined$viewModels$2(new MicSeatMutedTagController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatMutedTagController$$special$$inlined$viewModelDelegate$1(new MicSeatMutedTagController$viewModel$2(this)));
    }
    public void F2(){
       MicSeatMutedTagController micSeatMuted = MicSeatMutedTagController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatMuted, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.MutedTag, new MicSeatMutedTagController$onCreate$1(this));
       d uod = PatchProxy.apply(objArray, this, micSeatMuted, "1");
       if (uod == PatchProxyResult.class) {
          uod = this.j.getValue();
       }
       uod.u0().observe(this, new MicSeatMutedTagController$a(this));
       return;
    }
}
