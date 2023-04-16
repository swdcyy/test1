package com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.follow.common.log.kslog.a;

public final class KsLogFollowTag extends Enum implements b	// class@00104f
{
    public String mName;
    public static final KsLogFollowTag[] $VALUES;
    public static final KsLogFollowTag FOLLOW_ACCOUNT;
    public static final KsLogFollowTag FOLLOW_ACQUAINTANCE;
    public static final KsLogFollowTag FOLLOW_AUTO_DEGRADE;
    public static final KsLogFollowTag FOLLOW_EVE;
    public static final KsLogFollowTag FOLLOW_GUIDE;
    public static final KsLogFollowTag FOLLOW_KRN;
    public static final KsLogFollowTag FOLLOW_LIST_COMPONENT_STAGGER;
    public static final KsLogFollowTag FOLLOW_NIRVANA;
    public static final KsLogFollowTag FOLLOW_NOTIFY;
    public static final KsLogFollowTag FOLLOW_POST;
    public static final KsLogFollowTag FOLLOW_PREFETCH;
    public static final KsLogFollowTag FOLLOW_PRE_CACHE;
    public static final KsLogFollowTag FOLLOW_PUSH;
    public static final KsLogFollowTag FOLLOW_PYMI;
    public static final KsLogFollowTag FOLLOW_PYMK;
    public static final KsLogFollowTag FOLLOW_SELECTOR;
    public static final KsLogFollowTag FOLLOW_SLIDE_SWIPE_PROFILE;
    public static final KsLogFollowTag FOLLOW_STAGGER;
    public static final KsLogFollowTag FOLLOW_STAGGER_PLUGIN;
    public static final KsLogFollowTag FOLLOW_VISIT;
    public static final KsLogFollowTag HOME_FOLLOW;
    public static final KsLogFollowTag HOME_FOLLOW_SLIDE;
    public static final KsLogFollowTag NIRVANA_PYMI;
    public static final KsLogFollowTag RX_ERROR;
    public static final KsLogFollowTag STAGGER_REFRESH;

