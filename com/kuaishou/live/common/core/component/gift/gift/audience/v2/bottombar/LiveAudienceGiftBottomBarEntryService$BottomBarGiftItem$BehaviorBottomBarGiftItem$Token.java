package com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token extends Enum	// class@00128e
{
    public static final LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token[] $VALUES;
    public static final LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token Alpha;
    public static final LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token Background;
    public static final LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token Controller;
    public static final LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token Enabled;
    public static final LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token ResId;

    static {
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token uBottomBarGi = new LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token("Enabled", 0);
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token.Enabled = uBottomBarGi;
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token uBottomBarGi1 = new LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token("Alpha", 1);
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token.Alpha = uBottomBarGi1;
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token uBottomBarGi2 = new LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token("ResId", 2);
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token.ResId = uBottomBarGi2;
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token uBottomBarGi3 = new LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token("Controller", 3);
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token.Controller = uBottomBarGi3;
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token uBottomBarGi4 = new LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token("Background", 4);
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token.Background = uBottomBarGi4;
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token[] uBottomBarGi5 = new LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token[]{uBottomBarGi,uBottomBarGi1,uBottomBarGi2,uBottomBarGi3,uBottomBarGi4};
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token.$VALUES = uBottomBarGi5;
    }
    public void LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token.class, p0);
    }
    public static LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token.$VALUES.clone();
    }
}
