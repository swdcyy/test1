package com.yxcorp.gifshow.detail.slidev2.presenter.c0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.c0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import b8a.c2;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import vy6.a;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import ve5.c;
import t45.d;
import brd.z;
import b8a.b2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import az6.a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import im8.f;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.c;
import android.app.Activity;
import org.greenrobot.eventbus.a;
import e6a.a;
import d6a.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import ln5.e;
import e6a.f;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Integer;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import cda.i;

public class c0 extends PresenterV2	// class@0018f1
{
    public boolean A;
    public String B;
    public final a C;
    public t p;
    public PhotoDetailParam q;
    public NasaBizParam r;
    public f s;
    public QPhoto t;
    public int u;
    public f v;
    public SlidePlayViewModel w;
    public BaseFragment x;
    public boolean y;
    public boolean z;

    public void c0(){
       super();
       this.C = new c0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "2")) {
          return;
       }
       this.w = SlidePlayViewModel.B0(this.x.getParentFragment());
       this.X7(this.p.subscribe(new c2(this), Functions.e));
       this.w.P(this.x, this.C);
       u1.a(this);
       this.X7(RxBus.f.f(c.class).observeOn(d.a).subscribe(new b2(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "3")) {
          return;
       }
       u1.b(this);
       this.w.D(this.x, this.C);
       return;
    }
    public void P8(){
       c0 uoc0 = c0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc0, "4")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, uoc0, "6");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): this.w.q(this.q.mPhotoIndex);
       if (this.r.getNasaSlideParam().mDisableAllSmoothSwipeBack == null && (!this.s.get().booleanValue() && i)) {
          this.s.set(Boolean.TRUE);
          new c(this.getActivity()).a();
       }
    label_0054 :
       if (!this.w.g1() && (!this.w.r() && (this.y != null || this.v.get().booleanValue()))) {
          a.d().k(new a(f.c(this.q.mSlidePlayId), this.u, this.t.mEntity));
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "5")) {
          return;
       }
       boolean b = true;
       if (this.z == null && (this.t.getPhotoId()).equals(this.B)) {
          this.z = b;
          a.d().k(new e(this.t.getPhotoId()));
       }else if(this.A == null || (!(this.t.getPhotoId()).equals(this.B) && (!this.w.g1() && (this.y != null || this.v.get().booleanValue())))){
          this.A = b;
          a.d().k(new f(f.c(this.q.mSlidePlayId), this.u, this.q.getDetailCommonParam().getUnserializableBundleId()));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "1")) {
          return;
       }
       this.p = this.r8("PAGE_SMOOTH_SWIPE_OBSERVABLE");
       this.q = this.q8(PhotoDetailParam.class);
       this.r = this.q8(NasaBizParam.class);
       this.s = this.x8("AGGREGATE_ACTIVITY_OPACITY_HAS_CHANGED");
       this.v = this.x8("LANDSCAPE_CHANGE_PHOTO");
       this.t = this.q8(QPhoto.class);
       this.u = this.r8("DETAIL_FEED_POSITION").intValue();
       this.x = this.r8("DETAIL_FRAGMENT");
       return;
    }
    public void onEventMainThread(i p0){
       this.B = p0.a;
    }
}
