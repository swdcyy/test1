package com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsPendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsLogic;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsPendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsPendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsPendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import it2.x0;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsPendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsPendantViewController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class OpenVideoTipsPendantViewController extends ViewController	// class@001731
{
    public final p j;
    public a k;
    public final OpenVideoTipsLogic l;
    public final MicSeatStyle m;

    public void OpenVideoTipsPendantViewController(OpenVideoTipsLogic p0,MicSeatStyle p1,LiveData p2){
       a.p(p0, "logic");
       a.p(p1, "style");
       a.p(p2, "micSeatId");
       super();
       this.l = p0;
       this.m = p1;
       this.j = new ViewModelLazy(m0.d(x0.class), new OpenVideoTipsPendantViewController$viewModelDelegate$$inlined$viewModels$2(new OpenVideoTipsPendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new OpenVideoTipsPendantViewController$$special$$inlined$viewModelDelegate$1(new OpenVideoTipsPendantViewController$viewModel$2(this, p2)));
    }
    public void F2(){
       OpenVideoTipsPendantViewController openVideoTip = OpenVideoTipsPendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, openVideoTip, "2")) {
          return;
       }
       this.S2(StyleKt.c(R.layout.arg_RES_7f0d16be, StyleKt.b(this.m)));
       x0 ox0 = PatchProxy.apply(objArray, this, openVideoTip, "1");
       if (ox0 == PatchProxyResult.class) {
          ox0 = this.j.getValue();
       }
       ox0.a.observe(this, new OpenVideoTipsPendantViewController$a(this));
       return;
    }
}
