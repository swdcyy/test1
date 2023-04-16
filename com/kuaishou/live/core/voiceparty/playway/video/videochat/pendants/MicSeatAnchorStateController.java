package com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorStateController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorStateController$viewModel$2;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorStateController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorStateController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import lv2.a;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorStateController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorStateController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorStateController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class MicSeatAnchorStateController extends ViewController	// class@0018f7
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;

    public void MicSeatAnchorStateController(f p0,a p1,h p2,String p3){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantSeatStateService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "anchorId");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.j = new ViewModelLazy(m0.d(a.class), new MicSeatAnchorStateController$viewModelDelegate$$inlined$viewModels$2(new MicSeatAnchorStateController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatAnchorStateController$$special$$inlined$viewModelDelegate$1(new MicSeatAnchorStateController$viewModel$2(this, p3)));
    }
    public void F2(){
       MicSeatAnchorStateController micSeatAncho = MicSeatAnchorStateController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatAncho, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.AnchorState, MicSeatAnchorStateController$onCreate$1.INSTANCE);
       a uoa = PatchProxy.apply(objArray, this, micSeatAncho, "1");
       if (uoa == PatchProxyResult.class) {
          uoa = this.j.getValue();
       }
       uoa.u0().observe(this, new MicSeatAnchorStateController$a(this));
       return;
    }
}
