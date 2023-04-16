package com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter$a;
import nsd.u;
import java.util.HashSet;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter$mCountThresholdWithDetailPageSlide$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter$f;
import com.yxcorp.gifshow.model.EventTrackType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.HotSurveyActionDetailSurvey;
import com.yxcorp.gifshow.model.d;
import java.lang.CharSequence;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.util.rx.RxBus;
import ada.c;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter$g;
import erd.g;
import crd.b;
import lnc.u1;
import wkd.b;
import l66.a;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter$b;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter$c;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter$d;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter$e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.r1;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.ViewGroup;
import dsa.e;
import java.lang.Enum;
import q87.c;
import i89.a;
import java.lang.Integer;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter$h;
import com.kuaishou.android.model.mix.CoverMeta;
import e17.i;
import jsa.d;
import dda.d;
import m66.a;
import e6a.b;
import androidx.fragment.app.Fragment;

public abstract class HomeHotPhotoSurveyMaskBasePresenter extends PresenterV2	// class@0017e7
{
    public BaseFragment p;
    public BaseFeed q;
    public QPhoto r;
    public CoverMeta s;
    public ViewGroup t;
    public boolean u;
    public boolean v;
    public HashSet w;
    public HotSurveyActionDetailSurvey x;
    public final p y;
    public final Runnable z;
    public static final HomeHotPhotoSurveyMaskBasePresenter$a A;

