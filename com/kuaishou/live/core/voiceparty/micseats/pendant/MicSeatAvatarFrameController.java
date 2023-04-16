package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAvatarFrameController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import brd.t;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAvatarFrameController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAvatarFrameController$$special$$inlined$viewModelDelegate$1;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAvatarFrameController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAvatarFrameModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAvatarFrameController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAvatarFrameController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAvatarFrameController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;

public final class MicSeatAvatarFrameController extends ViewController	// class@00164c
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final MicSeatStyle n;
    public final t o;
    public final a p;
    public final boolean q;

    public void MicSeatAvatarFrameController(f p0,a p1,h p2,MicSeatStyle p3,t p4,a p5,boolean p6){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       a.p(p4, "avatarFrameInfoObservable");
       a.p(p5, "isNormalRoom");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.q = p6;
       this.j = new ViewModelLazy(m0.d(MicSeatAvatarFrameModel.class), new MicSeatAvatarFrameController$viewModelDelegate$$inlined$viewModels$2(new MicSeatAvatarFrameController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatAvatarFrameController$$special$$inlined$viewModelDelegate$1(new MicSeatAvatarFrameController$viewModel$2(this)));
    }
    public void F2(){
       MicSeatAvatarFrameController micSeatAvata = MicSeatAvatarFrameController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatAvata, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.AvatarFrame, new MicSeatAvatarFrameController$onCreate$1(this));
       MicSeatAvatarFrameModel micSeatAvata1 = PatchProxy.apply(objArray, this, micSeatAvata, "1");
       if (micSeatAvata1 == PatchProxyResult.class) {
          micSeatAvata1 = this.j.getValue();
       }
       micSeatAvata1.b.observe(this, new MicSeatAvatarFrameController$a(this));
       return;
    }
}
