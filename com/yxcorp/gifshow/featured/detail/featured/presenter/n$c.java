package com.yxcorp.gifshow.featured.detail.featured.presenter.n$c;
import qvb.q;
import com.yxcorp.gifshow.featured.detail.featured.presenter.n;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import wkd.b;
import gb5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.featured.detail.featured.preinit.f;
import ok.x;
import k2b.u1;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import lnc.a1;
import j9a.a;
import j9a.d;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import bf5.v;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.nasa.NasaRefreshView;
import qvb.i;
import com.yxcorp.gifshow.featured.detail.featured.t;
import android.view.animation.Animation;
import android.view.ViewGroup;
import qvb.p;
import com.yxcorp.gifshow.w;
import uv8.e1;
import androidx.fragment.app.Fragment;
import zda.f1;
import java.lang.Runnable;
import lda.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lda.c0;
import com.kwai.robust.PatchProxyResult;
import android.text.TextUtils;
import com.kwai.feature.api.feed.tag.plugin.TagPluginHelper;

public class n$c implements q	// class@000f85
{
    public boolean b;
    public boolean c;
    public final n d;

    public void n$c(n p0){
       this.d = p0;
       super();
       this.b = true;
       this.c = false;
    }
    public void M1(boolean p0,Throwable p1){
       n$c uoc = n$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "3")) {
          return;
       }
       b.a(0x8708467).g("homeFeaturedLoad", false);
       Activity activity = this.d.getActivity();
       if (activity == null) {
          return;
       }
       ExceptionHandler.handleException(activity, p1);
       if (this.b != null) {
          this.b = false;
          u1.Q("firstFeaturedApi", "succ=0&enablePreInit="+f.f.get());
       }
       n$c td = this.d;
       if (td.D == null && td.E != null) {
          td.V8();
       }
       if (!this.d.H.Y0()) {
          this.d.d9(a1.p(R.string.arg_RES_7f104c7c));
          if (d.b().mEnableColdStart != null && this.c == null) {
             this.d.B.V.onNext(new v(null, "scene_cold_start_failed"));
             this.c = true;
          }
       }else {
          this.d.r.setVisibility(8);
          this.d.s.setVisibility(8);
       }
       if (this.d.q.u()) {
          this.d.q.setRefreshing(false);
       }
       td = this.d;
       td.G = false;
       if (td.H.X0() instanceof t) {
          this.d.H.X0().j2();
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       n$c uoc = n$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       if (!this.d.q.u() && (this.d.q.getAnimation() == null || this.d.q.getAnimation().hasEnded())) {
          n$c td = this.d;
          if (td.G == null) {
             if (p0 && (td.H.p1() && !this.d.q.u())) {
                this.d.c9();
             }
          label_005b :
             b.a(0x8708467).E("homeFeaturedLoad");
          }
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       boolean b;
       n$c td;
       n$c uoc = n$c.class;
       String str = "2";
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, str)) {
          return;
       }
       w ow = b.a(-1343064608);
       if (ow != null && p0) {
          ow.z().D(this.d.x, p1);
       }
       b.a(0x8708467).g("homeFeaturedLoad", p1);
       b = false;
       if (this.b != null) {
          this.b = b;
          u1.R("firstFeaturedApi", "succ=1&enablePreInit="+f.f.get(), 14);
       }
       if (p1) {
          n p = this.d.p;
          if (p == null || !p.get().booleanValue()) {
             return;
          }
       }
       if (this.d.q.u()) {
          this.d.q.postDelayed(new f1(this), 400);
       }
       if (this.d.H.Y0() > 0) {
          this.d.r.setVisibility(8);
          this.d.s.setVisibility(8);
          td = this.d;
          if (td.D == null && (td.E != null || td.F != null)) {
             td.V8();
          }
       }
       td = this.d;
       td.G = b;
       if (td.H.X0() instanceof t) {
          this.d.H.X0().j2();
          if (p0) {
             t h = this.d.H.X0().H;
             if (h != null && (TextUtils.n(h.a, "EVENT_HOT_NEWS_PHOTO") && (this.d.H.X0().getCount() > 0 && (this.d.getActivity() != null && !TextUtils.n(h.mPhotoId, this.d.H.X0().getItem(b).getPhotoId()))))) {
                Activity activity = this.d.getActivity();
                d mServerExpTa = h.mServerExpTag;
                Object obj = PatchProxy.applyTwoRefs(activity, mServerExpTa, null, c0.class, str);
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(!TextUtils.equals("olympic2022", mServerExpTa)){
                   b = c0.a(activity);
                }
                if (!b) {
                   TagPluginHelper.a(this.d.getActivity());
                }
             }
          }
       }
    label_0153 :
       return;
    }
}
