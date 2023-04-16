package com.kuaishou.live.playeradapter.model.LiveStatusQueryBizType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveStatusQueryBizType extends Enum	// class@000d54
{
    public final String mValue;
    public static final LiveStatusQueryBizType[] $VALUES;
    public static final LiveStatusQueryBizType ANCHOR;
    public static final LiveStatusQueryBizType AUTO_PLAY_CARD;
    public static final LiveStatusQueryBizType DEFAULT;
    public static final LiveStatusQueryBizType FLOATING_WINDOW;
    public static final LiveStatusQueryBizType PREVIEW_LIVE;

    static {
       LiveStatusQueryBizType liveStatusQu = new LiveStatusQueryBizType("DEFAULT", 0, "DEFAULT");
       LiveStatusQueryBizType.DEFAULT = liveStatusQu;
       LiveStatusQueryBizType liveStatusQu1 = new LiveStatusQueryBizType("PREVIEW_LIVE", 1, "SIMPLE_LIVE");
       LiveStatusQueryBizType.PREVIEW_LIVE = liveStatusQu1;
       LiveStatusQueryBizType liveStatusQu2 = new LiveStatusQueryBizType("AUTO_PLAY_CARD", 2, "AUTO_PLAY_CARD");
       LiveStatusQueryBizType.AUTO_PLAY_CARD = liveStatusQu2;
       LiveStatusQueryBizType liveStatusQu3 = new LiveStatusQueryBizType("FLOATING_WINDOW", 3, "FLOATING_WINDOW");
       LiveStatusQueryBizType.FLOATING_WINDOW = liveStatusQu3;
       LiveStatusQueryBizType liveStatusQu4 = new LiveStatusQueryBizType("ANCHOR", 4, "ANCHOR");
       LiveStatusQueryBizType.ANCHOR = liveStatusQu4;
       LiveStatusQueryBizType[] liveStatusQu5 = new LiveStatusQueryBizType[]{liveStatusQu,liveStatusQu1,liveStatusQu2,liveStatusQu3,liveStatusQu4};
       LiveStatusQueryBizType.$VALUES = liveStatusQu5;
    }
    public void LiveStatusQueryBizType(String p0,int p1,String p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static LiveStatusQueryBizType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveStatusQueryBizType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveStatusQueryBizType.class, p0);
    }
    public static LiveStatusQueryBizType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveStatusQueryBizType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveStatusQueryBizType.$VALUES.clone();
    }
}
