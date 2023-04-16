package com.yxcorp.gifshow.detail.nonslide.presenter.share.FansMotivateShareGuideBasePresenter;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.guide.ShareMyFeedGuideConfig;
import java.lang.reflect.Type;
import uhc.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.fans.bean.FansTopMotivateInfo;
import uw9.c;
import android.content.SharedPreferences;
import km8.b;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.FansMotivateShareGuideBasePresenter$GuideType;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.share.fans.util.FansSharePreference$GuideRecord;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import z2a.i;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.fans.util.FansSharePreference;
import java.util.Map;
import java.util.LinkedHashMap;
import com.kuaishou.android.model.mix.PhotoMeta;
import d3a.e;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import com.yxcorp.gifshow.widget.popup.a;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.a$c;
import z2a.h;
import k07.g;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.FansMotivateShareGuideBasePresenter$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import zhc.a;

public abstract class FansMotivateShareGuideBasePresenter extends k	// class@0015da
{
    public PhotoDetailParam H;
    public QPhoto I;
    public PhotoMeta J;
    public ShareMyFeedGuideConfig K;
    public FansTopMotivateInfo L;

    public void FansMotivateShareGuideBasePresenter(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FansMotivateShareGuideBasePresenter.class, "2")) {
          return;
       }
       super.E8();
       this.K = a.t().getValue("shareMyFeedGuideConfig", ShareMyFeedGuideConfig.class, new ShareMyFeedGuideConfig());
       Object[] objArray1 = PatchProxy.apply(objArray, objArray, a.class, "7");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          FansTopMotivateInfo uFansTopMoti = FansTopMotivateInfo.class;
          String str = c.a.getString("authorFansTopMotivateInfo", "null");
          if (str != null && str != "") {
             objArray = b.a(str, uFansTopMoti);
          }
          if (objArray != null) {
             objArray1 = objArray;
          }else {
             uFansTopMoti = new FansTopMotivateInfo();
          }
       }
       this.L = objArray1;
       return;
    }
    public void V8(){
       FansMotivateShareGuideBasePresenter uFansMotivat = FansMotivateShareGuideBasePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uFansMotivat, "3")) {
          return;
       }
       FansMotivateShareGuideBasePresenter$GuideType guideType = PatchProxy.apply(objArray, this, uFansMotivat, "5");
       if (guideType != PatchProxyResult.class) {
       }else {
          FansSharePreference$GuideRecord guideRecord = a.c(this.H.getPhoto().getPhotoId());
          int i = a.b();
          FansSharePreference$GuideRecord mPopGuideCou = guideRecord.mPopGuideCount;
          if (mPopGuideCou >= i && guideRecord.mBubbleShowed != null) {
             guideType = FansMotivateShareGuideBasePresenter$GuideType.NONE;
          }else if(mPopGuideCou < i){
             guideType = FansMotivateShareGuideBasePresenter$GuideType.POPUP_GUIDE;
          }else {
             guideType = FansMotivateShareGuideBasePresenter$GuideType.BUBBLE_GUIDE;
          }
       }
       if (guideType == FansMotivateShareGuideBasePresenter$GuideType.NONE) {
          return;
       }else {
          this.z = t.timer((long)this.K.mDelay, TimeUnit.SECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new i(this, guideType), Functions.d());
          return;
       }
    }
    public void W8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FansMotivateShareGuideBasePresenter.class, "6")) {
          return;
       }
       FansTopMotivateInfo guideTitle = this.L.guideTitle;
       View view = this.m8().findViewById(R.id.forward_button);
       if (!TextUtils.x(guideTitle) && view != null) {
          String photoId = this.H.mPhoto.getPhotoId();
          if (!PatchProxy.applyVoidOneRefs(photoId, objArray, a.class, "11")) {
             a.p(photoId, "photoId");
             Map map = c.h(FansSharePreference.b);
             if (map == null) {
                map = new LinkedHashMap();
             }
             FansSharePreference$GuideRecord guideRecord = map.get(photoId);
             if (guideRecord == null) {
                guideRecord = new FansSharePreference$GuideRecord();
             }
             guideRecord.mBubbleShowed = true;
             map.put(photoId, guideRecord);
             c.D(map);
          }
          FansMotivateShareGuideBasePresenter tJ = this.J;
          if (tJ != null) {
             PhotoMeta mRecoType = tJ.mRecoType;
             FansTopMotivateInfo textType = this.L.textType;
             QPhoto mEntity = this.H.mPhoto.mEntity;
             if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(mRecoType), guideTitle, Integer.valueOf(textType), mEntity, null, e.class, "4")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SHARE_BUBBLE";
                i3 oi3 = i3.f();
                oi3.c("reco_photo_type", Integer.valueOf(mRecoType));
                oi3.c("share_bubble_id", Integer.valueOf(textType));
                oi3.d("text", guideTitle);
                uElementPack.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.referPhotoPackage = w1.f(mEntity);
                u1.u0(7, uElementPack, uContentPack);
             }
          }
          a uoa = new a(this.getActivity());
          uoa.I0(0x2a53);
          uoa.K0(KwaiBubbleOption.f);
          uoa.F0(guideTitle);
          uoa.o0(view);
          uoa.t0(new h(view));
          uoa.T(3000);
          uoa.P(true);
          this.X8(uoa);
          this.Y8();
       }
       return;
    }
    public abstract void X8(a$c p0);
    public abstract void Y8();
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, FansMotivateShareGuideBasePresenter.class, "4")) {
          return;
       }
       if (this.r.booleanValue() || (this.C == null && !this.S8())) {
          FansMotivateShareGuideBasePresenter$a uoa = new FansMotivateShareGuideBasePresenter$a(this, this.getActivity(), this.H);
          this.q = uoa;
          uoa.f();
       }
    label_0031 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FansMotivateShareGuideBasePresenter.class, "1")) {
          return;
       }
       super.j8();
       this.H = this.q8(PhotoDetailParam.class);
       this.I = this.q8(QPhoto.class);
       this.J = this.q8(PhotoMeta.class);
       return;
    }
}
