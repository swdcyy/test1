package com.yxcorp.gifshow.corona.common.utils.ProgressHandleEggView$a;
import com.yxcorp.gifshow.corona.common.utils.ResourceUrlType;
import java.lang.Enum;

public class ProgressHandleEggView$a	// class@00126c
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ResourceUrlType.values().length];
       try{
          ProgressHandleEggView$a.a = ointArray;
          ointArray[ResourceUrlType.ANIMATION_JSON.ordinal()] = 1;
          try{
             ProgressHandleEggView$a.a[ResourceUrlType.IMAGE.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
