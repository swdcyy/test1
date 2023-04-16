package com.kuaishou.live.preview.item.presenter.ad.LivePreviewEnterAdLogPresenter;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.preview.item.presenter.ad.LivePreviewEnterAdLogPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import hn5.n;
import hn5.m;
import android.content.Context;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import wkd.b;
import mxb.f0;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;

public class LivePreviewEnterAdLogPresenter extends PresenterV2 implements DefaultLifecycleObserver	// class@000e06
{
    public QPhoto p;
    public BaseFragment q;
    public SlidePlayViewModel r;
    public boolean s;
    public int t;
    public final a u;

    public void LivePreviewEnterAdLogPresenter(){
       super();
       this.t = 0;
       this.u = new LivePreviewEnterAdLogPresenter$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewEnterAdLogPresenter.class, "3")) {
          return;
       }
       if (k.B(this.p) == null) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q.getParentFragment());
       this.r = slidePlayVie;
       slidePlayVie.P(this.q, this.u);
       this.getActivity().getLifecycle().addObserver(this);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewEnterAdLogPresenter.class, "2")) {
          return;
       }
       this.s = m.a().U3(this.getContext());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewEnterAdLogPresenter.class, "4")) {
          return;
       }
       this.getActivity().getLifecycle().removeObserver(this);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewEnterAdLogPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       return;
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewEnterAdLogPresenter.class, "5")) {
          return;
       }
       if (this.t != null) {
          b.a(-762347696).r1(this.p.mEntity, "key_enteraction", Integer.valueOf(this.t));
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
