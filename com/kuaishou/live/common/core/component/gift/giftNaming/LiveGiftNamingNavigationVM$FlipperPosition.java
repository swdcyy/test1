package com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVM$FlipperPosition;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGiftNamingNavigationVM$FlipperPosition extends Enum	// class@0012bb
{
    public final int value;
    public static final LiveGiftNamingNavigationVM$FlipperPosition[] $VALUES;
    public static final LiveGiftNamingNavigationVM$FlipperPosition FIRST;
    public static final LiveGiftNamingNavigationVM$FlipperPosition SECOND;

    static {
       LiveGiftNamingNavigationVM$FlipperPosition uFlipperPosi1;
       LiveGiftNamingNavigationVM$FlipperPosition[] uFlipperPosi = new LiveGiftNamingNavigationVM$FlipperPosition[]{uFlipperPosi1,uFlipperPosi1};
       uFlipperPosi1 = new LiveGiftNamingNavigationVM$FlipperPosition("FIRST", 0, 0);
       LiveGiftNamingNavigationVM$FlipperPosition.FIRST = uFlipperPosi1;
       uFlipperPosi1 = new LiveGiftNamingNavigationVM$FlipperPosition("SECOND", 1, 1);
       LiveGiftNamingNavigationVM$FlipperPosition.SECOND = uFlipperPosi1;
       LiveGiftNamingNavigationVM$FlipperPosition.$VALUES = uFlipperPosi;
    }
    public void LiveGiftNamingNavigationVM$FlipperPosition(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LiveGiftNamingNavigationVM$FlipperPosition valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGiftNamingNavigationVM$FlipperPosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGiftNamingNavigationVM$FlipperPosition.class, p0);
    }
    public static LiveGiftNamingNavigationVM$FlipperPosition[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGiftNamingNavigationVM$FlipperPosition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGiftNamingNavigationVM$FlipperPosition.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
