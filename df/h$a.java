package df.h$a;
import com.facebook.react.uimanager.events.TouchEventType;
import java.lang.Enum;

public class h$a	// class@001e54
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TouchEventType.values().length];
       try{
          h$a.a = ointArray;
          ointArray[TouchEventType.START.ordinal()] = 1;
          try{
             h$a.a[TouchEventType.END.ordinal()] = 2;
             try{
                h$a.a[TouchEventType.CANCEL.ordinal()] = 3;
                try{
                   h$a.a[TouchEventType.MOVE.ordinal()] = 4;
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
