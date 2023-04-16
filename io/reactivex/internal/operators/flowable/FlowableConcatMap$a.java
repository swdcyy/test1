package io.reactivex.internal.operators.flowable.FlowableConcatMap$a;
import io.reactivex.internal.util.ErrorMode;
import java.lang.Enum;

public class FlowableConcatMap$a	// class@00121d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ErrorMode.values().length];
       try{
          FlowableConcatMap$a.a = ointArray;
          ointArray[ErrorMode.BOUNDARY.ordinal()] = 1;
          try{
             FlowableConcatMap$a.a[ErrorMode.END.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
