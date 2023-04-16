package com.kuaishou.live.common.core.component.multipk.game.vc.scorelimit.LiveMultiPkScoreLimitMvpNoticeViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkBottomTip;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.game.vc.scorelimit.LiveMultiPkScoreLimitMvpNoticeViewController$viewModel$2;
import com.kuaishou.live.common.core.component.multipk.game.vc.scorelimit.LiveMultiPkScoreLimitMvpNoticeViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import pt1.b;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multipk.game.vc.scorelimit.LiveMultiPkScoreLimitMvpNoticeViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.live.common.core.basic.widget.MarqueeTextView;
import ya1.j0;
import ya1.i0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import android.widget.TextView;
import xh3.g;
import pt1.a;
import xh3.l;
import com.airbnb.lottie.LottieAnimationView;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class LiveMultiPkScoreLimitMvpNoticeViewController extends ViewController	// class@001647
{
    public LiveLottieAnimationView j;
    public MarqueeTextView k;
    public final p l;

    public void LiveMultiPkScoreLimitMvpNoticeViewController(LiveMultiPkBottomTip p0){
       a.p(p0, "bottomTip");
       super();
       this.l = new ViewModelLazy(m0.d(b.class), new LiveMultiPkScoreLimitMvpNoticeViewController$$special$$inlined$viewModels$2(new LiveMultiPkScoreLimitMvpNoticeViewController$$special$$inlined$viewModels$1(this)), new LiveMultiPkScoreLimitMvpNoticeViewController$viewModel$2(p0));
    }
    public static final LiveLottieAnimationView V2(LiveMultiPkScoreLimitMvpNoticeViewController p0){
       p0 = p0.j;
       if (p0 == null) {
          a.S("lottieAnimationView");
       }
       return p0;
    }
    public void F2(){
       LiveMultiPkScoreLimitMvpNoticeViewController liveMultiPkS = LiveMultiPkScoreLimitMvpNoticeViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMultiPkS, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkS, "4")) {
          this.Q2(R.layout.arg_RES_7f0d0d03);
          this.j = this.A2(0x7f0a22a1);
          this.k = this.A2(0x7f0a22a2);
       }
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkS, "5")) {
          liveMultiPkS = this.k;
          String str = "descriptionMarqueeTextView";
          if (liveMultiPkS == null) {
             a.S(str);
          }
          b c = this.W2().c;
          if (!PatchProxy.applyVoidThreeRefs(liveMultiPkS, this, c, null, j0.class, "1")) {
             a.p(liveMultiPkS, "$this$bindMarqueeEnable");
             a.p(this, "lifecycleOwner");
             a.p(c, "liveData");
             c.observe(this, new i0(liveMultiPkS));
          }
          liveMultiPkS = this.k;
          if (liveMultiPkS == null) {
             a.S(str);
          }
          g.a(liveMultiPkS, this, this.W2().b);
          this.W2().d.observe(this, new a(this));
          l.e(this.P2(), this, this.W2().u0(), false, 4, null);
       }
       return;
    }
    public void J2(){
       LiveMultiPkScoreLimitMvpNoticeViewController liveMultiPkS = LiveMultiPkScoreLimitMvpNoticeViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMultiPkS, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkS, "6")) {
          liveMultiPkS = this.j;
          if (liveMultiPkS == null) {
             a.S("lottieAnimationView");
          }
          if (liveMultiPkS.p()) {
             liveMultiPkS = this.j;
             if (liveMultiPkS == null) {
                a.S("lottieAnimationView");
             }
             liveMultiPkS.f();
          }
       }
       return;
    }
    public final b W2(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkScoreLimitMvpNoticeViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
}
