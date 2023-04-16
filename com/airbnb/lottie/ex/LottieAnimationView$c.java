package com.airbnb.lottie.ex.LottieAnimationView$c;
import com.airbnb.lottie.ex.RenderMode;
import java.lang.Enum;

public class LottieAnimationView$c	// class@000d9c
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RenderMode.values().length];
       try{
          LottieAnimationView$c.a = ointArray;
          ointArray[RenderMode.HARDWARE.ordinal()] = 1;
          try{
             LottieAnimationView$c.a[RenderMode.SOFTWARE.ordinal()] = 2;
             try{
                LottieAnimationView$c.a[RenderMode.AUTOMATIC.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
