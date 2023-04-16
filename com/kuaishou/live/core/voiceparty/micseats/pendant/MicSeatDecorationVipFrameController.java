package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;

public final class MicSeatDecorationVipFrameController extends ViewController	// class@001674
{
    public final p j;
    public final a k;
    public final h l;
    public final MicSeatStyle m;

    public void MicSeatDecorationVipFrameController(f p0,a p1,h p2,MicSeatStyle p3,t p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       a.p(p4, "decorationInfoObservable");
       super();
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.j = new ViewModelLazy(m0.d(MicSeatDecorationVipFrameModel.class), new MicSeatDecorationVipFrameController$viewModelDelegate$$inlined$viewModels$2(new MicSeatDecorationVipFrameController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatDecorationVipFrameController$$special$$inlined$viewModelDelegate$1(new MicSeatDecorationVipFrameController$viewModel$2(this, p0, p4)));
    }
    public void F2(){
       MicSeatDecorationVipFrameController micSeatDecor = MicSeatDecorationVipFrameController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatDecor, "2")) {
          return;
       }
       this.l.a(MicSeatPendantId.DecorationVipFrame, new MicSeatDecorationVipFrameController$onCreate$1(this));
       MicSeatDecorationVipFrameModel micSeatDecor1 = PatchProxy.apply(objArray, this, micSeatDecor, "1");
       if (micSeatDecor1 == PatchProxyResult.class) {
          micSeatDecor1 = this.j.getValue();
       }
       micSeatDecor1.a.observe(this, new MicSeatDecorationVipFrameController$a(this));
       return;
    }
}
