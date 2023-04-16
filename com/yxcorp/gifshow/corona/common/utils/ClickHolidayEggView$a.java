package com.yxcorp.gifshow.corona.common.utils.ClickHolidayEggView$a;
import com.yxcorp.gifshow.corona.common.utils.ResourceUrlType;
import java.lang.Enum;

public class ClickHolidayEggView$a	// class@00126a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ResourceUrlType.values().length];
       try{
          ClickHolidayEggView$a.a = ointArray;
          ointArray[ResourceUrlType.ANIMATION_JSON.ordinal()] = 1;
          try{
             ClickHolidayEggView$a.a[ResourceUrlType.IMAGE.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
