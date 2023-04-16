package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatEmojiController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import zu2.e;
import tu2.c;
import co2.f2;
import qu2.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatEmojiController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatEmojiController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatEmojiController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import jt2.b;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatEmojiController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatEmojiController$onCreate$1;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatEmojiController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class MicSeatEmojiController extends ViewController	// class@00167e
{
    public final p j;
    public final f k;
    public final a l;
    public final h m;
    public final MicSeatStyle n;
    public final e o;
    public final c p;
    public final f2 q;
    public final a r;

    public void MicSeatEmojiController(f p0,a p1,h p2,MicSeatStyle p3,e p4,c p5,f2 p6,a p7){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       a.p(p4, "senderViewFinder");
       a.p(p5, "emojiDispatchService");
       a.p(p6, "voicePartyContext");
       a.p(p7, "liveContextWrapper");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.q = p6;
       this.r = p7;
       this.j = new ViewModelLazy(m0.d(b.class), new MicSeatEmojiController$viewModelDelegate$$inlined$viewModels$2(new MicSeatEmojiController$viewModelDelegate$$inlined$viewModels$1(this)), new MicSeatEmojiController$$special$$inlined$viewModelDelegate$1(new MicSeatEmojiController$viewModel$2(this)));
    }
    public void F2(){
       MicSeatEmojiController micSeatEmoji = MicSeatEmojiController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, micSeatEmoji, "2")) {
          return;
       }
       this.m.a(MicSeatPendantId.Emoji, new MicSeatEmojiController$onCreate$1(this));
       b uob = PatchProxy.apply(objArray, this, micSeatEmoji, "1");
       if (uob == PatchProxyResult.class) {
          uob = this.j.getValue();
       }
       uob.u0().observe(this, new MicSeatEmojiController$a(this));
       return;
    }
}
