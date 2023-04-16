package com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNamePendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import brd.t;
import com.kuaishou.live.core.voiceparty.playway.shared.micseat.viewmodel.Gender;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNamePendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNamePendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNamePendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNameViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNamePendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import it2.p;
import java.lang.Enum;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import xh3.g;
import com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNamePendantViewController$binding$1;
import xh3.l;

public final class DecorationNamePendantViewController extends ViewController	// class@0015ec
{
    public final p j;
    public final Gender k;
    public final MicSeatStyle l;

    public void DecorationNamePendantViewController(t p0,Gender p1,MicSeatStyle p2,LiveData p3){
       a.p(p0, "decorationInfoObservable");
       a.p(p1, "anchorGender");
       a.p(p2, "style");
       a.p(p3, "micSeatId");
       super();
       this.k = p1;
       this.l = p2;
       this.j = new ViewModelLazy(m0.d(DecorationNameViewModel.class), new DecorationNamePendantViewController$viewModelDelegate$$inlined$viewModels$2(new DecorationNamePendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new DecorationNamePendantViewController$$special$$inlined$viewModelDelegate$1(new DecorationNamePendantViewController$viewModel$2(p0, p3)));
    }
    public void F2(){
       DecorationNamePendantViewController uDecorationN = DecorationNamePendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uDecorationN, "2")) {
          return;
       }
       int i = (p.a[this.l.ordinal()] != 1)? 0x7f0d16c2: 0x7f0d16ab;
       this.S2(StyleKt.c(i, StyleKt.b(this.l)));
       DecorationNameViewModel uDecorationN1 = PatchProxy.apply(objArray, this, uDecorationN, "1");
       if (uDecorationN1 == PatchProxyResult.class) {
          uDecorationN1 = this.j.getValue();
       }
       if (!PatchProxy.applyVoidOneRefs(uDecorationN1, this, uDecorationN, "3")) {
          TextView textView = this.A2(R.id.live_voice_party_mic_seat_decoration_name);
          g.a(textView, this, uDecorationN1.b);
          l.a(textView, this, uDecorationN1.c, new DecorationNamePendantViewController$binding$1(this));
       }
       return;
    }
}
