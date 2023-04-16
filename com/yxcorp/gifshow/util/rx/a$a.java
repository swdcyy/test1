package com.yxcorp.gifshow.util.rx.a$a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Enum;

public class a$a	// class@000d00
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RxBus$ThreadMode.values().length];
       try{
          a$a.a = ointArray;
          ointArray[RxBus$ThreadMode.MAIN.ordinal()] = 1;
          try{
             a$a.a[RxBus$ThreadMode.MAIN_NEXT_RUNNABLE.ordinal()] = 2;
             try{
                a$a.a[RxBus$ThreadMode.ASYNC.ordinal()] = 3;
                try{
                   a$a.a[RxBus$ThreadMode.BACKGROUND.ordinal()] = 4;
                   try{
                      a$a.a[RxBus$ThreadMode.POSTING.ordinal()] = 5;
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
