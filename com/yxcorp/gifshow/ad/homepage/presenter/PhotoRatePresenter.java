package com.yxcorp.gifshow.ad.homepage.presenter.PhotoRatePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import com.yxcorp.gifshow.ad.homepage.presenter.PhotoRatePresenter$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import wkd.b;
import l66.a;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import android.view.View;
import android.widget.RadioGroup;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.VideoQualityInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewStub;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dda.d;
import m66.a;
import android.widget.ImageView;
import uh5.e;

public class PhotoRatePresenter extends PresenterV2	// class@001786
{
    public RadioButton A;
    public RadioButton B;
    public RadioButton C;
    public final List D;
    public boolean E;
    public final LifecycleObserver F;
    public BaseFeed p;
    public BaseFragment q;
    public List r;
    public VideoQualityInfo s;
    public KwaiImageView t;
    public ViewStub u;
    public View v;
    public RadioGroup w;
    public View x;
    public View y;
    public TextView z;

    public void PhotoRatePresenter(){
       super();
       this.D = new ArrayList();
       this.F = new PhotoRatePresenter$1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, PhotoRatePresenter.class, "4")) {
          return;
       }
       PhotoAdvertisement photoAdverti = this.p.get("AD");
       if (photoAdverti != null) {
          photoAdverti = photoAdverti.mAdData;
          if (photoAdverti != null) {
             this.r = photoAdverti.mVideoQUalityInfoList;
          }
       }
       if (this.R8()) {
          b.a(0x6d2a4fdd).a(this);
          this.q.getLifecycle().addObserver(this.F);
       }else {
          PhotoRatePresenter tv = this.v;
          if (tv != null) {
             tv.setVisibility(8);
          }
       }
       return;
    }
    public void J8(){
       PhotoRatePresenter photoRatePre = PhotoRatePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, photoRatePre, "7")) {
          return;
       }
       if (this.R8()) {
          b.a(0x6d2a4fdd).c(this);
          this.q.getLifecycle().removeObserver(this.F);
       }
       if (this.P8() && !PatchProxy.applyVoid(objArray, this, photoRatePre, "17")) {
          photoRatePre = this.v;
          if (photoRatePre != null) {
             photoRatePre.setVisibility(8);
             this.x.setEnabled(false);
             this.w.clearCheck();
             this.D.clear();
          }
       }
       return;
    }
    public final boolean P8(){
       PhotoRatePresenter obj = PatchProxy.apply(null, this, PhotoRatePresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s;
       boolean b = false;
       if (obj == null || (!TextUtils.x(obj.mTitle) && (q.f(this.s.mScoreMarkList) || (this.s.mScoreMarkList.size() >= 3 && this.D.size() == 3)))) {
          b = true;
       }
    label_0041 :
       return b;
    }
    public final boolean R8(){
       PhotoRatePresenter obj = PatchProxy.apply(null, this, PhotoRatePresenter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.r;
       boolean b = (obj != null && obj.size() > 0)? true: false;
       return b;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, PhotoRatePresenter.class, "16")) {
          return;
       }
       PhotoRatePresenter ts = this.s;
       if (ts != null) {
          ts.mRateCoverShowStatus = 2;
       }
       ts = this.v;
       if (ts != null) {
          ts.setVisibility(8);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoRatePresenter.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a3105);
       this.u = m1.f(p0, 0x7f0a3060);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PhotoRatePresenter.class, "1")) {
          return;
       }
       this.p = this.r8("feed");
       this.q = this.r8("FRAGMENT");
       return;
    }
    public void onEventMainThread(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoRatePresenter.class, "10")) {
          return;
       }
       if (TextUtils.n(this.p.getId(), p0.a.getId()) && this.t.getMeasuredHeight() >= this.t.getMeasuredWidth()) {
          PhotoRatePresenter tr = this.r;
          if (tr == null || (tr.size() && !e.b())) {
             this.E = true;
             return;
          }
       }
    label_0042 :
       this.S8();
       return;
    }
}
