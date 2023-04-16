package com.kwai.feature.api.live.service.show.comments.LiveCommentsBiz;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveCommentsBiz extends Enum	// class@001013
{
    public static final LiveCommentsBiz[] $VALUES;
    public static final LiveCommentsBiz CHAT;
    public static final LiveCommentsBiz CHAT_NEW_STYLE_APPLY_ENTRANCE;
    public static final LiveCommentsBiz CHAT_SHADOW_VIEW;
    public static final LiveCommentsBiz COMBO_COMMENT;
    public static final LiveCommentsBiz COMMENT_NOTICE;
    public static final LiveCommentsBiz CONFIGURATION_CHANGED;
    public static final LiveCommentsBiz DEFAULT;
    public static final LiveCommentsBiz ENTER_ROOM_EFFECT;
    public static final LiveCommentsBiz FLOAT_ELEMENTS;
    public static final LiveCommentsBiz KEY_BOARD;
    public static final LiveCommentsBiz LIVE_ASK;
    public static final LiveCommentsBiz MERCHANT_BUBBLE;
    public static final LiveCommentsBiz MULTI_LINE;
    public static final LiveCommentsBiz MULTI_PK;
    public static final LiveCommentsBiz PURCHASE_FANS;
    public static final LiveCommentsBiz REBROADCAST_BANNER;
    public static final LiveCommentsBiz RIGHT_PENDANT;
    public static final LiveCommentsBiz VOICE_PARTY_THEATER_FULLSCREEN;
    public static final LiveCommentsBiz VOICE_PARTY_VIDEO_STYLE_V2;

    static {
       LiveCommentsBiz liveComments = new LiveCommentsBiz("DEFAULT", 0);
       LiveCommentsBiz.DEFAULT = liveComments;
       LiveCommentsBiz liveComments1 = new LiveCommentsBiz("CHAT_SHADOW_VIEW", 1);
       LiveCommentsBiz.CHAT_SHADOW_VIEW = liveComments1;
       LiveCommentsBiz liveComments2 = new LiveCommentsBiz("CHAT_NEW_STYLE_APPLY_ENTRANCE", 2);
       LiveCommentsBiz.CHAT_NEW_STYLE_APPLY_ENTRANCE = liveComments2;
       LiveCommentsBiz liveComments3 = new LiveCommentsBiz("RIGHT_PENDANT", 3);
       LiveCommentsBiz.RIGHT_PENDANT = liveComments3;
       LiveCommentsBiz liveComments4 = new LiveCommentsBiz("CHAT", 4);
       LiveCommentsBiz.CHAT = liveComments4;
       LiveCommentsBiz liveComments5 = new LiveCommentsBiz("MULTI_LINE", 5);
       LiveCommentsBiz.MULTI_LINE = liveComments5;
       LiveCommentsBiz liveComments6 = new LiveCommentsBiz("MULTI_PK", 6);
       LiveCommentsBiz.MULTI_PK = liveComments6;
       LiveCommentsBiz liveComments7 = new LiveCommentsBiz("VOICE_PARTY_THEATER_FULLSCREEN", 7);
       LiveCommentsBiz.VOICE_PARTY_THEATER_FULLSCREEN = liveComments7;
       LiveCommentsBiz liveComments8 = new LiveCommentsBiz("VOICE_PARTY_VIDEO_STYLE_V2", 8);
       LiveCommentsBiz.VOICE_PARTY_VIDEO_STYLE_V2 = liveComments8;
       LiveCommentsBiz liveComments9 = new LiveCommentsBiz("LIVE_ASK", 9);
       LiveCommentsBiz.LIVE_ASK = liveComments9;
       LiveCommentsBiz liveComments10 = new LiveCommentsBiz("REBROADCAST_BANNER", 10);
       LiveCommentsBiz.REBROADCAST_BANNER = liveComments10;
       LiveCommentsBiz liveComments11 = new LiveCommentsBiz("MERCHANT_BUBBLE", 11);
       LiveCommentsBiz.MERCHANT_BUBBLE = liveComments11;
       LiveCommentsBiz liveComments12 = new LiveCommentsBiz("PURCHASE_FANS", 12);
       LiveCommentsBiz.PURCHASE_FANS = liveComments12;
       LiveCommentsBiz liveComments13 = new LiveCommentsBiz("KEY_BOARD", 13);
       LiveCommentsBiz.KEY_BOARD = liveComments13;
       LiveCommentsBiz liveComments14 = liveComments13;
       LiveCommentsBiz liveComments15 = new LiveCommentsBiz("COMMENT_NOTICE", 14);
       LiveCommentsBiz.COMMENT_NOTICE = liveComments15;
       LiveCommentsBiz liveComments16 = liveComments15;
       LiveCommentsBiz liveComments17 = new LiveCommentsBiz("COMBO_COMMENT", 15);
       LiveCommentsBiz.COMBO_COMMENT = liveComments17;
       LiveCommentsBiz liveComments18 = liveComments17;
       liveComments13 = new LiveCommentsBiz("ENTER_ROOM_EFFECT", 16);
       LiveCommentsBiz.ENTER_ROOM_EFFECT = liveComments13;
       LiveCommentsBiz liveComments19 = liveComments13;
       liveComments15 = new LiveCommentsBiz("CONFIGURATION_CHANGED", 17);
       LiveCommentsBiz.CONFIGURATION_CHANGED = liveComments15;
       LiveCommentsBiz liveComments20 = liveComments15;
       liveComments17 = new LiveCommentsBiz("FLOAT_ELEMENTS", 18);
       LiveCommentsBiz.FLOAT_ELEMENTS = liveComments17;
       LiveCommentsBiz[] liveComments21 = new LiveCommentsBiz[19];
       liveComments21[0] = liveComments;
       liveComments21[1] = liveComments1;
       liveComments21[2] = liveComments2;
       liveComments21[3] = liveComments3;
       liveComments21[4] = liveComments4;
       liveComments21[5] = liveComments5;
       liveComments21[6] = liveComments6;
       liveComments21[7] = liveComments7;
       liveComments21[8] = liveComments8;
       liveComments21[9] = liveComments9;
       liveComments21[10] = liveComments10;
       liveComments21[11] = liveComments11;
       liveComments21[12] = liveComments12;
       liveComments21[13] = liveComments14;
       liveComments21[14] = liveComments16;
       liveComments21[15] = liveComments18;
       liveComments21[16] = liveComments19;
       liveComments21[17] = liveComments20;
       liveComments21[18] = liveComments17;
       LiveCommentsBiz.$VALUES = liveComments21;
    }
    public void LiveCommentsBiz(String p0,int p1){
       super(p0, p1);
    }
    public static LiveCommentsBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveCommentsBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveCommentsBiz.class, p0);
    }
    public static LiveCommentsBiz[] values(){
       Object obj = PatchProxy.apply(null, null, LiveCommentsBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCommentsBiz.$VALUES.clone();
    }
}
