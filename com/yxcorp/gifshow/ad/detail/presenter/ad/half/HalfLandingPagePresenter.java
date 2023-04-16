package com.yxcorp.gifshow.ad.detail.presenter.ad.half.HalfLandingPagePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.half.HalfLandingPagePresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.detail.presenter.ad.half.HalfLandingPagePresenter$mHalfLandingViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mxb.c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo;
import wkd.b;
import u49.c;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import sz8.a;
import sz8.b;
import erd.g;
import crd.b;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import v19.c;
import androidx.lifecycle.ViewModel;
import io.reactivex.subjects.PublishSubject;
import v19.g;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import com.yxcorp.gifshow.ad.detail.presenter.ad.half.HalfLandingPagePresenter$b;
import io.reactivex.internal.functions.Functions;
import bz8.o;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import n49.o;

public final class HalfLandingPagePresenter extends PresenterV2	// class@0015aa
{
    public QPhoto p;
    public BaseFragment q;
    public o r;
    public PhotoAdvertisement$HalfLandingPageInfo s;
    public final p t;
    public static final HalfLandingPagePresenter$a u;

    static {
       HalfLandingPagePresenter.u = new HalfLandingPagePresenter$a(null);
    }
    public void HalfLandingPagePresenter(){
       super();
       this.t = s.c(new HalfLandingPagePresenter$mHalfLandingViewModel$2(this));
    }
    public void E8(){
       boolean b;
       HalfLandingPagePresenter tq;
       HalfLandingPagePresenter halfLandingP = HalfLandingPagePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, halfLandingP, "11")) {
          return;
       }
       c a = c.a;
       HalfLandingPagePresenter tp = this.p;
       String str = "mPhoto";
       if (tp == null) {
          a.S(str);
       }
       if (!a.e(tp)) {
          return;
       }else {
          HalfLandingPagePresenter tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          PhotoAdvertisement photoAdverti = k.B(tp1);
          a.m(photoAdverti);
          a.o(photoAdverti, "CommercialFeedExt.getPhotoAd\(mPhoto\)!!");
          PhotoAdvertisement$AdData mHalfLanding = photoAdverti.getAdData().mHalfLandingPageInfo;
          a.o(mHalfLanding, "CommercialFeedExt.getPho¡­Data.mHalfLandingPageInfo");
          this.s = mHalfLanding;
          Object obj = PatchProxy.apply(objArray, this, halfLandingP, "12");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             tp1 = this.s;
             if (tp1 == null) {
                a.S("mHalfLandingPageInfo");
             }
             b = tp1.preLoad;
          }
          if (b != null && !PatchProxy.applyVoid(objArray, this, halfLandingP, "13")) {
             c uoc = b.a(0x3a268c29);
             tq = this.s;
             if (tq == null) {
                a.S("mHalfLandingPageInfo");
             }
             this.X7(uoc.C(tq.mSiteId).map(new e()).observeOn(d.a).subscribe(new a(this), b.b));
          }
          FragmentActivity activity = this.getActivity();
          if (activity != null) {
             PublishSubject publishSubje = ViewModelProviders.of(activity).get(c.class).o0();
             tq = this.q;
             if (tq == null) {
                a.S("mFragment");
             }
             this.X7(publishSubje.compose(tq.ge()).subscribe(new HalfLandingPagePresenter$b(this), Functions.d()));
          }
          return;
       }
    }
    public final PhotoAdvertisement$HalfLandingPageInfo P8(){
       HalfLandingPagePresenter obj = PatchProxy.apply(null, this, HalfLandingPagePresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("mHalfLandingPageInfo");
       }
       return obj;
    }
    public final o R8(){
       Object obj = PatchProxy.apply(null, this, HalfLandingPagePresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HalfLandingPagePresenter.class, "10")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.q8(o.class);
       a.o(obj, "inject\(PhotoAdActionBarClickProcessor::class.java\)");
       this.r = obj;
       return;
    }
}
