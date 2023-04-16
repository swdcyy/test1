package com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter$a;
import nsd.u;
import lnc.a1;
import com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter$mEasyTk$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter$b;
import com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter$c;
import android.view.ViewGroup;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import n49.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.SideWindowInfo;
import mxb.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import x49.l;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import android.app.Activity;
import lnc.y0;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import jta.c;
import g19.l;
import com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter$onBind$appendBridgeGroup$1;
import x49.o;
import mxb.u;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import yy6.c;
import msd.l;
import io.reactivex.subjects.PublishSubject;
import x49.n;
import x49.n$b;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Float;
import bf5.q;
import java.lang.StringBuilder;
import yx.j0;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rf5.u;

public final class ThanosSideTKPresenter extends PresenterV2	// class@0016a2
{
    public final c A;
    public QPhoto p;
    public BaseFragment q;
    public l r;
    public q s;
    public PublishSubject t;
    public u u;
    public ViewGroup v;
    public View w;
    public final p x;
    public boolean y;
    public final ThanosSideTKPresenter$b z;
    public static final int B;
    public static final int C;
    public static final ThanosSideTKPresenter$a D;

    static {
       ThanosSideTKPresenter.D = new ThanosSideTKPresenter$a(null);
       ThanosSideTKPresenter.B = a1.d(0x7f070bf1);
       ThanosSideTKPresenter.C = a1.d(0x7f070a83);
    }
    public void ThanosSideTKPresenter(){
       super();
       this.x = s.c(ThanosSideTKPresenter$mEasyTk$2.INSTANCE);
       this.z = new ThanosSideTKPresenter$b(this);
       this.A = new ThanosSideTKPresenter$c(this);
    }
    public static final ViewGroup P8(ThanosSideTKPresenter p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mSideTkContainer");
       }
       return p0;
    }
    public void E8(){
       boolean b;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, ThanosSideTKPresenter.class, "4")) {
          return;
       }
       this.S8();
       ThanosSideTKPresenter p = obj.p;
       if (p == null) {
          a.S("mPhoto");
       }
       String obj1 = PatchProxy.applyOneRefs(p, objArray, s.class, "37");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          SideWindowInfo sideWindowIn1 = c.J(p);
          if (sideWindowIn1 != null && !TextUtils.isEmpty(sideWindowIn1.mTemplateId)) {
             PhotoAdvertisement photoAdverti = k.B(p);
             if (photoAdverti != null) {
                PhotoAdvertisement$TkTemplateInfo tkTemplateIn = l.a(sideWindowIn1.mTemplateId, photoAdverti);
                if (l.b(sideWindowIn1.mTemplateId, photoAdverti) != null && s.C(tkTemplateIn)) {
                   b = true;
                }
             }
          }
          b = false;
       }
       if (b && !y0.o(this.getActivity())) {
          p = obj.q;
          obj1 = "mFragment";
          if (p == null) {
             a.S(obj1);
          }
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(p.getParentFragment());
          a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment\)");
          ThanosSideTKPresenter q = obj.q;
          if (q == null) {
             a.S(obj1);
          }
          slidePlayVie.P(q, obj.z);
          if (slidePlayVie.r()) {
             this.W8();
          }else {
             this.S8();
          }
          p = obj.r;
          if (p == null) {
             a.S("mSidebarStatusHelper");
          }
          p.a(obj.A);
          ThanosSideTKPresenter$onBind$appendBridgeGroup$1 oonBind$appe = new ThanosSideTKPresenter$onBind$appendBridgeGroup$1(obj);
          u ou = null;
          p = obj.t;
          if (p == null) {
             a.S("mSideTkHalfPagePublish");
          }
          o oo = new o(ou, null, null, null, null, null, p, 63, null);
          n on = this.R8();
          Activity activity = this.getActivity();
          a.m(activity);
          a.o(activity, "activity!!");
          ThanosSideTKPresenter v = obj.v;
          if (v == null) {
             a.S("mSideTkContainer");
          }
          ThanosSideTKPresenter p1 = obj.p;
          if (p1 == null) {
             a.S("mPhoto");
          }
          p = obj.p;
          if (p == null) {
             a.S("mPhoto");
          }
          SideWindowInfo sideWindowIn = c.J(p);
          a.m(sideWindowIn);
          SideWindowInfo mTemplateId = sideWindowIn.mTemplateId;
          a.o(mTemplateId, "AdDataUtils.getSideWindo¡­nfo\(mPhoto\)!!.mTemplateId");
          obj.y = n$b.a(on, activity, v, p1, mTemplateId, v9, null, oonBind$appe, 32, null);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ThanosSideTKPresenter.class, "10")) {
          return;
       }
       this.R8().destroy();
       ThanosSideTKPresenter tr = this.r;
       if (tr == null) {
          a.S("mSidebarStatusHelper");
       }
       tr.c(this.A);
       return;
    }
    public final n R8(){
       Object obj = PatchProxy.apply(null, this, ThanosSideTKPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x.getValue();
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, ThanosSideTKPresenter.class, "6")) {
          return;
       }
       ThanosSideTKPresenter tv = this.v;
       if (tv == null) {
          a.S("mSideTkContainer");
       }
       n.Y(tv, 8, false);
       tv = this.w;
       if (tv == null) {
          a.S("mSideShadowLayout");
       }
       n.Y(tv, 8, false);
       return;
    }
    public final void V8(float p0){
       q a;
       ThanosSideTKPresenter ts1;
       ThanosSideTKPresenter thanosSideTK = ThanosSideTKPresenter.class;
       if (PatchProxy.isSupport(thanosSideTK) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, thanosSideTK, "7")) {
          return;
       }
       if (!PatchProxy.isSupport(thanosSideTK) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, thanosSideTK, "8")) {
          ThanosSideTKPresenter tv = this.v;
          if (tv == null) {
             a.S("mSideTkContainer");
          }
          tv.setAlpha(((float)1 - p0));
          if (!p0 - 0x3f800000) {
             this.S8();
          }else {
             this.W8();
          }
       }
       if (!PatchProxy.isSupport(thanosSideTK) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, thanosSideTK, "9")) {
          thanosSideTK = this.s;
          String str = "mProfileSideEventBus";
          if (thanosSideTK == null) {
             a.S(str);
          }
          a = thanosSideTK.a;
          ThanosSideTKPresenter ts = this.s;
          if (ts == null) {
             a.S(str);
          }
          int i = a - ts.e;
          ts = this.s;
          if (ts == null) {
             a.S(str);
          }
          i = i - ts.c;
          ts = this.s;
          if (ts == null) {
             a.S(str);
          }
          i = i - ts.g;
          Object[] objArray = new Object[0];
          j0.a("ThanosSideTKPresenter", "containerBottomMargin is "+i, objArray);
          float f = (float)(- i) * p0;
          ts = this.s;
          if (ts == null) {
             a.S(str);
          }
          if (ts.g == null) {
             float f1 = (float)ThanosSideTKPresenter.B;
             ts1 = this.s;
             if (ts1 == null) {
                a.S(str);
             }
             f = f - (f1 * (ts1.h - p0));
          }
          ts = this.v;
          if (ts == null) {
             a.S("mSideTkContainer");
          }
          ts.setTranslationY(f);
          ts = this.w;
          if (ts == null) {
             a.S("mSideShadowLayout");
          }
          ViewGroup$LayoutParams layoutParams = ts.getLayoutParams();
          if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
             layoutParams = null;
          }
          if (layoutParams != null) {
             layoutParams.topMargin = (int)f;
             thanosSideTK = this.s;
             if (thanosSideTK == null) {
                a.S(str);
             }
             if (thanosSideTK.g == null) {
                f = (float)ThanosSideTKPresenter.B * ((float)1 - p0);
                ts1 = this.s;
                if (ts1 == null) {
                   a.S(str);
                }
                layoutParams.bottomMargin = (int)(f * ts1.h);
             }
          }
          thanosSideTK = this.v;
          if (thanosSideTK == null) {
             a.S("mSideTkContainer");
          }
          thanosSideTK.setTranslationX(((p0 - (float)1) * (float)ThanosSideTKPresenter.C));
          StringBuilder str1 = "translationY is ";
          thanosSideTK = this.v;
          if (thanosSideTK == null) {
             a.S("mSideTkContainer");
          }
          str1 = str1+thanosSideTK.getTranslationY()+", translationX is ";
          thanosSideTK = this.v;
          if (thanosSideTK == null) {
             a.S("mSideTkContainer");
          }
          Object[] objArray1 = new Object[0];
          j0.a("ThanosSideTKPresenter", str1+thanosSideTK.getTranslationX(), objArray1);
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, ThanosSideTKPresenter.class, "5")) {
          return;
       }
       ThanosSideTKPresenter tv = this.v;
       if (tv == null) {
          a.S("mSideTkContainer");
       }
       n.Y(tv, 0, 0);
       tv = this.w;
       if (tv == null) {
          a.S("mSideShadowLayout");
       }
       n.Y(tv, 0, 0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosSideTKPresenter.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.thanos_side_tk_container);
       a.o(view, "ViewBindUtils.bindWidget¡­thanos_side_tk_container\)");
       this.v = view;
       p0 = m1.f(p0, R.id.side_tk_shadow);
       a.o(p0, "ViewBindUtils.bindWidget¡­iew, R.id.side_tk_shadow\)");
       this.w = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ThanosSideTKPresenter.class, "3")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.r8("NASA_SIDEBAR_STATUS");
       a.o(obj, "inject\(AccessIds.NASA_SIDEBAR_STATUS\)");
       this.r = obj;
       obj = this.q8(q.class);
       a.o(obj, "inject\(MilanoProfileSideEventBus::class.java\)");
       this.s = obj;
       obj = this.r8("DETAIL_HALF_H5_FRAGMENT_VISIBLE_PUBLISH");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­FRAGMENT_VISIBLE_PUBLISH\)");
       this.t = obj;
       obj = this.q8(u.class);
       a.o(obj, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.u = obj;
       return;
    }
}
