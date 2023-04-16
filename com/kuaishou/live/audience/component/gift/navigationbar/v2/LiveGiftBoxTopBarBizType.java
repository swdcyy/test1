package com.kuaishou.live.audience.component.gift.navigationbar.v2.LiveGiftBoxTopBarBizType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGiftBoxTopBarBizType extends Enum	// class@000b7a
{
    public final int priority;
    public static final LiveGiftBoxTopBarBizType[] $VALUES;
    public static final LiveGiftBoxTopBarBizType ACHIEVEMENT;
    public static final LiveGiftBoxTopBarBizType GIFT_GROUP;
    public static final LiveGiftBoxTopBarBizType GIFT_NAMING;
    public static final LiveGiftBoxTopBarBizType VIP_GRADE;
    public static final LiveGiftBoxTopBarBizType WEALTH_GRADE;

    static {
       LiveGiftBoxTopBarBizType liveGiftBoxT1;
       LiveGiftBoxTopBarBizType[] liveGiftBoxT = new LiveGiftBoxTopBarBizType[]{liveGiftBoxT1,liveGiftBoxT1,liveGiftBoxT1,liveGiftBoxT1,liveGiftBoxT1};
       liveGiftBoxT1 = new LiveGiftBoxTopBarBizType("GIFT_GROUP", 0, 50);
       LiveGiftBoxTopBarBizType.GIFT_GROUP = liveGiftBoxT1;
       liveGiftBoxT1 = new LiveGiftBoxTopBarBizType("GIFT_NAMING", 1, 40);
       LiveGiftBoxTopBarBizType.GIFT_NAMING = liveGiftBoxT1;
       liveGiftBoxT1 = new LiveGiftBoxTopBarBizType("ACHIEVEMENT", 2, 30);
       LiveGiftBoxTopBarBizType.ACHIEVEMENT = liveGiftBoxT1;
       liveGiftBoxT1 = new LiveGiftBoxTopBarBizType("VIP_GRADE", 3, 20);
       LiveGiftBoxTopBarBizType.VIP_GRADE = liveGiftBoxT1;
       liveGiftBoxT1 = new LiveGiftBoxTopBarBizType("WEALTH_GRADE", 4, 10);
       LiveGiftBoxTopBarBizType.WEALTH_GRADE = liveGiftBoxT1;
       LiveGiftBoxTopBarBizType.$VALUES = liveGiftBoxT;
    }
    public void LiveGiftBoxTopBarBizType(String p0,int p1,int p2){
       super(p0, p1);
       this.priority = p2;
    }
    public static LiveGiftBoxTopBarBizType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGiftBoxTopBarBizType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGiftBoxTopBarBizType.class, p0);
    }
    public static LiveGiftBoxTopBarBizType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGiftBoxTopBarBizType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGiftBoxTopBarBizType.$VALUES.clone();
    }
    public final int getPriority(){
       return this.priority;
    }
}
