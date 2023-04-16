package brd.t$a;
import io.reactivex.BackpressureStrategy;
import java.lang.Enum;

public class t$a	// class@0002d1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[BackpressureStrategy.values().length];
       try{
          t$a.a = ointArray;
          ointArray[BackpressureStrategy.DROP.ordinal()] = 1;
          try{
             t$a.a[BackpressureStrategy.LATEST.ordinal()] = 2;
             try{
                t$a.a[BackpressureStrategy.MISSING.ordinal()] = 3;
                try{
                   t$a.a[BackpressureStrategy.ERROR.ordinal()] = 4;
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
