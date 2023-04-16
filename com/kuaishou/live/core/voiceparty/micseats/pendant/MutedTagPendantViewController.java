package com.kuaishou.live.core.voiceparty.micseats.pendant.MutedTagPendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MutedTagPendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MutedTagPendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MutedTagPendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import jt2.c;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MutedTagPendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import msd.l;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LifecycleOwner;
import xh3.l;

public final class MutedTagPendantViewController extends ViewController	// class@001728
{
    public final p j;
    public final MicSeatStyle k;

    public void MutedTagPendantViewController(f p0,MicSeatStyle p1,LiveData p2){
       a.p(p0, "micSeatStateService");
       a.p(p1, "style");
       a.p(p2, "micSeatId");
       super();
       this.k = p1;
       this.j = new ViewModelLazy(m0.d(c.class), new MutedTagPendantViewController$viewModelDelegate$$inlined$viewModels$2(new MutedTagPendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new MutedTagPendantViewController$$special$$inlined$viewModelDelegate$1(new MutedTagPendantViewController$viewModel$2(p0, p2)));
    }
    public void F2(){
       MutedTagPendantViewController mutedTagPend = MutedTagPendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, mutedTagPend, "2")) {
          return;
       }
       this.S2(StyleKt.c(R.layout.arg_RES_7f0d16c6, StyleKt.a(this.k)));
       View view = this.P2();
       c uoc = PatchProxy.apply(objArray, this, mutedTagPend, "1");
       if (uoc == PatchProxyResult.class) {
          uoc = this.j.getValue();
       }
       l.e(view, this, uoc.u0(), false, 4, null);
       return;
    }
}
