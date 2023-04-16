package com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePendantContainerScene extends Enum	// class@000f9d
{
    public static final LivePendantContainerScene[] $VALUES;
    public static final LivePendantContainerScene ANCHOR_CHAT;
    public static final LivePendantContainerScene AUDIENCE_CHAT;
    public static final LivePendantContainerScene AUDIENCE_CHAT_APPLY_BUTTON;
    public static final LivePendantContainerScene AUDIENCE_VIDEO_CHAT;
    public static final LivePendantContainerScene GUEST_ACTIVITY_TOP_LIST_PORTRAIT;
    public static final LivePendantContainerScene GZONE_BANNER;
    public static final LivePendantContainerScene GZONE_NEW_TAB_STYLE_SCREEN_LANDSCAPE;
    public static final LivePendantContainerScene LIVE_LINE;
    public static final LivePendantContainerScene LIVE_MULTI_LINE;
    public static final LivePendantContainerScene LIVE_MULTI_PK;
    public static final LivePendantContainerScene MERCHANT_AUCTION_BUBBLE;
    public static final LivePendantContainerScene MERCHANT_SKIN;
    public static final LivePendantContainerScene MULTI_CHAT_CENTER_VIEW;
    public static final LivePendantContainerScene MULTI_TAB_STYLE;
    public static final LivePendantContainerScene PK;
    public static final LivePendantContainerScene PK_SMALL_WINDOW;
    public static final LivePendantContainerScene PLAY_CONFIG_LANDSCAPE;
    public static final LivePendantContainerScene PLAY_CONFIG_PORTRAIT;
    public static final LivePendantContainerScene REBROADCAST_PENDANT_RIGHT_BOTTOM;
    public static final LivePendantContainerScene REBROADCAST_PENDANT_RIGHT_TOP;
    public static final LivePendantContainerScene RECRUIT_EXPLAIN;
    public static final LivePendantContainerScene SCREEN_LANDSCAPE;
    public static final LivePendantContainerScene VOICE_PARTY_CROSS_ROOM_TEAM_PK;
    public static final LivePendantContainerScene VOICE_PARTY_KTV;
    public static final LivePendantContainerScene VOICE_PARTY_SEATS;
    public static final LivePendantContainerScene VOICE_PARTY_TEAM_PK;
    public static final LivePendantContainerScene VOICE_PARTY_THEATER;
    public static final LivePendantContainerScene VOICE_PARTY_VIDEO;

    static {
       LivePendantContainerScene livePendantC = new LivePendantContainerScene("MERCHANT_AUCTION_BUBBLE", 0);
       LivePendantContainerScene.MERCHANT_AUCTION_BUBBLE = livePendantC;
       LivePendantContainerScene livePendantC1 = new LivePendantContainerScene("MULTI_CHAT_CENTER_VIEW", 1);
       LivePendantContainerScene.MULTI_CHAT_CENTER_VIEW = livePendantC1;
       LivePendantContainerScene livePendantC2 = new LivePendantContainerScene("ANCHOR_CHAT", 2);
       LivePendantContainerScene.ANCHOR_CHAT = livePendantC2;
       LivePendantContainerScene livePendantC3 = new LivePendantContainerScene("AUDIENCE_CHAT", 3);
       LivePendantContainerScene.AUDIENCE_CHAT = livePendantC3;
       LivePendantContainerScene livePendantC4 = new LivePendantContainerScene("AUDIENCE_VIDEO_CHAT", 4);
       LivePendantContainerScene.AUDIENCE_VIDEO_CHAT = livePendantC4;
       LivePendantContainerScene livePendantC5 = new LivePendantContainerScene("AUDIENCE_CHAT_APPLY_BUTTON", 5);
       LivePendantContainerScene.AUDIENCE_CHAT_APPLY_BUTTON = livePendantC5;
       LivePendantContainerScene livePendantC6 = new LivePendantContainerScene("RECRUIT_EXPLAIN", 6);
       LivePendantContainerScene.RECRUIT_EXPLAIN = livePendantC6;
       LivePendantContainerScene livePendantC7 = new LivePendantContainerScene("REBROADCAST_PENDANT_RIGHT_TOP", 7);
       LivePendantContainerScene.REBROADCAST_PENDANT_RIGHT_TOP = livePendantC7;
       LivePendantContainerScene livePendantC8 = new LivePendantContainerScene("REBROADCAST_PENDANT_RIGHT_BOTTOM", 8);
       LivePendantContainerScene.REBROADCAST_PENDANT_RIGHT_BOTTOM = livePendantC8;
       LivePendantContainerScene livePendantC9 = new LivePendantContainerScene("PK_SMALL_WINDOW", 9);
       LivePendantContainerScene.PK_SMALL_WINDOW = livePendantC9;
       LivePendantContainerScene livePendantC10 = new LivePendantContainerScene("PK", 10);
       LivePendantContainerScene.PK = livePendantC10;
       LivePendantContainerScene livePendantC11 = new LivePendantContainerScene("LIVE_LINE", 11);
       LivePendantContainerScene.LIVE_LINE = livePendantC11;
       LivePendantContainerScene livePendantC12 = new LivePendantContainerScene("LIVE_MULTI_LINE", 12);
       LivePendantContainerScene.LIVE_MULTI_LINE = livePendantC12;
       LivePendantContainerScene livePendantC13 = new LivePendantContainerScene("LIVE_MULTI_PK", 13);
       LivePendantContainerScene.LIVE_MULTI_PK = livePendantC13;
       LivePendantContainerScene livePendantC14 = livePendantC13;
       LivePendantContainerScene livePendantC15 = new LivePendantContainerScene("VOICE_PARTY_KTV", 14);
       LivePendantContainerScene.VOICE_PARTY_KTV = livePendantC15;
       LivePendantContainerScene livePendantC16 = livePendantC15;
       LivePendantContainerScene livePendantC17 = new LivePendantContainerScene("VOICE_PARTY_THEATER", 15);
       LivePendantContainerScene.VOICE_PARTY_THEATER = livePendantC17;
       LivePendantContainerScene livePendantC18 = livePendantC17;
       livePendantC13 = new LivePendantContainerScene("VOICE_PARTY_TEAM_PK", 16);
       LivePendantContainerScene.VOICE_PARTY_TEAM_PK = livePendantC13;
       LivePendantContainerScene livePendantC19 = livePendantC13;
       livePendantC15 = new LivePendantContainerScene("VOICE_PARTY_CROSS_ROOM_TEAM_PK", 17);
       LivePendantContainerScene.VOICE_PARTY_CROSS_ROOM_TEAM_PK = livePendantC15;
       LivePendantContainerScene livePendantC20 = livePendantC15;
       livePendantC17 = new LivePendantContainerScene("VOICE_PARTY_VIDEO", 18);
       LivePendantContainerScene.VOICE_PARTY_VIDEO = livePendantC17;
       LivePendantContainerScene livePendantC21 = livePendantC17;
       livePendantC13 = new LivePendantContainerScene("VOICE_PARTY_SEATS", 19);
       LivePendantContainerScene.VOICE_PARTY_SEATS = livePendantC13;
       LivePendantContainerScene livePendantC22 = livePendantC13;
       livePendantC15 = new LivePendantContainerScene("GUEST_ACTIVITY_TOP_LIST_PORTRAIT", 20);
       LivePendantContainerScene.GUEST_ACTIVITY_TOP_LIST_PORTRAIT = livePendantC15;
       LivePendantContainerScene livePendantC23 = livePendantC15;
       livePendantC17 = new LivePendantContainerScene("GZONE_NEW_TAB_STYLE_SCREEN_LANDSCAPE", 21);
       LivePendantContainerScene.GZONE_NEW_TAB_STYLE_SCREEN_LANDSCAPE = livePendantC17;
       LivePendantContainerScene livePendantC24 = livePendantC17;
       livePendantC13 = new LivePendantContainerScene("GZONE_BANNER", 22);
       LivePendantContainerScene.GZONE_BANNER = livePendantC13;
       LivePendantContainerScene livePendantC25 = livePendantC13;
       livePendantC17 = new LivePendantContainerScene("MULTI_TAB_STYLE", 23);
       LivePendantContainerScene.MULTI_TAB_STYLE = livePendantC17;
       LivePendantContainerScene livePendantC26 = livePendantC17;
       livePendantC15 = new LivePendantContainerScene("MERCHANT_SKIN", 24);
       LivePendantContainerScene.MERCHANT_SKIN = livePendantC15;
       LivePendantContainerScene livePendantC27 = livePendantC15;
       livePendantC17 = new LivePendantContainerScene("PLAY_CONFIG_PORTRAIT", 25);
       LivePendantContainerScene.PLAY_CONFIG_PORTRAIT = livePendantC17;
       LivePendantContainerScene livePendantC28 = livePendantC17;
       livePendantC15 = new LivePendantContainerScene("PLAY_CONFIG_LANDSCAPE", 26);
       LivePendantContainerScene.PLAY_CONFIG_LANDSCAPE = livePendantC15;
       LivePendantContainerScene livePendantC29 = livePendantC15;
       livePendantC17 = new LivePendantContainerScene("SCREEN_LANDSCAPE", 27);
       LivePendantContainerScene.SCREEN_LANDSCAPE = livePendantC17;
       LivePendantContainerScene[] livePendantC30 = new LivePendantContainerScene[28];
       livePendantC30[0] = livePendantC;
       livePendantC30[1] = livePendantC1;
       livePendantC30[2] = livePendantC2;
       livePendantC30[3] = livePendantC3;
       livePendantC30[4] = livePendantC4;
       livePendantC30[5] = livePendantC5;
       livePendantC30[6] = livePendantC6;
       livePendantC30[7] = livePendantC7;
       livePendantC30[8] = livePendantC8;
       livePendantC30[9] = livePendantC9;
       livePendantC30[10] = livePendantC10;
       livePendantC30[11] = livePendantC11;
       livePendantC30[12] = livePendantC12;
       livePendantC30[13] = livePendantC14;
       livePendantC30[14] = livePendantC16;
       livePendantC30[15] = livePendantC18;
       livePendantC30[16] = livePendantC19;
       livePendantC30[17] = livePendantC20;
       livePendantC30[18] = livePendantC21;
       livePendantC30[19] = livePendantC22;
       livePendantC30[20] = livePendantC23;
       livePendantC30[21] = livePendantC24;
       livePendantC30[22] = livePendantC25;
       livePendantC30[23] = livePendantC26;
       livePendantC30[24] = livePendantC27;
       livePendantC30[25] = livePendantC28;
       livePendantC30[26] = livePendantC29;
       livePendantC30[27] = livePendantC17;
       LivePendantContainerScene.$VALUES = livePendantC30;
    }
    public void LivePendantContainerScene(String p0,int p1){
       super(p0, p1);
    }
    public static LivePendantContainerScene valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePendantContainerScene.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePendantContainerScene.class, p0);
    }
    public static LivePendantContainerScene[] values(){
       Object obj = PatchProxy.apply(null, null, LivePendantContainerScene.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePendantContainerScene.$VALUES.clone();
    }
}
