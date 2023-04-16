package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAboardAnimationController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import it2.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAboardAnimationController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAboardAnimationController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAboardAnimationController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import jt2.a;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAboardAnimationController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAboardAnimationController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAboardAnimationController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.Objects;
import crd.b;

public final class MicSeatAboardAnimationController extends ViewController	// class@00162c
{
    public final a j;
    public final p k;
    public final f l;
    public final a m;
    public final h n;
    public final MicSeatStyle o;

    public void MicSeatAboardAnimationController(f p0,a p1,h p2,MicSeatStyle p3,t p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       a.p(p4, "aboardEffectInfoObservable");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.j = new a(p4);
       this.k = new ViewModelLazy(m0.d(a.class), new MicSeatAboardAnimationController$viewModelDelegate$$inlined$viewModels$2(new MicSeatAboardAnimationController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatAboardAnimationController$$special$$inlined$viewModelDelegate$1(new MicSeatAboardAnimationController$viewModel$2(this)));
    }
    public void F2(){
       MicSeatAboardAnimationController micSeatAboar = MicSeatAboardAnimationController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatAboar, "2")) {
          return;
       }
       this.n.a(MicSeatPendantId.AboardAnimation, new MicSeatAboardAnimationController$onCreate$1(this));
       a uoa = PatchProxy.apply(objArray, this, micSeatAboar, "1");
       if (uoa == PatchProxyResult.class) {
          uoa = this.k.getValue();
       }
       uoa.u0().observe(this, new MicSeatAboardAnimationController$a(this));
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MicSeatAboardAnimationController.class, "3")) {
          return;
       }
       MicSeatAboardAnimationController tj = this.j;
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoid(objArray, tj, a.class, "1")) {
          tj.b.dispose();
       }
       return;
    }
}
