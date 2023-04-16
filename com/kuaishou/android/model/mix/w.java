package com.kuaishou.android.model.mix.w;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.IMPhotoReplyConfigInfo;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.v;
import tl8.d;
import ok.h;
import tl8.e;
import zp.r;
import tl8.g;
import com.kuaishou.android.model.mix.r;
import zp.u;
import com.kuaishou.android.model.mix.ActivityUserIconModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zp.x;
import zp.w;
import com.kwai.components.feedmodel.RewardPhotoInfo;
import com.kuaishou.android.model.mix.n;
import yl8.b;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.kwai.components.feedmodel.SearchAiScriptInfo;
import zp.l;
import com.kwai.components.feedmodel.BottomEntryInfo;
import com.kwai.components.feedmodel.ProgressHighLightInfo;
import com.kwai.framework.model.ExtendableModelMap;
import zp.v;
import java.lang.Integer;
import zp.n;
import com.kuaishou.android.model.mix.f;
import com.kwai.components.feedmodel.HotSpotInfo;
import zp.m;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import java.util.ArrayList;
import zp.y;
import com.kuaishou.android.model.mix.l;
import com.kwai.framework.model.live.LiveTipInfo;
import zp.s;
import com.kuaishou.android.model.mix.s;
import com.kwai.components.feedmodel.OperationBarInfo;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.PhotoCoinRewardModel;
import java.lang.Number;
import com.kuaishou.android.model.mix.m;
import com.kwai.components.feedmodel.SummaryInfo;
import com.kuaishou.android.model.mix.u;
import com.kuaishou.android.model.mix.HyperTag;
import com.kuaishou.android.model.mix.d;
import com.kuaishou.android.model.mix.q;
import android.content.Context;
import lnc.a1;
import java.util.Map;
import com.kuaishou.android.model.mix.b;
import com.kuaishou.android.model.mix.e;
import com.kuaishou.android.model.mix.i;
import com.kuaishou.android.model.mix.PostShowInfo;
import com.kuaishou.android.model.mix.c;
import com.kuaishou.android.model.mix.PhotoCommentVoteInfo;
import wkd.b;
import ip.b;
import oe6.b;
import com.kuaishou.android.model.mix.k;
import com.kuaishou.android.model.mix.TagItem;
import com.kwai.components.feedmodel.feed.KaraokeModel$KaraokeInfo;
import com.kuaishou.android.model.feed.VisibilityExpiration;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.model.mix.g;
import com.kuaishou.android.model.mix.p;
import com.yxcorp.gifshow.model.EditInfo;
import zp.t;
import com.kuaishou.android.model.mix.h;
import zp.p;
import com.kuaishou.android.model.mix.t;
import java.lang.Long;
import com.kuaishou.android.model.mix.a;
import zp.k;
import com.kuaishou.android.model.mix.j;
import zp.o;
import com.kuaishou.android.model.mix.o;
import zp.q;

public class w	// class@000e4d
{

