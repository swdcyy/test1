package com.yxcorp.gifshow.profile.common.event.RxPageBus$a;
import com.yxcorp.gifshow.profile.common.event.RxPageBus$ThreadMode;
import java.lang.Enum;

public class RxPageBus$a	// class@0012d2
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RxPageBus$ThreadMode.values().length];
       try{
          RxPageBus$a.a = ointArray;
          ointArray[RxPageBus$ThreadMode.MAIN.ordinal()] = 1;
          try{
             RxPageBus$a.a[RxPageBus$ThreadMode.MAIN_NEXT_RUNNABLE.ordinal()] = 2;
             try{
                RxPageBus$a.a[RxPageBus$ThreadMode.ASYNC.ordinal()] = 3;
                try{
                   RxPageBus$a.a[RxPageBus$ThreadMode.POSTING.ordinal()] = 4;
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
