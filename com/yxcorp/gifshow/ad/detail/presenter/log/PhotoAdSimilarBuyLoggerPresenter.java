package com.yxcorp.gifshow.ad.detail.presenter.log.PhotoAdSimilarBuyLoggerPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.log.PhotoAdSimilarBuyLoggerPresenter$a;
import com.yxcorp.gifshow.ad.detail.presenter.log.PhotoAdSimilarBuyLoggerPresenter$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import tw.j;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kz8.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.System;

public class PhotoAdSimilarBuyLoggerPresenter extends PresenterV2	// class@001655
{
    public long p;
    public QPhoto q;
    public List r;
    public BaseFragment s;
    public SlidePlayViewModel t;
    public final a u;
    public DefaultLifecycleObserver v;

    public void PhotoAdSimilarBuyLoggerPresenter(){
       super();
       this.u = new PhotoAdSimilarBuyLoggerPresenter$a(this);
       this.v = new PhotoAdSimilarBuyLoggerPresenter$2(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, PhotoAdSimilarBuyLoggerPresenter.class, "2")) {
          return;
       }
       if (this.q.isAd() && !j.D(this.q)) {
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.s.getParentFragment());
          this.t = slidePlayVie;
          if (slidePlayVie != null) {
             slidePlayVie.P(this.s, this.u);
          }else {
             PhotoAdSimilarBuyLoggerPresenter tr = this.r;
             if (tr != null) {
                tr.add(this.u);
             }
          }
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, PhotoAdSimilarBuyLoggerPresenter.class, "5")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       this.getActivity().getLifecycle().removeObserver(this.v);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PhotoAdSimilarBuyLoggerPresenter.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.t8("DETAIL_ATTACH_LISTENERS");
       this.s = this.r8("DETAIL_FRAGMENT");
       return;
    }
    public void onEventMainThread(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoAdSimilarBuyLoggerPresenter.class, "3")) {
          return;
       }
       if (!TextUtils.isEmpty(p0.a) && (p0.a).equals(this.q.mEntity.getId())) {
          this.p = System.currentTimeMillis();
       }
       return;
    }
}
