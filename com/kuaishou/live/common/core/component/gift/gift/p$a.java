package com.kuaishou.live.common.core.component.gift.gift.p$a;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Enum;

public class p$a	// class@0012b1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[GiftTab.values().length];
       try{
          p$a.a = ointArray;
          ointArray[GiftTab.FansGroupGift.ordinal()] = 1;
          try{
             p$a.a[GiftTab.NormalGift.ordinal()] = 2;
             try{
                p$a.a[GiftTab.PacketGift.ordinal()] = 3;
                try{
                   p$a.a[GiftTab.PropsPanel.ordinal()] = 4;
                   try{
                      p$a.a[GiftTab.PrivilegeGift.ordinal()] = 5;
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