    static {
       KsLogFollowTag ksLogFollowT = new KsLogFollowTag("HOME_FOLLOW", 0, "HomeFollow");
       KsLogFollowTag.HOME_FOLLOW = ksLogFollowT;
       KsLogFollowTag ksLogFollowT1 = new KsLogFollowTag("RX_ERROR", 1, "rxError");
       KsLogFollowTag.RX_ERROR = ksLogFollowT1;
       KsLogFollowTag ksLogFollowT2 = new KsLogFollowTag("STAGGER_REFRESH", 2, "staggerRefresh");
       KsLogFollowTag.STAGGER_REFRESH = ksLogFollowT2;
       KsLogFollowTag ksLogFollowT3 = new KsLogFollowTag("FOLLOW_NOTIFY", 3, "followNotify");
       KsLogFollowTag.FOLLOW_NOTIFY = ksLogFollowT3;
       KsLogFollowTag ksLogFollowT4 = new KsLogFollowTag("FOLLOW_SELECTOR", 4, "followSelector");
       KsLogFollowTag.FOLLOW_SELECTOR = ksLogFollowT4;
       KsLogFollowTag ksLogFollowT5 = new KsLogFollowTag("FOLLOW_POST", 5, "followPost");
       KsLogFollowTag.FOLLOW_POST = ksLogFollowT5;
       KsLogFollowTag ksLogFollowT6 = new KsLogFollowTag("FOLLOW_PYMI", 6, "followPymi");
       KsLogFollowTag.FOLLOW_PYMI = ksLogFollowT6;
       KsLogFollowTag ksLogFollowT7 = new KsLogFollowTag("FOLLOW_PYMK", 7, "followPymk");
       KsLogFollowTag.FOLLOW_PYMK = ksLogFollowT7;
       KsLogFollowTag ksLogFollowT8 = new KsLogFollowTag("FOLLOW_STAGGER", 8, "followStagger");
       KsLogFollowTag.FOLLOW_STAGGER = ksLogFollowT8;
       KsLogFollowTag ksLogFollowT9 = new KsLogFollowTag("FOLLOW_NIRVANA", 9, "followNirvana");
       KsLogFollowTag.FOLLOW_NIRVANA = ksLogFollowT9;
       KsLogFollowTag ksLogFollowT10 = new KsLogFollowTag("NIRVANA_PYMI", 10, "nirvanaPymi");
       KsLogFollowTag.NIRVANA_PYMI = ksLogFollowT10;
       KsLogFollowTag ksLogFollowT11 = new KsLogFollowTag("FOLLOW_VISIT", 11, "followVisit");
       KsLogFollowTag.FOLLOW_VISIT = ksLogFollowT11;
       KsLogFollowTag ksLogFollowT12 = new KsLogFollowTag("FOLLOW_ACCOUNT", 12, "followAccount");
       KsLogFollowTag.FOLLOW_ACCOUNT = ksLogFollowT12;
       KsLogFollowTag ksLogFollowT13 = ksLogFollowT12;
       KsLogFollowTag ksLogFollowT14 = new KsLogFollowTag("FOLLOW_SLIDE_SWIPE_PROFILE", 13, "followSlideSwipeProfile");
       KsLogFollowTag.FOLLOW_SLIDE_SWIPE_PROFILE = ksLogFollowT14;
       KsLogFollowTag ksLogFollowT15 = ksLogFollowT14;
       ksLogFollowT12 = new KsLogFollowTag("FOLLOW_ACQUAINTANCE", 14, "followAcquaintance");
       KsLogFollowTag.FOLLOW_ACQUAINTANCE = ksLogFollowT12;
       KsLogFollowTag ksLogFollowT16 = ksLogFollowT12;
       ksLogFollowT14 = new KsLogFollowTag("FOLLOW_LIST_COMPONENT_STAGGER", 15, "followListComponentStagger");
       KsLogFollowTag.FOLLOW_LIST_COMPONENT_STAGGER = ksLogFollowT14;
       KsLogFollowTag ksLogFollowT17 = ksLogFollowT14;
       ksLogFollowT12 = new KsLogFollowTag("FOLLOW_AUTO_DEGRADE", 16, "follow_auto_degrade");
       KsLogFollowTag.FOLLOW_AUTO_DEGRADE = ksLogFollowT12;
       KsLogFollowTag ksLogFollowT18 = ksLogFollowT12;
       ksLogFollowT14 = new KsLogFollowTag("FOLLOW_KRN", 17, "follow_krn");
       KsLogFollowTag.FOLLOW_KRN = ksLogFollowT14;
       KsLogFollowTag ksLogFollowT19 = ksLogFollowT14;
       ksLogFollowT12 = new KsLogFollowTag("FOLLOW_STAGGER_PLUGIN", 18, "follow_plugin_stagger");
       KsLogFollowTag.FOLLOW_STAGGER_PLUGIN = ksLogFollowT12;
       KsLogFollowTag ksLogFollowT20 = ksLogFollowT12;
       ksLogFollowT14 = new KsLogFollowTag("HOME_FOLLOW_SLIDE", 19, "homeFollowSlide");
       KsLogFollowTag.HOME_FOLLOW_SLIDE = ksLogFollowT14;
       KsLogFollowTag ksLogFollowT21 = ksLogFollowT14;
       ksLogFollowT12 = new KsLogFollowTag("FOLLOW_PUSH", 20, "followPush");
       KsLogFollowTag.FOLLOW_PUSH = ksLogFollowT12;
       KsLogFollowTag ksLogFollowT22 = ksLogFollowT12;
       ksLogFollowT14 = new KsLogFollowTag("FOLLOW_EVE", 21, "followEve");
       KsLogFollowTag.FOLLOW_EVE = ksLogFollowT14;
       KsLogFollowTag ksLogFollowT23 = ksLogFollowT14;
       ksLogFollowT12 = new KsLogFollowTag("FOLLOW_PREFETCH", 22, "followPrefetch");
       KsLogFollowTag.FOLLOW_PREFETCH = ksLogFollowT12;
       KsLogFollowTag ksLogFollowT24 = ksLogFollowT12;
       ksLogFollowT14 = new KsLogFollowTag("FOLLOW_GUIDE", 23, "followGuide");
       KsLogFollowTag.FOLLOW_GUIDE = ksLogFollowT14;
       KsLogFollowTag ksLogFollowT25 = ksLogFollowT14;
       ksLogFollowT12 = new KsLogFollowTag("FOLLOW_PRE_CACHE", 24, "followPreLoadCache");
       KsLogFollowTag.FOLLOW_PRE_CACHE = ksLogFollowT12;
       KsLogFollowTag[] ksLogFollowT26 = new KsLogFollowTag[25];
       ksLogFollowT26[0] = ksLogFollowT;
       ksLogFollowT26[1] = ksLogFollowT1;
       ksLogFollowT26[2] = ksLogFollowT2;
       ksLogFollowT26[3] = ksLogFollowT3;
       ksLogFollowT26[4] = ksLogFollowT4;
       ksLogFollowT26[5] = ksLogFollowT5;
       ksLogFollowT26[6] = ksLogFollowT6;
       ksLogFollowT26[7] = ksLogFollowT7;
       ksLogFollowT26[8] = ksLogFollowT8;
       ksLogFollowT26[9] = ksLogFollowT9;
       ksLogFollowT26[10] = ksLogFollowT10;
       ksLogFollowT26[11] = ksLogFollowT11;
       ksLogFollowT26[12] = ksLogFollowT13;
       ksLogFollowT26[13] = ksLogFollowT15;
       ksLogFollowT26[14] = ksLogFollowT16;
       ksLogFollowT26[15] = ksLogFollowT17;
       ksLogFollowT26[16] = ksLogFollowT18;
       ksLogFollowT26[17] = ksLogFollowT19;
       ksLogFollowT26[18] = ksLogFollowT20;
       ksLogFollowT26[19] = ksLogFollowT21;
       ksLogFollowT26[20] = ksLogFollowT22;
       ksLogFollowT26[21] = ksLogFollowT23;
       ksLogFollowT26[22] = ksLogFollowT24;
       ksLogFollowT26[23] = ksLogFollowT25;
       ksLogFollowT26[24] = ksLogFollowT12;
       KsLogFollowTag.$VALUES = ksLogFollowT26;
    }
    public void KsLogFollowTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static KsLogFollowTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogFollowTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogFollowTag.class, p0);
    }
    public static KsLogFollowTag[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogFollowTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogFollowTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
