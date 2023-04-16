package ta6.e$a;
import com.yxcorp.utility.AbiUtil$Abi;
import java.lang.Enum;

public class e$a	// class@00248d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AbiUtil$Abi.values().length];
       try{
          e$a.a = ointArray;
          ointArray[AbiUtil$Abi.ARMEABI_V7A.ordinal()] = 1;
          try{
             e$a.a[AbiUtil$Abi.ARM64_V8A.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
