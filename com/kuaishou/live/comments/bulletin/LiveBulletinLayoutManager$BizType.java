package com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$BizType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveBulletinLayoutManager$BizType extends Enum	// class@000e37
{
    public static final LiveBulletinLayoutManager$BizType[] $VALUES;
    public static final LiveBulletinLayoutManager$BizType DEFAULT_RIGHT_SPACE;
    public static final LiveBulletinLayoutManager$BizType GIFT_BOX_PANEL;
    public static final LiveBulletinLayoutManager$BizType LITE_LAYOUT_MANAGER;
    public static final LiveBulletinLayoutManager$BizType LIVE_LINE_CHAT;
    public static final LiveBulletinLayoutManager$BizType LIVE_RIGHT_PENDANT;
    public static final LiveBulletinLayoutManager$BizType MAGIC_BOX;
    public static final LiveBulletinLayoutManager$BizType VOICE_PARTY_THEATER_FULL_SCREEN;
    public static final LiveBulletinLayoutManager$BizType VOICE_PARTY_VIDEO_CHAT;

    static {
       LiveBulletinLayoutManager$BizType uBizType;
       LiveBulletinLayoutManager$BizType[] uBizTypeArra = new LiveBulletinLayoutManager$BizType[]{uBizType,uBizType,uBizType,uBizType,uBizType,uBizType,uBizType,uBizType};
       uBizType = new LiveBulletinLayoutManager$BizType("DEFAULT_RIGHT_SPACE", 0);
       LiveBulletinLayoutManager$BizType.DEFAULT_RIGHT_SPACE = uBizType;
       uBizType = new LiveBulletinLayoutManager$BizType("VOICE_PARTY_VIDEO_CHAT", 1);
       LiveBulletinLayoutManager$BizType.VOICE_PARTY_VIDEO_CHAT = uBizType;
       uBizType = new LiveBulletinLayoutManager$BizType("VOICE_PARTY_THEATER_FULL_SCREEN", 2);
       LiveBulletinLayoutManager$BizType.VOICE_PARTY_THEATER_FULL_SCREEN = uBizType;
       uBizType = new LiveBulletinLayoutManager$BizType("LIVE_LINE_CHAT", 3);
       LiveBulletinLayoutManager$BizType.LIVE_LINE_CHAT = uBizType;
       uBizType = new LiveBulletinLayoutManager$BizType("LIVE_RIGHT_PENDANT", 4);
       LiveBulletinLayoutManager$BizType.LIVE_RIGHT_PENDANT = uBizType;
       uBizType = new LiveBulletinLayoutManager$BizType("LITE_LAYOUT_MANAGER", 5);
       LiveBulletinLayoutManager$BizType.LITE_LAYOUT_MANAGER = uBizType;
       uBizType = new LiveBulletinLayoutManager$BizType("MAGIC_BOX", 6);
       LiveBulletinLayoutManager$BizType.MAGIC_BOX = uBizType;
       uBizType = new LiveBulletinLayoutManager$BizType("GIFT_BOX_PANEL", 7);
       LiveBulletinLayoutManager$BizType.GIFT_BOX_PANEL = uBizType;
       LiveBulletinLayoutManager$BizType.$VALUES = uBizTypeArra;
    }
    public void LiveBulletinLayoutManager$BizType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveBulletinLayoutManager$BizType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveBulletinLayoutManager$BizType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveBulletinLayoutManager$BizType.class, p0);
    }
    public static LiveBulletinLayoutManager$BizType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveBulletinLayoutManager$BizType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveBulletinLayoutManager$BizType.$VALUES.clone();
    }
}
