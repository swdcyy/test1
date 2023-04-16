package com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAudienceAccompanyType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGzoneAudienceAccompanyType extends Enum	// class@000b64
{
    public static final LiveGzoneAudienceAccompanyType[] $VALUES;
    public static final LiveGzoneAudienceAccompanyType LIVE_LINK;
    public static final LiveGzoneAudienceAccompanyType NORMAL;
    public static final LiveGzoneAudienceAccompanyType ONE_KEY_SDK;
    public static final LiveGzoneAudienceAccompanyType ROOM_LINK;

    static {
       LiveGzoneAudienceAccompanyType liveGzoneAud = new LiveGzoneAudienceAccompanyType("NORMAL", 0);
       LiveGzoneAudienceAccompanyType.NORMAL = liveGzoneAud;
       LiveGzoneAudienceAccompanyType liveGzoneAud1 = new LiveGzoneAudienceAccompanyType("ONE_KEY_SDK", 1);
       LiveGzoneAudienceAccompanyType.ONE_KEY_SDK = liveGzoneAud1;
       LiveGzoneAudienceAccompanyType liveGzoneAud2 = new LiveGzoneAudienceAccompanyType("LIVE_LINK", 2);
       LiveGzoneAudienceAccompanyType.LIVE_LINK = liveGzoneAud2;
       LiveGzoneAudienceAccompanyType liveGzoneAud3 = new LiveGzoneAudienceAccompanyType("ROOM_LINK", 3);
       LiveGzoneAudienceAccompanyType.ROOM_LINK = liveGzoneAud3;
       LiveGzoneAudienceAccompanyType[] liveGzoneAud4 = new LiveGzoneAudienceAccompanyType[]{liveGzoneAud,liveGzoneAud1,liveGzoneAud2,liveGzoneAud3};
       LiveGzoneAudienceAccompanyType.$VALUES = liveGzoneAud4;
    }
    public void LiveGzoneAudienceAccompanyType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveGzoneAudienceAccompanyType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneAudienceAccompanyType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneAudienceAccompanyType.class, p0);
    }
    public static LiveGzoneAudienceAccompanyType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneAudienceAccompanyType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneAudienceAccompanyType.$VALUES.clone();
    }
}
