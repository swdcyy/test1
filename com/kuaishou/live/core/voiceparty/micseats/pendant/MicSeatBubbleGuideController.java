package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import bt2.e;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;

public final class MicSeatBubbleGuideController extends ViewController	// class@00165f
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final MicSeatStyle n;
    public final e o;
    public final p p;
    public final boolean q;

    public void MicSeatBubbleGuideController(f p0,a p1,h p2,MicSeatStyle p3,e p4,p p5,boolean p6){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       a.p(p4, "micSeatsGuideManager");
       a.p(p5, "followAction");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.q = p6;
       this.j = new ViewModelLazy(m0.d(MicSeatBubbleGuideModel.class), new MicSeatBubbleGuideController$viewModelDelegate$$inlined$viewModels$2(new MicSeatBubbleGuideController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatBubbleGuideController$$special$$inlined$viewModelDelegate$1(new MicSeatBubbleGuideController$viewModel$2(this)));
    }
    public void F2(){
       MicSeatBubbleGuideController micSeatBubbl = MicSeatBubbleGuideController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatBubbl, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.BubbleGuide, new MicSeatBubbleGuideController$onCreate$1(this));
       MicSeatBubbleGuideModel micSeatBubbl1 = PatchProxy.apply(objArray, this, micSeatBubbl, "1");
       if (micSeatBubbl1 == PatchProxyResult.class) {
          micSeatBubbl1 = this.j.getValue();
       }
       micSeatBubbl1.c.observe(this, new MicSeatBubbleGuideController$a(this));
       return;
    }
}
