package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserSpeakingController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserSpeakingController$model$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserSpeakingController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserSpeakingController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import jt2.b;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserSpeakingController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserSpeakingController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserSpeakingController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class MicSeatUserSpeakingController extends ViewController	// class@001708
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final MicSeatStyle n;
    public final t o;
    public final t p;

    public void MicSeatUserSpeakingController(f p0,a p1,h p2,MicSeatStyle p3,t p4,t p5){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       a.p(p4, "voiceWaveInfoObservable");
       a.p(p5, "speakingUsersObservable");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.j = new ViewModelLazy(m0.d(b.class), new MicSeatUserSpeakingController$viewModelDelegate$$inlined$viewModels$2(new MicSeatUserSpeakingController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatUserSpeakingController$$special$$inlined$viewModelDelegate$1(new MicSeatUserSpeakingController$model$2(this)));
    }
    public void F2(){
       MicSeatUserSpeakingController micSeatUserS = MicSeatUserSpeakingController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatUserS, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.UserSpeaking, new MicSeatUserSpeakingController$onCreate$1(this));
       b uob = PatchProxy.apply(objArray, this, micSeatUserS, "1");
       if (uob == PatchProxyResult.class) {
          uob = this.j.getValue();
       }
       uob.u0().observe(this, new MicSeatUserSpeakingController$a(this));
       return;
    }
}
