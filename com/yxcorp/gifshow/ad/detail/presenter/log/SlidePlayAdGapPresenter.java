package com.yxcorp.gifshow.ad.detail.presenter.log.SlidePlayAdGapPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.log.SlidePlayAdGapPresenter$mAdGapInfoListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import az6.a;
import com.yxcorp.gifshow.photoad.g;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.detail.presenter.log.SlidePlayAdGapPresenter$mAdGapInfoListener$2$a;
import java.util.Map;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public final class SlidePlayAdGapPresenter extends PresenterV2	// class@00165b
{
    public QPhoto p;
    public BaseFragment q;
    public PhotoDetailParam r;
    public f s;
    public SlidePlayViewModel t;
    public final p u;

    public void SlidePlayAdGapPresenter(){
       super();
       this.u = s.c(new SlidePlayAdGapPresenter$mAdGapInfoListener$2(this));
    }
    public void E8(){
       Map a;
       SlidePlayAdGapPresenter slidePlayAdG = SlidePlayAdGapPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, slidePlayAdG, "7")) {
          return;
       }
       SlidePlayAdGapPresenter tr = this.r;
       if (tr != null) {
          a.m(tr);
          if (g.c(tr.mSource)) {
             tr = this.q;
             if (tr == null) {
                a.S("mFragment");
             }
             SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tr.getParentFragment());
             this.t = slidePlayVie;
             if (slidePlayVie == null) {
                return;
             }else {
                tr = this.p;
                String str = "mPhoto";
                if (tr == null) {
                   a.S(str);
                }
                if (tr.isAd()) {
                   tr = this.p;
                   if (tr == null) {
                      a.S(str);
                   }
                   PhotoAdvertisement photoAdverti = k.B(tr);
                   a.m(photoAdverti);
                   if (photoAdverti.mHasAdGapReported == null) {
                      a = g.a;
                      a.o(a, "PhotoAdGapUtil.sAdGapInfoListenerMap");
                      SlidePlayAdGapPresenter tp = this.p;
                      if (tp == null) {
                         a.S(str);
                      }
                      str = tp.getPhotoId();
                      SlidePlayAdGapPresenter$mAdGapInfoListener$2$a omAdGapInfoL = PatchProxy.apply(objArray, this, slidePlayAdG, "5");
                      if (omAdGapInfoL == PatchProxyResult.class) {
                         omAdGapInfoL = this.u.getValue();
                      }
                      a.put(str, omAdGapInfoL);
                   }
                }
             }
          }
       }
       return;
    }
    public void J8(){
       Map a;
       if (PatchProxy.applyVoid(null, this, SlidePlayAdGapPresenter.class, "8")) {
          return;
       }
       SlidePlayAdGapPresenter tp = this.p;
       String str = "mPhoto";
       if (tp == null) {
          a.S(str);
       }
       if (tp.isAd()) {
          a = g.a;
          SlidePlayAdGapPresenter tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          a.remove(tp1.getPhotoId());
       }
       return;
    }
    public final QPhoto P8(){
       SlidePlayAdGapPresenter obj = PatchProxy.apply(null, this, SlidePlayAdGapPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAdGapPresenter.class, "6")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       this.s = this.w8("SLIDE_PLAY_FETCHER_ID");
       this.r = this.q8(PhotoDetailParam.class);
       return;
    }
}
