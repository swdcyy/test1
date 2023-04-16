package com.yxcorp.gifshow.util.rx.RxBus$a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Enum;

public class RxBus$a	// class@001342
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RxBus$ThreadMode.values().length];
       try{
          RxBus$a.a = ointArray;
          ointArray[RxBus$ThreadMode.MAIN.ordinal()] = 1;
          try{
             RxBus$a.a[RxBus$ThreadMode.MAIN_NEXT_RUNNABLE.ordinal()] = 2;
             try{
                RxBus$a.a[RxBus$ThreadMode.ASYNC.ordinal()] = 3;
                try{
                   RxBus$a.a[RxBus$ThreadMode.BACKGROUND.ordinal()] = 4;
                   try{
                      RxBus$a.a[RxBus$ThreadMode.POSTING.ordinal()] = 5;
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
