package com.kuaishou.live.common.core.component.gift.domain.slot.springnaming.LiveGiftSlotSpringNamingView$SpringNamingStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGiftSlotSpringNamingView$SpringNamingStyle extends Enum	// class@001277
{
    public static final LiveGiftSlotSpringNamingView$SpringNamingStyle[] $VALUES;
    public static final LiveGiftSlotSpringNamingView$SpringNamingStyle LiteStyle;
    public static final LiveGiftSlotSpringNamingView$SpringNamingStyle NormalStyle;

    static {
       LiveGiftSlotSpringNamingView$SpringNamingStyle springNaming = new LiveGiftSlotSpringNamingView$SpringNamingStyle("NormalStyle", 0);
       LiveGiftSlotSpringNamingView$SpringNamingStyle.NormalStyle = springNaming;
       LiveGiftSlotSpringNamingView$SpringNamingStyle springNaming1 = new LiveGiftSlotSpringNamingView$SpringNamingStyle("LiteStyle", 1);
       LiveGiftSlotSpringNamingView$SpringNamingStyle.LiteStyle = springNaming1;
       LiveGiftSlotSpringNamingView$SpringNamingStyle[] springNaming2 = new LiveGiftSlotSpringNamingView$SpringNamingStyle[]{springNaming,springNaming1};
       LiveGiftSlotSpringNamingView$SpringNamingStyle.$VALUES = springNaming2;
    }
    public void LiveGiftSlotSpringNamingView$SpringNamingStyle(String p0,int p1){
       super(p0, p1);
    }
    public static LiveGiftSlotSpringNamingView$SpringNamingStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGiftSlotSpringNamingView$SpringNamingStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGiftSlotSpringNamingView$SpringNamingStyle.class, p0);
    }
    public static LiveGiftSlotSpringNamingView$SpringNamingStyle[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGiftSlotSpringNamingView$SpringNamingStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGiftSlotSpringNamingView$SpringNamingStyle.$VALUES.clone();
    }
}
