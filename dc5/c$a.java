package dc5.c$a;
import com.kwai.chat.kwailink.log.KLog$KLogLevel;
import java.lang.Enum;

public class c$a	// class@0014af
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KLog$KLogLevel.values().length];
       try{
          c$a.a = ointArray;
          ointArray[KLog$KLogLevel.kVerbose.ordinal()] = 1;
          try{
             c$a.a[KLog$KLogLevel.kDebug.ordinal()] = 2;
             try{
                c$a.a[KLog$KLogLevel.kInfo.ordinal()] = 3;
                try{
                   c$a.a[KLog$KLogLevel.kWarn.ordinal()] = 4;
                   try{
                      c$a.a[KLog$KLogLevel.kError.ordinal()] = 5;
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
