package com.kuaishou.live.core.voiceparty.micseats.pendant.BackgroundPendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import java.lang.String;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.BackgroundPendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.BackgroundPendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.BackgroundPendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import it2.k;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.BackgroundPendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.SystemUtil;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt;
import com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt$bindBlurAvatar$1;
import com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt$bindRequests$1;
import androidx.lifecycle.LifecycleOwner;
import msd.l;
import msd.p;
import com.kuaishou.live.core.voiceparty.micseats.pendant.BackgroundPendantViewController$binding$1;
import xh3.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class BackgroundPendantViewController extends ViewController	// class@0015dd
{
    public final p j;

    public void BackgroundPendantViewController(f p0,String p1,LiveData p2){
       a.p(p0, "micSeatStateService");
       a.p(p1, "anchorId");
       a.p(p2, "micSeatId");
       super();
       this.j = new ViewModelLazy(m0.d(k.class), new BackgroundPendantViewController$viewModelDelegate$$inlined$viewModels$2(new BackgroundPendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new BackgroundPendantViewController$$special$$inlined$viewModelDelegate$1(new BackgroundPendantViewController$viewModel$2(p0, p1, p2)));
    }
    public void F2(){
       BackgroundPendantViewController uBackgroundP = BackgroundPendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uBackgroundP, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d16cb);
       if (!PatchProxy.applyVoid(objArray, this, uBackgroundP, "3")) {
          if (SystemUtil.a(21)) {
             KwaiBindableImageView kwaiBindable = this.A2(R.id.blur_bg_view);
             k g = this.V2().g;
             if (!PatchProxy.applyVoidThreeRefs(kwaiBindable, this, g, null, KwaiImageViewBinderKt.class, "6")) {
                a.p(kwaiBindable, "$this$bindBlurAvatar");
                a.p(this, "lifecycleOwner");
                a.p(g, "liveData");
                KwaiImageViewBinderKt.b(kwaiBindable, this, g, KwaiImageViewBinderKt$bindBlurAvatar$1.INSTANCE, KwaiImageViewBinderKt$bindRequests$1.INSTANCE, null);
             }
          }
          l.a(this.A2(R.id.bg_view), this, this.V2().h, BackgroundPendantViewController$binding$1.INSTANCE);
       }
       return;
    }
    public final k V2(){
       Object obj = PatchProxy.apply(null, this, BackgroundPendantViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
