package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGiftController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import qx1.a;
import java.lang.String;
import hf3.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGiftController$model$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGiftController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGiftController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import jt2.b;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGiftController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGiftController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGiftController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class MicSeatGiftController extends ViewController	// class@00168e
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final a n;
    public final String o;
    public final a p;

    public void MicSeatGiftController(f p0,a p1,h p2,a p3,String p4,a p5){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p4, "anchorUserId");
       a.p(p5, "liveLongConnection");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.j = new ViewModelLazy(m0.d(b.class), new MicSeatGiftController$viewModelDelegate$$inlined$viewModels$2(new MicSeatGiftController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatGiftController$$special$$inlined$viewModelDelegate$1(new MicSeatGiftController$model$2(this)));
    }
    public void F2(){
       MicSeatGiftController micSeatGiftC = MicSeatGiftController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatGiftC, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.Gift, new MicSeatGiftController$onCreate$1(this));
       b uob = PatchProxy.apply(objArray, this, micSeatGiftC, "1");
       if (uob == PatchProxyResult.class) {
          uob = this.j.getValue();
       }
       uob.u0().observe(this, new MicSeatGiftController$a(this));
       return;
    }
}
