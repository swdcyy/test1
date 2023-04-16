package in8.q$a;
import com.facebook.react.bridge.ReadableType;
import java.lang.Enum;

public class q$a	// class@0026e5
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ReadableType.values().length];
       try{
          q$a.a = ointArray;
          ointArray[ReadableType.Number.ordinal()] = 1;
          try{
             q$a.a[ReadableType.String.ordinal()] = 2;
             try{
                q$a.a[ReadableType.Array.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
