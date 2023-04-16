package com.kuaishou.live.core.voiceparty.micseats.pendant.AboardAnimationViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import it2.a;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AboardAnimationViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AboardAnimationViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AboardAnimationViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import it2.c;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AboardAnimationViewController$viewModelDelegate$$inlined$viewModels$2;
import px2.a;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import it2.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class AboardAnimationViewController extends ViewController	// class@0015c2
{
    public final p j;
    public a k;
    public final MicSeatStyle l;

    public void AboardAnimationViewController(a p0,MicSeatStyle p1,LiveData p2){
       a.p(p0, "logic");
       a.p(p1, "style");
       a.p(p2, "micSeatId");
       super();
       this.l = p1;
       this.j = new ViewModelLazy(m0.d(c.class), new AboardAnimationViewController$viewModelDelegate$$inlined$viewModels$2(new AboardAnimationViewController$viewModelDelegate$$inlined$viewModels$1(this)), new AboardAnimationViewController$$special$$inlined$viewModelDelegate$1(new AboardAnimationViewController$viewModel$2(p0, p2)));
    }
    public static final a V2(AboardAnimationViewController p0){
       p0 = p0.k;
       if (p0 == null) {
          a.S("effectPlayer");
       }
       return p0;
    }
    public void F2(){
       AboardAnimationViewController uAboardAnima = AboardAnimationViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAboardAnima, "2")) {
          return;
       }
       this.S2(StyleKt.c(R.layout.arg_RES_7f0d16bc, StyleKt.b(this.l)));
       c uoc = PatchProxy.apply(objArray, this, uAboardAnima, "1");
       if (uoc == PatchProxyResult.class) {
          uoc = this.j.getValue();
       }
       if (!PatchProxy.applyVoidOneRefs(uoc, this, uAboardAnima, "4")) {
          this.k = new a(this.A2(0x7f0a0cc4));
          uoc.u0().observe(this, new b(this));
       }
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoid(null, this, AboardAnimationViewController.class, "3")) {
          return;
       }
       AboardAnimationViewController tk = this.k;
       if (tk == null) {
          a.S("effectPlayer");
       }
       tk.b();
       return;
    }
}
