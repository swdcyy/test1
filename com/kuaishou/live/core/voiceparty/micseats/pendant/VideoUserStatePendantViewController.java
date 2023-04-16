package com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import brd.t;
import msd.p;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$followViewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserFollowPendantViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$mutedViewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$$special$$inlined$viewModelDelegate$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$viewModelDelegate$$inlined$viewModels$3;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserMutedPendantViewModel;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$viewModelDelegate$$inlined$viewModels$4;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$userNameViewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$$special$$inlined$viewModelDelegate$3;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$viewModelDelegate$$inlined$viewModels$5;
import it2.h1;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$viewModelDelegate$$inlined$viewModels$6;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import it2.k1;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import it2.l1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import it2.m1;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import qrd.p;
import xh3.l;
import android.widget.TextView;
import xh3.g;
import java.lang.Boolean;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$a;
import android.animation.Animator$AnimatorListener;

public final class VideoUserStatePendantViewController extends ViewController	// class@001770
{
    public final p j;
    public final p k;
    public final p l;
    public final f m;
    public final p n;
    public final LiveData o;

    public void VideoUserStatePendantViewController(f p0,t p1,p p2,LiveData p3){
       a.p(p0, "micSeatStateService");
       a.p(p1, "userMutedInfoObservable");
       a.p(p2, "followAction");
       a.p(p3, "micSeatId");
       super();
       this.m = p0;
       this.n = p2;
       this.o = p3;
       this.j = new ViewModelLazy(m0.d(UserFollowPendantViewModel.class), new VideoUserStatePendantViewController$viewModelDelegate$$inlined$viewModels$2(new VideoUserStatePendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new VideoUserStatePendantViewController$$special$$inlined$viewModelDelegate$1(new VideoUserStatePendantViewController$followViewModel$2(this)));
       this.k = new ViewModelLazy(m0.d(UserMutedPendantViewModel.class), new VideoUserStatePendantViewController$viewModelDelegate$$inlined$viewModels$4(new VideoUserStatePendantViewController$viewModelDelegate$$inlined$viewModels$3(this)), new VideoUserStatePendantViewController$$special$$inlined$viewModelDelegate$2(new VideoUserStatePendantViewController$mutedViewModel$2(this, p1)));
       this.l = new ViewModelLazy(m0.d(h1.class), new VideoUserStatePendantViewController$viewModelDelegate$$inlined$viewModels$6(new VideoUserStatePendantViewController$viewModelDelegate$$inlined$viewModels$5(this)), new VideoUserStatePendantViewController$$special$$inlined$viewModelDelegate$3(new VideoUserStatePendantViewController$userNameViewModel$2(this)));
    }
    public void F2(){
       VideoUserStatePendantViewController videoUserSta = VideoUserStatePendantViewController.class;
       if (PatchProxy.applyVoid(null, this, videoUserSta, "4")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d16ad);
       if (!PatchProxy.applyVoid(null, this, videoUserSta, "5")) {
          LiveLottieAnimationView liveLottieAn = this.A2(R.id.follow_user_button);
          liveLottieAn.setOnClickListener(new k1(this));
          this.V2().h.observe(this, new l1(this, liveLottieAn));
          this.V2().i.observe(this, new m1(this));
          View view = this.A2(R.id.mic_state_view_small);
          UserMutedPendantViewModel userMutedPen = PatchProxy.apply(null, this, videoUserSta, "2");
          if (userMutedPen == PatchProxyResult.class) {
             userMutedPen = this.k.getValue();
          }
          l.d(view, this, userMutedPen.x0(), true);
          TextView textView = this.A2(R.id.title_view);
          h1 oh1 = PatchProxy.apply(null, this, videoUserSta, "3");
          if (oh1 == PatchProxyResult.class) {
             oh1 = this.l.getValue();
          }
          g.a(textView, this, oh1.x0());
       }
       return;
    }
    public final UserFollowPendantViewModel V2(){
       Object obj = PatchProxy.apply(null, this, VideoUserStatePendantViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final void W2(LiveLottieAnimationView p0,boolean p1){
       VideoUserStatePendantViewController videoUserSta = VideoUserStatePendantViewController.class;
       if (PatchProxy.isSupport(videoUserSta) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, videoUserSta, "7")) {
          return;
       }
       if (p1) {
          p0.setRenderMode(RenderMode.HARDWARE);
          p0.t();
          p0.setProgress(0);
          p0.a(new VideoUserStatePendantViewController$a(this, p0));
          p0.setVisibility(0);
       }else {
          p0.t();
          p0.f();
          p0.setVisibility(8);
       }
       return;
    }
}
