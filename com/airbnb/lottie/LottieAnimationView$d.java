package com.airbnb.lottie.LottieAnimationView$d;
import com.airbnb.lottie.RenderMode;
import java.lang.Enum;

public class LottieAnimationView$d	// class@000d89
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RenderMode.values().length];
       try{
          LottieAnimationView$d.a = ointArray;
          ointArray[RenderMode.HARDWARE.ordinal()] = 1;
          try{
             LottieAnimationView$d.a[RenderMode.SOFTWARE.ordinal()] = 2;
             try{
                LottieAnimationView$d.a[RenderMode.AUTOMATIC.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
