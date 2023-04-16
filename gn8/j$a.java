package gn8.j$a;
import com.facebook.react.uimanager.PointerEvents;
import java.lang.Enum;

public class j$a	// class@0024a1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PointerEvents.values().length];
       try{
          j$a.a = ointArray;
          ointArray[PointerEvents.BOX_ONLY.ordinal()] = 1;
          try{
             j$a.a[PointerEvents.BOX_NONE.ordinal()] = 2;
             try{
                j$a.a[PointerEvents.NONE.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
