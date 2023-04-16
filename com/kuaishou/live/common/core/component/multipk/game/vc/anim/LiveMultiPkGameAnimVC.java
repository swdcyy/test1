package com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameAnimVC;
import com.kuaishou.live.viewcontroller.ViewController;
import kt1.d;
import ht1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameAnimVC$gameAnimViewModel$2;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameAnimVC$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import kt1.h;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameAnimVC$$special$$inlined$viewModels$2;
import msd.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.a;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import kt1.g;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import android.widget.ImageView;
import pu1.k;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class LiveMultiPkGameAnimVC extends ViewController	// class@0015f3
{
    public final Object j;
    public final p k;
    public KwaiImageView l;
    public final d m;
    public final a n;

    public void LiveMultiPkGameAnimVC(d p0,a p1){
       a.p(p0, "animModel");
       a.p(p1, "skinManager");
       super();
       this.m = p0;
       this.n = p1;
       this.j = new Object();
       this.k = new ViewModelLazy(m0.d(h.class), new LiveMultiPkGameAnimVC$$special$$inlined$viewModels$2(new LiveMultiPkGameAnimVC$$special$$inlined$viewModels$1(this)), new LiveMultiPkGameAnimVC$gameAnimViewModel$2(this));
    }
    public static final KwaiImageView V2(LiveMultiPkGameAnimVC p0){
       p0 = p0.l;
       if (p0 == null) {
          a.S("normalAnimViewContainer");
       }
       return p0;
    }
    public void F2(){
       LiveMultiPkGameAnimVC liveMultiPkG = LiveMultiPkGameAnimVC.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMultiPkG, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0cc0);
       View view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       this.z2(new a(view, this.W2(), this.n));
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkG, "4")) {
          this.l = this.A2(0x7f0a21a2);
       }
       h oh = this.W2();
       if (!PatchProxy.applyVoidOneRefs(oh, this, liveMultiPkG, "5")) {
          oh.a.observe(this, new g(this, oh));
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkGameAnimVC.class, "3")) {
          return;
       }
       LiveMultiPkGameAnimVC tl = this.l;
       String str = "normalAnimViewContainer";
       if (tl == null) {
          a.S(str);
       }
       tl.setVisibility(8);
       k b = k.b;
       LiveMultiPkGameAnimVC tl1 = this.l;
       if (tl1 == null) {
          a.S(str);
       }
       b.g(tl1, this.j);
       return;
    }
    public final h W2(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkGameAnimVC.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
}
