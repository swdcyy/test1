package g99.w$a;
import com.yxcorp.gifshow.detail.nonslide.toolbar.ImmersiveStatus;
import java.lang.Enum;

public class w$a	// class@002454
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ImmersiveStatus.values().length];
       try{
          w$a.a = ointArray;
          ointArray[ImmersiveStatus.DARK_TEXT.ordinal()] = 1;
          try{
             w$a.a[ImmersiveStatus.LIGHT_TEXT.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
