package com.kuaishou.live.core.voiceparty.micseats.pendant.StateNamePendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StateNamePendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StateNamePendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StateNamePendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import it2.e1;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StateNamePendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import msd.l;
import android.view.View;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import xh3.g;
import xh3.i;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class StateNamePendantViewController extends ViewController	// class@001747
{
    public final p j;
    public final MicSeatStyle k;

    public void StateNamePendantViewController(f p0,boolean p1,MicSeatStyle p2,LiveData p3){
       a.p(p0, "micSeatStateService");
       a.p(p2, "style");
       a.p(p3, "micSeatId");
       super();
       this.k = p2;
       this.j = new ViewModelLazy(m0.d(e1.class), new StateNamePendantViewController$viewModelDelegate$$inlined$viewModels$2(new StateNamePendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new StateNamePendantViewController$$special$$inlined$viewModelDelegate$1(new StateNamePendantViewController$viewModel$2(this, p0, p1, p3)));
    }
    public void F2(){
       StateNamePendantViewController stateNamePen = StateNamePendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, stateNamePen, "2")) {
          return;
       }
       this.S2(StyleKt.c(R.layout.arg_RES_7f0d16c9, StyleKt.a(this.k)));
       if (!PatchProxy.applyVoid(objArray, this, stateNamePen, "3")) {
          TextView textView = this.A2(R.id.title_view);
          e1 uoe1 = PatchProxy.apply(objArray, this, stateNamePen, "1");
          if (uoe1 == PatchProxyResult.class) {
             uoe1 = this.j.getValue();
          }
          uoe1 = uoe1.g;
          if (!PatchProxy.applyVoidThreeRefs(textView, this, uoe1, null, g.class, "3")) {
             a.p(textView, "$this$bindTextRes");
             a.p(this, "lifecycleOwner");
             a.p(uoe1, "liveData");
             uoe1.observe(this, new i(textView));
          }
       }
       return;
    }
}
