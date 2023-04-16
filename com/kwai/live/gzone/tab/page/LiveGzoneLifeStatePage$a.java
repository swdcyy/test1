package com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage$a;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabState$State;
import java.lang.Enum;

public class LiveGzoneLifeStatePage$a	// class@000e1a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveGzoneTabState$State.values().length];
       try{
          LiveGzoneLifeStatePage$a.a = ointArray;
          ointArray[LiveGzoneTabState$State.INIT.ordinal()] = 1;
          try{
             LiveGzoneLifeStatePage$a.a[LiveGzoneTabState$State.CREATE.ordinal()] = 2;
             try{
                LiveGzoneLifeStatePage$a.a[LiveGzoneTabState$State.BIND.ordinal()] = 3;
                try{
                   LiveGzoneLifeStatePage$a.a[LiveGzoneTabState$State.UNBIND.ordinal()] = 4;
                   try{
                      LiveGzoneLifeStatePage$a.a[LiveGzoneTabState$State.DESTROY.ordinal()] = 5;
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
