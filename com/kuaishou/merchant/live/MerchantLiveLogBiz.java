package com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MerchantLiveLogBiz extends Enum implements a	// class@001874
{
    public final String mBiz;
    public static final MerchantLiveLogBiz[] $VALUES;
    public static final MerchantLiveLogBiz API_GRAY;
    public static final MerchantLiveLogBiz AR_SKIN;
    public static final MerchantLiveLogBiz AUDIENCE_STRONG_NOTICE;
    public static final MerchantLiveLogBiz BOTTOM_BAR;
    public static final MerchantLiveLogBiz BULLET;
    public static final MerchantLiveLogBiz CHALLENGE;
    public static final MerchantLiveLogBiz ENTRY;
    public static final MerchantLiveLogBiz ESTATE;
    public static final MerchantLiveLogBiz FRAGMENT_CONTAINER;
    public static final MerchantLiveLogBiz LITE_INTERPRETATION;
    public static final MerchantLiveLogBiz LIVE_BUBBLE;
    public static final MerchantLiveLogBiz LIVE_COMMODITY_PREVIEW;
    public static final MerchantLiveLogBiz LIVE_COMMON;
    public static final MerchantLiveLogBiz LIVE_DECORATION;
    public static final MerchantLiveLogBiz LIVE_GATHER_POPULARITY;
    public static final MerchantLiveLogBiz LIVE_GRAB_COUPON;
    public static final MerchantLiveLogBiz LIVE_PAY_RESULT;
    public static final MerchantLiveLogBiz LIVE_PREVIEW_ATMOSPHERE;
    public static final MerchantLiveLogBiz LIVE_REVENUE_ACTIVITY_PENDANT;
    public static final MerchantLiveLogBiz LIVE_REVENUE_PENDANT;
    public static final MerchantLiveLogBiz LIVE_SANDEAGO;
    public static final MerchantLiveLogBiz LIVE_SIGNAL_ROUTER;
    public static final MerchantLiveLogBiz LIVE_TOP_AUTHENTICATION_PENDANT;
    public static final MerchantLiveLogBiz LIVE_TOP_PENDANT;
    public static final MerchantLiveLogBiz MAGIC_EFFECT;
    public static final MerchantLiveLogBiz MONITOR;
    public static final MerchantLiveLogBiz Notice;
    public static final MerchantLiveLogBiz PENDANT;
    public static final MerchantLiveLogBiz RIGHTS_GUARANTEE;
    public static final MerchantLiveLogBiz ROBOT;
    public static final MerchantLiveLogBiz SHARE_TOKEN;
    public static final MerchantLiveLogBiz STARTUP;
    public static final MerchantLiveLogBiz TRUST_BUBBLE;
    public static final MerchantLiveLogBiz TURTH_OR_DARE;

    static {
       MerchantLiveLogBiz merchantLive = new MerchantLiveLogBiz("STARTUP", 0, "LiveStartup");
       MerchantLiveLogBiz.STARTUP = merchantLive;
       MerchantLiveLogBiz merchantLive1 = new MerchantLiveLogBiz("MONITOR", 1, "LiveMonitor");
       MerchantLiveLogBiz.MONITOR = merchantLive1;
       MerchantLiveLogBiz merchantLive2 = new MerchantLiveLogBiz("API_GRAY", 2, "LiveApiGray");
       MerchantLiveLogBiz.API_GRAY = merchantLive2;
       MerchantLiveLogBiz merchantLive3 = new MerchantLiveLogBiz("FRAGMENT_CONTAINER", 3, "LiveFragmentContainer");
       MerchantLiveLogBiz.FRAGMENT_CONTAINER = merchantLive3;
       MerchantLiveLogBiz merchantLive4 = new MerchantLiveLogBiz("SHARE_TOKEN", 4, "LiveShareToken");
       MerchantLiveLogBiz.SHARE_TOKEN = merchantLive4;
       MerchantLiveLogBiz merchantLive5 = new MerchantLiveLogBiz("BOTTOM_BAR", 5, "LiveBottomBar");
       MerchantLiveLogBiz.BOTTOM_BAR = merchantLive5;
       MerchantLiveLogBiz merchantLive6 = new MerchantLiveLogBiz("LIVE_BUBBLE", 6, "LiveBubble");
       MerchantLiveLogBiz.LIVE_BUBBLE = merchantLive6;
       MerchantLiveLogBiz merchantLive7 = new MerchantLiveLogBiz("PENDANT", 7, "LivePendant");
       MerchantLiveLogBiz.PENDANT = merchantLive7;
       MerchantLiveLogBiz merchantLive8 = new MerchantLiveLogBiz("AUDIENCE_STRONG_NOTICE", 8, "LiveAudienceStrongNotice");
       MerchantLiveLogBiz.AUDIENCE_STRONG_NOTICE = merchantLive8;
       MerchantLiveLogBiz merchantLive9 = new MerchantLiveLogBiz("RIGHTS_GUARANTEE", 9, "LiveRightsGuarantee");
       MerchantLiveLogBiz.RIGHTS_GUARANTEE = merchantLive9;
       MerchantLiveLogBiz merchantLive10 = new MerchantLiveLogBiz("BULLET", 10, "LiveBullet");
       MerchantLiveLogBiz.BULLET = merchantLive10;
       MerchantLiveLogBiz merchantLive11 = new MerchantLiveLogBiz("Notice", 11, "LiveNotice");
       MerchantLiveLogBiz.Notice = merchantLive11;
       MerchantLiveLogBiz merchantLive12 = new MerchantLiveLogBiz("ROBOT", 12, "LiveRobot");
       MerchantLiveLogBiz.ROBOT = merchantLive12;
       MerchantLiveLogBiz merchantLive13 = merchantLive12;
       MerchantLiveLogBiz merchantLive14 = new MerchantLiveLogBiz("LIVE_PAY_RESULT", 13, "LivePayResult");
       MerchantLiveLogBiz.LIVE_PAY_RESULT = merchantLive14;
       MerchantLiveLogBiz merchantLive15 = merchantLive14;
       merchantLive12 = new MerchantLiveLogBiz("LIVE_COMMON", 14, "LiveCommon");
       MerchantLiveLogBiz.LIVE_COMMON = merchantLive12;
       MerchantLiveLogBiz merchantLive16 = merchantLive12;
       merchantLive14 = new MerchantLiveLogBiz("LIVE_GRAB_COUPON", 15, "LiveGrabCoupon");
       MerchantLiveLogBiz.LIVE_GRAB_COUPON = merchantLive14;
       MerchantLiveLogBiz merchantLive17 = merchantLive14;
       merchantLive12 = new MerchantLiveLogBiz("LIVE_REVENUE_ACTIVITY_PENDANT", 16, "LiveRevenuePendant");
       MerchantLiveLogBiz.LIVE_REVENUE_ACTIVITY_PENDANT = merchantLive12;
       MerchantLiveLogBiz merchantLive18 = merchantLive12;
       MerchantLiveLogBiz merchantLive19 = merchantLive11;
       MerchantLiveLogBiz merchantLive20 = new MerchantLiveLogBiz("CHALLENGE", 17, "LiveChallenge");
       MerchantLiveLogBiz.CHALLENGE = merchantLive20;
       MerchantLiveLogBiz merchantLive21 = merchantLive20;
       merchantLive11 = new MerchantLiveLogBiz("LIVE_SANDEAGO", 18, "LiveSandeago");
       MerchantLiveLogBiz.LIVE_SANDEAGO = merchantLive11;
       MerchantLiveLogBiz merchantLive22 = merchantLive11;
       MerchantLiveLogBiz merchantLive23 = new MerchantLiveLogBiz("LIVE_COMMODITY_PREVIEW", 19, "LiveCommodityPreview");
       MerchantLiveLogBiz.LIVE_COMMODITY_PREVIEW = merchantLive23;
       merchantLive11 = new MerchantLiveLogBiz("LIVE_REVENUE_PENDANT", 20, "LiveRevenuePendant");
       MerchantLiveLogBiz.LIVE_REVENUE_PENDANT = merchantLive11;
       MerchantLiveLogBiz merchantLive24 = merchantLive11;
       merchantLive14 = new MerchantLiveLogBiz("LIVE_TOP_PENDANT", 21, "LiveTopPendant");
       MerchantLiveLogBiz.LIVE_TOP_PENDANT = merchantLive14;
       MerchantLiveLogBiz merchantLive25 = merchantLive14;
       merchantLive12 = new MerchantLiveLogBiz("LIVE_DECORATION", 22, "LiveDecoration");
       MerchantLiveLogBiz.LIVE_DECORATION = merchantLive12;
       MerchantLiveLogBiz merchantLive26 = merchantLive12;
       merchantLive14 = new MerchantLiveLogBiz("LIVE_SIGNAL_ROUTER", 23, "LiveSignalRouter");
       MerchantLiveLogBiz.LIVE_SIGNAL_ROUTER = merchantLive14;
       MerchantLiveLogBiz merchantLive27 = merchantLive14;
       merchantLive12 = new MerchantLiveLogBiz("LIVE_GATHER_POPULARITY", 24, "LiveGatherPopularity");
       MerchantLiveLogBiz.LIVE_GATHER_POPULARITY = merchantLive12;
       MerchantLiveLogBiz merchantLive28 = merchantLive12;
       merchantLive14 = new MerchantLiveLogBiz("TURTH_OR_DARE", 25, "LiveTrueOrDare");
       MerchantLiveLogBiz.TURTH_OR_DARE = merchantLive14;
       MerchantLiveLogBiz merchantLive29 = merchantLive14;
       merchantLive12 = new MerchantLiveLogBiz("ENTRY", 26, "LiveEntry");
       MerchantLiveLogBiz.ENTRY = merchantLive12;
       MerchantLiveLogBiz merchantLive30 = merchantLive12;
       merchantLive14 = new MerchantLiveLogBiz("LIVE_TOP_AUTHENTICATION_PENDANT", 27, "LiveTopAuthenticationPendant");
       MerchantLiveLogBiz.LIVE_TOP_AUTHENTICATION_PENDANT = merchantLive14;
       MerchantLiveLogBiz merchantLive31 = merchantLive14;
       merchantLive12 = new MerchantLiveLogBiz("TRUST_BUBBLE", 28, "LiveTrustBubble");
       MerchantLiveLogBiz.TRUST_BUBBLE = merchantLive12;
       MerchantLiveLogBiz merchantLive32 = merchantLive12;
       merchantLive14 = new MerchantLiveLogBiz("ESTATE", 29, "LiveEstate");
       MerchantLiveLogBiz.ESTATE = merchantLive14;
       MerchantLiveLogBiz merchantLive33 = merchantLive14;
       merchantLive12 = new MerchantLiveLogBiz("AR_SKIN", 30, "ArSkin");
       MerchantLiveLogBiz.AR_SKIN = merchantLive12;
       MerchantLiveLogBiz merchantLive34 = merchantLive12;
       merchantLive14 = new MerchantLiveLogBiz("MAGIC_EFFECT", 31, "LiveMagicEffect");
       MerchantLiveLogBiz.MAGIC_EFFECT = merchantLive14;
       MerchantLiveLogBiz merchantLive35 = merchantLive14;
       merchantLive12 = new MerchantLiveLogBiz("LIVE_PREVIEW_ATMOSPHERE", 32, "LivePreviewAtmosphere");
       MerchantLiveLogBiz.LIVE_PREVIEW_ATMOSPHERE = merchantLive12;
       MerchantLiveLogBiz merchantLive36 = merchantLive12;
       merchantLive14 = new MerchantLiveLogBiz("LITE_INTERPRETATION", 33, "LiteInterpretation");
       MerchantLiveLogBiz.LITE_INTERPRETATION = merchantLive14;
       MerchantLiveLogBiz[] merchantLive37 = new MerchantLiveLogBiz[34];
       merchantLive37[0] = merchantLive;
       merchantLive37[1] = merchantLive1;
       merchantLive37[2] = merchantLive2;
       merchantLive37[3] = merchantLive3;
       merchantLive37[4] = merchantLive4;
       merchantLive37[5] = merchantLive5;
       merchantLive37[6] = merchantLive6;
       merchantLive37[7] = merchantLive7;
       merchantLive37[8] = merchantLive8;
       merchantLive37[9] = merchantLive9;
       merchantLive37[10] = merchantLive10;
       merchantLive37[11] = merchantLive19;
       merchantLive37[12] = merchantLive13;
       merchantLive37[13] = merchantLive15;
       merchantLive37[14] = merchantLive16;
       merchantLive37[15] = merchantLive17;
       merchantLive37[16] = merchantLive18;
       merchantLive37[17] = merchantLive21;
       merchantLive37[18] = merchantLive22;
       merchantLive37[19] = merchantLive23;
       merchantLive37[20] = merchantLive24;
       merchantLive37[21] = merchantLive25;
       merchantLive37[22] = merchantLive26;
       merchantLive37[23] = merchantLive27;
       merchantLive37[24] = merchantLive28;
       merchantLive37[25] = merchantLive29;
       merchantLive37[26] = merchantLive30;
       merchantLive37[27] = merchantLive31;
       merchantLive37[28] = merchantLive32;
       merchantLive37[29] = merchantLive33;
       merchantLive37[30] = merchantLive34;
       merchantLive37[31] = merchantLive35;
       merchantLive37[32] = merchantLive36;
       merchantLive37[33] = merchantLive14;
       MerchantLiveLogBiz.$VALUES = merchantLive37;
    }
    public void MerchantLiveLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static MerchantLiveLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MerchantLiveLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MerchantLiveLogBiz.class, p0);
    }
    public static MerchantLiveLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, MerchantLiveLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MerchantLiveLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
