package ik1.h0$a;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Enum;

public class h0$a	// class@00292a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[GiftTab.values().length];
       try{
          h0$a.a = ointArray;
          ointArray[GiftTab.NormalGift.ordinal()] = 1;
          try{
             h0$a.a[GiftTab.PacketGift.ordinal()] = 2;
             try{
                h0$a.a[GiftTab.PrivilegeGift.ordinal()] = 3;
                try{
                   h0$a.a[GiftTab.FansGroupGift.ordinal()] = 4;
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
