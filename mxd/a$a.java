package mxd.a$a;
import org.tensorflow.lite.DataType;
import java.lang.Enum;

public class a$a	// class@001d66
{
    public static final int[] a;

    static {
       int[] ointArray = new int[DataType.values().length];
       try{
          a$a.a = ointArray;
          ointArray[DataType.FLOAT32.ordinal()] = 1;
          try{
             a$a.a[DataType.UINT8.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
