package com.makeramen.roundedimageview.RoundedImageView$a;
import android.widget.ImageView$ScaleType;

public class RoundedImageView$a	// class@001482
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ImageView$ScaleType.values().length];
       try{
          RoundedImageView$a.a = ointArray;
          ointArray[ImageView$ScaleType.CENTER.ordinal()] = 1;
          try{
             RoundedImageView$a.a[ImageView$ScaleType.CENTER_CROP.ordinal()] = 2;
             try{
                RoundedImageView$a.a[ImageView$ScaleType.CENTER_INSIDE.ordinal()] = 3;
                try{
                   RoundedImageView$a.a[ImageView$ScaleType.FIT_CENTER.ordinal()] = 4;
                   try{
                      RoundedImageView$a.a[ImageView$ScaleType.FIT_START.ordinal()] = 5;
                      try{
                         RoundedImageView$a.a[ImageView$ScaleType.FIT_END.ordinal()] = 6;
                         try{
                            RoundedImageView$a.a[ImageView$ScaleType.FIT_XY.ordinal()] = 7;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
