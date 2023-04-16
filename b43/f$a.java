package b43.f$a;
import com.kwai.live.gzone.floatbar.LivePlayerFloatItem;
import java.lang.Enum;

public class f$a	// class@0002f8
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LivePlayerFloatItem.values().length];
       try{
          f$a.a = ointArray;
          ointArray[LivePlayerFloatItem.QUALITY.ordinal()] = 1;
          try{
             f$a.a[LivePlayerFloatItem.ACTIVE_ORIENTATION.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
