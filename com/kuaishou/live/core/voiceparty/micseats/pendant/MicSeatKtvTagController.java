package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKtvTagController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import brd.t;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKtvTagController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKtvTagController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKtvTagController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKtvTagModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKtvTagController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKtvTagController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKtvTagController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;

public final class MicSeatKtvTagController extends ViewController	// class@0016b1
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final t n;
    public final String o;

    public void MicSeatKtvTagController(f p0,a p1,h p2,t p3,String p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "singerCandidates");
       a.p(p4, "anchorId");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.j = new ViewModelLazy(m0.d(MicSeatKtvTagModel.class), new MicSeatKtvTagController$viewModelDelegate$$inlined$viewModels$2(new MicSeatKtvTagController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatKtvTagController$$special$$inlined$viewModelDelegate$1(new MicSeatKtvTagController$viewModel$2(this)));
    }
    public void F2(){
       MicSeatKtvTagController micSeatKtvTa = MicSeatKtvTagController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatKtvTa, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.KTVTag, new MicSeatKtvTagController$onCreate$1(this));
       MicSeatKtvTagModel micSeatKtvTa1 = PatchProxy.apply(objArray, this, micSeatKtvTa, "1");
       if (micSeatKtvTa1 == PatchProxyResult.class) {
          micSeatKtvTa1 = this.j.getValue();
       }
       micSeatKtvTa1.a.observe(this, new MicSeatKtvTagController$a(this));
       return;
    }
}
