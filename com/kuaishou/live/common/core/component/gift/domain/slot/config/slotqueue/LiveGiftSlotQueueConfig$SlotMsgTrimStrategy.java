package com.kuaishou.live.common.core.component.gift.domain.slot.config.slotqueue.LiveGiftSlotQueueConfig$SlotMsgTrimStrategy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGiftSlotQueueConfig$SlotMsgTrimStrategy extends Enum	// class@00125f
{
    public static final LiveGiftSlotQueueConfig$SlotMsgTrimStrategy[] $VALUES;
    public static final LiveGiftSlotQueueConfig$SlotMsgTrimStrategy DELETE;
    public static final LiveGiftSlotQueueConfig$SlotMsgTrimStrategy NONE;
    public static final LiveGiftSlotQueueConfig$SlotMsgTrimStrategy SAMPLE;

    static {
       LiveGiftSlotQueueConfig$SlotMsgTrimStrategy slotMsgTrimS1;
       LiveGiftSlotQueueConfig$SlotMsgTrimStrategy[] slotMsgTrimS = new LiveGiftSlotQueueConfig$SlotMsgTrimStrategy[]{slotMsgTrimS1,slotMsgTrimS1,slotMsgTrimS1};
       slotMsgTrimS1 = new LiveGiftSlotQueueConfig$SlotMsgTrimStrategy("NONE", 0);
       LiveGiftSlotQueueConfig$SlotMsgTrimStrategy.NONE = slotMsgTrimS1;
       slotMsgTrimS1 = new LiveGiftSlotQueueConfig$SlotMsgTrimStrategy("SAMPLE", 1);
       LiveGiftSlotQueueConfig$SlotMsgTrimStrategy.SAMPLE = slotMsgTrimS1;
       slotMsgTrimS1 = new LiveGiftSlotQueueConfig$SlotMsgTrimStrategy("DELETE", 2);
       LiveGiftSlotQueueConfig$SlotMsgTrimStrategy.DELETE = slotMsgTrimS1;
       LiveGiftSlotQueueConfig$SlotMsgTrimStrategy.$VALUES = slotMsgTrimS;
    }
    public void LiveGiftSlotQueueConfig$SlotMsgTrimStrategy(String p0,int p1){
       super(p0, p1);
    }
    public static LiveGiftSlotQueueConfig$SlotMsgTrimStrategy valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGiftSlotQueueConfig$SlotMsgTrimStrategy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGiftSlotQueueConfig$SlotMsgTrimStrategy.class, p0);
    }
    public static LiveGiftSlotQueueConfig$SlotMsgTrimStrategy[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGiftSlotQueueConfig$SlotMsgTrimStrategy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGiftSlotQueueConfig$SlotMsgTrimStrategy.$VALUES.clone();
    }
}
