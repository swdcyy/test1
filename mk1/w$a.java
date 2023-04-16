package mk1.w$a;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Enum;

public class w$a	// class@0031b1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[GiftTab.values().length];
       try{
          w$a.a = ointArray;
          ointArray[GiftTab.NormalGift.ordinal()] = 1;
          try{
             w$a.a[GiftTab.PacketGift.ordinal()] = 2;
             try{
                w$a.a[GiftTab.PrivilegeGift.ordinal()] = 3;
                try{
                   w$a.a[GiftTab.FansGroupGift.ordinal()] = 4;
                   try{
                      w$a.a[GiftTab.PropsPanel.ordinal()] = 5;
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
