package com.yxcorp.gifshow.local.sub.entrance.sizer.view.HomeLocalSizerView$a;
import com.yxcorp.gifshow.local.sub.entrance.sizer.view.HomeLocalSizerView$SizerState;
import java.lang.Enum;

public class HomeLocalSizerView$a	// class@001acf
{
    public static final int[] a;

    static {
       int[] ointArray = new int[HomeLocalSizerView$SizerState.values().length];
       try{
          HomeLocalSizerView$a.a = ointArray;
          ointArray[HomeLocalSizerView$SizerState.NO_PERMISSION.ordinal()] = 1;
          try{
             HomeLocalSizerView$a.a[HomeLocalSizerView$SizerState.LOCATING.ordinal()] = 2;
             try{
                HomeLocalSizerView$a.a[HomeLocalSizerView$SizerState.NORMAL.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
