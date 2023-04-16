package com.yxcorp.gifshow.listcomponent.event.KsRxBusHolder$a;
import com.yxcorp.gifshow.listcomponent.event.KsRxBusHolder$ThreadMode;
import java.lang.Enum;

public class KsRxBusHolder$a	// class@001a69
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KsRxBusHolder$ThreadMode.values().length];
       try{
          KsRxBusHolder$a.a = ointArray;
          ointArray[KsRxBusHolder$ThreadMode.MAIN.ordinal()] = 1;
          try{
             KsRxBusHolder$a.a[KsRxBusHolder$ThreadMode.MAIN_NEXT_RUNNABLE.ordinal()] = 2;
             try{
                KsRxBusHolder$a.a[KsRxBusHolder$ThreadMode.ASYNC.ordinal()] = 3;
                try{
                   KsRxBusHolder$a.a[KsRxBusHolder$ThreadMode.BACKGROUND.ordinal()] = 4;
                   try{
                      KsRxBusHolder$a.a[KsRxBusHolder$ThreadMode.POSTING.ordinal()] = 5;
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
