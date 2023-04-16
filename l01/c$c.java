package l01.c$c;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Enum;

public class c$c	// class@002e42
{
    public static final int[] a;

    static {
       int[] ointArray = new int[GiftTab.values().length];
       try{
          c$c.a = ointArray;
          ointArray[GiftTab.NormalGift.ordinal()] = 1;
          try{
             c$c.a[GiftTab.PacketGift.ordinal()] = 2;
             try{
                c$c.a[GiftTab.PrivilegeGift.ordinal()] = 3;
                try{
                   c$c.a[GiftTab.FansGroupGift.ordinal()] = 4;
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
