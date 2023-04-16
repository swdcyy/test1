package ff.b$a;
import com.facebook.react.uimanager.layoutanimation.AnimatedPropertyType;
import java.lang.Enum;

public class b$a	// class@001fef
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AnimatedPropertyType.values().length];
       try{
          b$a.a = ointArray;
          ointArray[AnimatedPropertyType.OPACITY.ordinal()] = 1;
          try{
             b$a.a[AnimatedPropertyType.SCALE_XY.ordinal()] = 2;
             try{
                b$a.a[AnimatedPropertyType.SCALE_X.ordinal()] = 3;
                try{
                   b$a.a[AnimatedPropertyType.SCALE_Y.ordinal()] = 4;
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
