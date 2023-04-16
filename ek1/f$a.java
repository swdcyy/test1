package ek1.f$a;
import com.kuaishou.live.common.core.component.gift.domain.slot.config.slotqueue.LiveGiftSlotQueueConfig$SlotMsgTrimStrategy;
import java.lang.Enum;

public class f$a	// class@002183
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveGiftSlotQueueConfig$SlotMsgTrimStrategy.values().length];
       try{
          f$a.a = ointArray;
          ointArray[LiveGiftSlotQueueConfig$SlotMsgTrimStrategy.DELETE.ordinal()] = 1;
          try{
             f$a.a[LiveGiftSlotQueueConfig$SlotMsgTrimStrategy.NONE.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
