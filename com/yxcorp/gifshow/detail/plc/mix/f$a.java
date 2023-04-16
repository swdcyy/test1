package com.yxcorp.gifshow.detail.plc.mix.f$a;
import com.yxcorp.gifshow.detail.plc.helper.PlcStyleChangeType;
import java.lang.Enum;

public class f$a	// class@00168b
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PlcStyleChangeType.values().length];
       try{
          f$a.a = ointArray;
          ointArray[PlcStyleChangeType.DURATION.ordinal()] = 1;
          try{
             f$a.a[PlcStyleChangeType.COUNTDOWN.ordinal()] = 2;
             try{
                f$a.a[PlcStyleChangeType.PROGRESS.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
