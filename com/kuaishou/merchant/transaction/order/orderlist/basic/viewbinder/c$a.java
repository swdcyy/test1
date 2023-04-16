package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.c$a;
import com.kuaishou.ksmvvm.command.KSCommand$Status;
import java.lang.Enum;

public class c$a	// class@000867
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KSCommand$Status.values().length];
       try{
          c$a.a = ointArray;
          ointArray[KSCommand$Status.EXECUTING.ordinal()] = 1;
          try{
             c$a.a[KSCommand$Status.SUCCESS.ordinal()] = 2;
             try{
                c$a.a[KSCommand$Status.FAILURE.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