    public void w(){
       super();
    }
    public static IMPhotoReplyConfigInfo A(PhotoMeta p0){
       return w.M0(p0);
    }
    public static boolean A0(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.h(p0, PhotoMeta.class, v.b).booleanValue();
    }
    public static void A1(BaseFeed p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ow, "80")) {
          return;
       }
       e.g(p0, PhotoMeta.class, new r(p1));
       return;
    }
    public static Boolean B(PhotoMeta p0){
       return w.Z0(p0);
    }
    public static boolean B0(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.h(p0, PhotoMeta.class, r.b).booleanValue();
    }
    public static void B1(BaseFeed p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ow, "60")) {
          return;
       }
       e.h(p0, PhotoMeta.class, new u(p1));
       return;
    }
    public static Boolean C(boolean p0,PhotoMeta p1){
       return w.j1(p0, p1);
    }
    public static boolean C0(PhotoMeta p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          p0 = p0.mActivityUserIconMode;
          if (p0 != null && !TextUtils.x(p0.mIconUrl)) {
             return true;
          }
       }
       return false;
    }
    public static void C1(BaseFeed p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ow, "64")) {
          return;
       }
       e.h(p0, PhotoMeta.class, new x(p1));
       return;
    }
    public static String D(PhotoMeta p0){
       return w.I0(p0);
    }
    public static boolean D0(PhotoMeta p0){
       boolean b = (p0.mFriendsVisibility == 3)? true: false;
       return b;
    }
    public static void D1(BaseFeed p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ow, "66")) {
          return;
       }
       e.h(p0, PhotoMeta.class, new w(p1));
       return;
    }
    public static void E(boolean p0,PhotoMeta p1){
       w.h1(p0, p1);
    }
    public static boolean E0(PhotoMeta p0){
       boolean b = (p0.mFriendsVisibility == 2)? true: false;
       return b;
    }
    public static void E1(PhotoMeta p0,boolean p1){
       if (p0 != null) {
          p0 = p0.mRewardPhotoInfo;
          if (p0 != null) {
             p0.mIsRewarding = p1;
          }
       }
       return;
    }
    public static Boolean F(boolean p0,PhotoMeta p1){
       return w.p1(p0, p1);
    }
    public static boolean F0(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(p0, PhotoMeta.class, n.b);
    }
    public static void F1(PhotoMeta p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, w.class, "8")) {
          return;
       }
       p0.mVisibilityExpiration = null;
       p0.notifyChanged(p0);
       p0.fireSync();
       return;
    }
    public static Boolean G(boolean p0,PhotoMeta p1){
       return w.l1(p0, p1);
    }
    public static SearchAiScriptInfo G0(PhotoMeta p0){
       return p0.mSearchAiScriptInfo;
    }
    public static void G1(boolean p0,BaseFeed p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, ow, "32")) {
          return;
       }
       e.a(p1, PhotoMeta.class, new l(p0));
       return;
    }
    public static Boolean H(PhotoMeta p0){
       return w.U0(p0);
    }
    public static BottomEntryInfo H0(PhotoMeta p0){
       return p0.mBottomEntryInfo;
    }
    public static void H1(PhotoMeta p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(w.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), null, w.class, "4")) {
          return;
       }
       p0.mPhotoStatus = p1 ^ 0x01;
       p0.mMessageGroupId = null;
       p0.mFriendsVisibility = p2;
       p0.notifyChanged(p0);
       p0.fireSync();
       return;
    }
    public static ProgressHighLightInfo[] I(PhotoMeta p0){
       return w.K0(p0);
    }
    public static String I0(PhotoMeta p0){
       return p0.getExtraMap().getExtra("comment_top_bar_show_biz_type");
    }
    public static void I1(BaseFeed p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ow, "70")) {
          return;
       }
       e.h(p0, PhotoMeta.class, new v(p1));
       return;
    }
    public static Boolean J(PhotoMeta p0){
       return w.Y0(p0);
    }
    public static Integer J0(PhotoMeta p0){
       return Integer.valueOf(p0.mFromSourceType);
    }
    public static void J1(BaseFeed p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ow, "68")) {
          return;
       }
       e.h(p0, PhotoMeta.class, new n(p1));
       return;
    }
    public static Boolean K(boolean p0,PhotoMeta p1){
       return w.o1(p0, p1);
    }
    public static ProgressHighLightInfo[] K0(PhotoMeta p0){
       return p0.mHighLightPosInfo;
    }
    public static void K1(PhotoMeta p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ow, "7")) {
          return;
       }
       p0.mRecreationSetting = p1 ^ 0x01;
       p0.notifyChanged(p0);
       p0.fireSync();
       return;
    }
    public static SearchAiScriptInfo L(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, PhotoMeta.class, f.b);
    }
    public static HotSpotInfo L0(PhotoMeta p0){
       return p0.mHotSpotInfo;
    }
    public static void L1(BaseFeed p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ow, "72")) {
          return;
       }
       e.h(p0, PhotoMeta.class, new m(p1));
       return;
    }
    public static List M(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          PhotoMeta photoMeta = p0.getPhotoMeta();
          if (photoMeta != null) {
             photoMeta = photoMeta.mAtUserItems;
             if (photoMeta != null) {
                return photoMeta;
             }
          }
       }
       return new ArrayList();
    }
    public static IMPhotoReplyConfigInfo M0(PhotoMeta p0){
       return p0.mIMPhotoReplyConfigInfo;
    }
    public static void M1(BaseFeed p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ow, "62")) {
          return;
       }
       e.h(p0, PhotoMeta.class, new y(p1));
       return;
    }
    public static BottomEntryInfo N(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, PhotoMeta.class, l.b);
    }
    public static LiveTipInfo N0(PhotoMeta p0){
       return p0.mLiveTipInfo;
    }
    public static void N1(BaseFeed p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ow, "21")) {
          return;
       }
       e.h(p0, PhotoMeta.class, new s(p1));
       return;
    }
    public static String O(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.f(p0, PhotoMeta.class, s.b);
    }
    public static OperationBarInfo O0(PhotoMeta p0){
       return p0.mOperationBarInfo;
    }
    public static void O1(PhotoMeta p0,int p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, ow, "9")) {
          return;
       }
       p0.mPhotoCommentLimitType = p1;
       p0.notifyChanged(p0);
       p0.fireSync();
       return;
    }
    public static boolean P(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       PhotoMeta photoMeta = p0.a(PhotoMeta.class);
       if (photoMeta == null) {
          return false;
       }
       return photoMeta.mEnableFullScreenPlay;
    }
    public static Integer P0(PhotoMeta p0){
       return Integer.valueOf(p0.mPlayingPhotoMinSuspendHeight);
    }
    public static void P1(CommonMeta p0,int p1){
       if (p0 != null) {
          p0 = p0.mCoinRewardModel;
          if (p0 != null) {
             p0.mRewardOptionType = p1;
          }
       }
       return;
    }
    public static int Q(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.h(p0, PhotoMeta.class, m.b).intValue();
    }
    public static SummaryInfo Q0(PhotoMeta p0){
       return p0.mSummaryInfo;
    }
    public static void Q1(PhotoMeta p0,int p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, ow, "41")) {
          return;
       }
       if (p0 != null) {
          PhotoMeta mRewardPhoto = p0.mRewardPhotoInfo;
          if (mRewardPhoto != null) {
             mRewardPhoto.mRewardOptionType = p1;
             p0.notifyChanged(p0);
             p0.fireSync();
          }
       }
       return;
    }
    public static ProgressHighLightInfo[] R(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, PhotoMeta.class, u.b);
    }
    public static Boolean R0(PhotoMeta p0){
       return Boolean.valueOf(p0.mIsPhotoCopyTop);
    }
    public static void R1(PhotoMeta p0,RewardPhotoInfo p1,HyperTag p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, w.class, "44")) {
          return;
       }
       if (p0 == null || (p0.mRewardPhotoInfo != null && p1 != null)) {
          p0.mRewardPhotoInfo = p1;
          if (p2 != null) {
             p0.mHyperTag = p2;
          }
          p0.notifyChanged(p0);
          p0.fireSync();
       }
    label_0024 :
       return;
    }
    public static List S(PhotoMeta p0){
       return p0.mHotPageTagItems;
    }
    public static Boolean S0(PhotoMeta p0){
       boolean b = (p0.getExtraMap().getExtra("is_load_from_cache") == Boolean.TRUE)? true: false;
       return Boolean.valueOf(b);
    }
    public static HotSpotInfo T(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, PhotoMeta.class, d.b);
    }
    public static Boolean T0(PhotoMeta p0){
       return Boolean.valueOf(p0.mIsPhotoClick);
    }
    public static IMPhotoReplyConfigInfo U(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "84");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, PhotoMeta.class, q.b);
    }
    public static Boolean U0(PhotoMeta p0){
       return Boolean.valueOf(p0.mIsPhotoConsume);
    }
    public static boolean V(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       PhotoMeta photoMeta = p0.a(PhotoMeta.class);
       if (photoMeta == null) {
          return false;
       }
       return photoMeta.mIsCurrentPhotoDownloadingFromShare;
    }
    public static Boolean V0(PhotoMeta p0){
       return Boolean.valueOf(p0.mPlayingPhotoEnableSuspend);
    }
    public static String W(PhotoMeta p0,int p1,String p2){
       if (PatchProxy.isSupport(w.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, w.class, "55");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = a1.c().getString(p1);
       if (p0 == null) {
          return str;
       }else {
          p0 = p0.mLikeContentMap;
          if (p0 == null) {
             return str;
          }else {
             return TextUtils.i(p0.get(p2), str);
          }
       }
    }
    public static Boolean W0(PhotoMeta p0){
       boolean b = (p0.getExtraMap().getExtra("is_reco_feed_has_show") == Boolean.TRUE)? true: false;
       return Boolean.valueOf(b);
    }
    public static LiveTipInfo X(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, PhotoMeta.class, b.b);
    }
    public static Boolean X0(PhotoMeta p0){
       return Boolean.valueOf(p0.mIsRecommendedPhotoPress);
    }
    public static OperationBarInfo Y(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, PhotoMeta.class, e.b);
    }
    public static Boolean Y0(PhotoMeta p0){
       return Boolean.valueOf(p0.mIsRecommendedPopupShow);
    }
    public static int Z(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(p0, PhotoMeta.class, i.b);
    }
    public static Boolean Z0(PhotoMeta p0){
       return Boolean.valueOf(p0.mIsSearchCardRequestNetwork);
    }
    public static Boolean a(PhotoMeta p0){
       return w.V0(p0);
    }
    public static PostShowInfo a0(PhotoMeta p0){
       return p0.mPostShowInfo;
    }
    public static Boolean a1(PhotoMeta p0){
       return Boolean.valueOf(p0.mIsPhotoTop);
    }
    public static Boolean b(boolean p0,PhotoMeta p1){
       return w.n1(p0, p1);
    }
    public static long b0(PhotoMeta p0){
       return p0.mShowCount;
    }
    public static Boolean b1(PhotoMeta p0){
       return Boolean.valueOf(p0.mNeedShowPlc);
    }
    public static LiveTipInfo c(PhotoMeta p0){
       return w.N0(p0);
    }
    public static SummaryInfo c0(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, PhotoMeta.class, c.b);
    }
    public static Boolean c1(boolean p0,PhotoMeta p1){
       p1.mHasMusicTag = p0;
       return Boolean.valueOf(p0);
    }
    public static SummaryInfo d(PhotoMeta p0){
       return w.Q0(p0);
    }
    public static long d0(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       PhotoMeta photoMeta = p0.a(PhotoMeta.class);
       long l = (photoMeta != null)? (long)photoMeta.mViewCount: 0;
       return l;
    }
    public static void d1(String p0,PhotoMeta p1){
       p1.getExtraMap().putExtra("comment_top_bar_show_biz_type", p0);
    }
    public static HotSpotInfo e(PhotoMeta p0){
       return w.L0(p0);
    }
    public static boolean e0(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.getPhotoMeta() != null && (p0.getPhotoMeta().mPhotoCommentVoteInfo != null && p0.getPhotoMeta().mPhotoCommentVoteInfo.isValidVote())))? true: false;
       return b;
    }
    public static IMPhotoReplyConfigInfo e1(IMPhotoReplyConfigInfo p0,PhotoMeta p1){
       p1.mIMPhotoReplyConfigInfo = p0;
       return p0;
    }
    public static Boolean f(boolean p0,PhotoMeta p1){
       return w.f1(p0, p1);
    }
    public static void f0(PhotoMeta p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, w.class, "42")) {
          return;
       }
       if (p0 != null) {
          PhotoMeta mRewardPhoto = p0.mRewardPhotoInfo;
          if (mRewardPhoto != null) {
             mRewardPhoto.mRewardCount = mRewardPhoto.mRewardCount + 1;
             mRewardPhoto.mHasReward = true;
             p0.notifyChanged(p0);
             p0.fireSync();
          }
       }
       return;
    }
    public static Boolean f1(boolean p0,PhotoMeta p1){
       p1.mIsCurrentPhotoDownloadingFromShare = p0;
       return Boolean.valueOf(p0);
    }
    public static OperationBarInfo g(PhotoMeta p0){
       return w.O0(p0);
    }
    public static boolean g0(BaseFeed p0,int p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ow, "33");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return b.a(-570058679).l(p0, p1);
    }
    public static void g1(boolean p0,PhotoMeta p1){
       p1.getExtraMap().putExtra("is_load_from_cache", Boolean.valueOf(p0));
    }
    public static SearchAiScriptInfo h(PhotoMeta p0){
       return w.G0(p0);
    }
    public static boolean h0(PhotoMeta p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.mUsC == null || !b.b())? true: false;
       return b;
    }
    public static void h1(boolean p0,PhotoMeta p1){
       p1.getExtraMap().putExtra("is_reco_feed_has_show", Boolean.valueOf(p0));
    }
    public static Boolean i(PhotoMeta p0){
       return w.S0(p0);
    }
    public static boolean i0(PhotoMeta p0){
       boolean b = (p0.mUsD == null)? true: false;
       return b;
    }
    public static Boolean i1(boolean p0,PhotoMeta p1){
       p1.mNeedShowPlc = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean j(PhotoMeta p0){
       return w.T0(p0);
    }
    public static boolean j0(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(p0, PhotoMeta.class, k.b);
    }
    public static Boolean j1(boolean p0,PhotoMeta p1){
       p1.mIsPhotoClick = p0;
       return Boolean.valueOf(p0);
    }
    public static Integer k(PhotoMeta p0){
       return w.P0(p0);
    }
    public static boolean k0(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       PhotoMeta photoMeta = p0.a(PhotoMeta.class);
       if (photoMeta == null) {
          return b;
       }
       photoMeta = photoMeta.mRecoReasonTag;
       if (photoMeta != null && !TextUtils.x(photoMeta.mName)) {
          b = true;
       }
       return b;
    }
    public static Boolean k1(boolean p0,PhotoMeta p1){
       p1.mIsPhotoConsume = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean l(PhotoMeta p0){
       return w.W0(p0);
    }
    public static boolean l0(PhotoMeta p0){
       boolean b = true;
       if (p0.mFriendsVisibility == b) {
       }else {
          b = false;
       }
       return b;
    }
    public static Boolean l1(boolean p0,PhotoMeta p1){
       p1.mPlayingPhotoEnableSuspend = p0;
       return Boolean.valueOf(p0);
    }
    public static IMPhotoReplyConfigInfo m(IMPhotoReplyConfigInfo p0,PhotoMeta p1){
       w.e1(p0, p1);
       return p0;
    }
    public static boolean m0(PhotoMeta p0){
       return p0.mInappropriate;
    }
    public static Boolean m1(boolean p0,PhotoMeta p1){
       p1.mIsRecommendedPhotoPress = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean n(boolean p0,PhotoMeta p1){
       return w.q1(p0, p1);
    }
    public static boolean n0(PhotoMeta p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getKaraokeInfo() != null)? true: false;
       return b;
    }
    public static Boolean n1(boolean p0,PhotoMeta p1){
       p1.mIsRecommendedPopupShow = p0;
       return Boolean.valueOf(p0);
    }
    public static void o(String p0,PhotoMeta p1){
       w.d1(p0, p1);
    }
    public static boolean o0(PhotoMeta p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!w.l0(p0) && (w.E0(p0) || w.D0(p0)))? true: false;
       return b;
    }
    public static Boolean o1(boolean p0,PhotoMeta p1){
       p1.mIsSearchCardRequestNetwork = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean p(boolean p0,PhotoMeta p1){
       return w.c1(p0, p1);
    }
    public static boolean p0(PhotoMeta p0){
       p0 = p0.mVisibilityExpiration;
       boolean b = (p0 != null && p0.mExpiryDays > null)? true: false;
       return b;
    }
    public static Boolean p1(boolean p0,PhotoMeta p1){
       p1.mIsSubscribed = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean q(boolean p0,PhotoMeta p1){
       return w.i1(p0, p1);
    }
    public static boolean q0(BaseFeed p0){
       if (p0 instanceof LiveStreamFeed) {
          LiveStreamFeed mConfig = p0.mConfig;
          if (mConfig != null) {
             return mConfig.mIsFromLiveMate;
          }
       }
       return false;
    }
    public static Boolean q1(boolean p0,PhotoMeta p1){
       p1.mIsPhotoTop = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean r(PhotoMeta p0){
       return w.R0(p0);
    }
    public static boolean r0(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "76");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(p0, PhotoMeta.class, g.b);
    }
    public static boolean r1(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.h(p0, PhotoMeta.class, p.b).booleanValue();
    }
    public static BottomEntryInfo s(PhotoMeta p0){
       return w.H0(p0);
    }
    public static boolean s0(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.getEditInfo() != null && p0.getEditInfo().mMusicTort != null))? true: false;
       return b;
    }
    public static void s1(BaseFeed p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ow, "45")) {
          return;
       }
       e.a(p0, PhotoMeta.class, new t(p1));
       return;
    }
    public static Boolean t(boolean p0,PhotoMeta p1){
       return w.m1(p0, p1);
    }
    public static boolean t0(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.h(p0, PhotoMeta.class, h.b).booleanValue();
    }
    public static void t1(BaseFeed p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, w.class, "81")) {
          return;
       }
       e.g(p0, PhotoMeta.class, new p(p1));
       return;
    }
    public static Integer u(PhotoMeta p0){
       return w.J0(p0);
    }
    public static boolean u0(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.h(p0, PhotoMeta.class, t.b).booleanValue();
    }
    public static void u1(PhotoMeta p0,PhotoCommentVoteInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, w.class, "11")) {
          return;
       }
       p0.mPhotoCommentVoteInfo = p1;
       p0.notifyChanged(p0);
       p0.fireSync();
       return;
    }
    public static Boolean v(PhotoMeta p0){
       return w.a1(p0);
    }
    public static boolean v0(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PhotoMeta photoMeta = p0.a(PhotoMeta.class);
       boolean b = false;
       if (photoMeta == null) {
          return b;
       }
       photoMeta = photoMeta.mEditInfo;
       if (photoMeta == null) {
          return b;
       }
       EditInfo mEditTime = photoMeta.mEditTime;
       if (mEditTime != null && mEditTime.longValue()) {
          b = true;
       }
       return b;
    }
    public static void v1(PhotoMeta p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ow, "6")) {
          return;
       }
       p0.mDownloadSetting = p1;
       p0.notifyChanged(p0);
       p0.fireSync();
       return;
    }
    public static Boolean w(PhotoMeta p0){
       return w.X0(p0);
    }
    public static boolean w0(PhotoMeta p0){
       boolean b;
       if (p0 != null) {
          p0 = p0.mRewardPhotoInfo;
          if (p0 != null && p0.mIsRewarding != null) {
             b = true;
          label_000d :
             return b;
          }
       }
       b = false;
       goto label_000d ;
    }
    public static void w1(PhotoMeta p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ow, "10")) {
          return;
       }
       p0.mHasShowedRewardBubble = p1;
       p0.notifyChanged(p0);
       p0.fireSync();
       return;
    }
    public static void x(boolean p0,PhotoMeta p1){
       w.g1(p0, p1);
    }
    public static boolean x0(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(p0, PhotoMeta.class, a.b);
    }
    public static void x1(BaseFeed p0,IMPhotoReplyConfigInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, w.class, "83")) {
          return;
       }
       e.h(p0, PhotoMeta.class, new k(p1));
       return;
    }
    public static Boolean y(PhotoMeta p0){
       return w.b1(p0);
    }
    public static boolean y0(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(p0, PhotoMeta.class, j.b);
    }
    public static void y1(BaseFeed p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ow, "51")) {
          return;
       }
       e.h(p0, PhotoMeta.class, new o(p1));
       return;
    }
    public static Boolean z(boolean p0,PhotoMeta p1){
       return w.k1(p0, p1);
    }
    public static boolean z0(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.h(p0, PhotoMeta.class, o.b).booleanValue();
    }
    public static void z1(BaseFeed p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ow, "77")) {
          return;
       }
       e.g(p0, PhotoMeta.class, new q(p1));
       return;
    }
}
