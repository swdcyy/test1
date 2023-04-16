package bo7.a;
import com.kuaishou.eve.packageinfo.ExecutableCode;
import java.lang.Enum;

public final class a	// class@000432
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[ExecutableCode.values().length];
       a.a = ointArray;
       ExecutableCode mODEL = ExecutableCode.MODEL;
       ointArray[mODEL.ordinal()] = 1;
       ExecutableCode sO = ExecutableCode.SO;
       ointArray[sO.ordinal()] = 2;
       ExecutableCode lUA = ExecutableCode.LUA;
       ointArray[lUA.ordinal()] = 3;
       ointArray = new int[ExecutableCode.values().length];
       a.b = ointArray;
       ointArray[mODEL.ordinal()] = 1;
       ointArray[sO.ordinal()] = 2;
       ointArray[lUA.ordinal()] = 3;
    }
}
