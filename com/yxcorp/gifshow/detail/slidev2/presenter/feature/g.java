package com.yxcorp.gifshow.detail.slidev2.presenter.feature.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;

public class g extends PresenterV2	// class@001944
{
    public final a p;
    public QPhoto q;
    public BaseFragment r;
    public PublishSubject s;
    public SlidePlayViewModel t;
    public b u;

    public void g(){
       super();
       this.p = new g$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       g tr = this.r;
       if (tr == null) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tr.getParentFragment());
       this.t = slidePlayVie;
       slidePlayVie.P(this.r, this.p);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       g tr = this.r;
       if (tr != null) {
          this.t.D(tr, this.p);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.t8("DETAIL_FRAGMENT");
       this.s = this.r8("SLIDE_PLAY_HIDE_COMMENT_DIALOG");
       return;
    }
}
