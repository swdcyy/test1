package com.swmansion.rnscreens.ScreenStack$d;
import com.swmansion.rnscreens.Screen$StackAnimation;
import java.lang.Enum;

public class ScreenStack$d	// class@000cae
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Screen$StackAnimation.values().length];
       try{
          ScreenStack$d.a = ointArray;
          ointArray[Screen$StackAnimation.NONE.ordinal()] = 1;
          try{
             ScreenStack$d.a[Screen$StackAnimation.FADE.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
