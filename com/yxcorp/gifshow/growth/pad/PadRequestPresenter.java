package com.yxcorp.gifshow.growth.pad.PadRequestPresenter;
import pvb.a;
import com.yxcorp.gifshow.growth.pad.PadRequestPresenter$slidePlayViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.growth.pad.PadRequestPresenter$pageListReference$2;
import com.yxcorp.gifshow.growth.pad.PadRequestPresenter$pageListObserver$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xpa.f;
import java.util.Objects;
import java.lang.ref.WeakReference;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qvb.i;
import com.yxcorp.gifshow.growth.pad.PadRequestPresenter$pageListObserver$2$a;
import qvb.q;
import qvb.j;
import android.content.res.Configuration;
import kotlin.jvm.internal.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class PadRequestPresenter extends a	// class@001473
{
    public BaseFragment q;
    public final p r;
    public final p s;
    public boolean t;
    public final p u;

    public void PadRequestPresenter(){
       super();
       this.r = s.c(new PadRequestPresenter$slidePlayViewModel$2(this));
       this.s = s.c(PadRequestPresenter$pageListReference$2.INSTANCE);
       this.u = s.c(new PadRequestPresenter$pageListObserver$2(this));
    }
    public void E8(){
       PadRequestPresenter padRequestPr = PadRequestPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, padRequestPr, "7")) {
          return;
       }
       f b = f.b;
       Objects.requireNonNull(b);
       if (f.a == null) {
          SlidePlayViewModel slidePlayVie = PatchProxy.apply(objArray, this, padRequestPr, "1");
          if (slidePlayVie == PatchProxyResult.class) {
             slidePlayVie = this.r.getValue();
          }
          b.a(new WeakReference(slidePlayVie));
       }
       i oi = this.q();
       if (oi != null) {
          oi.h(this.S8());
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PadRequestPresenter.class, "8")) {
          return;
       }
       f.b.a(objArray);
       i oi = this.q();
       if (oi != null) {
          oi.f(this.S8());
       }
       return;
    }
    public void R8(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PadRequestPresenter.class, "6")) {
          return;
       }
       a.p(p0, "newConfig");
       if (this.q() != null && this.t == null) {
          WeakReference weakReferenc = this.V8();
          i oi = (weakReferenc != null)? weakReferenc.get(): null;
          if (oi != null && oi.hasMore() == true) {
             oi.load();
          }
       }
    label_0034 :
       return;
    }
    public final PadRequestPresenter$pageListObserver$2$a S8(){
       Object obj = PatchProxy.apply(null, this, PadRequestPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.getValue();
    }
    public final WeakReference V8(){
       Object obj = PatchProxy.apply(null, this, PadRequestPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PadRequestPresenter.class, "5")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       return;
    }
    public final i q(){
       Object[] objArray = null;
       WeakReference obj = PatchProxy.apply(objArray, this, PadRequestPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.V8();
       if (obj != null) {
          objArray = obj.get();
       }
       return objArray;
    }
}
