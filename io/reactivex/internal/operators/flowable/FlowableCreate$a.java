package io.reactivex.internal.operators.flowable.FlowableCreate$a;
import io.reactivex.BackpressureStrategy;
import java.lang.Enum;

public class FlowableCreate$a	// class@001229
{
    public static final int[] a;

    static {
       int[] ointArray = new int[BackpressureStrategy.values().length];
       try{
          FlowableCreate$a.a = ointArray;
          ointArray[BackpressureStrategy.MISSING.ordinal()] = 1;
          try{
             FlowableCreate$a.a[BackpressureStrategy.ERROR.ordinal()] = 2;
             try{
                FlowableCreate$a.a[BackpressureStrategy.DROP.ordinal()] = 3;
                try{
                   FlowableCreate$a.a[BackpressureStrategy.LATEST.ordinal()] = 4;
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
