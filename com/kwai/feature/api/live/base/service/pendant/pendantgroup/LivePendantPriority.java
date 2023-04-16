package com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;
import java.lang.Enum;
import java.lang.String;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class LivePendantPriority extends Enum	// class@000f9f
{
    public static final LivePendantPriority[] $VALUES;
    public static final LivePendantPriority ACTIVITY_WIDGET;
    public static final LivePendantPriority ANSWERING_QUESTION;
    public static final LivePendantPriority AR_SKIN_TEST;
    public static final LivePendantPriority ASK_QUESTION;
    public static final LivePendantPriority ASK_QUESTION_ANCHOR;
    public static final LivePendantPriority BOTTOM;
    public static final LivePendantPriority BROTHER_GROUP_BUY_PENDANT;
    public static final LivePendantPriority CAROUSEL_PENDANT;
    public static final LivePendantPriority CHAT_BUTTON;
    public static final LivePendantPriority COMMERCIAL_NEO_LIVE_COUPON;
    public static final LivePendantPriority FEATURE_PAGER;
    public static final LivePendantPriority GINSENG_FRUIT;
    public static final LivePendantPriority GZONE_ACTIVITY_WIDGET;
    public static final LivePendantPriority GZONE_GAME_PROMOTION;
    public static final LivePendantPriority HOUSE_CONSULT_PENDANT;
    public static final LivePendantPriority INTERACTION_SCENE_PENDANT;
    public static final LivePendantPriority LARGE_STYLE_ACTIVITY_WIDGET;
    public static final LivePendantPriority LIVE_ANCHOR_CONTENT_PROMOTION;
    public static final LivePendantPriority LIVE_BLIND;
    public static final LivePendantPriority LIVE_INTERACTIVE_GUIDE;
    public static final LivePendantPriority LIVE_INTERACTIVE_GUIDE_HIGH;
    public static final LivePendantPriority LIVE_LINE;
    public static final LivePendantPriority LIVE_PK;
    public static final LivePendantPriority LIVE_PK_SMALL_WINDOW;
    public static final LivePendantPriority LIVE_PLUS;
    public static final LivePendantPriority LOCAL_LIFE_HOT_BUBBLE;
    public static final LivePendantPriority LOCAL_LIFE_PENDANT;
    public static final LivePendantPriority LUCKY_STAR;
    public static final LivePendantPriority MERCHANT_616_NOTICE_PENDANT;
    public static final LivePendantPriority MERCHANT_616_PENDANT;
    public static final LivePendantPriority MERCHANT_ASK_INTERPRET;
    public static final LivePendantPriority MERCHANT_DYNAMIC_PENDANT;
    public static final LivePendantPriority MERCHANT_DYNAMIC_PENDANT_2;
    public static final LivePendantPriority MERCHANT_DYNAMIC_PENDANT_3;
    public static final LivePendantPriority MERCHANT_DYNAMIC_PENDANT_4;
    public static final LivePendantPriority MERCHANT_DYNAMIC_PENDANT_5;
    public static final LivePendantPriority MERCHANT_DYNAMIC_PENDANT_6;
    public static final LivePendantPriority MERCHANT_DYNAMIC_PENDANT_7;
    public static final LivePendantPriority MERCHANT_INTERPRET;
    public static final LivePendantPriority MERCHANT_PENDANT_SLIDE_CONTAINER;
    public static final LivePendantPriority MERCHANT_RISING_COUPON;
    public static final LivePendantPriority MERCHANT_SPIKE_PENDANT;
    public static final LivePendantPriority NEBULA_FANS_TOP_AWARD_LIVE;
    public static final LivePendantPriority OPERATE_WIDGET;
    public static final LivePendantPriority RECRUIT_INTERPRET;
    public static final LivePendantPriority RED_PACKET;
    public static final LivePendantPriority RED_PACKET_RAIN;
    public static final LivePendantPriority SANDEAGO;
    public static final LivePendantPriority SUPER_FANS_GROUP_LUCKY_BAG_PENDANT;
    public static final LivePendantPriority TUNA_SCENE_PENDANT;
    public static final LivePendantPriority VOICE_PARTY_KTV_ORDER_MUSIC;
    public static final LivePendantPriority VOICE_PARTY_THEATER_PLAY_LIST;
    public static final Map sDisplayRankMap;

    static {
       LivePendantPriority livePendantP = new LivePendantPriority("LOCAL_LIFE_HOT_BUBBLE", 0);
       LivePendantPriority.LOCAL_LIFE_HOT_BUBBLE = livePendantP;
       LivePendantPriority livePendantP1 = new LivePendantPriority("TUNA_SCENE_PENDANT", 1);
       LivePendantPriority.TUNA_SCENE_PENDANT = livePendantP1;
       LivePendantPriority livePendantP2 = new LivePendantPriority("MERCHANT_INTERPRET", 2);
       LivePendantPriority.MERCHANT_INTERPRET = livePendantP2;
       LivePendantPriority livePendantP3 = new LivePendantPriority("MERCHANT_PENDANT_SLIDE_CONTAINER", 3);
       LivePendantPriority.MERCHANT_PENDANT_SLIDE_CONTAINER = livePendantP3;
       LivePendantPriority livePendantP4 = new LivePendantPriority("GINSENG_FRUIT", 4);
       LivePendantPriority.GINSENG_FRUIT = livePendantP4;
       LivePendantPriority livePendantP5 = new LivePendantPriority("AR_SKIN_TEST", 5);
       LivePendantPriority.AR_SKIN_TEST = livePendantP5;
       LivePendantPriority livePendantP6 = new LivePendantPriority("MERCHANT_DYNAMIC_PENDANT", 6);
       LivePendantPriority.MERCHANT_DYNAMIC_PENDANT = livePendantP6;
       LivePendantPriority livePendantP7 = new LivePendantPriority("MERCHANT_DYNAMIC_PENDANT_2", 7);
       LivePendantPriority.MERCHANT_DYNAMIC_PENDANT_2 = livePendantP7;
       LivePendantPriority livePendantP8 = new LivePendantPriority("MERCHANT_DYNAMIC_PENDANT_3", 8);
       LivePendantPriority.MERCHANT_DYNAMIC_PENDANT_3 = livePendantP8;
       LivePendantPriority livePendantP9 = new LivePendantPriority("MERCHANT_DYNAMIC_PENDANT_4", 9);
       LivePendantPriority.MERCHANT_DYNAMIC_PENDANT_4 = livePendantP9;
       LivePendantPriority livePendantP10 = new LivePendantPriority("MERCHANT_DYNAMIC_PENDANT_5", 10);
       LivePendantPriority.MERCHANT_DYNAMIC_PENDANT_5 = livePendantP10;
       LivePendantPriority livePendantP11 = new LivePendantPriority("CAROUSEL_PENDANT", 11);
       LivePendantPriority.CAROUSEL_PENDANT = livePendantP11;
       LivePendantPriority livePendantP12 = new LivePendantPriority("MERCHANT_616_PENDANT", 12);
       LivePendantPriority.MERCHANT_616_PENDANT = livePendantP12;
       LivePendantPriority livePendantP13 = new LivePendantPriority("MERCHANT_SPIKE_PENDANT", 13);
       LivePendantPriority.MERCHANT_SPIKE_PENDANT = livePendantP13;
       LivePendantPriority livePendantP14 = livePendantP13;
       LivePendantPriority livePendantP15 = new LivePendantPriority("MERCHANT_616_NOTICE_PENDANT", 14);
       LivePendantPriority.MERCHANT_616_NOTICE_PENDANT = livePendantP15;
       LivePendantPriority livePendantP16 = livePendantP15;
       LivePendantPriority livePendantP17 = new LivePendantPriority("LIVE_PK_SMALL_WINDOW", 15);
       LivePendantPriority.LIVE_PK_SMALL_WINDOW = livePendantP17;
       LivePendantPriority livePendantP18 = livePendantP17;
       livePendantP13 = new LivePendantPriority("RED_PACKET_RAIN", 16);
       LivePendantPriority.RED_PACKET_RAIN = livePendantP13;
       LivePendantPriority livePendantP19 = livePendantP13;
       livePendantP15 = new LivePendantPriority("RED_PACKET", 17);
       LivePendantPriority.RED_PACKET = livePendantP15;
       LivePendantPriority livePendantP20 = livePendantP15;
       livePendantP17 = new LivePendantPriority("LUCKY_STAR", 18);
       LivePendantPriority.LUCKY_STAR = livePendantP17;
       LivePendantPriority livePendantP21 = livePendantP17;
       livePendantP13 = new LivePendantPriority("SUPER_FANS_GROUP_LUCKY_BAG_PENDANT", 19);
       LivePendantPriority.SUPER_FANS_GROUP_LUCKY_BAG_PENDANT = livePendantP13;
       LivePendantPriority livePendantP22 = livePendantP13;
       livePendantP15 = new LivePendantPriority("VOICE_PARTY_KTV_ORDER_MUSIC", 20);
       LivePendantPriority.VOICE_PARTY_KTV_ORDER_MUSIC = livePendantP15;
       LivePendantPriority livePendantP23 = livePendantP15;
       livePendantP17 = new LivePendantPriority("VOICE_PARTY_THEATER_PLAY_LIST", 21);
       LivePendantPriority.VOICE_PARTY_THEATER_PLAY_LIST = livePendantP17;
       LivePendantPriority livePendantP24 = livePendantP17;
       livePendantP13 = new LivePendantPriority("ASK_QUESTION", 22);
       LivePendantPriority.ASK_QUESTION = livePendantP13;
       LivePendantPriority livePendantP25 = livePendantP13;
       livePendantP17 = new LivePendantPriority("ANSWERING_QUESTION", 23);
       LivePendantPriority.ANSWERING_QUESTION = livePendantP17;
       LivePendantPriority livePendantP26 = livePendantP17;
       livePendantP15 = new LivePendantPriority("COMMERCIAL_NEO_LIVE_COUPON", 24);
       LivePendantPriority.COMMERCIAL_NEO_LIVE_COUPON = livePendantP15;
       LivePendantPriority livePendantP27 = livePendantP15;
       livePendantP17 = new LivePendantPriority("MERCHANT_RISING_COUPON", 25);
       LivePendantPriority.MERCHANT_RISING_COUPON = livePendantP17;
       LivePendantPriority livePendantP28 = livePendantP17;
       livePendantP15 = new LivePendantPriority("MERCHANT_ASK_INTERPRET", 26);
       LivePendantPriority.MERCHANT_ASK_INTERPRET = livePendantP15;
       LivePendantPriority livePendantP29 = livePendantP15;
       livePendantP17 = new LivePendantPriority("MERCHANT_DYNAMIC_PENDANT_6", 27);
       LivePendantPriority.MERCHANT_DYNAMIC_PENDANT_6 = livePendantP17;
       LivePendantPriority livePendantP30 = livePendantP17;
       livePendantP15 = new LivePendantPriority("SANDEAGO", 28);
       LivePendantPriority.SANDEAGO = livePendantP15;
       LivePendantPriority livePendantP31 = livePendantP15;
       livePendantP17 = new LivePendantPriority("LIVE_LINE", 29);
       LivePendantPriority.LIVE_LINE = livePendantP17;
       LivePendantPriority livePendantP32 = livePendantP17;
       livePendantP15 = new LivePendantPriority("LIVE_PK", 30);
       LivePendantPriority.LIVE_PK = livePendantP15;
       LivePendantPriority livePendantP33 = livePendantP15;
       livePendantP17 = new LivePendantPriority("ASK_QUESTION_ANCHOR", 31);
       LivePendantPriority.ASK_QUESTION_ANCHOR = livePendantP17;
       LivePendantPriority livePendantP34 = livePendantP17;
       livePendantP15 = new LivePendantPriority("HOUSE_CONSULT_PENDANT", 32);
       LivePendantPriority.HOUSE_CONSULT_PENDANT = livePendantP15;
       LivePendantPriority livePendantP35 = livePendantP15;
       livePendantP17 = new LivePendantPriority("LOCAL_LIFE_PENDANT", 33);
       LivePendantPriority.LOCAL_LIFE_PENDANT = livePendantP17;
       LivePendantPriority livePendantP36 = livePendantP17;
       livePendantP15 = new LivePendantPriority("CHAT_BUTTON", 34);
       LivePendantPriority.CHAT_BUTTON = livePendantP15;
       LivePendantPriority livePendantP37 = livePendantP15;
       livePendantP17 = new LivePendantPriority("GZONE_GAME_PROMOTION", 35);
       LivePendantPriority.GZONE_GAME_PROMOTION = livePendantP17;
       LivePendantPriority livePendantP38 = livePendantP17;
       livePendantP15 = new LivePendantPriority("FEATURE_PAGER", 36);
       LivePendantPriority.FEATURE_PAGER = livePendantP15;
       LivePendantPriority livePendantP39 = livePendantP15;
       livePendantP17 = new LivePendantPriority("OPERATE_WIDGET", 37);
       LivePendantPriority.OPERATE_WIDGET = livePendantP17;
       LivePendantPriority livePendantP40 = livePendantP17;
       livePendantP15 = new LivePendantPriority("NEBULA_FANS_TOP_AWARD_LIVE", 38);
       LivePendantPriority.NEBULA_FANS_TOP_AWARD_LIVE = livePendantP15;
       LivePendantPriority livePendantP41 = livePendantP15;
       livePendantP17 = new LivePendantPriority("LIVE_PLUS", 39);
       LivePendantPriority.LIVE_PLUS = livePendantP17;
       LivePendantPriority livePendantP42 = livePendantP17;
       livePendantP15 = new LivePendantPriority("LIVE_BLIND", 40);
       LivePendantPriority.LIVE_BLIND = livePendantP15;
       LivePendantPriority livePendantP43 = livePendantP15;
       livePendantP17 = new LivePendantPriority("RECRUIT_INTERPRET", 41);
       LivePendantPriority.RECRUIT_INTERPRET = livePendantP17;
       LivePendantPriority livePendantP44 = livePendantP17;
       livePendantP15 = new LivePendantPriority("LIVE_INTERACTIVE_GUIDE_HIGH", 42);
       LivePendantPriority.LIVE_INTERACTIVE_GUIDE_HIGH = livePendantP15;
       LivePendantPriority livePendantP45 = livePendantP15;
       livePendantP17 = new LivePendantPriority("LIVE_ANCHOR_CONTENT_PROMOTION", 43);
       LivePendantPriority.LIVE_ANCHOR_CONTENT_PROMOTION = livePendantP17;
       LivePendantPriority livePendantP46 = livePendantP17;
       livePendantP15 = new LivePendantPriority("LARGE_STYLE_ACTIVITY_WIDGET", 44);
       LivePendantPriority.LARGE_STYLE_ACTIVITY_WIDGET = livePendantP15;
       LivePendantPriority livePendantP47 = livePendantP15;
       livePendantP17 = new LivePendantPriority("ACTIVITY_WIDGET", 45);
       LivePendantPriority.ACTIVITY_WIDGET = livePendantP17;
       LivePendantPriority livePendantP48 = livePendantP17;
       livePendantP15 = new LivePendantPriority("GZONE_ACTIVITY_WIDGET", 46);
       LivePendantPriority.GZONE_ACTIVITY_WIDGET = livePendantP15;
       LivePendantPriority livePendantP49 = livePendantP15;
       livePendantP17 = new LivePendantPriority("BROTHER_GROUP_BUY_PENDANT", 47);
       LivePendantPriority.BROTHER_GROUP_BUY_PENDANT = livePendantP17;
       LivePendantPriority livePendantP50 = livePendantP17;
       livePendantP15 = new LivePendantPriority("MERCHANT_DYNAMIC_PENDANT_7", 48);
       LivePendantPriority.MERCHANT_DYNAMIC_PENDANT_7 = livePendantP15;
       LivePendantPriority livePendantP51 = livePendantP15;
       livePendantP17 = new LivePendantPriority("LIVE_INTERACTIVE_GUIDE", 49);
       LivePendantPriority.LIVE_INTERACTIVE_GUIDE = livePendantP17;
       LivePendantPriority livePendantP52 = livePendantP17;
       livePendantP15 = new LivePendantPriority("INTERACTION_SCENE_PENDANT", 50);
       LivePendantPriority.INTERACTION_SCENE_PENDANT = livePendantP15;
       LivePendantPriority livePendantP53 = livePendantP15;
       livePendantP17 = new LivePendantPriority("BOTTOM", 51);
       LivePendantPriority.BOTTOM = livePendantP17;
       LivePendantPriority[] livePendantP54 = new LivePendantPriority[52];
       livePendantP54[0] = livePendantP;
       livePendantP54[1] = livePendantP1;
       livePendantP54[2] = livePendantP2;
       livePendantP54[3] = livePendantP3;
       livePendantP54[4] = livePendantP4;
       livePendantP54[5] = livePendantP5;
       livePendantP54[6] = livePendantP6;
       livePendantP54[7] = livePendantP7;
       livePendantP54[8] = livePendantP8;
       livePendantP54[9] = livePendantP9;
       livePendantP54[10] = livePendantP10;
       livePendantP54[11] = livePendantP11;
       livePendantP54[12] = livePendantP12;
       livePendantP54[13] = livePendantP14;
       livePendantP54[14] = livePendantP16;
       livePendantP54[15] = livePendantP18;
       livePendantP54[16] = livePendantP19;
       livePendantP54[17] = livePendantP20;
       livePendantP54[18] = livePendantP21;
       livePendantP54[19] = livePendantP22;
       livePendantP54[20] = livePendantP23;
       livePendantP54[21] = livePendantP24;
       livePendantP54[22] = livePendantP25;
       livePendantP54[23] = livePendantP26;
       livePendantP54[24] = livePendantP27;
       livePendantP54[25] = livePendantP28;
       livePendantP54[26] = livePendantP29;
       livePendantP54[27] = livePendantP30;
       livePendantP54[28] = livePendantP31;
       livePendantP54[29] = livePendantP32;
       livePendantP54[30] = livePendantP33;
       livePendantP54[31] = livePendantP34;
       livePendantP54[32] = livePendantP35;
       livePendantP54[33] = livePendantP36;
       livePendantP54[34] = livePendantP37;
       livePendantP54[35] = livePendantP38;
       livePendantP54[36] = livePendantP39;
       livePendantP54[37] = livePendantP40;
       livePendantP54[38] = livePendantP41;
       livePendantP54[39] = livePendantP42;
       livePendantP54[40] = livePendantP43;
       livePendantP54[41] = livePendantP44;
       livePendantP54[42] = livePendantP45;
       livePendantP54[43] = livePendantP46;
       livePendantP54[44] = livePendantP47;
       livePendantP54[45] = livePendantP48;
       livePendantP54[46] = livePendantP49;
       livePendantP54[47] = livePendantP50;
       livePendantP54[48] = livePendantP51;
       livePendantP54[49] = livePendantP52;
       livePendantP54[50] = livePendantP53;
       livePendantP54[51] = livePendantP17;
       LivePendantPriority.$VALUES = livePendantP54;
       LivePendantPriority.sDisplayRankMap = new HashMap();
       LivePendantPriority[] livePendantP55 = LivePendantPriority.values();
       int len = livePendantP55.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = livePendantP55[i];
          int i1 = oobject.ordinal() * 100;
          LivePendantPriority.sDisplayRankMap.put(oobject, Integer.valueOf(i1));
       }
       Map sDisplayRank = LivePendantPriority.sDisplayRankMap;
       sDisplayRank.put(LivePendantPriority.GZONE_ACTIVITY_WIDGET, Integer.valueOf(LivePendantPriority.after(LivePendantPriority.FEATURE_PAGER)));
       livePendantP17 = LivePendantPriority.BOTTOM;
       sDisplayRank.put(LivePendantPriority.GZONE_GAME_PROMOTION, Integer.valueOf(LivePendantPriority.after(livePendantP17)));
       sDisplayRank.put(LivePendantPriority.ASK_QUESTION, Integer.valueOf(LivePendantPriority.after(livePendantP17)));
       sDisplayRank.put(LivePendantPriority.VOICE_PARTY_KTV_ORDER_MUSIC, Integer.valueOf(LivePendantPriority.after(livePendantP17)));
       sDisplayRank.put(LivePendantPriority.VOICE_PARTY_THEATER_PLAY_LIST, Integer.valueOf(LivePendantPriority.after(livePendantP17)));
       sDisplayRank.put(LivePendantPriority.MERCHANT_INTERPRET, Integer.valueOf(LivePendantPriority.before(LivePendantPriority.RECRUIT_INTERPRET)));
    }
    public void LivePendantPriority(String p0,int p1){
       super(p0, p1);
    }
    public static int after(LivePendantPriority p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePendantPriority.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (p0.getDisplayRank() + 1);
    }
    public static int before(LivePendantPriority p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePendantPriority.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (p0.getDisplayRank() - 1);
    }
    public static LivePendantPriority valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePendantPriority.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePendantPriority.class, p0);
    }
    public static LivePendantPriority[] values(){
       Object obj = PatchProxy.apply(null, null, LivePendantPriority.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePendantPriority.$VALUES.clone();
    }
    public int getDisplayRank(){
       Integer obj = PatchProxy.apply(null, this, LivePendantPriority.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = LivePendantPriority.sDisplayRankMap.get(this);
       if (obj != null) {
          return obj.intValue();
       }
       return (this.ordinal() * 100);
    }
}
