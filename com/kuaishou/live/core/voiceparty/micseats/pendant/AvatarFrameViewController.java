package com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarFrameViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import brd.t;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import msd.a;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarFrameViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarFrameViewController$$special$$inlined$viewModelDelegate$1;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarFrameViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarFramePendantViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarFrameViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import msd.l;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import it2.i;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class AvatarFrameViewController extends ViewController	// class@0015d0
{
    public final p j;
    public final MicSeatStyle k;

    public void AvatarFrameViewController(f p0,t p1,MicSeatStyle p2,a p3,boolean p4,LiveData p5){
       a.p(p0, "micSeatStateService");
       a.p(p1, "avatarFrameInfoListObservable");
       a.p(p2, "style");
       a.p(p3, "isNormalRoom");
       a.p(p5, "micSeatId");
       super();
       this.k = p2;
       AvatarFrameViewController$viewModel$2 oviewModel$2 = new AvatarFrameViewController$viewModel$2(p0, p1, p3, p4, p5);
       AvatarFrameViewController$$special$$inlined$viewModelDelegate$1 $special$$in = new AvatarFrameViewController$$special$$inlined$viewModelDelegate$1(p2);
       this.j = new ViewModelLazy(m0.d(AvatarFramePendantViewModel.class), new AvatarFrameViewController$viewModelDelegate$$inlined$viewModels$2(new AvatarFrameViewController$viewModelDelegate$$inlined$viewModels$1(this)), $special$$in);
    }
    public void F2(){
       AvatarFrameViewController uAvatarFrame = AvatarFrameViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAvatarFrame, "2")) {
          return;
       }
       this.S2(StyleKt.c(R.layout.arg_RES_7f0d16bf, StyleKt.b(this.k)));
       if (!PatchProxy.applyVoid(objArray, this, uAvatarFrame, "3")) {
          KwaiImageView kwaiImageVie = this.A2(R.id.avatar_frame_view);
          AvatarFramePendantViewModel uAvatarFrame1 = PatchProxy.apply(objArray, this, uAvatarFrame, "1");
          if (uAvatarFrame1 == PatchProxyResult.class) {
             uAvatarFrame1 = this.j.getValue();
          }
          uAvatarFrame1.g.observe(this, new i(kwaiImageVie));
       }
       return;
    }
}
