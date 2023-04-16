package com.kuaishou.live.core.show.showprofile.a;
import im8.g;
import k51.c;
import java.util.ArrayList;
import com.kuaishou.live.core.show.showprofile.a$a;
import wj2.j;
import wj2.i;
import wj2.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedCacheManager;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveProfileConfig;
import java.lang.reflect.Type;
import wg3.a;
import t02.a0;
import mq5.h;
import mq5.b;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatUserApplyOpened;
import lf3.g;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatUserApplyClosed;
import wj2.k;
import vq5.b;
import vq5.d;
import um2.a;
import wj2.l;
import erd.g;
import crd.b;
import eoc.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.List;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import tx1.b;
import com.kuaishou.live.gzone.v2.profile.LiveGzoneProfileParams;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService;
import lp3.c;
import lp3.i;
import xd1.c;
import co2.f2;
import co2.i0;
import p91.m;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.live.core.basic.utils.e;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.kwai.framework.model.user.QCurrentUser;
import bb1.o;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import yx2.r;
import jk1.f;
import lp3.e;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tx1.d;
import wj2.m0;
import android.os.Bundle;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import mb1.c;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import ry1.b;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse$LiveDisplayAnonymousInfo;
import kotlin.jvm.internal.a;
import e17.i;
import com.kuaishou.live.core.basic.activity.x;
import wj2.r0;
import com.kuaishou.live.core.basic.utils.LiveWidgetVisibilityStatusService;
import com.kuaishou.live.core.basic.utils.LiveWidgetVisibilityStatusService$AudienceWidget;
import com.kuaishou.live.core.basic.utils.LiveWidgetVisibilityStatusService$a;
import b61.a;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import com.kuaishou.live.core.show.profilecard.LiveProfileFragmentV2;
import t02.r1;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse$LiveChatUserStatus;
import ne2.b;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import com.kuaishou.live.core.show.chat.model.LiveAudienceChatStatConfig;
import bb1.a;
import com.kuaishou.live.core.show.showprofile.a$b;
import wj2.o0;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import ne2.k;
import wj2.g;
import ok.x;
import com.kuaishou.live.core.show.showprofile.a$c;
import wj2.n0;
import com.kuaishou.live.core.show.showprofile.a$d;
import androidx.fragment.app.c;
import com.kuaishou.live.core.show.showprofile.a$e;
import android.content.DialogInterface$OnDismissListener;
import android.view.View;
import wj2.f;
import android.view.View$OnClickListener;
import ekd.m1;
import wj2.q;
import java.util.Map;
import java.util.HashMap;
import wj2.e;

public class a extends c implements g	// class@00101f
{
    public final h A;
    public final g B;
    public final g C;
    public a0 p;
    public LiveBizParam q;
    public e r;
    public final List s;
    public LiveProfileFeedCacheManager t;
    public d u;
    public i v;
    public b w;
    public boolean x;
    public int y;
    public r0 z;
    public static String sLivePresenterClassName = "LiveAudienceProfilePresenter";

