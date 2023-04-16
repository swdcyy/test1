package com.kuaishou.live.core.voiceparty.micseats.pendant.LevelUpAnimationPendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import hf3.a;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.LevelUpAnimationPendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.LevelUpAnimationPendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.LevelUpAnimationPendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import it2.k0;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.LevelUpAnimationPendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import msd.l;
import px2.a;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import it2.j0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class LevelUpAnimationPendantViewController extends ViewController	// class@001624
{
    public final p j;
    public final MicSeatStyle k;

    public void LevelUpAnimationPendantViewController(f p0,a p1,MicSeatStyle p2,LiveData p3){
       a.p(p0, "micSeatStateService");
       a.p(p1, "liveLongConnection");
       a.p(p2, "style");
       a.p(p3, "micSeatId");
       super();
       this.k = p2;
       this.j = new ViewModelLazy(m0.d(k0.class), new LevelUpAnimationPendantViewController$viewModelDelegate$$inlined$viewModels$2(new LevelUpAnimationPendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new LevelUpAnimationPendantViewController$$special$$inlined$viewModelDelegate$1(new LevelUpAnimationPendantViewController$viewModel$2(p0, p1, p3)));
    }
    public void F2(){
       LevelUpAnimationPendantViewController levelUpAnima = LevelUpAnimationPendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, levelUpAnima, "2")) {
          return;
       }
       this.S2(StyleKt.c(R.layout.arg_RES_7f0d16bc, StyleKt.b(this.k)));
       if (!PatchProxy.applyVoid(objArray, this, levelUpAnima, "3")) {
          a uoa = new a(this.A2(0x7f0a0cc4));
          k0 ok0 = PatchProxy.apply(objArray, this, levelUpAnima, "1");
          if (ok0 == PatchProxyResult.class) {
             ok0 = this.j.getValue();
          }
          ok0.x0().observe(this, new j0(uoa));
       }
       return;
    }
}
