package com.yxcorp.gifshow.ad.detail.presenter.ad.postback.SlideAdPostbackPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.postback.SlideAdPostbackPresenter$mAdGapInfoListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import az6.a;
import m09.c;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.detail.presenter.ad.postback.SlideAdPostbackPresenter$mAdGapInfoListener$2$a;
import java.util.Map;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public final class SlideAdPostbackPresenter extends PresenterV2	// class@001611
{
    public QPhoto p;
    public BaseFragment q;
    public PhotoDetailParam r;
    public final p s;

    public void SlideAdPostbackPresenter(){
       super();
       this.s = s.c(new SlideAdPostbackPresenter$mAdGapInfoListener$2(this));
    }
    public void E8(){
       SlideAdPostbackPresenter slideAdPostb = SlideAdPostbackPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, slideAdPostb, "3")) {
          return;
       }
       SlideAdPostbackPresenter tp = this.p;
       String str = "mPhoto";
       if (tp == null) {
          a.S(str);
       }
       if (tp.isAd()) {
          tp = this.r;
          String str1 = "mDetailParam";
          if (tp == null) {
             a.S(str1);
          }
          if (tp.mSource != 82) {
             tp = this.r;
             if (tp == null) {
                a.S(str1);
             }
             if (tp.mSource != 90) {
             label_0063 :
                return;
             }
          }
          ConcurrentHashMap uConcurrentH = c.c.b();
          SlideAdPostbackPresenter tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          str = tp1.getPhotoId();
          a.o(str, "mPhoto.photoId");
          SlideAdPostbackPresenter$mAdGapInfoListener$2$a omAdGapInfoL = PatchProxy.apply(objArray, this, slideAdPostb, "1");
          if (omAdGapInfoL == PatchProxyResult.class) {
             omAdGapInfoL = this.s.getValue();
          }
          uConcurrentH.put(str, omAdGapInfoL);
          goto label_0063 ;
       }else {
          goto label_0063 ;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SlideAdPostbackPresenter.class, "4")) {
          return;
       }
       SlideAdPostbackPresenter tp = this.p;
       String str = "mPhoto";
       if (tp == null) {
          a.S(str);
       }
       if (tp.isAd()) {
          ConcurrentHashMap uConcurrentH = c.c.b();
          SlideAdPostbackPresenter tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          uConcurrentH.remove(tp1.getPhotoId());
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SlideAdPostbackPresenter.class, "2")) {
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
