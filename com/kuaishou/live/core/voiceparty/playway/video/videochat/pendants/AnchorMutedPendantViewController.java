package com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.AnchorMutedPendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import brd.t;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.AnchorMutedPendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.AnchorMutedPendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.AnchorMutedPendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserMutedPendantViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.AnchorMutedPendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LifecycleOwner;
import xh3.l;

public final class AnchorMutedPendantViewController extends ViewController	// class@0018e7
{
    public final p j;

    public void AnchorMutedPendantViewController(f p0,t p1,LiveData p2){
       a.p(p0, "micSeatStateService");
       a.p(p1, "userMutedInfoObservable");
       a.p(p2, "micSeatId");
       super();
       this.j = new ViewModelLazy(m0.d(UserMutedPendantViewModel.class), new AnchorMutedPendantViewController$viewModelDelegate$$inlined$viewModels$2(new AnchorMutedPendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new AnchorMutedPendantViewController$$special$$inlined$viewModelDelegate$1(new AnchorMutedPendantViewController$viewModel$2(p0, p1, p2)));
    }
    public void F2(){
       AnchorMutedPendantViewController uAnchorMuted = AnchorMutedPendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAnchorMuted, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d16f8);
       if (!PatchProxy.applyVoid(objArray, this, uAnchorMuted, "3")) {
          View view = this.A2(R.id.muted_view);
          UserMutedPendantViewModel userMutedPen = PatchProxy.apply(objArray, this, uAnchorMuted, "1");
          if (userMutedPen == PatchProxyResult.class) {
             userMutedPen = this.j.getValue();
          }
          l.d(view, this, userMutedPen.x0(), true);
       }
       return;
    }
}
