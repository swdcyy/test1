package dkd.a$a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Enum;

public class a$a	// class@000cd0
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RequestTiming.values().length];
       try{
          a$a.a = ointArray;
          ointArray[RequestTiming.COLD_START.ordinal()] = 1;
          try{
             a$a.a[RequestTiming.ON_HOME_PAGE_CREATED.ordinal()] = 2;
             try{
                a$a.a[RequestTiming.ON_FOREGROUND.ordinal()] = 3;
                try{
                   a$a.a[RequestTiming.ON_BACKGROUND.ordinal()] = 4;
                   try{
                      a$a.a[RequestTiming.LOGIN.ordinal()] = 5;
                      try{
                         a$a.a[RequestTiming.LOGOUT.ordinal()] = 6;
                         try{
                            a$a.a[RequestTiming.AFTER_STARTUP.ordinal()] = 7;
                            try{
                               a$a.a[RequestTiming.AFTER_ABTEST.ordinal()] = 8;
                               try{
                                  a$a.a[RequestTiming.NETWORK_CHANGED.ordinal()] = 9;
                                  try{
                                     a$a.a[RequestTiming.DEFAULT.ordinal()] = 10;
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
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
