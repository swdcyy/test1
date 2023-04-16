package com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarPendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarPendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarPendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarPendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import it2.j;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarPendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import msd.l;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LifecycleOwner;
import msd.p;
import com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt;

public final class AvatarPendantViewController extends ViewController	// class@0015d6
{
    public final p j;
    public final MicSeatStyle k;

    public void AvatarPendantViewController(f p0,String p1,MicSeatStyle p2,LiveData p3){
       a.p(p0, "micSeatStateService");
       a.p(p1, "anchorId");
       a.p(p2, "style");
       a.p(p3, "micSeatId");
       super();
       this.k = p2;
       this.j = new ViewModelLazy(m0.d(j.class), new AvatarPendantViewController$viewModelDelegate$$inlined$viewModels$2(new AvatarPendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new AvatarPendantViewController$$special$$inlined$viewModelDelegate$1(new AvatarPendantViewController$viewModel$2(p0, p1, p3)));
    }
    public void F2(){
       AvatarPendantViewController uAvatarPenda = AvatarPendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAvatarPenda, "2")) {
          return;
       }
       this.S2(StyleKt.c(R.layout.arg_RES_7f0d16ce, StyleKt.b(this.k)));
       if (!PatchProxy.applyVoid(objArray, this, uAvatarPenda, "3")) {
          View view = this.A2(0x7f0a037c);
          j oj = PatchProxy.apply(objArray, this, uAvatarPenda, "1");
          if (oj == PatchProxyResult.class) {
             oj = this.j.getValue();
          }
          KwaiImageViewBinderKt.a(view, this, oj.g, null, 4, null);
       }
       return;
    }
}
