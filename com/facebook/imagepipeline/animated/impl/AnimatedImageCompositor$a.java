package com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$a;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$FrameNeededResult;
import java.lang.Enum;

public class AnimatedImageCompositor$a	// class@0010e9
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AnimatedImageCompositor$FrameNeededResult.values().length];
       try{
          AnimatedImageCompositor$a.a = ointArray;
          ointArray[AnimatedImageCompositor$FrameNeededResult.REQUIRED.ordinal()] = 1;
          try{
             AnimatedImageCompositor$a.a[AnimatedImageCompositor$FrameNeededResult.NOT_REQUIRED.ordinal()] = 2;
             try{
                AnimatedImageCompositor$a.a[AnimatedImageCompositor$FrameNeededResult.ABORT.ordinal()] = 3;
                try{
                   AnimatedImageCompositor$a.a[AnimatedImageCompositor$FrameNeededResult.SKIP.ordinal()] = 4;
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
