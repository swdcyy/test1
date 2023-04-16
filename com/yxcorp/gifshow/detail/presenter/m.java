package com.yxcorp.gifshow.detail.presenter.m;
import ue5.e;
import com.yxcorp.gifshow.detail.presenter.m$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import bf5.q;
import y4a.d0;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Throwable;
import hn5.n;
import hn5.m;
import wkd.b;
import gb5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import android.app.Activity;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import brd.y;
import mrd.c;

public class m extends e	// class@0016f2
{
    public a A;
    public q w;
    public c x;
    public SlidePlayViewModel y;
    public boolean z;

    public void m(){
       super();
       this.z = false;
       this.A = new m$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       super.E8();
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.v.getParentFragment());
       this.y = slidePlayVie;
       slidePlayVie.P(this.v, this.A);
       this.W8(this.w.h);
       this.X7(this.w.G.subscribe(new d0(this), Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "6")) {
          return;
       }
       this.y.D(this.v, this.A);
       this.z = false;
       return;
    }
    public void S8(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "4")) {
          return;
       }
       super.S8(p0);
       if (m.a().FG(this.v)) {
          b.a(0x8708467).l(this.v, false, this.u, p0);
       }
       this.X8(Boolean.TRUE);
       this.z = true;
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       super.V8();
       if (m.a().FG(this.v)) {
          b.a(0x8708467).n(this.v, false, this.u);
       }
       this.X8(Boolean.FALSE);
       this.z = false;
       return;
    }
    public void X8(Boolean p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "5")) {
          return;
       }
       if (this.getActivity() == null || (!this.getActivity().isFinishing() && NasaExperimentUtils.m())) {
          this.x.onNext(p0);
       }
    label_0027 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       super.j8();
       this.w = this.q8(q.class);
       this.x = this.r8("DETAIL_LOADING_ANIM_OBSERVABLE");
       return;
    }
}
