package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationNameController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import brd.t;
import com.kuaishou.live.core.voiceparty.playway.shared.micseat.viewmodel.Gender;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationNameController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationNameController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationNameController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationNameModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationNameController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationNameController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationNameController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;

public final class MicSeatDecorationNameController extends ViewController	// class@00166a
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final MicSeatStyle n;
    public final t o;
    public final Gender p;

    public void MicSeatDecorationNameController(f p0,a p1,h p2,MicSeatStyle p3,t p4,Gender p5){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       a.p(p4, "decorationInfoObservable");
       a.p(p5, "anchorGender");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.j = new ViewModelLazy(m0.d(MicSeatDecorationNameModel.class), new MicSeatDecorationNameController$viewModelDelegate$$inlined$viewModels$2(new MicSeatDecorationNameController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatDecorationNameController$$special$$inlined$viewModelDelegate$1(new MicSeatDecorationNameController$viewModel$2(this)));
    }
    public void F2(){
       MicSeatDecorationNameController micSeatDecor = MicSeatDecorationNameController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatDecor, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.DecorationName, new MicSeatDecorationNameController$onCreate$1(this));
       MicSeatDecorationNameModel micSeatDecor1 = PatchProxy.apply(objArray, this, micSeatDecor, "1");
       if (micSeatDecor1 == PatchProxyResult.class) {
          micSeatDecor1 = this.j.getValue();
       }
       micSeatDecor1.a.observe(this, new MicSeatDecorationNameController$a(this));
       return;
    }
}
