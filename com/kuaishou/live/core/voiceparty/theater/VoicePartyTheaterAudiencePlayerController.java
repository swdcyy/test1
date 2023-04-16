package com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudiencePlayerController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudiencePlayerController$a;
import nsd.u;
import hf3.a;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudiencePlayerController$tipViewModel$2;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudiencePlayerController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import dw2.j;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudiencePlayerController$$special$$inlined$viewModels$2;
import msd.a;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudiencePlayerController$b;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import com.yxcorp.gifshow.util.rx.RxBus;
import rw2.c;
import brd.t;
import brd.x;
import com.kuaishou.live.core.voiceparty.theater.util.AutoDisposeKt;
import dw2.n;
import sfc.a;
import erd.g;
import crd.b;
import op2.j;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import dw2.m;
import java.lang.Enum;
import dw2.f;
import qrd.l1;
import dw2.h;

public final class VoicePartyTheaterAudiencePlayerController extends ViewController	// class@00195d
{
    public ViewController j;
    public final p k;
    public final VoicePartyTheaterAudiencePlayerController$b l;
    public final a m;
    public final AudienceTheaterManager n;
    public static final VoicePartyTheaterAudiencePlayerController$a o;

    static {
       VoicePartyTheaterAudiencePlayerController.o = new VoicePartyTheaterAudiencePlayerController$a(null);
    }
    public void VoicePartyTheaterAudiencePlayerController(a p0,AudienceTheaterManager p1){
       a.p(p0, "liveLongConnection");
       a.p(p1, "theaterManager");
       super();
       this.m = p0;
       this.n = p1;
       this.k = new ViewModelLazy(m0.d(j.class), new VoicePartyTheaterAudiencePlayerController$$special$$inlined$viewModels$2(new VoicePartyTheaterAudiencePlayerController$$special$$inlined$viewModels$1(this)), new VoicePartyTheaterAudiencePlayerController$tipViewModel$2(this));
       this.l = new VoicePartyTheaterAudiencePlayerController$b(this);
    }
    public void F2(){
       VoicePartyTheaterAudiencePlayerController voicePartyTh = VoicePartyTheaterAudiencePlayerController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, voicePartyTh, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0e37);
       LiveVoicePartyLogTag tHEATER = LiveVoicePartyLogTag.THEATER;
       b.Z(tHEATER, "VoicePartyTheaterAudiencePlayerController onCreate");
       this.W2(TheaterDisplayMode.HALF_SCREEN);
       if (!PatchProxy.applyVoid(objArray, this, voicePartyTh, "5")) {
          RxBus.f.f(c.class).compose(AutoDisposeKt.a(this)).subscribe(new n(this), new a());
       }
       this.n.a(this.l);
       b.Z(tHEATER, "VoicePartyTheaterAudiencePlayerController onCreate end");
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterAudiencePlayerController.class, "3")) {
          return;
       }
       this.n.o(this.l);
       return;
    }
    public final j V2(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterAudiencePlayerController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final void W2(TheaterDisplayMode p0){
       f uof;
       l1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterAudiencePlayerController.class, "4")) {
          return;
       }
       VoicePartyTheaterAudiencePlayerController tj = this.j;
       if (tj != null) {
          this.O2(tj);
       }
       if (m.a[p0.ordinal()] != 1) {
          uof = new f(this.V2());
          this.x2(R.id.full_tip_container, uof);
          a = l1.a;
       }else {
          uof = new h(this.V2());
          this.x2(R.id.half_tip_container, uof);
          a = l1.a;
       }
       this.j = uof;
       return;
    }
}
