package com.kuaishou.live.common.core.basic.player.AdaptPlayViewReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AdaptPlayViewReason extends Enum	// class@000eb2
{
    public static final AdaptPlayViewReason[] $VALUES;
    public static final AdaptPlayViewReason DEFAULT;
    public static final AdaptPlayViewReason MULTI_CHAT_VIDEO_CHATTING_FIT;
    public static final AdaptPlayViewReason VIDEO_CHATTING_END;
    public static final AdaptPlayViewReason VIDEO_CHATTING_START;
    public static final AdaptPlayViewReason VIDEO_CHATTING_THEME_SWITCH;

    static {
       AdaptPlayViewReason uAdaptPlayVi = new AdaptPlayViewReason("VIDEO_CHATTING_START", 0);
       AdaptPlayViewReason.VIDEO_CHATTING_START = uAdaptPlayVi;
       AdaptPlayViewReason uAdaptPlayVi1 = new AdaptPlayViewReason("VIDEO_CHATTING_THEME_SWITCH", 1);
       AdaptPlayViewReason.VIDEO_CHATTING_THEME_SWITCH = uAdaptPlayVi1;
       AdaptPlayViewReason uAdaptPlayVi2 = new AdaptPlayViewReason("VIDEO_CHATTING_END", 2);
       AdaptPlayViewReason.VIDEO_CHATTING_END = uAdaptPlayVi2;
       AdaptPlayViewReason uAdaptPlayVi3 = new AdaptPlayViewReason("MULTI_CHAT_VIDEO_CHATTING_FIT", 3);
       AdaptPlayViewReason.MULTI_CHAT_VIDEO_CHATTING_FIT = uAdaptPlayVi3;
       AdaptPlayViewReason uAdaptPlayVi4 = new AdaptPlayViewReason("DEFAULT", 4);
       AdaptPlayViewReason.DEFAULT = uAdaptPlayVi4;
       AdaptPlayViewReason[] uAdaptPlayVi5 = new AdaptPlayViewReason[]{uAdaptPlayVi,uAdaptPlayVi1,uAdaptPlayVi2,uAdaptPlayVi3,uAdaptPlayVi4};
       AdaptPlayViewReason.$VALUES = uAdaptPlayVi5;
    }
    public void AdaptPlayViewReason(String p0,int p1){
       super(p0, p1);
    }
    public static AdaptPlayViewReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AdaptPlayViewReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AdaptPlayViewReason.class, p0);
    }
    public static AdaptPlayViewReason[] values(){
       Object obj = PatchProxy.apply(null, null, AdaptPlayViewReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AdaptPlayViewReason.$VALUES.clone();
    }
}
