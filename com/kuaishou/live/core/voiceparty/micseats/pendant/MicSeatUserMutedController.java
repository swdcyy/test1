package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserMutedController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserMutedController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserMutedController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserMutedController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserMutedModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserMutedController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserMutedController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserMutedController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;

public final class MicSeatUserMutedController extends ViewController	// class@0016f6
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final MicSeatStyle n;

    public void MicSeatUserMutedController(f p0,a p1,h p2,MicSeatStyle p3,t p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       a.p(p4, "userMutedInfoObservable");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.j = new ViewModelLazy(m0.d(MicSeatUserMutedModel.class), new MicSeatUserMutedController$viewModelDelegate$$inlined$viewModels$2(new MicSeatUserMutedController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatUserMutedController$$special$$inlined$viewModelDelegate$1(new MicSeatUserMutedController$viewModel$2(this, p4)));
    }
    public void F2(){
       MicSeatUserMutedController micSeatUserM = MicSeatUserMutedController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatUserM, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.UserMuted, new MicSeatUserMutedController$onCreate$1(this));
       MicSeatUserMutedModel micSeatUserM1 = PatchProxy.apply(objArray, this, micSeatUserM, "1");
       if (micSeatUserM1 == PatchProxyResult.class) {
          micSeatUserM1 = this.j.getValue();
       }
       micSeatUserM1.a.observe(this, new MicSeatUserMutedController$a(this));
       return;
    }
}
