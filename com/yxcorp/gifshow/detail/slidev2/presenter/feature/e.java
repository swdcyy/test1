package com.yxcorp.gifshow.detail.slidev2.presenter.feature.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import uv6.b;
import am6.b;
import com.kwai.library.dynamic_prefetcher.data.config.PrefetchConfig;
import com.yxcorp.gifshow.util.rx.RxBus;
import brd.t;
import t45.d;
import brd.z;
import e8a.l;
import erd.g;
import crd.b;
import fx6.b;
import com.kwai.robust.PatchProxyResult;
import tv6.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.d;
import java.util.concurrent.Callable;
import e8a.m;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class e extends PresenterV2	// class@00193f
{
    public BaseFragment p;
    public SlidePlayViewModel q;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.q = SlidePlayViewModel.B0(this.p);
       if (b.e()) {
          this.R8(new b(b.b()));
       }else {
          this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new l(this)));
       }
       return;
    }
    public b P8(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.Q0("kwai_data_source_service");
    }
    public final void R8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       a.e("feature_preload", "init nasa dynamic prefetch");
       this.X7(t.fromCallable(d.b).subscribeOn(d.c).observeOn(d.a).subscribe(new m(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
