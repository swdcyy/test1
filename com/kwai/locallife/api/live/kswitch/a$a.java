package com.kwai.locallife.api.live.kswitch.a$a;
import com.kwai.locallife.api.live.kswitch.LiveLocalLifeSwitchKeys$From;
import java.lang.Enum;

public class a$a	// class@000e9f
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveLocalLifeSwitchKeys$From.values().length];
       try{
          a$a.a = ointArray;
          ointArray[LiveLocalLifeSwitchKeys$From.AB.ordinal()] = 1;
          try{
             a$a.a[LiveLocalLifeSwitchKeys$From.SWITCH.ordinal()] = 2;
             try{
                a$a.a[LiveLocalLifeSwitchKeys$From.DEV.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
