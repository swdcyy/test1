package f66.d$a;
import com.yxcorp.utility.Log$LEVEL;
import java.lang.Enum;

public class d$a	// class@0015d5
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
