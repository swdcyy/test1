package com.yxcorp.gifshow.ad.detail.presenter.log.SlidePlayAdAroundInfoPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.log.SlidePlayAdAroundInfoPresenter$mAroundInfoListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import tw.g;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.detail.presenter.log.SlidePlayAdAroundInfoPresenter$mAroundInfoListener$2$a;
import java.util.Map;
import java.lang.Boolean;
import im8.f;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Integer;

public final class SlidePlayAdAroundInfoPresenter extends PresenterV2	// class@001658
{
    public QPhoto p;
    public BaseFragment q;
    public f r;
    public b s;
    public SlidePlayViewModel t;
    public final p u;

    public void SlidePlayAdAroundInfoPresenter(){
       super();
       this.u = s.c(new SlidePlayAdAroundInfoPresenter$mAroundInfoListener$2(this));
    }
    public void E8(){
       Map a;
       SlidePlayAdAroundInfoPresenter slidePlayAdA = SlidePlayAdAroundInfoPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, slidePlayAdA, "7")) {
          return;
       }
       SlidePlayAdAroundInfoPresenter tq = this.q;
       if (tq == null) {
          a.S("mFragment");
       }
       this.t = SlidePlayViewModel.B0(tq.getParentFragment());
       if (!this.P8()) {
          return;
       }else {
          tq = this.p;
          String str = "mPhoto";
          if (tq == null) {
             a.S(str);
          }
          if (tq.isAd()) {
             a = g.a;
             SlidePlayAdAroundInfoPresenter tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             str = tp.getPhotoId();
             SlidePlayAdAroundInfoPresenter$mAroundInfoListener$2$a omAroundInfo = PatchProxy.apply(objArray, this, slidePlayAdA, "6");
             if (omAroundInfo == PatchProxyResult.class) {
                omAroundInfo = this.u.getValue();
             }
             a.put(str, omAroundInfo);
          }
          return;
       }
    }
    public void J8(){
       Map a;
       if (PatchProxy.applyVoid(null, this, SlidePlayAdAroundInfoPresenter.class, "8")) {
          return;
       }
       SlidePlayAdAroundInfoPresenter tp = this.p;
       String str = "mPhoto";
       if (tp == null) {
          a.S(str);
       }
       if (tp.isAd()) {
          a = g.a;
          SlidePlayAdAroundInfoPresenter tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          a.remove(tp1.getPhotoId());
       }
       return;
    }
    public final boolean P8(){
       Object[] objArray = null;
       SlidePlayAdAroundInfoPresenter obj = PatchProxy.apply(objArray, this, SlidePlayAdAroundInfoPresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.t != null) {
          return true;
       }
       obj = this.r;
       if (obj != null) {
          objArray = obj.get();
       }
       b uob = b.e(objArray);
       this.s = uob;
       if (uob == null) {
          return false;
       }else {
          return true;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAdAroundInfoPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       this.r = this.w8("SLIDE_PLAY_FETCHER_ID");
       return;
    }
    public final QPhoto w2(int p0){
       SlidePlayAdAroundInfoPresenter slidePlayAdA = SlidePlayAdAroundInfoPresenter.class;
       if (PatchProxy.isSupport(slidePlayAdA)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, slidePlayAdA, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       slidePlayAdA = this.t;
       if (slidePlayAdA != null) {
          a.m(slidePlayAdA);
          return slidePlayAdA.c1(p0);
       }else {
          slidePlayAdA = this.s;
          if (slidePlayAdA != null) {
             a.m(slidePlayAdA);
             return slidePlayAdA.w2(p0);
          }else {
             return null;
          }
       }
    }
}
