package mk1.c$a;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Enum;

public class c$a	// class@00319a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[GiftTab.values().length];
       try{
          c$a.a = ointArray;
          ointArray[GiftTab.PacketGift.ordinal()] = 1;
          try{
             c$a.a[GiftTab.PrivilegeGift.ordinal()] = 2;
             try{
                c$a.a[GiftTab.FansGroupGift.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
