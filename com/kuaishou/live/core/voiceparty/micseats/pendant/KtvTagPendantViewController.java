package com.kuaishou.live.core.voiceparty.micseats.pendant.KtvTagPendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import brd.t;
import java.lang.String;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KtvTagPendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KtvTagPendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KtvTagPendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KtvTagPendantViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KtvTagPendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.ImageView;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KtvTagPendantViewController$binding$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import it2.i0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class KtvTagPendantViewController extends ViewController	// class@00161b
{
    public final p j;

    public void KtvTagPendantViewController(f p0,t p1,String p2,LiveData p3){
       a.p(p0, "micSeatStateService");
       a.p(p1, "singerCandidates");
       a.p(p2, "anchorId");
       a.p(p3, "micSeatId");
       super();
       this.j = new ViewModelLazy(m0.d(KtvTagPendantViewModel.class), new KtvTagPendantViewController$viewModelDelegate$$inlined$viewModels$2(new KtvTagPendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new KtvTagPendantViewController$$special$$inlined$viewModelDelegate$1(new KtvTagPendantViewController$viewModel$2(p0, p1, p2, p3)));
    }
    public void F2(){
       KtvTagPendantViewController ktvTagPendan = KtvTagPendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ktvTagPendan, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d16ae);
       if (!PatchProxy.applyVoid(objArray, this, ktvTagPendan, "3")) {
          LiveDataOperators.b(this.V2().h, this.V2().i, KtvTagPendantViewController$binding$1.INSTANCE).observe(this, new i0(this.A2(R.id.badge_view)));
       }
       return;
    }
    public final KtvTagPendantViewModel V2(){
       Object obj = PatchProxy.apply(null, this, KtvTagPendantViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
