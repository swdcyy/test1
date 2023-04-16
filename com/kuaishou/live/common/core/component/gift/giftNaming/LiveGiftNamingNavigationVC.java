package com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVC;
import com.kuaishou.live.viewcontroller.ViewController;
import rl1.a;
import rl1.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVC$viewModel$2;
import com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVC$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVM;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVC$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import i2b.a;
import rl1.f;
import rl1.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import rl1.c;
import rl1.d;
import rl1.e;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class LiveGiftNamingNavigationVC extends ViewController	// class@0012ba
{
    public final p j;
    public final a k;

    public void LiveGiftNamingNavigationVC(a p0,g p1){
       a.p(p0, "giftNamingModel");
       a.p(p1, "listener");
       super();
       this.k = p0;
       this.j = new ViewModelLazy(m0.d(LiveGiftNamingNavigationVM.class), new LiveGiftNamingNavigationVC$$special$$inlined$viewModels$2(new LiveGiftNamingNavigationVC$$special$$inlined$viewModels$1(this)), new LiveGiftNamingNavigationVC$viewModel$2(this, p1));
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveGiftNamingNavigationVC.class, "2")) {
          return;
       }
       View view = a.a(this.D2(), R.layout.arg_RES_7f0d0b29);
       a.o(view, "KwaiLayoutInflater.infla¡­_gift_naming_layout\n    \)");
       this.R2(view);
       f uof = new f(view);
       LiveGiftNamingNavigationVM liveGiftNami = this.V2();
       if (!PatchProxy.applyVoidTwoRefs(this, liveGiftNami, uof, f.class, "1")) {
          a.p(this, "lifecycleOwner");
          a.p(liveGiftNami, "viewModel");
          liveGiftNami.a.observe(this, new b(uof));
          liveGiftNami.b.observe(this, new c(uof));
          liveGiftNami.c.observe(this, new d(uof));
          uof.l.setOnClickListener(new e(liveGiftNami));
       }
       return;
    }
    public final LiveGiftNamingNavigationVM V2(){
       Object obj = PatchProxy.apply(null, this, LiveGiftNamingNavigationVC.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
