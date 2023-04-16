package com.yxcorp.gifshow.ad.detail.presenter.ordered.AdBaseOrderedAppLabelPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ordered.AdBaseOrderedAppLabelPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.detail.presenter.ordered.AdBaseOrderedAppLabelPresenter$Companion$toastedPhotos$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.detail.presenter.ordered.AdBaseOrderedAppLabelPresenter$b;
import android.view.ViewGroup;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import android.view.View;
import g59.k0;
import android.app.Activity;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public abstract class AdBaseOrderedAppLabelPresenter extends PresenterV2	// class@00166b
{
    public QPhoto p;
    public BaseFragment q;
    public List r;
    public ViewGroup s;
    public SlidePlayViewModel t;
    public final a u;
    public static final p v;
    public static final AdBaseOrderedAppLabelPresenter$a w;

    static {
       AdBaseOrderedAppLabelPresenter.w = new AdBaseOrderedAppLabelPresenter$a(null);
       AdBaseOrderedAppLabelPresenter.v = s.c(AdBaseOrderedAppLabelPresenter$Companion$toastedPhotos$2.INSTANCE);
    }
    public void AdBaseOrderedAppLabelPresenter(){
       super();
       this.u = new AdBaseOrderedAppLabelPresenter$b(this);
    }
    public static final ViewGroup P8(AdBaseOrderedAppLabelPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("operateLayout");
       }
       return p0;
    }
    public void E8(){
       boolean b;
       AdBaseOrderedAppLabelPresenter uAdBaseOrder = AdBaseOrderedAppLabelPresenter.class;
       if (PatchProxy.applyVoid(null, this, uAdBaseOrder, "7")) {
          return;
       }
       AdBaseOrderedAppLabelPresenter tp = this.p;
       if (tp == null) {
          a.S("photo");
       }
       SlidePlayViewModel obj = PatchProxy.applyOneRefs(tp, this, uAdBaseOrder, "11");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          PhotoAdvertisement photoAdverti = k.B(tp);
          if (photoAdverti != null) {
             PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
             if (adData != null && adData.mIsOrderedApp == 1) {
                b = true;
             }
          }
          b = false;
       }
       if (!b) {
          return;
       }else {
          uAdBaseOrder = this.q;
          String str = "mBaseFragment";
          if (uAdBaseOrder == null) {
             a.S(str);
          }
          obj = SlidePlayViewModel.B0(uAdBaseOrder.getParentFragment());
          this.t = obj;
          if (obj != null) {
             if (obj != null) {
                AdBaseOrderedAppLabelPresenter tq = this.q;
                if (tq == null) {
                   a.S(str);
                }
                obj.P(tq, this.u);
             }
          }else {
             uAdBaseOrder = this.r;
             if (uAdBaseOrder != null) {
                uAdBaseOrder.add(this.u);
             }
          }
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, AdBaseOrderedAppLabelPresenter.class, "9")) {
          return;
       }
       AdBaseOrderedAppLabelPresenter ts = this.s;
       if (ts == null) {
          a.S("operateLayout");
       }
       k0.e(ts.findViewById(R.id.ad_ordered_app_label));
       return;
    }
    public abstract void R8(ViewGroup p0);
    public abstract void S8(Activity p0,ViewGroup p1);
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, AdBaseOrderedAppLabelPresenter.class, "8")) {
          return;
       }
       AdBaseOrderedAppLabelPresenter ts = this.s;
       if (ts == null) {
          a.S("operateLayout");
       }
       k0.e(ts.findViewById(R.id.ad_ordered_app_label));
       return;
    }
    public abstract int W8();
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdBaseOrderedAppLabelPresenter.class, "6")) {
          return;
       }
       p0 = m1.f(p0, this.W8());
       a.o(p0, "ViewBindUtils.bindWidget¡­tView, operateLayoutId\(\)\)");
       this.s = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AdBaseOrderedAppLabelPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       this.r = this.t8("DETAIL_ATTACH_LISTENERS");
       return;
    }
}
