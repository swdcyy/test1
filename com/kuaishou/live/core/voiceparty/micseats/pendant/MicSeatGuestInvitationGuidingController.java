package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGuestInvitationGuidingController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import ry1.b;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import it2.z;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGuestInvitationGuidingController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGuestInvitationGuidingController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGuestInvitationGuidingController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import it2.b0;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGuestInvitationGuidingController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGuestInvitationGuidingController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGuestInvitationGuidingController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import crd.b;
import lnc.b9;

public final class MicSeatGuestInvitationGuidingController extends ViewController	// class@001696
{
    public final z j;
    public final p k;
    public final a l;
    public final h m;
    public final MicSeatStyle n;

    public void MicSeatGuestInvitationGuidingController(f p0,a p1,h p2,MicSeatStyle p3,b p4,t p5){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       a.p(p5, "shareObservable");
       super();
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.j = new z(p0, p4, p5);
       this.k = new ViewModelLazy(m0.d(b0.class), new MicSeatGuestInvitationGuidingController$viewModelDelegate$$inlined$viewModels$2(new MicSeatGuestInvitationGuidingController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatGuestInvitationGuidingController$$special$$inlined$viewModelDelegate$1(new MicSeatGuestInvitationGuidingController$viewModel$2(this)));
    }
    public void F2(){
       MicSeatGuestInvitationGuidingController micSeatGuest = MicSeatGuestInvitationGuidingController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatGuest, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.GuestInvitationGuiding, new MicSeatGuestInvitationGuidingController$onCreate$1(this));
       b0 uob0 = PatchProxy.apply(objArray, this, micSeatGuest, "1");
       if (uob0 == PatchProxyResult.class) {
          uob0 = this.k.getValue();
       }
       uob0.a.observe(this, new MicSeatGuestInvitationGuidingController$a(this));
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MicSeatGuestInvitationGuidingController.class, "3")) {
          return;
       }
       MicSeatGuestInvitationGuidingController tj = this.j;
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoid(objArray, tj, z.class, "1")) {
          b9.a(tj.a);
       }
       return;
    }
}
