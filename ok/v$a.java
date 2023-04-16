package ok.v$a;
import java.util.concurrent.TimeUnit;

public class v$a	// class@002802
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TimeUnit.values().length];
       try{
          v$a.a = ointArray;
          ointArray[TimeUnit.NANOSECONDS.ordinal()] = 1;
          try{
             v$a.a[TimeUnit.MICROSECONDS.ordinal()] = 2;
             try{
                v$a.a[TimeUnit.MILLISECONDS.ordinal()] = 3;
                try{
                   v$a.a[TimeUnit.SECONDS.ordinal()] = 4;
                   try{
                      v$a.a[TimeUnit.MINUTES.ordinal()] = 5;
                      try{
                         v$a.a[TimeUnit.HOURS.ordinal()] = 6;
                         try{
                            v$a.a[TimeUnit.DAYS.ordinal()] = 7;
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
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
