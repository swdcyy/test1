package com.yxcorp.gifshow.detail.slidev2.presenter.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.e1;
import com.yxcorp.gifshow.detail.slidev2.presenter.r$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;

public class r extends PresenterV2	// class@0019d2
{
    public NasaBizParam p;
    public SlidePlayViewModel q;
    public BaseFragment r;
    public QPhoto s;
    public PublishSubject t;
    public final Runnable u;
    public final a v;

    public void r(){
       super();
       this.u = new e1(this);
       this.v = new r$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.r.getParentFragment());
       this.q = slidePlayVie;
       slidePlayVie.P(this.r, this.v);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       r tq = this.q;
       if (tq != null) {
          tq.D(this.r, this.v);
       }
       k1.m(this.u);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.s = this.q8(QPhoto.class);
       this.p = this.q8(NasaBizParam.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       this.t = this.r8("SLIDE_PLAY_SHOW_COMMENT_DIALOG");
       return;
    }
}
