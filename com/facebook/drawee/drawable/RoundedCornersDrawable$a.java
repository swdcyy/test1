package com.facebook.drawee.drawable.RoundedCornersDrawable$a;
import com.facebook.drawee.drawable.RoundedCornersDrawable$Type;
import java.lang.Enum;

public class RoundedCornersDrawable$a	// class@00108c
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RoundedCornersDrawable$Type.values().length];
       try{
          RoundedCornersDrawable$a.a = ointArray;
          ointArray[RoundedCornersDrawable$Type.CLIPPING.ordinal()] = 1;
          try{
             RoundedCornersDrawable$a.a[RoundedCornersDrawable$Type.OVERLAY_COLOR.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
