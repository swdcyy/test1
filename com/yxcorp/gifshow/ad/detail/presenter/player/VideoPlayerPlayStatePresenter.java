package com.yxcorp.gifshow.ad.detail.presenter.player.VideoPlayerPlayStatePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.player.VideoPlayerPlayStatePresenter$a;
import com.yxcorp.gifshow.ad.detail.presenter.player.VideoPlayerPlayStatePresenter$mLifecycleObserver$1;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import android.app.Activity;
import lnc.y0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class VideoPlayerPlayStatePresenter extends PresenterV2	// class@00166e
{
    public QPhoto p;
    public BaseFragment q;
    public PhotoDetailParam r;
    public boolean s;
    public SlidePlayViewModel t;
    public final a u;
    public final DefaultLifecycleObserver v;

    public void VideoPlayerPlayStatePresenter(){
       super();
       this.u = new VideoPlayerPlayStatePresenter$a(this);
       this.v = new VideoPlayerPlayStatePresenter$mLifecycleObserver$1(this);
    }
    public static final QPhoto P8(VideoPlayerPlayStatePresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, VideoPlayerPlayStatePresenter.class, "4")) {
          return;
       }
       VideoPlayerPlayStatePresenter tq = this.q;
       String str = "mFragment";
       if (tq == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(tq.getParentFragment());
       this.t = slidePlayVie;
       if (slidePlayVie != null) {
          VideoPlayerPlayStatePresenter tq1 = this.q;
          if (tq1 == null) {
             a.S(str);
          }
          slidePlayVie.r0(tq1, this.u);
       }
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.getLifecycle().addObserver(this.v);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, VideoPlayerPlayStatePresenter.class, "5")) {
          return;
       }
       VideoPlayerPlayStatePresenter tt = this.t;
       String str = "mFragment";
       if (tt != null) {
          VideoPlayerPlayStatePresenter tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          tt.q0(tq, this.u);
       }
       tt = this.q;
       if (tt == null) {
          a.S(str);
       }
       tt.getLifecycle().removeObserver(this.v);
       return;
    }
    public final boolean R8(){
       boolean b;
       Object[] objArray = null;
       VideoPlayerPlayStatePresenter obj = PatchProxy.apply(objArray, this, VideoPlayerPlayStatePresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.r;
       if (obj == null) {
          a.S("mDetailParam");
       }
       DetailPlayConfig detailPlayCo = obj.getDetailPlayConfig();
       a.o(detailPlayCo, "mDetailParam.detailPlayConfig");
       if (detailPlayCo.isContinuePlayWhileExit()) {
          Activity activity = this.getActivity();
          if (activity != null) {
             objArray = Boolean.valueOf(activity.isFinishing());
          }
          if (y0.p(objArray)) {
             b = true;
          label_0043 :
             return b;
          }
       }
       b = false;
       goto label_0043 ;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, VideoPlayerPlayStatePresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.r = obj;
       return;
    }
}
