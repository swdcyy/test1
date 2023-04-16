package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoUserStateController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import brd.t;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoUserStateController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoUserStateController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoUserStateController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import jt2.b;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoUserStateController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoUserStateController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoUserStateController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class MicSeatVideoUserStateController extends ViewController	// class@001722
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final MicSeatStyle n;
    public final t o;
    public final p p;

    public void MicSeatVideoUserStateController(f p0,a p1,h p2,MicSeatStyle p3,t p4,p p5){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "viewManager");
       a.p(p3, "style");
       a.p(p4, "userMutedInfoObservable");
       a.p(p5, "followAction");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.j = new ViewModelLazy(m0.d(b.class), new MicSeatVideoUserStateController$viewModelDelegate$$inlined$viewModels$2(new MicSeatVideoUserStateController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatVideoUserStateController$$special$$inlined$viewModelDelegate$1(new MicSeatVideoUserStateController$viewModel$2(this)));
    }
    public void F2(){
       MicSeatVideoUserStateController micSeatVideo = MicSeatVideoUserStateController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatVideo, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.VideoUserState, new MicSeatVideoUserStateController$onCreate$1(this));
       b uob = PatchProxy.apply(objArray, this, micSeatVideo, "1");
       if (uob == PatchProxyResult.class) {
          uob = this.j.getValue();
       }
       uob.u0().observe(this, new MicSeatVideoUserStateController$a(this));
       return;
    }
}