    static {
       HomeHotPhotoSurveyMaskBasePresenter.A = new HomeHotPhotoSurveyMaskBasePresenter$a(null);
    }
    public void HomeHotPhotoSurveyMaskBasePresenter(){
       super();
       this.w = new HashSet();
       this.y = s.c(HomeHotPhotoSurveyMaskBasePresenter$mCountThresholdWithDetailPageSlide$2.INSTANCE);
       this.z = new HomeHotPhotoSurveyMaskBasePresenter$f(this);
    }
    public static void e9(HomeHotPhotoSurveyMaskBasePresenter p0,EventTrackType p1,String p2,String p3,int p4,Object p5){
       p0.d9(p1, null, null);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeHotPhotoSurveyMaskBasePresenter.class, "7")) {
          return;
       }
       boolean b = false;
       if (!this.S8()) {
          this.a9(b);
          return;
       }else {
          HomeHotPhotoSurveyMaskBasePresenter tq = this.q;
          if (tq == null) {
             a.S("mFeed");
          }
          HotSurveyActionDetailSurvey hotSurveyAct = d.a(tq);
          if (hotSurveyAct != null) {
             objArray = hotSurveyAct.getMSurveyId();
          }
          RxBus rxBus = (objArray == null || !objArray.length())? 1: null;
          if (rxBus) {
             this.a9(b);
          }else {
             k1.o(this.z);
          }
          this.X7(RxBus.f.g(c.class, RxBus$ThreadMode.MAIN).subscribe(new HomeHotPhotoSurveyMaskBasePresenter$g(this)));
          u1.a(this);
          b.a(0x6d2a4fdd).a(this);
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, HomeHotPhotoSurveyMaskBasePresenter.class, "18")) {
          return;
       }
       k1.m(this.z);
       u1.b(this);
       b.a(0x6d2a4fdd).c(this);
       return;
    }
    public final void P8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotPhotoSurveyMaskBasePresenter.class, "11")) {
          return;
       }
       View$OnClickListener onClickListe = null;
       if (p0 != null) {
          p0.setOnClickListener(onClickListe);
       }
       if (p0 != null) {
          p0.setOnLongClickListener(onClickListe);
       }
       View view = (p0 != null)? p0.findViewById(R.id.img_close): onClickListe;
       View view1 = (p0 != null)? p0.findViewById(R.id.satisfy_btn): onClickListe;
       View view2 = (p0 != null)? p0.findViewById(R.id.dissatisfied_btn): onClickListe;
       if (p0 != null) {
          onClickListe = p0.findViewById(R.id.notsure_btn);
       }
       if (view != null) {
          view.setOnClickListener(new HomeHotPhotoSurveyMaskBasePresenter$b(this));
       }
       if (view1 != null) {
          view1.setOnClickListener(new HomeHotPhotoSurveyMaskBasePresenter$c(this));
       }
       if (view2 != null) {
          view2.setOnClickListener(new HomeHotPhotoSurveyMaskBasePresenter$d(this));
       }
       if (onClickListe != null) {
          onClickListe.setOnClickListener(new HomeHotPhotoSurveyMaskBasePresenter$e(this));
       }
       return;
    }
    public boolean R8(){
       return true;
    }
    public boolean S8(){
       boolean b;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HomeHotPhotoSurveyMaskBasePresenter homeHotPhoto = HomeHotPhotoSurveyMaskBasePresenter.class;
       Object[] objArray = null;
       HomeHotPhotoSurveyMaskBasePresenter obj = PatchProxy.apply(objArray, this, homeHotPhoto, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.r;
       if (obj == null) {
          a.S("mPhoto");
       }
       if (!r1.z2(obj)) {
          obj = this.r;
          if (obj == null) {
             a.S("mPhoto");
          }
          Object obj1 = PatchProxy.applyOneRefs(obj, this, homeHotPhoto, "17");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(obj.isAd()){
             PhotoAdvertisement photoAdverti = k.B(obj);
             photoAdverti = (photoAdverti != null)? photoAdverti.mAdGroup: objArray;
             if (photoAdverti != PhotoAdvertisement$AdGroup.FANS_TOP && photoAdverti != PhotoAdvertisement$AdGroup.AD_MERCHANT) {
                b = true;
             }
          }
       label_0055 :
          b = false;
          if (!b) {
             HomeHotPhotoSurveyMaskBasePresenter tr = this.r;
             if (tr == null) {
                a.S("mPhoto");
             }
             if (!tr.isLiveStream()) {
                tr = this.r;
                if (tr == null) {
                   a.S("mPhoto");
                }
                if (!tr.isVideoType()) {
                   tr = this.r;
                   if (tr == null) {
                      a.S("mPhoto");
                   }
                   if (!tr.isImageType()) {
                      return false;
                   }
                }
                tr = this.r;
                if (tr == null) {
                   a.S("mPhoto");
                }
                PhotoMeta photoMeta = tr.getPhotoMeta();
                if (photoMeta != null && photoMeta.mNeedActionSurvey == true) {
                   tr = this.r;
                   if (tr == null) {
                      a.S("mPhoto");
                   }
                   photoMeta = tr.getPhotoMeta();
                   if (photoMeta != null && photoMeta.mActionSurveyType == 8) {
                      tr = this.r;
                      if (tr == null) {
                         a.S("mPhoto");
                      }
                      photoMeta = tr.getPhotoMeta();
                      if (photoMeta != null) {
                         objArray = photoMeta.mSelectionSurveyId;
                      }
                      photoMeta = (objArray == null || !objArray.length())? 1: 0;
                      if (photoMeta) {
                         return false;
                      }else {
                         return true;
                      }
                   }
                }
             }
          }
       }
    label_00c6 :
       return false;
    }
    public final int V8(){
       Object obj = PatchProxy.apply(null, this, HomeHotPhotoSurveyMaskBasePresenter.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = this.y.getValue();
       }
       return obj.intValue();
    }
    public final BaseFeed W8(){
       HomeHotPhotoSurveyMaskBasePresenter obj = PatchProxy.apply(null, this, HomeHotPhotoSurveyMaskBasePresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mFeed");
       }
       return obj;
    }
    public final BaseFragment X8(){
       return this.p;
    }
    public final QPhoto Y8(){
       HomeHotPhotoSurveyMaskBasePresenter obj = PatchProxy.apply(null, this, HomeHotPhotoSurveyMaskBasePresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public final ViewGroup Z8(){
       return this.t;
    }
    public abstract void a9(boolean p0);
    public abstract void b9(String p0);
    public abstract void c9(boolean p0);
    public final void d9(EventTrackType p0,String p1,String p2){
       HomeHotPhotoSurveyMaskBasePresenter homeHotPhoto = this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, HomeHotPhotoSurveyMaskBasePresenter.class, "12")) {
          return;
       }
       a.p(p0, "eventTrackType");
       Object[] objArray = new Object[0];
       e.C().w("HomeHotPhotoCoverSurvey", p0.name(), objArray);
       Object obj = b.a(-1106399741);
       HomeHotPhotoSurveyMaskBasePresenter r = homeHotPhoto.r;
       if (r == null) {
          a.S("mPhoto");
       }
       PhotoMeta photoMeta = r.getPhotoMeta();
       Integer objArray1 = null;
       PhotoMeta photoMeta1 = (photoMeta != null)? photoMeta.mSelectionSurveyId: objArray1;
       String str = String.valueOf(p1);
       r = homeHotPhoto.r;
       if (r == null) {
          a.S("mPhoto");
       }
       String photoId = r.getPhotoId();
       r = homeHotPhoto.r;
       if (r == null) {
          a.S("mPhoto");
       }
       String expTag = r.getExpTag();
       String str1 = String.valueOf(p0.getType());
       r = homeHotPhoto.x;
       String str2 = (r != null)? r.getMSurveyInfoId(): objArray1;
       r = homeHotPhoto.r;
       if (r == null) {
          a.S("mPhoto");
       }
       photoMeta = r.getPhotoMeta();
       if (photoMeta != null) {
          objArray1 = Integer.valueOf(photoMeta.mActionSurveyType);
       }
       obj.c(photoMeta1, str, "PLAY", "FINISH", photoId, expTag, "", str1, "", p2, str2, String.valueOf(objArray1)).subscribe(HomeHotPhotoSurveyMaskBasePresenter$h.b);
       return;
    }
    public final void h9(ViewGroup p0){
       this.t = p0;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HomeHotPhotoSurveyMaskBasePresenter.class, "6")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       Object obj = this.r8("feed");
       a.o(obj, "inject\(FeedFieldConst.FEED\)");
       this.q = obj;
       this.s = this.q8(CoverMeta.class);
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       return;
    }
    public final void j9(){
       if (PatchProxy.applyVoid(null, this, HomeHotPhotoSurveyMaskBasePresenter.class, "16")) {
          return;
       }
       i.a(R.style.arg_RES_7f110668, 0x7f1038db);
       return;
    }
    public final void onFeedSearchCardPopupShowEvent(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotPhotoSurveyMaskBasePresenter.class, "13")) {
          return;
       }
       a.p(p0, "event");
       this.v = true;
       return;
    }
    public final void onPhotoClickedEvent(d p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotPhotoSurveyMaskBasePresenter.class, "15")) {
          return;
       }
       a.p(p0, "event");
       HomeHotPhotoSurveyMaskBasePresenter tr = this.r;
       if (tr == null) {
          a.S("mPhoto");
       }
       a = p0.a;
       a.o(a, "event.mModel");
       boolean b = false;
       if (a.g(tr.getPhotoId(), a.getId())) {
          this.v = b;
          HomeHotPhotoSurveyMaskBasePresenter tq = this.q;
          if (tq == null) {
             a.S("mFeed");
          }
          d.b(tq, new HotSurveyActionDetailSurvey());
          this.u = true;
          this.w.clear();
       }else {
          this.a9(b);
       }
       return;
    }
    public final void onSlidePlayPositionChangeEvent(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotPhotoSurveyMaskBasePresenter.class, "14")) {
          return;
       }
       a.p(p0, "event");
       if (this.u != null) {
          HomeHotPhotoSurveyMaskBasePresenter tp = this.p;
          if (tp != null && tp.hashCode() == p0.a) {
             p0 = p0.b;
             a.o(p0, "event.mPhoto");
             this.w.add(p0.getPhotoId());
          }
       }
       return;
    }
}
