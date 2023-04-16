package com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys;
import java.lang.Enum;
import com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys$From;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.common.keyswitch.b$d;
import com.kwai.live.gzone.common.keyswitch.b;

public final class LiveGzoneKeys extends Enum	// class@000caf
{
    public Object defaultValue;
    public LiveGzoneKeys$From from;
    public String key;
    public static final LiveGzoneKeys[] $VALUES;
    public static final LiveGzoneKeys KEY_BLOCK_GZONE_FANS_GROUP_GIFT_EFFECT;
    public static final LiveGzoneKeys KEY_DEV_DEBUG_TOAST;
    public static final LiveGzoneKeys KEY_DEV_GZONE_HIDE_ACCOMPANY;
    public static final LiveGzoneKeys KEY_DEV_GZONE_HIDE_TREASURE_BOX;
    public static final LiveGzoneKeys KEY_DEV_GZONE_HIDE_TURNTABLE;
    public static final LiveGzoneKeys KEY_DEV_GZONE_MASTER_ACTIVITY_SWITCH;
    public static final LiveGzoneKeys KEY_DEV_KDS_DEBUG;
    public static final LiveGzoneKeys KEY_DEV_KRN;
    public static final LiveGzoneKeys KEY_DEV_LIVE_GZONE_TAB_CONFIG;
    public static final LiveGzoneKeys KEY_DEV_LIVE_GZONE_UI_STYLE;
    public static final LiveGzoneKeys KEY_DEV_LIVE_SHOW_FORCE_GRPR;
    public static final LiveGzoneKeys KEY_DEV_LIVE_SHOW_FORCE_VIDEO_TEXT;
    public static final LiveGzoneKeys KEY_DEV_LIVE_SHOW_FORCE_X_STREAM;
    public static final LiveGzoneKeys KEY_DEV_LIVE_SHOW_MULTI_TAB;
    public static final LiveGzoneKeys KEY_ENABLE_LIVE_GAME_PASSWORD_LOTTERY_FEATURE;
    public static final LiveGzoneKeys KEY_SIWTCH_EFFECT_WISH;
    public static final LiveGzoneKeys KEY_SWITCH_COMPETITION_TAB;
    public static final LiveGzoneKeys KEY_SWITCH_CONFIG_USER_OPT;
    public static final LiveGzoneKeys KEY_SWITCH_ENABLE_BOTTOM_NOTICE_ALERT;
    public static final LiveGzoneKeys KEY_SWITCH_ENABLE_ENTER_ROOM_WIDGETS;
    public static final LiveGzoneKeys KEY_SWITCH_ENABLE_GAME_ACTIVITY_WIDGETS;
    public static final LiveGzoneKeys KEY_SWITCH_ENABLE_GAME_PROMOTION_CARD;
    public static final LiveGzoneKeys KEY_SWITCH_ENABLE_GAME_TV_VIDEO_TAB;
    public static final LiveGzoneKeys KEY_SWITCH_ENABLE_GZONE_HOURLY_RANK;
    public static final LiveGzoneKeys KEY_SWITCH_ENABLE_LIVE_GZONE_PROP_SHOP_TIP;
    public static final LiveGzoneKeys KEY_SWITCH_GUESS_SQUARE;
    public static final LiveGzoneKeys KEY_SWITCH_GZONE_HIDE_TOP_PENDANT_AREA;
    public static final LiveGzoneKeys KEY_SWITCH_GZONE_HISTORY_COMMENTS;
    public static final LiveGzoneKeys KEY_SWITCH_GZONE_SPORT_BROADCAST;
    public static final LiveGzoneKeys KEY_SWITCH_GZONE_VOTE;
    public static final LiveGzoneKeys KEY_SWITCH_JOYPAD_NOTICE_STYLE;
    public static final LiveGzoneKeys KEY_SWITCH_KDS;
    public static final LiveGzoneKeys KEY_SWITCH_KRN_COMPETITION_SCHEDULE;
    public static final LiveGzoneKeys KEY_SWITCH_KRN_DIALOG;
    public static final LiveGzoneKeys KEY_SWITCH_LIVE_GZONE_ENABLE_NEW_MULTI_PK;
    public static final LiveGzoneKeys KEY_SWITCH_LIVE_GZONE_SHOW_PROMOTION_IN_NON_GAME_LIVE;
    public static final LiveGzoneKeys KEY_SWITCH_LIVE_SHOW_MULTI_TAB;
    public static final LiveGzoneKeys KEY_SWITCH_PENDANT_SCALE;
    public static final LiveGzoneKeys KEY_SWITCH_PRESENTER_SCATTER_OPT;
    public static final LiveGzoneKeys KEY_SWITCH_PURE_STYLE;
    public static final LiveGzoneKeys KEY_SWITCH_SIGN_IN_TREASURE_BOX;
    public static final LiveGzoneKeys KEY_SWITCH_SPREAD_GOLD;
    public static final LiveGzoneKeys KEY_SWITCH_TOP_RIGHT_PENDANT;
    public static final LiveGzoneKeys KEY_SWITCH_TREASURE_BOX_TASK_TIP;
    public static final LiveGzoneKeys KEY_SYSTEM_BAR_LOG;

