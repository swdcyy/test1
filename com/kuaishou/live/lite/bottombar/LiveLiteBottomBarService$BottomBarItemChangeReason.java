package com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarItemChangeReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteBottomBarService$BottomBarItemChangeReason extends Enum	// class@001eaf
{
    public static final LiveLiteBottomBarService$BottomBarItemChangeReason[] $VALUES;
    public static final LiveLiteBottomBarService$BottomBarItemChangeReason NORMAL_ADD;
    public static final LiveLiteBottomBarService$BottomBarItemChangeReason NORMAL_REMOVE;
    public static final LiveLiteBottomBarService$BottomBarItemChangeReason SLOT_HAS_HIGH_PRIORITY_ITEM;
    public static final LiveLiteBottomBarService$BottomBarItemChangeReason SLOT_HIGH_PRIORITY_ITEM_REMOVED;

    static {
       LiveLiteBottomBarService$BottomBarItemChangeReason uBottomBarIt1;
       LiveLiteBottomBarService$BottomBarItemChangeReason[] uBottomBarIt = new LiveLiteBottomBarService$BottomBarItemChangeReason[]{uBottomBarIt1,uBottomBarIt1,uBottomBarIt1,uBottomBarIt1};
       uBottomBarIt1 = new LiveLiteBottomBarService$BottomBarItemChangeReason("NORMAL_ADD", 0);
       LiveLiteBottomBarService$BottomBarItemChangeReason.NORMAL_ADD = uBottomBarIt1;
       uBottomBarIt1 = new LiveLiteBottomBarService$BottomBarItemChangeReason("SLOT_HIGH_PRIORITY_ITEM_REMOVED", 1);
       LiveLiteBottomBarService$BottomBarItemChangeReason.SLOT_HIGH_PRIORITY_ITEM_REMOVED = uBottomBarIt1;
       uBottomBarIt1 = new LiveLiteBottomBarService$BottomBarItemChangeReason("NORMAL_REMOVE", 2);
       LiveLiteBottomBarService$BottomBarItemChangeReason.NORMAL_REMOVE = uBottomBarIt1;
       uBottomBarIt1 = new LiveLiteBottomBarService$BottomBarItemChangeReason("SLOT_HAS_HIGH_PRIORITY_ITEM", 3);
       LiveLiteBottomBarService$BottomBarItemChangeReason.SLOT_HAS_HIGH_PRIORITY_ITEM = uBottomBarIt1;
       LiveLiteBottomBarService$BottomBarItemChangeReason.$VALUES = uBottomBarIt;
    }
    public void LiveLiteBottomBarService$BottomBarItemChangeReason(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLiteBottomBarService$BottomBarItemChangeReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteBottomBarService$BottomBarItemChangeReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteBottomBarService$BottomBarItemChangeReason.class, p0);
    }
    public static LiveLiteBottomBarService$BottomBarItemChangeReason[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteBottomBarService$BottomBarItemChangeReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteBottomBarService$BottomBarItemChangeReason.$VALUES.clone();
    }
}
