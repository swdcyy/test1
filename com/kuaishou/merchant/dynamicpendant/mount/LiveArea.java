package com.kuaishou.merchant.dynamicpendant.mount.LiveArea;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveArea extends Enum	// class@001699
{
    public static final LiveArea[] $VALUES;
    public static final LiveArea ASSOCIATED_CONTENT_AREA;
    public static final LiveArea ATMOSPHERE_AREA;
    public static final LiveArea BOTTOM_BUBBLE_AREA;
    public static final LiveArea CENTER_MSG_BARRAGE;
    public static final LiveArea COMMENT_TOP_BARRAGE;
    public static final LiveArea CONTENT_ASSIST_AREA;
    public static final LiveArea GOODS_MESSAGE_AREA;
    public static final LiveArea INTERACTIVE_PLAY_AREA;
    public static final LiveArea LIVE_WATCH_AVATAR;
    public static final LiveArea MERCHANT_TOP_LEFT_AREA;
    public static final LiveArea RIGHT_BOTTOM_SLIDE_AREA;
    public static final LiveArea TEMP_ENHANCE_MESSAGE;
    public static final LiveArea TEMP_PLAY_AREA;

    static {
       LiveArea[] liveAreaArra = new LiveArea[13];
       LiveArea liveArea = new LiveArea("CONTENT_ASSIST_AREA", 0);
       LiveArea.CONTENT_ASSIST_AREA = liveArea;
       liveAreaArra[0] = liveArea;
       liveArea = new LiveArea("RIGHT_BOTTOM_SLIDE_AREA", 1);
       LiveArea.RIGHT_BOTTOM_SLIDE_AREA = liveArea;
       liveAreaArra[1] = liveArea;
       liveArea = new LiveArea("GOODS_MESSAGE_AREA", 2);
       LiveArea.GOODS_MESSAGE_AREA = liveArea;
       liveAreaArra[2] = liveArea;
       liveArea = new LiveArea("TEMP_PLAY_AREA", 3);
       LiveArea.TEMP_PLAY_AREA = liveArea;
       liveAreaArra[3] = liveArea;
       liveArea = new LiveArea("ASSOCIATED_CONTENT_AREA", 4);
       LiveArea.ASSOCIATED_CONTENT_AREA = liveArea;
       liveAreaArra[4] = liveArea;
       liveArea = new LiveArea("MERCHANT_TOP_LEFT_AREA", 5);
       LiveArea.MERCHANT_TOP_LEFT_AREA = liveArea;
       liveAreaArra[5] = liveArea;
       liveArea = new LiveArea("BOTTOM_BUBBLE_AREA", 6);
       LiveArea.BOTTOM_BUBBLE_AREA = liveArea;
       liveAreaArra[6] = liveArea;
       liveArea = new LiveArea("INTERACTIVE_PLAY_AREA", 7);
       LiveArea.INTERACTIVE_PLAY_AREA = liveArea;
       liveAreaArra[7] = liveArea;
       liveArea = new LiveArea("COMMENT_TOP_BARRAGE", 8);
       LiveArea.COMMENT_TOP_BARRAGE = liveArea;
       liveAreaArra[8] = liveArea;
       liveArea = new LiveArea("CENTER_MSG_BARRAGE", 9);
       LiveArea.CENTER_MSG_BARRAGE = liveArea;
       liveAreaArra[9] = liveArea;
       liveArea = new LiveArea("LIVE_WATCH_AVATAR", 10);
       LiveArea.LIVE_WATCH_AVATAR = liveArea;
       liveAreaArra[10] = liveArea;
       liveArea = new LiveArea("ATMOSPHERE_AREA", 11);
       LiveArea.ATMOSPHERE_AREA = liveArea;
       liveAreaArra[11] = liveArea;
       liveArea = new LiveArea("TEMP_ENHANCE_MESSAGE", 12);
       LiveArea.TEMP_ENHANCE_MESSAGE = liveArea;
       liveAreaArra[12] = liveArea;
       LiveArea.$VALUES = liveAreaArra;
    }
    public void LiveArea(String p0,int p1){
       super(p0, p1);
    }
    public static LiveArea valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveArea.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveArea.class, p0);
    }
    public static LiveArea[] values(){
       Object obj = PatchProxy.apply(null, null, LiveArea.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveArea.$VALUES.clone();
    }
}
