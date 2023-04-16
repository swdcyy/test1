package d01.p$a;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Enum;

public class p$a	// class@001ee3
{
    public static final int[] a;

    static {
       int[] ointArray = new int[GiftTab.values().length];
       try{
          p$a.a = ointArray;
          ointArray[GiftTab.PacketGift.ordinal()] = 1;
          try{
             p$a.a[GiftTab.FansGroupGift.ordinal()] = 2;
             try{
                p$a.a[GiftTab.PrivilegeGift.ordinal()] = 3;
                try{
                   p$a.a[GiftTab.PropsPanel.ordinal()] = 4;
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
