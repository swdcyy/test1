package lg.i$a;
import com.facebook.yoga.YogaUnit;
import java.lang.Enum;

public class i$a	// class@002558
{
    public static final int[] a;

    static {
       int[] ointArray = new int[YogaUnit.values().length];
       try{
          i$a.a = ointArray;
          ointArray[YogaUnit.UNDEFINED.ordinal()] = 1;
          try{
             i$a.a[YogaUnit.POINT.ordinal()] = 2;
             try{
                i$a.a[YogaUnit.PERCENT.ordinal()] = 3;
                try{
                   i$a.a[YogaUnit.AUTO.ordinal()] = 4;
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
