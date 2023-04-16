package com.yxcorp.gifshow.ad.detail.presenter.log.SlidePlayAdAroundInfoPresenter$mAroundInfoListener$2$a;
import qx.a;
import com.yxcorp.gifshow.ad.detail.presenter.log.SlidePlayAdAroundInfoPresenter$mAroundInfoListener$2;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.List;
import com.yxcorp.gifshow.ad.detail.presenter.log.SlidePlayAdAroundInfoPresenter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Number;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Integer;
import com.yxcorp.gifshow.detail.slideplay.b;
import java.util.ArrayList;

public final class SlidePlayAdAroundInfoPresenter$mAroundInfoListener$2$a implements a	// class@001656
{
    public final SlidePlayAdAroundInfoPresenter$mAroundInfoListener$2 a;

    public void SlidePlayAdAroundInfoPresenter$mAroundInfoListener$2$a(SlidePlayAdAroundInfoPresenter$mAroundInfoListener$2 p0){
       this.a = p0;
       super();
    }
    public List a(BaseFeed p0){
       int i;
       int i1;
       SlidePlayAdAroundInfoPresenter slidePlayAdA = SlidePlayAdAroundInfoPresenter.class;
       SlidePlayAdAroundInfoPresenter$mAroundInfoListener$2 obj = PatchProxy.applyOneRefs(p0, this, SlidePlayAdAroundInfoPresenter$mAroundInfoListener$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "feed");
       obj = this.a.this$0;
       Objects.requireNonNull(obj);
       Object[] objArray = null;
       SlidePlayAdAroundInfoPresenter slidePlayAdA1 = PatchProxy.apply(objArray, obj, slidePlayAdA, "2");
       String str = "mPhoto";
       if (slidePlayAdA1 != PatchProxyResult.class) {
       }else {
          slidePlayAdA1 = obj.p;
          if (slidePlayAdA1 == null) {
             a.S(str);
          }
       }
       if (a.g(slidePlayAdA1.mEntity, p0)) {
          SlidePlayAdAroundInfoPresenter$mAroundInfoListener$2 this$0 = this.a.this$0;
          Objects.requireNonNull(this$0);
          SlidePlayAdAroundInfoPresenter obj1 = PatchProxy.apply(objArray, this$0, slidePlayAdA, "9");
          if (obj1 != PatchProxyResult.class) {
             objArray = obj1;
          }else if(!this$0.P8()){
             obj1 = this$0.p;
             if (obj1 == null) {
                a.S(str);
             }
             ArrayList obj2 = PatchProxy.applyOneRefs(obj1, this$0, slidePlayAdA, "11");
             if (obj2 != PatchProxyResult.class) {
                i = obj2.intValue();
             }else {
                slidePlayAdA1 = this$0.t;
                if (slidePlayAdA1 != null) {
                   Integer integer = Integer.valueOf(slidePlayAdA1.R0(obj1));
                   a.m(integer);
                   i = integer.intValue();
                }else {
                   obj1 = this$0.s;
                   if (obj1 != null) {
                      a.m(obj1);
                      slidePlayAdA1 = this$0.p;
                      if (slidePlayAdA1 == null) {
                         a.S(str);
                      }
                      i = obj1.f(slidePlayAdA1);
                   }else {
                      i = -1;
                   }
                }
             }
             if (i >= 0) {
                obj2 = new ArrayList();
                if (i > 0) {
                   QPhoto qPhoto = this$0.w2((i - 1));
                   if (qPhoto != null && qPhoto.isVideoType()) {
                      obj2.add(qPhoto);
                   }
                }
                Object obj3 = PatchProxy.apply(objArray, this$0, slidePlayAdA, "13");
                if (obj3 != PatchProxyResult.class) {
                   i1 = obj3.intValue();
                }else {
                   slidePlayAdA = this$0.t;
                   if (slidePlayAdA != null) {
                      a.m(slidePlayAdA);
                      i1 = slidePlayAdA.L0();
                   }else {
                      slidePlayAdA = this$0.s;
                      if (slidePlayAdA != null) {
                         a.m(slidePlayAdA);
                         i1 = slidePlayAdA.e0().size();
                      }else {
                         i1 = 0;
                      }
                   }
                }
                if (i < (i1 - 1)) {
                   QPhoto qPhoto1 = this$0.w2((i + 1));
                   if (qPhoto1 != null && qPhoto1.isVideoType()) {
                      obj2.add(qPhoto1);
                   }
                }
                objArray = obj2;
             }
          }
       }
       return objArray;
    }
}
