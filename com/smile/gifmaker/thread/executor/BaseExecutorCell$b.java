package com.smile.gifmaker.thread.executor.BaseExecutorCell$b;
import com.smile.gifmaker.thread.executor.BaseExecutorCell$ExecutorType;
import java.lang.Enum;

public class BaseExecutorCell$b	// class@000fcc
{
    public static final int[] a;

    static {
       int[] ointArray = new int[BaseExecutorCell$ExecutorType.values().length];
       try{
          BaseExecutorCell$b.a = ointArray;
          ointArray[BaseExecutorCell$ExecutorType.ARTERY.ordinal()] = 1;
          try{
             BaseExecutorCell$b.a[BaseExecutorCell$ExecutorType.DREDGE_NORMAL.ordinal()] = 2;
             try{
                BaseExecutorCell$b.a[BaseExecutorCell$ExecutorType.DREDGE_DISASTER.ordinal()] = 3;
                try{
                   BaseExecutorCell$b.a[BaseExecutorCell$ExecutorType.DREDGE_EXPANDABLE.ordinal()] = 4;
                   try{
                      BaseExecutorCell$b.a[BaseExecutorCell$ExecutorType.SERIAL.ordinal()] = 5;
                      try{
                         BaseExecutorCell$b.a[BaseExecutorCell$ExecutorType.FIXED.ordinal()] = 6;
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
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
