package com.kuaishou.live.common.core.component.authority.c;
import java.lang.Object;
import io.reactivex.subjects.ReplaySubject;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.common.core.component.authority.LiveAnchorSwitchAuthority;
import com.kuaishou.live.common.core.component.authority.LiveAnchorCommonAuthority;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMaintenanceConfig;
import wg3.a;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import com.kuaishou.live.core.show.uvc.LiveAnchorUvcConfig;
import java.util.HashMap;
import com.kwai.feature.api.live.merchant.authority.LiveAnchorFunction;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import rb1.b;
import java.lang.Iterable;
import ok.o;
import qk.y;
import com.kuaishou.live.common.core.component.authority.LiveAnchorFunctionStatus;
import com.kuaishou.live.common.core.component.authority.LiveAnchorBlindDateConfig;
import brd.t;
import com.kuaishou.live.common.core.component.authority.b;
import erd.r;
import com.kuaishou.live.common.core.component.authority.a;
import erd.o;
import h91.d;
import h91.c;
import cjd.e;
import t45.d;
import brd.z;
import rb1.c;
import erd.g;
import rb1.d;
import com.kuaishou.live.common.core.component.authority.AnchorInfoAreaConfig;
import com.kuaishou.live.common.core.component.authority.LiveDataAnalysisResponse$DataAnalysisInfo;
import ukd.a;
import com.kuaishou.live.core.show.paidshow.model.LivePaidShowInfo;
import com.kuaishou.live.ad.model.LiveAnchorBuyPushInfo;
import com.kuaishou.live.common.core.component.authority.LiveMmuHighlightConfig;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Enum;
import com.google.common.collect.ImmutableMap;
import pp.c;
import com.kuaishou.android.live.log.b;
import rb1.e;
import mrd.c;
import rb1.f;
import crd.b;
import com.kuaishou.live.core.show.admin.model.LiveAdminAssistantConfig;
import com.kuaishou.live.common.core.component.chat.authority.LiveAnchorChatConfig;
import com.kuaishou.live.common.core.component.authority.LiveAnchorLocationConfig;
import com.kuaishou.live.common.core.component.authority.LiveAnchorMagicFaceExpression;
import com.kuaishou.live.common.core.component.authority.LiveAnchorVoiceCommentConfig;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import com.kuaishou.live.core.show.makeup.LiveMakeupTipConfig;
import java.lang.CharSequence;
import android.text.TextUtils;
import o56.a;
import android.app.Application;

public class c	// class@000f7a
{
    public LiveAnchorSwitchAuthority a;
    public LiveAnchorCommonAuthority b;
    public LiveConfigStartupResponse$LiveMaintenanceConfig c;
    public LiveAnchorBottomServerConfig d;
    public LiveMakeupTipConfig e;
    public LiveAnchorUvcConfig f;
    public final Map g;
    public final Map h;
    public final Map i;
    public c j;
    public c k;

