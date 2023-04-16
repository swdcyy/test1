package com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter$g;
import erd.g;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter;
import java.lang.Object;
import ada.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;
import java.util.HashSet;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import com.yxcorp.gifshow.model.HotSurveyActionDetailSurvey;
import com.yxcorp.gifshow.model.d;
import dsa.e;
import q87.c;
import wkd.b;
import i89.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.CoverMeta;
import java.lang.Integer;
import com.kuaishou.android.model.mix.PhotoMeta;
import brd.t;
import cjd.e;
import erd.o;
import fua.b;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class HomeHotPhotoSurveyMaskBasePresenter$g implements g	// class@0017e4
{
    public final HomeHotPhotoSurveyMaskBasePresenter b;

    public void HomeHotPhotoSurveyMaskBasePresenter$g(HomeHotPhotoSurveyMaskBasePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray2;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotPhotoSurveyMaskBasePresenter$g.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          HomeHotPhotoSurveyMaskBasePresenter homeHotPhoto = HomeHotPhotoSurveyMaskBasePresenter.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, homeHotPhoto, "9") && p0.u != null) {
             HomeHotPhotoSurveyMaskBasePresenter p = p0.p;
             if (!p instanceof RecyclerFragment) {
                p = objArray;
             }
             if (p != null) {
                int i = 1;
                if (p.c1() == i) {
                   p = p0.p;
                   if (p != null) {
                      Lifecycle lifecycle = p.getLifecycle();
                      if (lifecycle != null) {
                         Lifecycle$State currentState = lifecycle.getCurrentState();
                         if (currentState != null && (currentState.isAtLeast(Lifecycle$State.RESUMED) == i && (p0.V8() == -1 || (!p0.V8() && (!p0.w.size() || (p0.V8() > 0 && p0.w.size() < p0.V8())))))) {
                            p = p0.q;
                            String str = "mFeed";
                            if (p == null) {
                               a.S(str);
                            }
                            if (!w.A0(p) && p0.v == null) {
                               if (!PatchProxy.applyVoid(objArray, p0, homeHotPhoto, "10")) {
                                  if (!p0.R8()) {
                                     homeHotPhoto = p0.q;
                                     if (homeHotPhoto == null) {
                                        a.S(str);
                                     }
                                     d.b(homeHotPhoto, objArray);
                                  }else {
                                     Object[] objArray1 = new Object[false];
                                     e.C().w("HomeHotPhotoCoverSurvey", "请求接口-展示问卷面板", objArray1);
                                     Object obj = b.a(-1106399741);
                                     homeHotPhoto = p0.r;
                                     String str1 = "mPhoto";
                                     if (homeHotPhoto == null) {
                                        a.S(str1);
                                     }
                                     String photoId = homeHotPhoto.getPhotoId();
                                     homeHotPhoto = p0.r;
                                     if (homeHotPhoto == null) {
                                        a.S(str1);
                                     }
                                     String expTag = homeHotPhoto.getExpTag();
                                     homeHotPhoto = p0.s;
                                     Integer integer = (homeHotPhoto != null)? Integer.valueOf(homeHotPhoto.mWidth): objArray;
                                     String str2 = String.valueOf(integer);
                                     homeHotPhoto = p0.s;
                                     integer = (homeHotPhoto != null)? Integer.valueOf(homeHotPhoto.mHeight): objArray;
                                     String str3 = String.valueOf(integer);
                                     homeHotPhoto = p0.r;
                                     if (homeHotPhoto == null) {
                                        a.S(str1);
                                     }
                                     PhotoMeta photoMeta = homeHotPhoto.getPhotoMeta();
                                     integer = (photoMeta != null)? Integer.valueOf(photoMeta.mActionSurveyType): objArray;
                                     String str4 = String.valueOf(integer);
                                     homeHotPhoto = p0.r;
                                     if (homeHotPhoto == null) {
                                        a.S(str1);
                                     }
                                     photoMeta = homeHotPhoto.getPhotoMeta();
                                     if (photoMeta != null) {
                                        objArray = photoMeta.mSelectionSurveyId;
                                     }
                                     p0.X7(obj.e("PLAY", "FINISH", photoId, expTag, str2, str3, str4, String.valueOf(objArray)).map(new e()).subscribe(new b(p0)));
                                  }
                               }
                               p0.u = false;
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    label_0149 :
       return;
    }
}
