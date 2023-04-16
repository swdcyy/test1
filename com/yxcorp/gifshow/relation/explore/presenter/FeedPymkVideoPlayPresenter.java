package com.yxcorp.gifshow.relation.explore.presenter.FeedPymkVideoPlayPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.presenter.FeedPymkVideoPlayPresenter$a;
import com.yxcorp.gifshow.relation.explore.presenter.FeedPymkVideoPlayPresenter$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import crd.b;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import y8c.g;

public class FeedPymkVideoPlayPresenter extends PresenterV2	// class@00181e
{
    public PhotoDetailParam p;
    public PublishSubject q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public b t;
    public g u;
    public final a v;
    public final DefaultLifecycleObserver w;

    public void FeedPymkVideoPlayPresenter(){
       super();
       this.v = new FeedPymkVideoPlayPresenter$a(this);
       this.w = new FeedPymkVideoPlayPresenter$2(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, FeedPymkVideoPlayPresenter.class, "4")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.r.getParentFragment());
       this.s = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.r, this.v);
       }
       this.r.getLifecycle().addObserver(this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, FeedPymkVideoPlayPresenter.class, "5")) {
          return;
       }
       FeedPymkVideoPlayPresenter ts = this.s;
       if (ts != null) {
          ts.q0(this.r, this.v);
       }
       this.r.getLifecycle().removeObserver(this.w);
       ts = this.t;
       if (ts != null) {
          ts.dispose();
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, FeedPymkVideoPlayPresenter.class, "1")) {
          return;
       }
       FeedPymkVideoPlayPresenter tt = this.t;
       if (tt != null) {
          tt.dispose();
       }
       this.q.onNext(Integer.valueOf(201));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FeedPymkVideoPlayPresenter.class, "3")) {
          return;
       }
       this.p = this.q8(PhotoDetailParam.class);
       this.r = this.r8("FRAGMENT");
       this.u = this.r8("ADAPTER");
       this.q = this.r8("PYMK_ACCESS_IDScard_play");
       return;
    }
}
