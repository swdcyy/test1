package com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$ScrollMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGiftBoxConfig$ScrollMode extends Enum	// class@0011d2
{
    public static final LiveGiftBoxConfig$ScrollMode[] $VALUES;
    public static final LiveGiftBoxConfig$ScrollMode LIST_VERTICAL;
    public static final LiveGiftBoxConfig$ScrollMode PAGER_HORIZONTAL;

    static {
       LiveGiftBoxConfig$ScrollMode scrollMode;
       LiveGiftBoxConfig$ScrollMode[] scrollModeAr = new LiveGiftBoxConfig$ScrollMode[]{scrollMode,scrollMode};
       scrollMode = new LiveGiftBoxConfig$ScrollMode("PAGER_HORIZONTAL", 0);
       LiveGiftBoxConfig$ScrollMode.PAGER_HORIZONTAL = scrollMode;
       scrollMode = new LiveGiftBoxConfig$ScrollMode("LIST_VERTICAL", 1);
       LiveGiftBoxConfig$ScrollMode.LIST_VERTICAL = scrollMode;
       LiveGiftBoxConfig$ScrollMode.$VALUES = scrollModeAr;
    }
    public void LiveGiftBoxConfig$ScrollMode(String p0,int p1){
       super(p0, p1);
    }
    public static LiveGiftBoxConfig$ScrollMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGiftBoxConfig$ScrollMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGiftBoxConfig$ScrollMode.class, p0);
    }
    public static LiveGiftBoxConfig$ScrollMode[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGiftBoxConfig$ScrollMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGiftBoxConfig$ScrollMode.$VALUES.clone();
    }
}
