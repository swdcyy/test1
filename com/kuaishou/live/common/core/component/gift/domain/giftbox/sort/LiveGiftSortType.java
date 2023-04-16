package com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGiftSortType extends Enum	// class@00120a
{
    public final int type;
    public static final LiveGiftSortType[] $VALUES;
    public static final LiveGiftSortType ASC;
    public static final LiveGiftSortType DEFAULT;
    public static final LiveGiftSortType DESC;

    static {
       LiveGiftSortType liveGiftSort = new LiveGiftSortType("DEFAULT", 0, 1);
       LiveGiftSortType.DEFAULT = liveGiftSort;
       LiveGiftSortType liveGiftSort1 = new LiveGiftSortType("DESC", 1, 3);
       LiveGiftSortType.DESC = liveGiftSort1;
       LiveGiftSortType liveGiftSort2 = new LiveGiftSortType("ASC", 2, 2);
       LiveGiftSortType.ASC = liveGiftSort2;
       LiveGiftSortType[] liveGiftSort3 = new LiveGiftSortType[]{liveGiftSort,liveGiftSort1,liveGiftSort2};
       LiveGiftSortType.$VALUES = liveGiftSort3;
    }
    public void LiveGiftSortType(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static LiveGiftSortType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGiftSortType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGiftSortType.class, p0);
    }
    public static LiveGiftSortType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGiftSortType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGiftSortType.$VALUES.clone();
    }
    public int getType(){
       return this.type;
    }
}
