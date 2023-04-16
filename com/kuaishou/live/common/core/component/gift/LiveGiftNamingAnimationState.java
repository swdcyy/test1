package com.kuaishou.live.common.core.component.gift.LiveGiftNamingAnimationState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGiftNamingAnimationState extends Enum	// class@00112e
{
    public static final LiveGiftNamingAnimationState[] $VALUES;
    public static final LiveGiftNamingAnimationState AFTER_DISPLAY;
    public static final LiveGiftNamingAnimationState DISPLAYING;
    public static final LiveGiftNamingAnimationState NOT_DISPLAY;

    static {
       LiveGiftNamingAnimationState liveGiftNami = new LiveGiftNamingAnimationState("NOT_DISPLAY", 0);
       LiveGiftNamingAnimationState.NOT_DISPLAY = liveGiftNami;
       LiveGiftNamingAnimationState liveGiftNami1 = new LiveGiftNamingAnimationState("DISPLAYING", 1);
       LiveGiftNamingAnimationState.DISPLAYING = liveGiftNami1;
       LiveGiftNamingAnimationState liveGiftNami2 = new LiveGiftNamingAnimationState("AFTER_DISPLAY", 2);
       LiveGiftNamingAnimationState.AFTER_DISPLAY = liveGiftNami2;
       LiveGiftNamingAnimationState[] liveGiftNami3 = new LiveGiftNamingAnimationState[]{liveGiftNami,liveGiftNami1,liveGiftNami2};
       LiveGiftNamingAnimationState.$VALUES = liveGiftNami3;
    }
    public void LiveGiftNamingAnimationState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveGiftNamingAnimationState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGiftNamingAnimationState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGiftNamingAnimationState.class, p0);
    }
    public static LiveGiftNamingAnimationState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGiftNamingAnimationState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGiftNamingAnimationState.$VALUES.clone();
    }
}
