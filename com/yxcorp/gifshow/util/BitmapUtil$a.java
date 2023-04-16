package com.yxcorp.gifshow.util.BitmapUtil$a;
import com.yxcorp.gifshow.util.BitmapUtil$BitmapCropMode;
import java.lang.Enum;

public class BitmapUtil$a	// class@001ed1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[BitmapUtil$BitmapCropMode.values().length];
       try{
          BitmapUtil$a.a = ointArray;
          ointArray[BitmapUtil$BitmapCropMode.TOP.ordinal()] = 1;
          try{
             BitmapUtil$a.a[BitmapUtil$BitmapCropMode.CENTER.ordinal()] = 2;
             try{
                BitmapUtil$a.a[BitmapUtil$BitmapCropMode.BOTTOM.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
