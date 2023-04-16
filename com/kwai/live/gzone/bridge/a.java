package com.kwai.live.gzone.bridge.a;
import y37.b;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import os5.k;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.gamezone.bridge.JsAddShortcutToDesktopParams;
import f55.g;
import a47.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import o56.a;
import com.yxcorp.gifshow.gamezone.bridge.JsAddShortcutToDesktopParams$Params;
import android.net.Uri;
import lnc.m9;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import com.kwai.yoda.function.FunctionResultParams;
import android.os.Bundle;
import brd.t;
import com.kwai.live.gzone.bridge.function.a;
import erd.o;
import brd.z;
import lrd.b;
import t45.d;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import sc4.a;
import erd.a;
import com.kwai.live.gzone.bridge.function.b;
import com.kwai.live.gzone.bridge.function.c;
import erd.g;
import crd.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.gamecenter.api.model.JsGamePlaySquareParam;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.gamezone.UtmSource;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import os5.l;
import com.kwai.live.gzone.bridge.function.LiveGzoneCompetationIdParam;
import f37.y;
import com.kwai.live.gzone.bridge.function.GzoneJsObtainOpenIdParams;
import android.content.Context;
import r4d.a;
import tid.b;
import com.kwai.live.gzone.bridge.a$e;
import n3d.a;
import java.lang.Integer;
import lnc.a1;
import com.kwai.live.gzone.bridge.function.GzoneJsObtainOpenIdResult;
import com.kwai.framework.model.user.QCurrentUser;
import f37.a;
import android.content.SharedPreferences;
import v67.a$e;
import com.kwai.live.gzone.bridge.a$c;
import com.kwai.live.gzone.bridge.a$b;
import v67.a;
import com.kwai.library.widget.popup.common.c;
import com.kwai.live.gzone.bridge.function.LiveGzoneThirdPlatformParams;
import com.kwai.live.gzone.bridge.function.e;
import ou5.b;
import com.kwai.emotionsdk.util.ActivityContext;
import a47.f;
import com.kwai.feature.api.social.login.model.LoginParams;
import n67.a;
import fg6.a;
import com.kwai.live.gzone.popup.bean.LiveGzoneCommonPrisePopupInfo;
import com.google.gson.Gson;
import com.kwai.live.gzone.bridge.a$f;
import m67.p;
import com.kwai.feature.api.platform.bridge.beans.JsPageWXMiniProgramParams;
import com.kwai.live.gzone.bridge.a$a;
import java.lang.Runnable;
import f37.o0;
import y37.a;
import com.kwai.live.gzone.bridge.function.LiveGzoneShowTaskRewardParam;
import com.kwai.live.gzone.bridge.a$d;

public class a implements b	// class@000c7c
{

