package com.kuaishou.commercial.home.PhotoAdGapPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.home.PhotoAdGapPresenter$mAdGapInfoListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.Objects;
import qvb.i;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.photoad.g;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.commercial.home.PhotoAdGapPresenter$mAdGapInfoListener$2$a;
import java.util.Map;

public final class PhotoAdGapPresenter extends PresenterV2	// class@0014d0
{
    public BaseFragment p;
    public QPhoto q;
    public i r;
    public final p s;

    public void PhotoAdGapPresenter(){
       super();
       this.s = s.c(new PhotoAdGapPresenter$mAdGapInfoListener$2(this));
    }
    public void E8(){
       Map a;
       PhotoAdGapPresenter photoAdGapPr = PhotoAdGapPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, photoAdGapPr, "7")) {
          return;
       }
       PhotoAdGapPresenter tp = this.p;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       if (tp instanceof RecyclerFragment) {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          Objects.requireNonNull(tp, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.RecyclerFragment<com.yxcorp.gifshow.entity.QPhoto>");
          this.r = tp.q();
       }
       if (this.r != null) {
          tp = this.q;
          String str1 = "mPhoto";
          if (tp == null) {
             a.S(str1);
          }
          if (tp.isAd()) {
             tp = this.q;
             if (tp == null) {
                a.S(str1);
             }
             PhotoAdvertisement photoAdverti = k.B(tp);
             a.m(photoAdverti);
             if (photoAdverti.mShowReported == null) {
                tp = this.p;
                if (tp == null) {
                   a.S(str);
                }
                if (g.c(tp.f())) {
                   a = g.a;
                   a.o(a, "PhotoAdGapUtil.sAdGapInfoListenerMap");
                   PhotoAdGapPresenter tq = this.q;
                   if (tq == null) {
                      a.S(str1);
                   }
                   str = tq.getPhotoId();
                   PhotoAdGapPresenter$mAdGapInfoListener$2$a omAdGapInfoL = PatchProxy.apply(objArray, this, photoAdGapPr, "5");
                   if (omAdGapInfoL == PatchProxyResult.class) {
                      omAdGapInfoL = this.s.getValue();
                   }
                   a.put(str, omAdGapInfoL);
                }
             }
          }
       }
    label_008b :
       return;
    }
    public void J8(){
       Map a;
       if (PatchProxy.applyVoid(null, this, PhotoAdGapPresenter.class, "8")) {
          return;
       }
       PhotoAdGapPresenter tq = this.q;
       String str = "mPhoto";
       if (tq == null) {
          a.S(str);
       }
       if (tq.isAd()) {
          a = g.a;
          PhotoAdGapPresenter tq1 = this.q;
          if (tq1 == null) {
             a.S(str);
          }
          a.remove(tq1.getPhotoId());
       }
       return;
    }
    public final QPhoto P8(){
       PhotoAdGapPresenter obj = PatchProxy.apply(null, this, PhotoAdGapPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PhotoAdGapPresenter.class, "6")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(FRAGMENT\)");
       this.p = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       return;
    }
}
