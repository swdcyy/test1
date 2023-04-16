package ab6.a;
import com.yxcorp.utility.AbiUtil$Abi;
import java.lang.Enum;

public final class a	// class@00005f
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AbiUtil$Abi.values().length];
       a.a = ointArray;
       ointArray[AbiUtil$Abi.ARMEABI_V7A.ordinal()] = 1;
       ointArray[AbiUtil$Abi.ARM64_V8A.ordinal()] = 2;
    }
}
