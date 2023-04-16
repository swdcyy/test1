package com.kuaishou.live.common.core.component.gift.gift.righttopbanner.panel.ILiveDefaultSelectGiftIdInterceptor$Priority;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ILiveDefaultSelectGiftIdInterceptor$Priority extends Enum	// class@0012b3
{
    public final int priority;
    public static final ILiveDefaultSelectGiftIdInterceptor$Priority[] $VALUES;
    public static final ILiveDefaultSelectGiftIdInterceptor$Priority GIFT_BATTLE;
    public static final ILiveDefaultSelectGiftIdInterceptor$Priority GIFT_SELECT_OPT;
    public static final ILiveDefaultSelectGiftIdInterceptor$Priority GIFT_TAB_OPT;
    public static final ILiveDefaultSelectGiftIdInterceptor$Priority OTHER;

    static {
       ILiveDefaultSelectGiftIdInterceptor$Priority priority;
       ILiveDefaultSelectGiftIdInterceptor$Priority[] priorityArra = new ILiveDefaultSelectGiftIdInterceptor$Priority[]{priority,priority,priority,priority};
       priority = new ILiveDefaultSelectGiftIdInterceptor$Priority("GIFT_BATTLE", 0, 1000);
       ILiveDefaultSelectGiftIdInterceptor$Priority.GIFT_BATTLE = priority;
       priority = new ILiveDefaultSelectGiftIdInterceptor$Priority("GIFT_SELECT_OPT", 1, 10);
       ILiveDefaultSelectGiftIdInterceptor$Priority.GIFT_SELECT_OPT = priority;
       priority = new ILiveDefaultSelectGiftIdInterceptor$Priority("GIFT_TAB_OPT", 2, 1);
       ILiveDefaultSelectGiftIdInterceptor$Priority.GIFT_TAB_OPT = priority;
       priority = new ILiveDefaultSelectGiftIdInterceptor$Priority("OTHER", 3, 0);
       ILiveDefaultSelectGiftIdInterceptor$Priority.OTHER = priority;
       ILiveDefaultSelectGiftIdInterceptor$Priority.$VALUES = priorityArra;
    }
    public void ILiveDefaultSelectGiftIdInterceptor$Priority(String p0,int p1,int p2){
       super(p0, p1);
       this.priority = p2;
    }
    public static ILiveDefaultSelectGiftIdInterceptor$Priority valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ILiveDefaultSelectGiftIdInterceptor$Priority.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ILiveDefaultSelectGiftIdInterceptor$Priority.class, p0);
    }
    public static ILiveDefaultSelectGiftIdInterceptor$Priority[] values(){
       Object obj = PatchProxy.apply(null, null, ILiveDefaultSelectGiftIdInterceptor$Priority.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ILiveDefaultSelectGiftIdInterceptor$Priority.$VALUES.clone();
    }
    public final int getPriority(){
       return this.priority;
    }
}
