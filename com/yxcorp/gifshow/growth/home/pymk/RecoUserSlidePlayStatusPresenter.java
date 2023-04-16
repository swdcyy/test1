package com.yxcorp.gifshow.growth.home.pymk.RecoUserSlidePlayStatusPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.growth.home.pymk.RecoUserSlidePlayStatusPresenter$a;
import com.yxcorp.gifshow.growth.home.pymk.RecoUserSlidePlayStatusPresenter$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.viewpager2.widget.ViewPager2;
import vna.t;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import uw9.v3;
import uw9.l0;
import vna.o;
import jf5.a;
import vy6.a;
import com.yxcorp.gifshow.growth.home.pymk.RecoUserSlidePlayStatusPresenter$b;
import androidx.viewpager2.widget.ViewPager2$h;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Integer;
import g9c.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserWrapper;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.e0;
import k6a.u;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import vna.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class RecoUserSlidePlayStatusPresenter extends PresenterV2	// class@00139b
{
    public final DefaultLifecycleObserver A;
    public ViewPager2 p;
    public RecyclerView q;
    public t r;
    public PhotoDetailParam s;
    public b t;
    public PublishSubject u;
    public PublishSubject v;
    public BaseFragment w;
    public boolean x;
    public SlidePlayViewModel y;
    public final a z;

    public void RecoUserSlidePlayStatusPresenter(){
       super();
       this.z = new RecoUserSlidePlayStatusPresenter$a(this);
       this.A = new RecoUserSlidePlayStatusPresenter$2(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, RecoUserSlidePlayStatusPresenter.class, "3")) {
          return;
       }
       if (this.p.getAdapter() instanceof t) {
          this.r = this.p.getAdapter();
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.w.getParentFragment());
       this.y = slidePlayVie;
       if (slidePlayVie != null) {
          l0 ol0 = slidePlayVie.M0();
          if (ol0 != null) {
             ol0.T = new o(this);
          }
          this.y.P(this.w, this.z);
       }
       RecoUserSlidePlayStatusPresenter tp = this.p;
       if (tp != null) {
          tp.j(new RecoUserSlidePlayStatusPresenter$b(this));
       }
       this.w.getLifecycle().addObserver(this.A);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, RecoUserSlidePlayStatusPresenter.class, "6")) {
          return;
       }
       RecoUserSlidePlayStatusPresenter ty = this.y;
       if (ty != null) {
          ty.q0(this.w, this.z);
       }
       this.w.getLifecycle().removeObserver(this.A);
       return;
    }
    public void P8(int p0,String p1){
       RecoUserSlidePlayStatusPresenter recoUserSlid = RecoUserSlidePlayStatusPresenter.class;
       if (PatchProxy.isSupport(recoUserSlid) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, recoUserSlid, "7")) {
          return;
       }
       recoUserSlid = this.r;
       if (recoUserSlid != null) {
          RecommendUserWrapper recommendUse = recoUserSlid.N0(p0);
          if (recommendUse != null && !recommendUse.isShowed()) {
             recommendUse.setShowed(true);
             recommendUse = recommendUse.mFeed;
             if (recommendUse != null) {
                u.g(this.w, recommendUse.getPhotoId(), p1);
             }
          }
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, RecoUserSlidePlayStatusPresenter.class, "4")) {
          return;
       }
       this.u.onNext(Integer.valueOf(-1));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoUserSlidePlayStatusPresenter.class, "2")) {
          return;
       }
       ViewPager2 viewPager2 = m1.f(p0, R.id.video_recycler_view);
       this.p = viewPager2;
       this.q = viewPager2.getChildAt(0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, RecoUserSlidePlayStatusPresenter.class, "1")) {
          return;
       }
       this.t = this.q8(b.class);
       this.s = this.q8(PhotoDetailParam.class);
       this.u = this.r8("PLAYER_STATUS_CHANGE");
       this.v = this.r8("FOLLOW_STATUS_CHANGE");
       this.w = this.q8(BaseFragment.class);
       return;
    }
}
