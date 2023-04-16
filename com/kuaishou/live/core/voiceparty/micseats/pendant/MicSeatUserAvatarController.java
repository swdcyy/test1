package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserAvatarController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserAvatarController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserAvatarController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserAvatarController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import jt2.b;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserAvatarController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserAvatarController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserAvatarController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class MicSeatUserAvatarController extends ViewController	// class@0016ee
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final MicSeatStyle n;
    public final String o;

    public void MicSeatUserAvatarController(f p0,a p1,h p2,MicSeatStyle p3,String p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       a.p(p4, "anchorId");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.j = new ViewModelLazy(m0.d(b.class), new MicSeatUserAvatarController$viewModelDelegate$$inlined$viewModels$2(new MicSeatUserAvatarController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatUserAvatarController$$special$$inlined$viewModelDelegate$1(new MicSeatUserAvatarController$viewModel$2(this)));
    }
    public void F2(){
       MicSeatUserAvatarController micSeatUserA = MicSeatUserAvatarController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatUserA, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.UserAvatar, new MicSeatUserAvatarController$onCreate$1(this));
       b uob = PatchProxy.apply(objArray, this, micSeatUserA, "1");
       if (uob == PatchProxyResult.class) {
          uob = this.j.getValue();
       }
       uob.u0().observe(this, new MicSeatUserAvatarController$a(this));
       return;
    }
}
