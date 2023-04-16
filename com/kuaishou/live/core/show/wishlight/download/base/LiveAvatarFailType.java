package com.kuaishou.live.core.show.wishlight.download.base.LiveAvatarFailType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAvatarFailType extends Enum	// class@0012a1
{
    public int mType;
    public static final LiveAvatarFailType[] $VALUES;
    public static final LiveAvatarFailType FRESCO_SDK_ERROR;
    public static final LiveAvatarFailType INVALID_PARAM;
    public static final LiveAvatarFailType QUEUE_LIMIT;
    public static final LiveAvatarFailType TIME_OUT;
    public static final LiveAvatarFailType UNKNOWN_EXCEPTION;

    static {
       LiveAvatarFailType liveAvatarFa = new LiveAvatarFailType("INVALID_PARAM", 0, 1);
       LiveAvatarFailType.INVALID_PARAM = liveAvatarFa;
       LiveAvatarFailType liveAvatarFa1 = new LiveAvatarFailType("FRESCO_SDK_ERROR", 1, 2);
       LiveAvatarFailType.FRESCO_SDK_ERROR = liveAvatarFa1;
       LiveAvatarFailType liveAvatarFa2 = new LiveAvatarFailType("TIME_OUT", 2, 3);
       LiveAvatarFailType.TIME_OUT = liveAvatarFa2;
       LiveAvatarFailType liveAvatarFa3 = new LiveAvatarFailType("QUEUE_LIMIT", 3, 4);
       LiveAvatarFailType.QUEUE_LIMIT = liveAvatarFa3;
       LiveAvatarFailType liveAvatarFa4 = new LiveAvatarFailType("UNKNOWN_EXCEPTION", 4, 5);
       LiveAvatarFailType.UNKNOWN_EXCEPTION = liveAvatarFa4;
       LiveAvatarFailType[] liveAvatarFa5 = new LiveAvatarFailType[]{liveAvatarFa,liveAvatarFa1,liveAvatarFa2,liveAvatarFa3,liveAvatarFa4};
       LiveAvatarFailType.$VALUES = liveAvatarFa5;
    }
    public void LiveAvatarFailType(String p0,int p1,int p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static LiveAvatarFailType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAvatarFailType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAvatarFailType.class, p0);
    }
    public static LiveAvatarFailType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAvatarFailType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAvatarFailType.$VALUES.clone();
    }
    public int getType(){
       return this.mType;
    }
}