    public void c(){
       super();
       this.j = ReplaySubject.i(1);
       this.k = PublishSubject.g();
       this.a = LiveAnchorSwitchAuthority.createDefault();
       this.b = LiveAnchorCommonAuthority.createDefault();
       LiveConfigStartupResponse$LiveMaintenanceConfig liveMaintena = LiveConfigStartupResponse$LiveMaintenanceConfig.class;
       SharedPreferences a = a.a;
       String str = "{}";
       String str1 = a.getString("maintenanceConfig", str);
       String str2 = "";
       LiveAnchorUvcConfig liveAnchorUv = null;
       liveMaintena = (str1 == null || str1 == str2)? liveAnchorUv: b.a(str1, liveMaintena);
       this.c = liveMaintena;
       LiveAnchorUvcConfig liveAnchorUv1 = LiveAnchorUvcConfig.class;
       String str3 = a.getString("anchorUVCConfig", str);
       if (str3 != null && str3 != str2) {
          liveAnchorUv = b.a(str3, liveAnchorUv1);
       }
       this.f = liveAnchorUv;
       HashMap hashMap = new HashMap();
       this.h = hashMap;
       HashMap hashMap1 = new HashMap();
       this.g = hashMap1;
       HashMap hashMap2 = new HashMap();
       this.i = hashMap2;
       hashMap1.put(LiveAnchorFunction.LIVE_ASK, "mEnableOpenAskAuthor");
       hashMap1.put(LiveAnchorFunction.LIVE_PRIVATE, "mEnablePrivateLive");
       hashMap1.put(LiveAnchorFunction.LIVE_ESCROW, "mEnableLiveEscrow");
       LiveAnchorFunction vOICE_COMMEN = LiveAnchorFunction.VOICE_COMMENT;
       hashMap1.put(vOICE_COMMEN, "mEnableVoiceComment");
       hashMap1.put(LiveAnchorFunction.MULTI_CHAT, "mEnableMultiChat");
       hashMap2.put(vOICE_COMMEN, "mDisableAnchorVoiceCommentDisplay");
       vOICE_COMMEN = LiveAnchorFunction.VOICE_PARTY;
       hashMap1.put(vOICE_COMMEN, "mEnableVoiceParty");
       hashMap2.put(vOICE_COMMEN, "mDisableAnchorVoicePartyDisplay");
       hashMap2.put(LiveAnchorFunction.AUDIO_LIVE, "mDisableAnchorAudioLiveDisplay");
       hashMap2.put(LiveAnchorFunction.PK, "mDisableAnchorPkDisplay");
       hashMap1.put(LiveAnchorFunction.BACKGROUND_MUSIC_TIP, "mEnableBackgroundMusicTip");
       hashMap1.put(LiveAnchorFunction.RED_PACKET_LIVE_CLOSE_TIP, "mEnableRedPacketLiveCloseTip");
       hashMap1.put(LiveAnchorFunction.APPLY_MUSIC_STATION, "mEnableApplyMusicStation");
       hashMap1.put(LiveAnchorFunction.START_PK_GUIDE, "mEnableStartPkGuide");
       hashMap1.put(LiveAnchorFunction.CHAT_BETWEEN_ANCHORS, "mEnableChatBetweenAnchors");
       hashMap1.put(LiveAnchorFunction.START_CHAT_BETWEEN_ANCHORS_GUIDE, "mEnableStartChatBetweenAnchorsGuide");
       LiveAnchorFunction cHAT_AUDIENC = LiveAnchorFunction.CHAT_AUDIENCE_APPLY;
       hashMap1.put(cHAT_AUDIENC, "mEnableLiveChatAudienceApply");
       hashMap1.put(cHAT_AUDIENC, "mEnableLiveChatAudienceApply");
       hashMap1.put(LiveAnchorFunction.VOICE_PARTY_OPEN_VIDEO, "mEnableVoicePartyOpenVideo");
       hashMap1.put(LiveAnchorFunction.VOICE_PARTY_DEFAULT_OPEN_VIDEO, "mEnableVoicePartyDefaultOpenVideo");
       hashMap1.put(LiveAnchorFunction.VOICE_PARTY_ENTRANCE_ON_VOICE_PARTY_TAB, "mEnableVoicePartyNearbyEntranceOpen");
       hashMap1.put(LiveAnchorFunction.ONE_KS_COIN_DRAWING_GIFT, "mEnableOneKsCoinDrawingGift");
       hashMap1.put(LiveAnchorFunction.VOICE_PARTY_UPLOAD_BACKGROUND, "mEnableVoicePartyUploadBackground");
       hashMap1.put(LiveAnchorFunction.VOICE_PARTY_SEND_GIFT_TO_GUEST_COMMISSION, "mEnableVoicePartySendGiftToGuestCommission");
       hashMap1.put(LiveAnchorFunction.SHARE_GUIDE, "mEnableShowShareGuide");
       hashMap1.put(LiveAnchorFunction.COMMON_RED_PACKET, "mEnableCommonRedPack");
       hashMap1.put(LiveAnchorFunction.ROBOT, "mEnableStartRobot");
       hashMap1.put(LiveAnchorFunction.MAGIC_GIFT_LOCAL_RENDER, "mEnableLocalRenderMagicGift");
       hashMap1.put(LiveAnchorFunction.LIVE_ANCHOR_REPORT_USER_H5, "mEnableUseH5ReportAudience");
       hashMap1.put(LiveAnchorFunction.LIVE_ANCHOR_VOTE, "mEnableLiveVote");
       hashMap1.put(LiveAnchorFunction.VOICE_PARTY_AUTO_INVITE_SETTING, "mEnableSetVoicePartyAutoInvitation");
       hashMap1.put(LiveAnchorFunction.LIVE_PK_CHANGE_FORMAT, "mDisableStartFormatPk");
       hashMap1.put(LiveAnchorFunction.LUCKY_STAR, "mEnableLiveLuckyStar");
       hashMap1.put(LiveAnchorFunction.LIVE_COMMENT_MERGE_GIFT_FEED, "mEnableCommentMergeGiftFeed");
       hashMap1.put(LiveAnchorFunction.LIVE_NORMAL_STICKER, "mEnableLiveSticker");
       hashMap1.put(LiveAnchorFunction.LIVE_MERCHANT_STICKER, "mEnableMerchantSticker");
       hashMap1.put(LiveAnchorFunction.LIVE_4GQCI, "mEnable4GQos");
       hashMap1.put(LiveAnchorFunction.PROFESSIONAL_MERCHANT, "mEnableLiveProfessionalMerchant");
       hashMap1.put(LiveAnchorFunction.LIVE_WEEKLY_RANK_SHOW, "mEnableShowWeekRankSwitch");
       hashMap1.put(LiveAnchorFunction.LIVE_PK_RECOMMEND_REPORT, "mDisablePkRecommendReport");
       hashMap1.put(LiveAnchorFunction.Live_PK_ENTRY_PANEL_TAB_SELECT_REMEMBER, "mEnablePkPanelTabSelectRemember");
       hashMap1.put(LiveAnchorFunction.LIVE_CHAT_WITH_GUEST_DEFAULT_OPEN, "mIsChatWithGuestDefaultOpen");
       hashMap1.put(LiveAnchorFunction.LIVE_PLAYBACK_SWITCH, "mEnableShowAnchorLivePlaybackSwitch");
       hashMap1.put(LiveAnchorFunction.LIVE_ANONYMOUS_LIVE, "mEnableAnonymousLive");
       hashMap1.put(LiveAnchorFunction.LIVE_ANONYMOUS_LIVE_DEFAULT_SWITCH, "mAnonymousLiveSwitchStatus");
       hashMap.put(LiveAnchorFunction.LIVE_ANNOUNCE, "mEnableLiveBulletin");
       hashMap1.put(LiveAnchorFunction.LIVE_TOPIC, "mEnableShowLiveTopic");
       hashMap1.put(LiveAnchorFunction.LIVE_RE_PUSH, "mEnableRePush");
       hashMap1.put(LiveAnchorFunction.LIVE_VIP_GRADE, "mEnableLiveVipGrade");
       hashMap1.put(LiveAnchorFunction.LIVE_VIP_GRADE_WATCHING_LIST, "mEnableLiveVipGradeWatchingList");
       return;
    }
    public boolean A(int p0){
       LiveAnchorCommonAuthority obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uoc = this.b;
       boolean b = false;
       if (uoc == null) {
          return b;
       }else {
          obj = uoc.mBannedFunctionList;
          if (q.f(obj)) {
             return b;
          }else {
             return y.c(obj, new b(p0));
          }
       }
    }
    public boolean B(LiveAnchorFunction p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.h(p0) == LiveAnchorFunctionStatus.IN_MAINTENANCE)? true: false;
       return b;
    }
    public boolean C(){
       boolean b;
       c tb = this.b;
       if (tb != null) {
          LiveAnchorCommonAuthority mLiveAnchorB = tb.mLiveAnchorBlindDateConfig;
          if (mLiveAnchorB != null && mLiveAnchorB.mIsPaidMatchmaker != null) {
             b = true;
          label_000f :
             return b;
          }
       }
       b = false;
       goto label_000f ;
    }
    public boolean D(){
       c tb = this.b;
       boolean b = (tb != null && tb.mEnableRePush != null)? true: false;
       return b;
    }
    public boolean E(){
       c tb = this.b;
       boolean b = (tb != null && tb.mIsShowingConsumptionDataEnabled != null)? true: false;
       return b;
    }
    public boolean F(){
       c tb = this.b;
       boolean b = (tb != null && tb.mDisableMerchantForbiddenWhenChat != null)? true: false;
       return b;
    }
    public boolean G(){
       c tb = this.b;
       boolean b = (tb != null && tb.mDisableMerchantForbiddenWhenPk != null)? true: false;
       return b;
    }
    public t a(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c().filter(b.b).map(a.b);
    }
    public t b(){
       return this.k;
    }
    public t c(){
       return this.j;
    }
    public t d(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.b().d().map(new e()).observeOn(d.a).doOnError(new c(this)).doOnNext(new d(this));
    }
    public LiveAnchorBlindDateConfig e(){
       c tb = this.b;
       if (tb != null) {
          return tb.mLiveAnchorBlindDateConfig;
       }
       return null;
    }
    public AnchorInfoAreaConfig f(){
       c tb = this.b;
       if (tb != null) {
          return tb.mAnchorInfoAreaConfig;
       }
       return null;
    }
    public LiveDataAnalysisResponse$DataAnalysisInfo g(){
       c tb = this.b;
       if (tb == null) {
          return null;
       }
       return tb.mDataAnalysisInfo;
    }
    public LiveAnchorFunctionStatus h(LiveAnchorFunction p0){
       LiveLogTag liveLogTag;
       int i;
       boolean b;
       LiveAnchorFunctionStatus nOT_AUTHORIZ;
       LiveAnchorSwitchAuthority mDisableStop;
       LiveAnchorCommonAuthority obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          liveLogTag = null;
          i = 1;
          if (this.g.containsKey(p0)) {
             b = a.d(this.b, this.g.get(p0)).booleanValue();
          }else if(this.h.containsKey(p0)){
             b = a.d(this.a, this.h.get(p0)).booleanValue();
          }else {
             b = 1;
          }
       }catch(java.lang.RuntimeException e0){
          b = null;
       }
       if (p0 == LiveAnchorFunction.VOICE_PARTY_KTV) {
          obj = this.b.mDisableVoicePartyKtv;
       }else if(p0 == LiveAnchorFunction.LIVE_SHOP_ENTRANCE){
          obj = this.b.mDisableLiveShopEntrance;
       }else if(p0 == LiveAnchorFunction.VOICE_PARTY_THEATRE){
          obj = this.b.mDisableVoicePartyTheater;
       }else if(p0 == LiveAnchorFunction.LIVE_PK_CHANGE_FORMAT){
          obj = this.b.mDisableStartFormatPk;
       }else if(p0 == LiveAnchorFunction.VOICE_PARTY_TEAM_PK){
          obj = this.b.mDisableVoicePartyTeamPk;
       }else if(p0 == LiveAnchorFunction.LIVE_PAID_SHOW){
          obj = this.b.mLivePaidShowInfo;
          if (obj == null || obj.mEnablePaidShow == null) {
          label_008c :
             i = null;
          }
       }else if(p0 == LiveAnchorFunction.LIVE_ANCHOR_BUY_PUSH){
          obj = this.b.mLiveAnchorBuyPushInfo;
          if (obj == null || obj.mEnableAnchorBuyPush == null) {
          }
       }else if(p0 == LiveAnchorFunction.LIVE_DISABLE_COMMON_RED_PACKET_NEW_STYLE){
          obj = this.b.mDisableCommonRedPacketNewStyle;
       }else if(p0 == LiveAnchorFunction.LIVE_DISABLE_FANS_GROUP_CONDITION_RED_PACKET){
          obj = this.b.mDisableFansGroupConditionRedPacket;
       }else if(p0 == LiveAnchorFunction.LIVE_DISABLE_GIFT_CONDITION_RED_PACKET){
          obj = this.b.mDisableGiftConditionRedPacket;
       }else if(p0 == LiveAnchorFunction.LIVE_DISABLE_SHARE_CONDITION_RED_PACKET){
          obj = this.b.mDisableShareConditionRedPacket;
       }else if(p0 == LiveAnchorFunction.LIVE_PK_RECOMMEND_REPORT){
          obj = this.b.mDisablePkRecommendReport;
       }else if(p0 == LiveAnchorFunction.LIVE_QUIT_LIVE_GUIDE){
          mDisableStop = this.a.mDisableStopPushGuide;
       }else if(p0 == LiveAnchorFunction.LIVE_HIGH_LIGHT_IN_BOTTOM_BAR){
          obj = this.b.mLiveMmuHighLightConfig;
          if (obj == null || obj.mEnableShowMmuHighLightSwitch == null) {
          }
       }else if(p0 == LiveAnchorFunction.MULTI_PK){
          mDisableStop = this.b.mDisableOpenMultiPk;
       }else if(p0 == LiveAnchorFunction.LIVE_BLIND_DATE){
          if (this.b.mLiveAnchorBlindDateConfig == null) {
          }
       }else if(this.c == null || !this.i.containsKey(p0)){
          liveLogTag = a.d(this.c, this.i.get(p0)).booleanValue();
       }
    label_011c :
       if (!b) {
          nOT_AUTHORIZ = LiveAnchorFunctionStatus.NOT_AUTHORIZED;
       }else if(liveLogTag){
          nOT_AUTHORIZ = LiveAnchorFunctionStatus.IN_MAINTENANCE;
       }else {
          nOT_AUTHORIZ = LiveAnchorFunctionStatus.AVAILABLE;
       }
       b.h0(LiveLogTag.ANCHOR_FUNCTION_STATUS, "getFunctionStatus", ImmutableMap.of(p0.toString(), nOT_AUTHORIZ.toString()));
       return nOT_AUTHORIZ;
       b = i;
       goto label_00f9 ;
       b = obj ^ i;
       goto label_00f9 ;
    }
    public t i(LiveAnchorFunction p0){
       ReplaySubject obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ReplaySubject.i(1);
       this.j.subscribe(new e(this, obj, p0), new f(obj));
       return obj;
    }
    public LiveAdminAssistantConfig j(){
       return this.b.mLiveAdminAssistantConfig;
    }
    public LiveAnchorBuyPushInfo k(){
       return this.b.mLiveAnchorBuyPushInfo;
    }
    public LiveAnchorChatConfig l(){
       c tb = this.b;
       if (tb == null) {
          return null;
       }
       return tb.mLiveChatConfig;
    }
    public LiveAnchorLocationConfig m(){
       c ta = this.a;
       if (ta == null) {
          return null;
       }
       return ta.mLocationInfoPopupConfig;
    }
    public LiveAnchorMagicFaceExpression n(){
       c tb = this.b;
       if (tb == null) {
          return null;
       }
       return tb.mMagicFaceExpression;
    }
    public LivePaidShowInfo o(){
       c tb = this.b;
       if (tb != null) {
          return tb.mLivePaidShowInfo;
       }
       return null;
    }
    public LiveAnchorUvcConfig p(){
       return this.f;
    }
    public LiveAnchorVoiceCommentConfig q(){
       return this.b.mVoiceCommentConfig;
    }
    public LiveFansGroupInfo r(){
       return this.b.mLiveFansGroupInfo;
    }
    public LiveMakeupTipConfig s(){
       return this.e;
    }
    public String t(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.c.mAnchorServiceInMaintenancePrompt)) {
          return a.B.getString(0x7f102c27);
       }
       return this.c.mAnchorServiceInMaintenancePrompt;
    }
    public String u(){
       c tb = this.b;
       if (tb == null) {
          return "";
       }
       if (tb.mEnableKrnSendRedPacketPanel == null) {
          return "";
       }
       return tb.mKrnSendRedPacketPanelRouter;
    }
    public boolean v(){
       c tb = this.b;
       boolean b = (tb != null && tb.mAnonymousLiveSwitchStatus != null)? true: false;
       return b;
    }
    public boolean w(){
       c tb = this.b;
       boolean b = (tb != null && tb.mEnableShowLiveAgreement != null)? true: false;
       return b;
    }
    public boolean x(){
       c tb = this.b;
       boolean b = (tb != null && tb.mEnableVoicePartyCrossRoomPk != null)? true: false;
       return b;
    }
    public boolean y(LiveAnchorFunction p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.h(p0) != LiveAnchorFunctionStatus.NOT_AUTHORIZED)? true: false;
       return b;
    }
    public boolean z(LiveAnchorFunction p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.h(p0) == LiveAnchorFunctionStatus.AVAILABLE)? true: false;
       return b;
    }
}
