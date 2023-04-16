package com.kuaishou.live.common.core.component.gift.base.inject.LiveDialogAdapterType;
import zg1.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveDialogAdapterType extends Enum implements a	// class@001144
{
    public static final LiveDialogAdapterType[] $VALUES;
    public static final LiveDialogAdapterType GiftPanel;
    public static final LiveDialogAdapterType OtherPanel;
    public static final LiveDialogAdapterType SendGiftButtonPanel;

    static {
       LiveDialogAdapterType liveDialogAd1;
       LiveDialogAdapterType[] liveDialogAd = new LiveDialogAdapterType[]{liveDialogAd1,liveDialogAd1,liveDialogAd1};
       liveDialogAd1 = new LiveDialogAdapterType("GiftPanel", 0);
       LiveDialogAdapterType.GiftPanel = liveDialogAd1;
       liveDialogAd1 = new LiveDialogAdapterType("SendGiftButtonPanel", 1);
       LiveDialogAdapterType.SendGiftButtonPanel = liveDialogAd1;
       liveDialogAd1 = new LiveDialogAdapterType("OtherPanel", 2);
       LiveDialogAdapterType.OtherPanel = liveDialogAd1;
       LiveDialogAdapterType.$VALUES = liveDialogAd;
    }
    public void LiveDialogAdapterType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveDialogAdapterType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveDialogAdapterType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveDialogAdapterType.class, p0);
    }
    public static LiveDialogAdapterType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveDialogAdapterType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveDialogAdapterType.$VALUES.clone();
    }
}
