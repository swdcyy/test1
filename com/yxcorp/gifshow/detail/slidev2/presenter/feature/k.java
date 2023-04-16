package com.yxcorp.gifshow.detail.slidev2.presenter.feature.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.k$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import zz5.d;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class k extends PresenterV2	// class@0019a8
{
    public QPhoto p;
    public PhotoDetailParam q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public final a t;
    public boolean u;

    public void k(){
       super();
       this.t = new k$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.r.getParentFragment());
       this.s = slidePlayVie;
       slidePlayVie.P(this.r, this.t);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       this.s.D(this.r, this.t);
       if (!this.r.isAdded()) {
          return;
       }
       d.f(this.p, this.r);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(PhotoDetailParam.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
