package com.kwaishou.merchant.daccore.b$a;
import com.kwaishou.merchant.daccore.event.ELiveEvent;
import java.lang.Enum;

public class b$a	// class@001309
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ELiveEvent.values().length];
       try{
          b$a.a = ointArray;
          ointArray[ELiveEvent.LIVE_CREATE.ordinal()] = 1;
          try{
             b$a.a[ELiveEvent.LIVE_BIND.ordinal()] = 2;
             try{
                b$a.a[ELiveEvent.LIVE_UNBIND.ordinal()] = 3;
                try{
                   b$a.a[ELiveEvent.LIVE_DESTROY.ordinal()] = 4;
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
