package com.kwai.library.widget.compatimageview.CompatImageView$a;
import android.widget.ImageView$ScaleType;

public class CompatImageView$a	// class@000910
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ImageView$ScaleType.values().length];
       try{
          CompatImageView$a.a = ointArray;
          ointArray[ImageView$ScaleType.CENTER.ordinal()] = 1;
          try{
             CompatImageView$a.a[ImageView$ScaleType.CENTER_CROP.ordinal()] = 2;
             try{
                CompatImageView$a.a[ImageView$ScaleType.CENTER_INSIDE.ordinal()] = 3;
                try{
                   CompatImageView$a.a[ImageView$ScaleType.FIT_XY.ordinal()] = 4;
                   try{
                      CompatImageView$a.a[ImageView$ScaleType.FIT_END.ordinal()] = 5;
                      try{
                         CompatImageView$a.a[ImageView$ScaleType.FIT_START.ordinal()] = 6;
                         try{
                            CompatImageView$a.a[ImageView$ScaleType.FIT_CENTER.ordinal()] = 7;
                            try{
                               CompatImageView$a.a[ImageView$ScaleType.MATRIX.ordinal()] = 8;
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
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