    static {
       LiveGzoneKeys$From sWITCH = LiveGzoneKeys$From.SWITCH;
       Integer integer = Integer.valueOf(0);
       LiveGzoneKeys liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_JOYPAD_NOTICE_STYLE", 0, "gzoneJoypadNoticeStyle", sWITCH, integer);
       LiveGzoneKeys.KEY_SWITCH_JOYPAD_NOTICE_STYLE = v6;
       LiveGzoneKeys$From dEV = LiveGzoneKeys$From.DEV;
       LiveGzoneKeys liveGzoneKey1 = new LiveGzoneKeys("KEY_DEV_GZONE_MASTER_ACTIVITY_SWITCH", 1, "KEY_DEV_GZONE_MASTER_ACTIVITY_SWITCH", dEV);
       LiveGzoneKeys.KEY_DEV_GZONE_MASTER_ACTIVITY_SWITCH = liveGzoneKey1;
       LiveGzoneKeys liveGzoneKey2 = new LiveGzoneKeys("KEY_DEV_GZONE_HIDE_TREASURE_BOX", 2, "KEY_DEV_GZONE_HIDE_TREASURE_BOX", dEV);
       LiveGzoneKeys.KEY_DEV_GZONE_HIDE_TREASURE_BOX = liveGzoneKey2;
       LiveGzoneKeys liveGzoneKey3 = new LiveGzoneKeys("KEY_DEV_GZONE_HIDE_TURNTABLE", 3, "KEY_DEV_GZONE_HIDE_TURNTABLE", dEV);
       LiveGzoneKeys.KEY_DEV_GZONE_HIDE_TURNTABLE = liveGzoneKey3;
       LiveGzoneKeys liveGzoneKey4 = new LiveGzoneKeys("KEY_DEV_GZONE_HIDE_ACCOMPANY", 4, "KEY_DEV_GZONE_HIDE_ACCOMPANY", dEV);
       LiveGzoneKeys.KEY_DEV_GZONE_HIDE_ACCOMPANY = liveGzoneKey4;
       LiveGzoneKeys liveGzoneKey5 = liveGzoneKey4;
       LiveGzoneKeys$From uFrom = dEV;
       Integer integer1 = integer;
       liveGzoneKey = new LiveGzoneKeys("KEY_DEV_LIVE_GZONE_UI_STYLE", 5, "KEY_LIVE_GZONE_UI_STYLE", uFrom, integer1);
       LiveGzoneKeys.KEY_DEV_LIVE_GZONE_UI_STYLE = v16;
       liveGzoneKey = new LiveGzoneKeys("KEY_DEV_LIVE_GZONE_TAB_CONFIG", 6, "KEY_DEV_LIVE_GZONE_TAB_CONFIG", uFrom, integer1);
       LiveGzoneKeys.KEY_DEV_LIVE_GZONE_TAB_CONFIG = v20;
       LiveGzoneKeys liveGzoneKey6 = new LiveGzoneKeys("KEY_SWITCH_ENABLE_LIVE_GZONE_PROP_SHOP_TIP", 7, "liveGzoneWzryPromptCard", sWITCH);
       LiveGzoneKeys.KEY_SWITCH_ENABLE_LIVE_GZONE_PROP_SHOP_TIP = liveGzoneKey6;
       LiveGzoneKeys liveGzoneKey7 = liveGzoneKey6;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_TREASURE_BOX_TASK_TIP", 8, "liveGzoneTreasureBoxTaskTip", sWITCH, integer);
       LiveGzoneKeys.KEY_SWITCH_TREASURE_BOX_TASK_TIP = v21;
       liveGzoneKey6 = new LiveGzoneKeys("KEY_SWITCH_ENABLE_GAME_PROMOTION_CARD", 9, "liveGzonePromotionCard", sWITCH);
       LiveGzoneKeys.KEY_SWITCH_ENABLE_GAME_PROMOTION_CARD = liveGzoneKey6;
       LiveGzoneKeys liveGzoneKey8 = new LiveGzoneKeys("KEY_SWITCH_ENABLE_GZONE_HOURLY_RANK", 10, "liveGzoneHourlyRank", sWITCH);
       LiveGzoneKeys.KEY_SWITCH_ENABLE_GZONE_HOURLY_RANK = liveGzoneKey8;
       LiveGzoneKeys liveGzoneKey9 = liveGzoneKey8;
       LiveGzoneKeys liveGzoneKey10 = liveGzoneKey6;
       liveGzoneKey = new LiveGzoneKeys("KEY_DEV_DEBUG_TOAST", 11, "KEY_DEV_DEBUG_TOAST", dEV, null);
       LiveGzoneKeys.KEY_DEV_DEBUG_TOAST = v24;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_KDS", 12, "LiveGzoneKDSTurntableDialog", sWITCH, false);
       LiveGzoneKeys.KEY_SWITCH_KDS = v27;
       uFrom = dEV;
       liveGzoneKey = new LiveGzoneKeys("KEY_DEV_KDS_DEBUG", 13, "KEY_DEV_KDS_DEBUG", uFrom, false);
       LiveGzoneKeys.KEY_DEV_KDS_DEBUG = v30;
       liveGzoneKey = new LiveGzoneKeys("KEY_DEV_KRN", 14, "KEY_DEV_KRN", uFrom, false);
       LiveGzoneKeys.KEY_DEV_KRN = v31;
       liveGzoneKey = new LiveGzoneKeys("KEY_DEV_LIVE_SHOW_MULTI_TAB", 15, "KEY_DEV_LIVE_SHOW_MULTI_TAB", uFrom, false);
       LiveGzoneKeys.KEY_DEV_LIVE_SHOW_MULTI_TAB = v32;
       uFrom = sWITCH;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_GUESS_SQUARE", 16, "liveGzoneGuessSquare", uFrom, false);
       LiveGzoneKeys.KEY_SWITCH_GUESS_SQUARE = v33;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_LIVE_SHOW_MULTI_TAB", 17, "multiTabLiveEnable", uFrom, false);
       LiveGzoneKeys.KEY_SWITCH_LIVE_SHOW_MULTI_TAB = v34;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_SPREAD_GOLD", 18, "liveGzoneSpreadGold", uFrom, false);
       LiveGzoneKeys.KEY_SWITCH_SPREAD_GOLD = v35;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_COMPETITION_TAB", 19, "LiveGzoneCompetitionTab", uFrom, false);
       LiveGzoneKeys.KEY_SWITCH_COMPETITION_TAB = v36;
       uFrom = dEV;
       liveGzoneKey = new LiveGzoneKeys("KEY_DEV_LIVE_SHOW_FORCE_GRPR", 20, "KEY_DEV_LIVE_SHOW_FORCE_GRPR", uFrom, false);
       LiveGzoneKeys.KEY_DEV_LIVE_SHOW_FORCE_GRPR = v37;
       liveGzoneKey = new LiveGzoneKeys("KEY_DEV_LIVE_SHOW_FORCE_VIDEO_TEXT", 21, "KEY_DEV_LIVE_SHOW_FORCE_VIDEO_TEXT", uFrom, false);
       LiveGzoneKeys.KEY_DEV_LIVE_SHOW_FORCE_VIDEO_TEXT = v38;
       liveGzoneKey = new LiveGzoneKeys("KEY_DEV_LIVE_SHOW_FORCE_X_STREAM", 22, "KEY_DEV_LIVE_SHOW_FORCE_X_STREAM", uFrom, false);
       LiveGzoneKeys.KEY_DEV_LIVE_SHOW_FORCE_X_STREAM = v39;
       uFrom = sWITCH;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_PENDANT_SCALE", 23, "gzonePendantScale", uFrom, false);
       LiveGzoneKeys.KEY_SWITCH_PENDANT_SCALE = dEV;
       liveGzoneKey = new LiveGzoneKeys("KEY_ENABLE_LIVE_GAME_PASSWORD_LOTTERY_FEATURE", 24, "enableLiveGamePasswordLotteryFeature", uFrom, false);
       LiveGzoneKeys.KEY_ENABLE_LIVE_GAME_PASSWORD_LOTTERY_FEATURE = v40;
       liveGzoneKey = new LiveGzoneKeys("KEY_SYSTEM_BAR_LOG", 25, "gzoneLiveSystemBar", uFrom, false);
       LiveGzoneKeys.KEY_SYSTEM_BAR_LOG = v41;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_LIVE_GZONE_ENABLE_NEW_MULTI_PK", 26, "enableGzoneNewMultiPK", uFrom, true);
       LiveGzoneKeys.KEY_SWITCH_LIVE_GZONE_ENABLE_NEW_MULTI_PK = v42;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_LIVE_GZONE_SHOW_PROMOTION_IN_NON_GAME_LIVE", 27, "showPromotionViewInNonGzoneLive", uFrom, true);
       LiveGzoneKeys.KEY_SWITCH_LIVE_GZONE_SHOW_PROMOTION_IN_NON_GAME_LIVE = v43;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_SIGN_IN_TREASURE_BOX", 28, "LiveGzoneSignInBox", uFrom, false);
       LiveGzoneKeys.KEY_SWITCH_SIGN_IN_TREASURE_BOX = v44;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_ENABLE_BOTTOM_NOTICE_ALERT", 29, "enableLiveGameBottomNoticeAlert", uFrom, true);
       LiveGzoneKeys.KEY_SWITCH_ENABLE_BOTTOM_NOTICE_ALERT = v45;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_ENABLE_ENTER_ROOM_WIDGETS", 30, "enableLiveGameEnterRoomWidgets", uFrom, true);
       LiveGzoneKeys.KEY_SWITCH_ENABLE_ENTER_ROOM_WIDGETS = v46;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_ENABLE_GAME_ACTIVITY_WIDGETS", 31, "enableLiveGameActivityWidgets", uFrom, true);
       LiveGzoneKeys.KEY_SWITCH_ENABLE_GAME_ACTIVITY_WIDGETS = v47;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_KRN_COMPETITION_SCHEDULE", 32, "GzoneLiveGameCompetitionSchedule", uFrom, false);
       LiveGzoneKeys.KEY_SWITCH_KRN_COMPETITION_SCHEDULE = v48;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_ENABLE_GAME_TV_VIDEO_TAB", 33, "GzoneLiveGameTvDeleteVideoTab", uFrom, false);
       LiveGzoneKeys.KEY_SWITCH_ENABLE_GAME_TV_VIDEO_TAB = v49;
       liveGzoneKey = new LiveGzoneKeys("KEY_SIWTCH_EFFECT_WISH", 34, "LiveGzoneWishListEffectKey", uFrom, integer);
       LiveGzoneKeys.KEY_SIWTCH_EFFECT_WISH = v50;
       liveGzoneKey = new LiveGzoneKeys("KEY_BLOCK_GZONE_FANS_GROUP_GIFT_EFFECT", 35, "shouldBlockGzoneFansGroupGiftEffect", uFrom, false);
       LiveGzoneKeys.KEY_BLOCK_GZONE_FANS_GROUP_GIFT_EFFECT = v51;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_GZONE_VOTE", 36, "gzone_live_game_wish_vote", uFrom, false);
       LiveGzoneKeys.KEY_SWITCH_GZONE_VOTE = v52;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_GZONE_HISTORY_COMMENTS", 37, "GzoneliveHistoryCommentsKey", uFrom, false);
       LiveGzoneKeys.KEY_SWITCH_GZONE_HISTORY_COMMENTS = v53;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_GZONE_SPORT_BROADCAST", 38, "enableLiveSportBroadcast", uFrom, false);
       LiveGzoneKeys.KEY_SWITCH_GZONE_SPORT_BROADCAST = v54;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_GZONE_HIDE_TOP_PENDANT_AREA", 39, "gzoneHideTopPendantArea", uFrom, true);
       LiveGzoneKeys.KEY_SWITCH_GZONE_HIDE_TOP_PENDANT_AREA = v55;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_CONFIG_USER_OPT", 40, "enableConfigUserOptimization", uFrom, false);
       LiveGzoneKeys.KEY_SWITCH_CONFIG_USER_OPT = v56;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_PRESENTER_SCATTER_OPT", 41, "GzonePresenterScatterOpt", uFrom, false);
       LiveGzoneKeys.KEY_SWITCH_PRESENTER_SCATTER_OPT = v57;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_PURE_STYLE", 42, "liveGzonePureversion", uFrom, integer);
       LiveGzoneKeys.KEY_SWITCH_PURE_STYLE = v58;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_KRN_DIALOG", 43, "gzoneKRNDialogEnable", uFrom, true);
       LiveGzoneKeys.KEY_SWITCH_KRN_DIALOG = integer;
       liveGzoneKey = new LiveGzoneKeys("KEY_SWITCH_TOP_RIGHT_PENDANT", 44, "gzoneTopRightPendantEnable", uFrom, true);
       LiveGzoneKeys.KEY_SWITCH_TOP_RIGHT_PENDANT = v59;
       LiveGzoneKeys[] liveGzoneKey11 = new LiveGzoneKeys[45];
       liveGzoneKey11[0] = v6;
       liveGzoneKey11[1] = liveGzoneKey1;
       liveGzoneKey11[2] = liveGzoneKey2;
       liveGzoneKey11[3] = liveGzoneKey3;
       liveGzoneKey11[4] = liveGzoneKey5;
       liveGzoneKey11[5] = v16;
       liveGzoneKey11[6] = v20;
       liveGzoneKey11[7] = liveGzoneKey7;
       liveGzoneKey11[8] = v21;
       liveGzoneKey11[9] = liveGzoneKey10;
       liveGzoneKey11[10] = liveGzoneKey9;
       liveGzoneKey11[11] = v24;
       liveGzoneKey11[12] = v27;
       liveGzoneKey11[13] = v30;
       liveGzoneKey11[14] = v31;
       liveGzoneKey11[15] = v32;
       liveGzoneKey11[16] = v33;
       liveGzoneKey11[17] = v34;
       liveGzoneKey11[18] = v35;
       liveGzoneKey11[19] = v36;
       liveGzoneKey11[20] = v37;
       liveGzoneKey11[21] = v38;
       liveGzoneKey11[22] = v39;
       liveGzoneKey11[23] = dEV;
       liveGzoneKey11[24] = v40;
       liveGzoneKey11[25] = v41;
       liveGzoneKey11[26] = v42;
       liveGzoneKey11[27] = v43;
       liveGzoneKey11[28] = v44;
       liveGzoneKey11[29] = v45;
       liveGzoneKey11[30] = v46;
       liveGzoneKey11[31] = v47;
       liveGzoneKey11[32] = v48;
       liveGzoneKey11[33] = v49;
       liveGzoneKey11[34] = v50;
       liveGzoneKey11[35] = v51;
       liveGzoneKey11[36] = v52;
       liveGzoneKey11[37] = v53;
       liveGzoneKey11[38] = v54;
       liveGzoneKey11[39] = v55;
       liveGzoneKey11[40] = v56;
       liveGzoneKey11[41] = v57;
       liveGzoneKey11[42] = v58;
       liveGzoneKey11[43] = integer;
       liveGzoneKey11[44] = v59;
       LiveGzoneKeys.$VALUES = liveGzoneKey11;
    }
    public void LiveGzoneKeys(String p0,int p1,String p2,LiveGzoneKeys$From p3){
       super(p0, p1);
       this.key = "";
       this.key = p2;
       this.from = p3;
       this.defaultValue = Boolean.FALSE;
    }
    public void LiveGzoneKeys(String p0,int p1,String p2,LiveGzoneKeys$From p3,Integer p4){
       super(p0, p1);
       this.key = "";
       this.key = p2;
       this.from = p3;
       this.defaultValue = p4;
    }
    public void LiveGzoneKeys(String p0,int p1,String p2,LiveGzoneKeys$From p3,boolean p4){
       super(p0, p1);
       this.key = "";
       this.key = p2;
       this.from = p3;
       this.defaultValue = Boolean.valueOf(p4);
    }
    public static LiveGzoneKeys valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneKeys.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneKeys.class, p0);
    }
    public static LiveGzoneKeys[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneKeys.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneKeys.$VALUES.clone();
    }
    public Object defaultValue(){
       return this.defaultValue;
    }
    public LiveGzoneKeys$From from(){
       return this.from;
    }
    public b$d getter(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneKeys.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b().a(this);
    }
    public String key(){
       return this.key;
    }
}
