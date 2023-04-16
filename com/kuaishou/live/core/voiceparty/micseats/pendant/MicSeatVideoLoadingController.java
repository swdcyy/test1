package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoLoadingController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import brd.t;
import java.util.Set;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoLoadingController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoLoadingController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoLoadingController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoLoadingViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoLoadingController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoLoadingController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoLoadingController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;

public final class MicSeatVideoLoadingController extends ViewController	// class@001718
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final t n;

    public void MicSeatVideoLoadingController(f p0,a p1,h p2,t p3,Set p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "windowRenderStatus");
       a.p(p4, "needLoadingMicSeatIds");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.j = new ViewModelLazy(m0.d(VideoLoadingViewModel.class), new MicSeatVideoLoadingController$viewModelDelegate$$inlined$viewModels$2(new MicSeatVideoLoadingController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatVideoLoadingController$$special$$inlined$viewModelDelegate$1(new MicSeatVideoLoadingController$viewModel$2(this, p4)));
    }
    public void F2(){
       MicSeatVideoLoadingController micSeatVideo = MicSeatVideoLoadingController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatVideo, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.VideoLoading, MicSeatVideoLoadingController$onCreate$1.INSTANCE);
       VideoLoadingViewModel videoLoading = PatchProxy.apply(objArray, this, micSeatVideo, "1");
       if (videoLoading == PatchProxyResult.class) {
          videoLoading = this.j.getValue();
       }
       videoLoading.a.observe(this, new MicSeatVideoLoadingController$a(this));
       return;
    }
}
