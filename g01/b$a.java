package g01.b$a;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Enum;

public class b$a	// class@0023f1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[GiftTab.values().length];
       try{
          b$a.a = ointArray;
          ointArray[GiftTab.NormalGift.ordinal()] = 1;
          try{
             b$a.a[GiftTab.PacketGift.ordinal()] = 2;
             try{
                b$a.a[GiftTab.PrivilegeGift.ordinal()] = 3;
                try{
                   b$a.a[GiftTab.FansGroupGift.ordinal()] = 4;
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
