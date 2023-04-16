package com.kuaishou.live.core.voiceparty.micseats.pendant.PKFireAnimationPendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import tu2.f;
import brd.t;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.PKFireAnimationPendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.PKFireAnimationPendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.PKFireAnimationPendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.PKFireAnimationPendantViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.PKFireAnimationPendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import com.kuaishou.live.core.voiceparty.micseats.pendant.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class PKFireAnimationPendantViewController extends ViewController	// class@001737
{
    public final p j;

    public void PKFireAnimationPendantViewController(f p0,f p1,t p2,LiveData p3){
       a.p(p0, "micSeatStateService");
       a.p(p1, "pkAnimationDispatchService");
       a.p(p2, "teamInfo");
       a.p(p3, "micSeatId");
       super();
       this.j = new ViewModelLazy(m0.d(PKFireAnimationPendantViewModel.class), new PKFireAnimationPendantViewController$viewModelDelegate$$inlined$viewModels$2(new PKFireAnimationPendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new PKFireAnimationPendantViewController$$special$$inlined$viewModelDelegate$1(new PKFireAnimationPendantViewController$viewModel$2(p0, p1, p2, p3)));
    }
    public void F2(){
       PKFireAnimationPendantViewController pKFireAnimat = PKFireAnimationPendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, pKFireAnimat, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d16c7);
       if (!PatchProxy.applyVoid(objArray, this, pKFireAnimat, "3")) {
          KwaiImageView kwaiImageVie = this.A2(R.id.fire_anim_view);
          PKFireAnimationPendantViewModel pKFireAnimat1 = PatchProxy.apply(objArray, this, pKFireAnimat, "1");
          if (pKFireAnimat1 == PatchProxyResult.class) {
             pKFireAnimat1 = this.j.getValue();
          }
          pKFireAnimat1.x0().observe(this, new b(kwaiImageVie));
       }
       return;
    }
}
