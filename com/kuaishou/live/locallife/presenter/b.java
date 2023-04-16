package com.kuaishou.live.locallife.presenter.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.locallife.presenter.f;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import da6.c;
import com.kwai.framework.model.ExtendableModelMap;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import nl9.r;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.locallife.model.LocalLifeLiveIconMessage;
import com.kuaishou.live.locallife.model.MessageButton;
import gf3.b;
import com.kuaishou.locallife.log.biz.LocalLifeLiveLogBiz;
import mr3.b;
import lr3.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import va1.b0;
import ym5.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import t02.a0;
import k2b.e0;
import z12.x;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import xe3.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import com.kwai.framework.model.tuna.button.ActionParams;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kwai.framework.model.tuna.button.JumpUrlModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import va1.s0;
import com.kwai.framework.model.user.QCurrentUser;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import ff3.n;
import android.content.Context;
import n3d.a;
import a87.c;
import vq5.d;
import xx5.a;
import java.util.Map;

public final class b implements View$OnClickListener	// class@000c4a
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       TunaButtonModel mActionParam;
       ActionParams mJumpUrlMode;
       JumpUrlModel mKrnUrl;
       ActionParams mJumpUrlMode1;
       b b = this.b;
       Objects.requireNonNull(b);
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, uof, "9")) {
       }else {
          f p = b.P;
          if (p instanceof c) {
             p.getExtraMap().putExtra("needAltData", Boolean.TRUE);
          }
          d.a(0x691527a8).ck(b.P, 1, 0, 2, 0);
          int i = 1;
          if (!PatchProxy.applyVoid(objArray, b, uof, "21")) {
             String str2 = PatchProxy.apply(objArray, b, uof, "20");
             if (str2 != PatchProxyResult.class) {
             }else {
                LocalLifeLiveIconMessage localLifeLiv1 = b.b9();
                if (localLifeLiv1 != null) {
                   MessageButton activeButton = localLifeLiv1.getActiveButton();
                   if (activeButton != null) {
                      if (activeButton.getButtonType() == i) {
                         str2 = "10003";
                      }else if(activeButton.getButtonType() == 2){
                         str2 = "10004";
                      }
                   }
                }
                str2 = "";
             }
             b.b("local_life_d_biz_id", str2);
             b.a("local_life_c_live_bottom_button_click");
          }
          if (b.U == null) {
             b.f(LocalLifeLiveLogBiz.LIVE_ROOM, "LiveAudienceLocalLifeBottomBarPresenter", "button model is empty");
          }else if(PatchProxy.applyVoid(objArray, b, uof, "10")){
             Activity activity = b.getActivity();
             if (activity != null) {
                if (b0.a() && !d.a(0x4c5dd1b8).f2()) {
                   activity.setRequestedOrientation(i);
                }
                if (b.U != null) {
                   if (b.b9() != null) {
                      ClientContent$LiveStreamPackage liveStreamPa = b.K.a();
                      LocalLifeLiveIconMessage localLifeLiv = b.b9();
                      e0 uoe0 = x.l(b.L);
                      FeedLogCtx uFeedLogCtx = b.L.c0();
                      FeedLogCtx uFeedLogCtx1 = uFeedLogCtx;
                      FeedLogCtx uFeedLogCtx2 = uFeedLogCtx;
                      if (!PatchProxy.applyVoidFourRefs(liveStreamPa, localLifeLiv, uoe0, uFeedLogCtx1, null, d.class, "6")) {
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "LOCALLIFE_LIVE_USER_GOODS_ENTRANCE_BUTTON";
                         HashMap hashMap = new HashMap();
                         if (localLifeLiv.getActiveButton() != null) {
                            hashMap.put("button_type", String.valueOf(localLifeLiv.getActiveButton().getButtonType()));
                         }
                         hashMap.put("statistics_info", localLifeLiv.getStatisticsInfo());
                         uElementPack.params = a.a.q(hashMap);
                         ClientContent$KsOrderInfoPackage ksOrderInfoP = new ClientContent$KsOrderInfoPackage();
                         ksOrderInfoP.ksOrderId = localLifeLiv.getKsOrderId();
                         ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                         uContentPack.ksOrderInfoPackage = ksOrderInfoP;
                         uContentPack.liveStreamPackage = liveStreamPa;
                         u1.B(new ClickMetaData().setType(i).setLogPage(uoe0).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(uFeedLogCtx2));
                      }
                   }
                   f u = b.U;
                   if (!PatchProxy.applyVoidOneRefs(u, b, uof, "12") && u != null) {
                      mActionParam = u.mActionParams;
                      if (mActionParam != null && mActionParam.mJumpUrlModel != null) {
                         PhotoAdvertisement photoAdverti = b.P.get("AD");
                         String str = "fansTopAttributeParams";
                         String str1 = "identity";
                         if (!TextUtils.x(u.mActionParams.mJumpUrlModel.mUrl)) {
                            if (photoAdverti != null) {
                               mJumpUrlMode1 = u.mActionParams.mJumpUrlModel;
                               mJumpUrlMode1.mUrl = s0.c(mJumpUrlMode1.mUrl, str, photoAdverti.mFansTopAttributeParams);
                            }
                            if (!s0.e(u.mActionParams.mJumpUrlModel.mUrl, str1) && !TextUtils.x(b.K.getLiveStreamId())) {
                               mJumpUrlMode1 = u.mActionParams.mJumpUrlModel;
                               mJumpUrlMode1.mUrl = s0.c(mJumpUrlMode1.mUrl, str1, b.K.getLiveStreamId());
                            }
                         }
                      label_01b8 :
                         if (!TextUtils.x(u.mActionParams.mJumpUrlModel.mKrnUrl)) {
                            if (photoAdverti != null) {
                               mJumpUrlMode1 = u.mActionParams.mJumpUrlModel;
                               mJumpUrlMode1.mKrnUrl = s0.c(mJumpUrlMode1.mKrnUrl, str, photoAdverti.mFansTopAttributeParams);
                            }
                            if (!s0.e(u.mActionParams.mJumpUrlModel.mKrnUrl, str1) && !TextUtils.x(b.K.getLiveStreamId())) {
                               mJumpUrlMode = u.mActionParams.mJumpUrlModel;
                               mJumpUrlMode.mKrnUrl = s0.c(mJumpUrlMode.mKrnUrl, str1, b.K.getLiveStreamId());
                            }
                         }
                      label_01fe :
                         mJumpUrlMode = u.mActionParams.mJumpUrlModel;
                         mJumpUrlMode.setHideHalfScreenMask(mJumpUrlMode.getIsHiddenHalfScreenMask(i));
                      }
                   }
                   JumpUrlModel.setWebThemType(b.U.mActionParams, "11");
                   mActionParam = b.U.mActionParams;
                   if (mActionParam != null) {
                      mJumpUrlMode = mActionParam.mJumpUrlModel;
                      if (mJumpUrlMode != null) {
                         mKrnUrl = mJumpUrlMode.mKrnUrl;
                         if (TextUtils.x(mKrnUrl)) {
                            mKrnUrl = b.U.mActionParams.mJumpUrlModel.mUrl;
                         }
                      }else {
                      label_022d :
                         mKrnUrl = null;
                      }
                   }else {
                      goto label_022d ;
                   }
                   if (!QCurrentUser.ME.isLogined()) {
                      LoginParams$a uoa = new LoginParams$a();
                      uoa.d(a1.p(R.string.arg_RES_7f103078));
                      d.a(-1712118428).x00(b.getActivity(), 0, uoa.a(), new n(b, mKrnUrl, activity));
                   }else if(!TextUtils.x(mKrnUrl) && c.a(mKrnUrl)){
                      u = b.M;
                      if (u != null) {
                         u.r4(mKrnUrl, activity);
                      }
                   }
                   b.a9(d.a(0x17b84847).u7(b.Q, b.U));
                }
             }
          }
          b.e9("AudienceLiveTuanBottomBarClick", null);
       }
       return;
    }
}
