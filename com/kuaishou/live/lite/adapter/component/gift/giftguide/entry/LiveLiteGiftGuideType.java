package com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.LiveLiteGiftGuideType;
import java.lang.Enum;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteGiftGuideType extends Enum	// class@001dda
{
    public final LiveLiteBottomBarService$BottomBarType mBottomBarType;
    public final int mSideBarItemType;
    public final String mSideBarLogName;
    public static final LiveLiteGiftGuideType[] $VALUES;
    public static final LiveLiteGiftGuideType GiftGuide;
    public static final LiveLiteGiftGuideType ViceGiftGuide;

    static {
       LiveLiteGiftGuideType liveLiteGift = new LiveLiteGiftGuideType("GiftGuide", 0, LiveLiteBottomBarService$BottomBarType.GUIDE_GIFT, 6, "QUICK_GIFT");
       LiveLiteGiftGuideType.GiftGuide = v6;
       LiveLiteGiftGuideType liveLiteGift1 = new LiveLiteGiftGuideType("ViceGiftGuide", 1, LiveLiteBottomBarService$BottomBarType.VICE_GUIDE_GIFT, 8, "QUICK_GIFT_S");
       LiveLiteGiftGuideType.ViceGiftGuide = liveLiteGift;
       LiveLiteGiftGuideType[] liveLiteGift2 = new LiveLiteGiftGuideType[]{v6,liveLiteGift};
       LiveLiteGiftGuideType.$VALUES = liveLiteGift2;
    }
    public void LiveLiteGiftGuideType(String p0,int p1,LiveLiteBottomBarService$BottomBarType p2,int p3,String p4){
       super(p0, p1);
       this.mBottomBarType = p2;
       this.mSideBarItemType = p3;
       this.mSideBarLogName = p4;
    }
    public static LiveLiteGiftGuideType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteGiftGuideType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteGiftGuideType.class, p0);
    }
    public static LiveLiteGiftGuideType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteGiftGuideType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteGiftGuideType.$VALUES.clone();
    }
}
