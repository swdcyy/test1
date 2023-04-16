package com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorMutedController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import brd.t;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorMutedController$viewModel$2;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorMutedController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorMutedController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import lv2.a;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorMutedController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorMutedController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorMutedController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class MicSeatAnchorMutedController extends ViewController	// class@0018ef
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final t n;

    public void MicSeatAnchorMutedController(f p0,a p1,h p2,t p3,String p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantSeatStateService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "userMutedInfoObservable");
       a.p(p4, "anchorId");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.j = new ViewModelLazy(m0.d(a.class), new MicSeatAnchorMutedController$viewModelDelegate$$inlined$viewModels$2(new MicSeatAnchorMutedController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatAnchorMutedController$$special$$inlined$viewModelDelegate$1(new MicSeatAnchorMutedController$viewModel$2(this, p4)));
    }
    public void F2(){
       MicSeatAnchorMutedController micSeatAncho = MicSeatAnchorMutedController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatAncho, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.AnchorMuted, new MicSeatAnchorMutedController$onCreate$1(this));
       a uoa = PatchProxy.apply(objArray, this, micSeatAncho, "1");
       if (uoa == PatchProxyResult.class) {
          uoa = this.j.getValue();
       }
       uoa.u0().observe(this, new MicSeatAnchorMutedController$a(this));
       return;
    }
}
