package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.LiveMultiLineArenaLineHeaderViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LifecycleOwner;
import dr1.f;
import ar1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.LiveMultiLineArenaLineHeaderViewController$viewModel$2;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.LiveMultiLineArenaLineHeaderViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.vm.LiveMultiLineArenaLineHeaderViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.LiveMultiLineArenaLineHeaderViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import br1.a;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import ls1.g;
import br1.b;
import android.view.View$OnClickListener;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import xh3.g;
import xh3.l;
import br1.c;
import androidx.lifecycle.Observer;

public final class LiveMultiLineArenaLineHeaderViewController extends ViewController	// class@001527
{
    public final p j;
    public final LifecycleOwner k;
    public final boolean l;
    public final f m;
    public final a n;

    public void LiveMultiLineArenaLineHeaderViewController(LifecycleOwner p0,boolean p1,f p2,a p3){
       a.p(p0, "lifecycleOwner");
       a.p(p2, "arenaLineModel");
       a.p(p3, "arenaHeaderDelegate");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.j = new ViewModelLazy(m0.d(LiveMultiLineArenaLineHeaderViewModel.class), new LiveMultiLineArenaLineHeaderViewController$$special$$inlined$viewModels$2(new LiveMultiLineArenaLineHeaderViewController$$special$$inlined$viewModels$1(this)), new LiveMultiLineArenaLineHeaderViewController$viewModel$2(this));
    }
    public void F2(){
       a a;
       LiveMultiLineArenaLineHeaderViewController liveMultiLin = LiveMultiLineArenaLineHeaderViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMultiLin, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0cb1);
       if (!PatchProxy.applyVoid(objArray, this, liveMultiLin, "3")) {
          a uoa = new a(this.P2());
          LiveMultiLineArenaLineHeaderViewController tk = this.k;
          String str = "1";
          LiveMultiLineArenaLineHeaderViewModel liveMultiLin1 = PatchProxy.apply(objArray, this, liveMultiLin, str);
          if (liveMultiLin1 == PatchProxyResult.class) {
             liveMultiLin1 = this.j.getValue();
          }
          if (!PatchProxy.applyVoidTwoRefs(tk, liveMultiLin1, uoa, a.class, str)) {
             a.p(tk, "lifecycleOwner");
             a.p(liveMultiLin1, "viewModel");
             g.a(uoa.b, R.string.arg_RES_7f1025b6, a.f);
             uoa.c.setOnClickListener(new b(liveMultiLin1));
             a = uoa.a;
             a.o(a, "titleView");
             g.a(a, tk, liveMultiLin1.w0());
             a = uoa.c;
             a.o(a, "subTitle");
             g.a(a, tk, liveMultiLin1.b);
             a = uoa.d;
             a.o(a, "countDownView");
             g.a(a, tk, liveMultiLin1.f);
             l.e(uoa.e, tk, liveMultiLin1.v0(), false, 4, null);
             liveMultiLin1.x0().observe(tk, new c(uoa));
          }
       }
       return;
    }
}