    public void a(){
       super();
    }
    public void A6(Activity p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "13")) {
          return;
       }
       if (p1 != null) {
          d.a(-129360148).j30(p0, p1.mEntity, false);
       }
       return;
    }
    public void D7(Activity p0,JsAddShortcutToDesktopParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "5")) {
          return;
       }
       c uoc = new c();
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, uoc, c.class, "1") || (p1 == null || (p1.mParams != null && p0 instanceof GifshowActivity))) {
          Object obj = p0;
          Intent intent = new Intent();
          intent.setPackage(a.v);
          intent.setData(Uri.parse(p1.mParams.mScheme));
          intent.putExtra("game_tv_open_from_desktop", true);
          intent.setAction("android.intent.action.VIEW");
          intent.addCategory("android.intent.category.DEFAULT");
          JsAddShortcutToDesktopParams mParams = p1.mParams;
          if (!m9.e(mParams.mShortcutId, mParams.mTitle, intent, "GameGzoneAddShortcutToDesktopFunction")) {
             ProgressFragment progressFrag = PatchProxy.applyOneRefs(obj, uoc, c.class, "3");
             Bundle uBundle = null;
             if (progressFrag != PatchProxyResult.class) {
             }else {
                progressFrag = new ProgressFragment();
                if (progressFrag.isAdded()) {
                   progressFrag = uBundle;
                }else {
                   progressFrag.show(obj.getSupportFragmentManager(), "runner");
                }
             }
             if (progressFrag == null) {
                p2.a(-1, FunctionResultParams.createErrorResult(-1, "").mMessage, uBundle);
             }else {
                b uob = new b(uoc, obj, p1, intent, p2);
                t.just(progressFrag).flatMap(new a(uoc, p1)).subscribeOn(b.c()).observeOn(d.a).compose(c.c(obj.m(), ActivityEvent.DESTROY)).doFinally(new a(progressFrag)).subscribe(v7, new c(uoc, p2));
             }
          }else {
             b.Z(LiveLogTag.GZONE, "not show dialog because same name shortcut has been exist!!!");
             p2.onSuccess(FunctionResultParams.createSuccessResult());
          }
       }
       return;
    }
    public void I1(Activity p0,JsGamePlaySquareParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "10")) {
          return;
       }
       if (!p1.isValide()) {
          return;
       }
       int liveSourceTy = (!TextUtils.x(p1.mUtmSource))? UtmSource.fromText(p1.mUtmSource).getLiveSourceType(): UtmSource.external.getLiveSourceType();
       LiveAudienceParam$a uoa = new LiveAudienceParam$a();
       uoa.j(p1.mFeed);
       uoa.g(liveSourceTy);
       uoa.c(p1.mUtmSource);
       uoa.d(p1.feedIndex());
       uoa.h(p1.mUtmSource);
       d.a(-1492894991).m1(p0, uoa.a());
       return;
    }
    public void J0(Activity p0,LiveGzoneCompetationIdParam p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "15")) {
          return;
       }
       d.a(0x6fa7b5d6).Jv(p0, p1.mSelectedCompetionIds, p2);
       return;
    }
    public void Na(Activity p0,g p1,GzoneJsObtainOpenIdParams p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "6")) {
          return;
       }
       String str = null;
       int i = -1;
       if (TextUtils.n(p2.mPlatform, "wechat")) {
          i = 6;
          str = "weixin";
       }else if(TextUtils.n(p2.mPlatform, "qq")){
          i = 8;
          str = "qq2.0";
       }
       b.c0(LiveLogTag.GZONE, "GzoneBridgeModule", "platform", str);
       if (!TextUtils.x(str)) {
          a uoa = b.b(p0, str);
          if (uoa != null && uoa.isAvailable()) {
             uoa.login(p0, new a$e(this, p1, uoa, p2), i);
          }else {
             this.Oa(p1, 414, R.string.arg_RES_7f105019);
          }
       }else {
          this.Oa(p1, 412, R.string.arg_RES_7f105019);
       }
       return;
    }
    public void Oa(g p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "8")) {
          return;
       }
       b.e0(LiveLogTag.GZONE, "GzoneBridgeModule", "callback", p0, "errorCode", Integer.valueOf(p1), "errorMsg", Integer.valueOf(p2));
       p0.a(p1, a1.p(p2), null);
       return;
    }
    public void P9(Activity p0,LiveGzoneCompetationIdParam p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "14")) {
          return;
       }
       d.a(0x6fa7b5d6).oX(p0, p2);
       return;
    }
    public void Pa(a p0,GzoneJsObtainOpenIdParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "7")) {
          return;
       }
       GzoneJsObtainOpenIdResult gzoneJsObtai = new GzoneJsObtainOpenIdResult();
       gzoneJsObtai.mOpenId = p0.getOpenId();
       gzoneJsObtai.mKwaiId = QCurrentUser.me().getId();
       gzoneJsObtai.mAccessToken = p0.getToken();
       p2.onSuccess(gzoneJsObtai);
       return;
    }
    public void Q5(Activity p0,GzoneJsObtainOpenIdParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "3")) {
          return;
       }
       if (p1 != null && !TextUtils.x(p1.mPlatform)) {
          if (!p0 instanceof GifshowActivity) {
             return;
          }else if(a.a.getBoolean("isShowPersonalInfoAuthorizationPopup", true)){
             a$e uoe = new a$e(p0);
             uoe.I = new a$c(this, p2);
             uoe.J = new a$b(this, p0, p2, p1);
             new a(uoe).Z();
          }else {
             this.Na(p0, p2, p1);
          }
       }
       return;
    }
    public void S5(LiveGzoneThirdPlatformParams p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "12")) {
          return;
       }
       e uoe = new e();
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, uoe, e.class, "1")) {
          if (!QCurrentUser.me().isLogined()) {
             d.a(-1712118428).x00(ActivityContext.d().c(), 0, null, new f(uoe, p0, p1));
          }else {
             uoe.a(p0, p1);
          }
       }
       return;
    }
    public void U5(String p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "11")) {
          return;
       }
       a uoa = new a();
       uoa.a = a.a.h(p0, LiveGzoneCommonPrisePopupInfo.class).mLiveGzoneCommonPopupInfo;
       uoa.b = new a$f(this, p1);
       p.b().a(uoa);
       return;
    }
    public void Z0(Activity p0,JsPageWXMiniProgramParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       o0.c(p0, new a$a(this, p1));
       return;
    }
    public String getNameSpace(){
       return a.a(this);
    }
    public void w2(LiveGzoneShowTaskRewardParam p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       p0 = p0.prize;
       if (p0 == null) {
          p1.a(-1, "prize is null", null);
          return;
       }else {
          a uoa = new a();
          uoa.a = p0;
          uoa.b = new a$d(this, p1);
          p.b().a(uoa);
          return;
       }
    }
}
