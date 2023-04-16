package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import brd.t;
import java.util.Set;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;

public final class MicSeatVideoController extends ViewController	// class@001710
{
    public final p j;
    public final a k;
    public final h l;
    public final t m;

    public void MicSeatVideoController(f p0,a p1,h p2,t p3,Set p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "viewManager");
       a.p(p3, "windowRenderStatus");
       a.p(p4, "forceOpenVideoUsers");
       super();
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.j = new ViewModelLazy(m0.d(MicSeatVideoModel.class), new MicSeatVideoController$viewModelDelegate$$inlined$viewModels$2(new MicSeatVideoController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatVideoController$$special$$inlined$viewModelDelegate$1(new MicSeatVideoController$viewModel$2(this, p0, p4)));
    }
    public void F2(){
       MicSeatVideoController micSeatVideo = MicSeatVideoController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatVideo, "2")) {
          return;
       }
       this.l.a(MicSeatPendantId.Video, MicSeatVideoController$onCreate$1.INSTANCE);
       MicSeatVideoModel micSeatVideo1 = PatchProxy.apply(objArray, this, micSeatVideo, "1");
       if (micSeatVideo1 == PatchProxyResult.class) {
          micSeatVideo1 = this.j.getValue();
       }
       micSeatVideo1.a.observe(this, new MicSeatVideoController$a(this));
       return;
    }
}