    public void a(){
       super();
       this.s = new ArrayList();
       this.y = 0;
       this.z = new a$a(this);
       this.A = new j(this);
       this.B = new i(this);
       this.C = new h(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.t = new LiveProfileFeedCacheManager(a.D(LiveConfigStartupResponse$LiveProfileConfig.class).mLiveProfileMaxCacheUserProductCount);
       this.p.D2.Km(this.A);
       this.p.C.u0(328, LiveStreamMessages$SCLiveChatUserApplyOpened.class, this.B);
       this.p.C.u0(329, LiveStreamMessages$SCLiveChatUserApplyClosed.class, this.C);
       this.u.t5("profile", new k(this));
       this.X7(f.a(a.class, new l(this)));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "4")) {
          return;
       }
       this.t = objArray;
       this.p.D2.le(this.A);
       this.u.Z4("profile");
       this.s.clear();
       this.p.C.o(328, this.B);
       this.p.C.o(329, this.C);
       return;
    }
    public LiveGzoneProfileParams P8(UserProfile p0,LiveStreamClickType p1,int p2,String p3,int p4,boolean p5,LiveFollowExtParams p6,b p7){
       UserInfo obj;
       boolean b1;
       a uoa = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p6;
       object oobject3 = p7;
       a uoa1 = a.class;
       int i = 0;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),p3,Integer.valueOf(p4),Boolean.valueOf(p5),oobject2,oobject3};
          obj = PatchProxy.apply(objArray, this, uoa1, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = oobject.mProfile.mId;
       c uoc = uoa.v.a(LiveAudienceChatService.class).p();
       a0 a1 = uoa.p.a1;
       boolean b = (a1 != null && a1.r0().H())? true: false;
       LiveGzoneProfileParams liveGzonePro = new LiveGzoneProfileParams();
       LiveProfileParams liveProfileP = liveGzonePro.setLiveBasicContext(uoa.p.Z2).setLivePlayCallerContext(uoa.p).setLiveProfileFeedCacheManager(uoa.t).setBaseFeed(uoa.p.c.mEntity).setLogUrl(e.j(uoa.p.c)).setAnchorUserId(uoa.p.c.getUserId());
       String str = (this.R8(oobject1))? p3: null;
       liveProfileP = liveProfileP.setOpponentLiveStreamId(str).setExpTag(uoa.p.c.getExpTag()).setUserProfile(p0);
       LiveApiParams$AssistantType aUDIENCE = (this.R8(oobject1))? LiveApiParams$AssistantType.AUDIENCE: uoa.p.b2.d(QCurrentUser.me().getId());
       LiveProfileParams liveProfileP1 = liveProfileP.setOriginUserAssType(aUDIENCE).setTargetUserAssType(uoa.p.b2.c(p0)).setOriginUserAssPrivilege(uoa.p.b2.a(QCurrentUser.me().getId())).setCanOpenFullProfile(1).setAllowLiveChat(1).setClickType(p1.getValue()).setProfileOriginSource(p2).setInVoiceParty(r.c(uoa.p)).setIsCrossRoomPk(b);
       if (b) {
          a0 a11 = uoa.p.a1;
          if (a11 != null && a11.b2(obj)) {
             b1 = true;
          label_0135 :
             liveProfileP1 = liveProfileP1.setIsCrossRoomOpponentAnchor(b1);
             if (b) {
                a11 = uoa.p.a1;
                if (a11 != null && a11.w2(obj)) {
                   b1 = true;
                label_014a :
                   liveProfileP1 = liveProfileP1.setIsCrossRoomOpponentGuest(b1);
                   a11 = uoa.p.a1;
                   b1 = (a11 != null && a11.L2(obj))? true: false;
                   liveProfileP1 = liveProfileP1.setIsVoicePartyGuest(b1);
                   a11 = uoa.p.a1;
                   b1 = (a11 != null && a11.cd(obj))? true: false;
                   liveProfileP1 = liveProfileP1.setIsVoicePartyKtvSinger(b1);
                   a11 = uoa.p.a1;
                   b1 = (a11 != null && a11.U4(QCurrentUser.me().getId()))? true: false;
                   liveProfileP1 = liveProfileP1.setIsVoicePartyAdmin(b1).setIsSendGiftToAudienceEnabled(uoa.p.x1.Wc());
                   a11 = uoa.p.a1;
                   String str1 = "";
                   String str2 = (a11 != null)? a11.g0(): str1;
                   liveProfileP1 = liveProfileP1.setVoicePartyId(str2);
                   a11 = uoa.p.a1;
                   if (a11 != null) {
                      str1 = a11.k0();
                   }
                   liveProfileP1 = liveProfileP1.setTheaterId(str1);
                   b1 = (uoc != null && uoc.Z0(obj))? true: false;
                   liveProfileP1 = liveProfileP1.setIsLiveChatGuest(b1).setLiveServiceManager(uoa.v).setLiveSourceType(uoa.p.o.mLiveSourceType).setFollowSource(p4).setFollowExtParams(oobject2);
                   if (this.S8(obj) || p5) {
                      i = true;
                   }
                   liveProfileP1.setSendGuestGiftButtonEnabled(i).setProfileExtParams(oobject3).setLiveBizParam(uoa.q);
                   return liveGzonePro;
                }
             }
             b1 = false;
             goto label_014a ;
          }
       }
       b1 = false;
       goto label_0135 ;
    }
    public final boolean R8(LiveStreamClickType p0){
       boolean b = (p0 == LiveStreamClickType.LIVE_PK_PEER || p0 == LiveStreamClickType.LIVE_CHAT_BETWEEN_ANCHORS)? true: false;
       return b;
    }
    public boolean S8(String p0){
       c obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.x(p0)) {
          return b;
       }
       obj = this.v.a(LiveAudienceChatService.class).p();
       if (obj != null && (obj.v2() && obj.Z0(p0))) {
          b = true;
       }
    label_0038 :
       return b;
    }
    public void V8(UserProfile p0,LiveStreamClickType p1,int p2,String p3,d p4,int p5,boolean p6,boolean p7,m0 p8,LiveFollowExtParams p9,b p10,Bundle p11){
       boolean b;
       boolean booleanx;
       a w;
       LiveUserStatusResponse obj3;
       Boolean uBoolean;
       b uob = this;
       object oobject = p0;
       object oobject1 = p4;
       object oobject2 = p8;
       object oobject3 = p11;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       int i = 3;
       int i1 = 1;
       int i2 = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[12];
          objArray[i2] = oobject;
          objArray[i1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[i] = p3;
          objArray[4] = oobject1;
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = oobject2;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = oobject3;
          if (PatchProxy.applyVoid(objArray, uob, uoa, "6")) {
             return;
          }
       }
       LiveUserStatusResponse obj = PatchProxy.applyOneRefs(oobject, uob, uoa, "11");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(oobject != null){
          UserProfile mProfile1 = oobject.mProfile;
          if (mProfile1 != null) {
             UserInfo mExtraInfo = mProfile1.mExtraInfo;
             if (mExtraInfo != null && mExtraInfo.mDisableJumpUserProfile != null) {
                b.Z(LiveLogTag.LIVE_PROFILE, "DisableJumpUserProfile is true");
                b = true;
             }
          }
       }
       b = false;
       if (b) {
          b.Z(LiveVoicePartyLogTag.AUDIENCE, "LiveAudienceProfilePresenter showLiveProfile disable jump user profile");
          return;
       }else if(oobject3 != null){
          booleanx = oobject3.getBoolean("is_comment_anonymous", i2);
       }else {
          booleanx = false;
       }
       r1 or1 = null;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(oobject, Boolean.valueOf(booleanx), uob, uoa, "10");
          if (obj != patchProxyRe) {
             booleanx = obj.booleanValue();
          }else {
          label_00af :
             a0 obj2 = PatchProxy.applyOneRefs(oobject, uob, uoa, "12");
             if (obj2 != patchProxyRe) {
                b = obj2.booleanValue();
             }else if(oobject != null && oobject.mProfile != null){
                w = uob.p;
                if (w != null && TextUtils.n(w.Z2.d(), oobject.mProfile.mId)) {
                   b = true;
                }
             }
             b = false;
             if (!b) {
                obj2 = uob.p.b3;
                c uoc = c.class;
                if (PatchProxy.isSupport(uoc)) {
                   obj3 = PatchProxy.applyTwoRefs(obj2, Boolean.valueOf(booleanx), or1, uoc, "3");
                   if (obj3 != patchProxyRe) {
                      booleanx = obj3.booleanValue();
                   label_0125 :
                      if (booleanx) {
                         booleanx = true;
                      }
                   }
                }
                if (obj2 != null) {
                   obj = obj2.D1();
                   if (obj != null) {
                      obj3 = obj.mIsAnonymousLive;
                      if (obj3 != null) {
                         obj = obj.mDisplayAnonymousInfoConfig;
                         if (obj == null || obj.mEnableShowAnonymousInfo != i1) {
                         label_0116 :
                            booleanx = true;
                         label_0119 :
                            uBoolean = Boolean.valueOf(booleanx);
                         label_011f :
                            booleanx = a.g(uBoolean, Boolean.TRUE);
                            goto label_0125 ;
                         }
                      }
                      if (obj3 == null && booleanx) {
                         goto label_0116 ;
                      }else {
                         booleanx = false;
                         goto label_0119 ;
                      }
                   }
                }
                uBoolean = or1;
                goto label_011f ;
             }
             booleanx = false;
          }
       }else {
          goto label_00af ;
       }
       if (booleanx) {
          i.a(R.style.arg_RES_7f110668, 0x7f102512);
          b.Z(LiveVoicePartyLogTag.AUDIENCE, "LiveAudienceProfilePresenter showLiveProfile is anonymous");
          return;
       }else if(!uob.p.R().isAdded() || !uob.p.S.w0()){
          b.Z(LiveVoicePartyLogTag.AUDIENCE, "LiveAudienceProfilePresenter showLiveProfile is bind finish");
          return;
       }else if(uob.z.d() && !p6){
          b.Z(LiveVoicePartyLogTag.AUDIENCE, "LiveAudienceProfilePresenter showLiveProfile profile showing and canOverlay false");
          return;
       }else {
          uob.p.S().c(LiveWidgetVisibilityStatusService$AudienceWidget.PROFILE_CARD_DETAIL);
          boolean b1 = false;
          boolean b2 = uob.p.b2.d(QCurrentUser.me().getId()).isAdmin();
          String str = uob.p.Z2.d();
          UserProfile mProfile = oobject.mProfile;
          UserInfo mId = mProfile.mId;
          boolean b3 = a.e(mProfile);
          boolean b4 = (uob.p.b2.a(QCurrentUser.me().getId()).mControl != null && r.c(uob.p))? true: false;
          LiveProfileMode profileMode = LiveProfileMode.getProfileMode(b1, b2, str, mId, b3, b4);
          uob.w = new LiveProfileFragmentV2(uob.p, or1);
          obj = uob.p.b3.D1();
          if (obj != null) {
             obj = obj.mLiveChatUserStatus;
             if (obj != null) {
                uob.w.E5(obj.mEnableSwitchMediaType);
             }
          }
          uob.w.of(uob.x);
          w = uob.w;
          Object obj1 = PatchProxy.apply(or1, uob, uoa, "7");
          if (obj1 != patchProxyRe) {
             i1 = obj1.booleanValue();
          }else if(uob.x == null){
             if (uob.y == i) {
                LiveTimeConsumingUserStatusResponse liveTimeCons = uob.p.b3.d0();
                if (liveTimeCons != null) {
                   liveTimeCons = liveTimeCons.mLiveChatStat;
                   if (liveTimeCons != null) {
                      i1 = liveTimeCons.mIsFriend;
                   }
                }
             }
          }
          i1 = false;
          w.B4(i1);
          uob.w.b5(uob.v.a(a.class));
          uob.w.O4(profileMode);
          uob.w.R8(new a$b(uob, oobject));
          uob.w.v6(uob.p.B);
          uob.w.pe(new k(oobject.mProfile.mId, new g(uob)));
          uob.s.add(uob.w);
          uob.w.b9(this.P8(p0, p1, p2, p3, p5, p7, p9, p10));
          uob.w.V2(new a$c(uob));
          uob.w.U9(new a$d(uob, oobject1, oobject2));
          uob.w.Cb(uob.p.R().getChildFragmentManager(), "profile");
          b.Z(LiveVoicePartyLogTag.AUDIENCE, "LiveAudienceProfilePresenter showLiveProfile showImmediate");
          uob.w.k0(new a$e(uob, oobject1));
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       m1.a(p0, new f(this), R.id.live_anchor_info_container);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new q());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.r = this.q8(e.class);
       this.u = this.r8("LIVE_ROUTER_SERVICE");
       this.v = this.r8("LIVE_SERVICE_MANAGER");
       this.q = this.q8(LiveBizParam.class);
       return;
    }
}
