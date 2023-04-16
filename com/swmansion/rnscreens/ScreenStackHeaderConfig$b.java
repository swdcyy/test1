package com.swmansion.rnscreens.ScreenStackHeaderConfig$b;
import com.swmansion.rnscreens.ScreenStackHeaderSubview$Type;
import java.lang.Enum;

public class ScreenStackHeaderConfig$b	// class@000cb3
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ScreenStackHeaderSubview$Type.values().length];
       try{
          ScreenStackHeaderConfig$b.a = ointArray;
          ointArray[ScreenStackHeaderSubview$Type.LEFT.ordinal()] = 1;
          try{
             ScreenStackHeaderConfig$b.a[ScreenStackHeaderSubview$Type.RIGHT.ordinal()] = 2;
             try{
                ScreenStackHeaderConfig$b.a[ScreenStackHeaderSubview$Type.CENTER.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
