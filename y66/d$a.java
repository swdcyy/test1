package y66.d$a;
import com.yxcorp.image.common.log.Log$LEVEL;
import java.lang.Enum;

public class d$a	// class@002846
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Log$LEVEL.values().length];
       try{
          d$a.a = ointArray;
          ointArray[Log$LEVEL.ERROR.ordinal()] = 1;
          try{
             d$a.a[Log$LEVEL.WARN.ordinal()] = 2;
             try{
                d$a.a[Log$LEVEL.INFO.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
