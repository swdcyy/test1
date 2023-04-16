package ftd.m0;
import kotlinx.coroutines.CoroutineStart;
import java.lang.Enum;

public final class m0	// class@001659
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[CoroutineStart.values().length];
       m0.a = ointArray;
       CoroutineStart dEFAULT = CoroutineStart.DEFAULT;
       ointArray[dEFAULT.ordinal()] = 1;
       CoroutineStart aTOMIC = CoroutineStart.ATOMIC;
       ointArray[aTOMIC.ordinal()] = 2;
       CoroutineStart uNDISPATCHED = CoroutineStart.UNDISPATCHED;
       ointArray[uNDISPATCHED.ordinal()] = 3;
       CoroutineStart lAZY = CoroutineStart.LAZY;
       ointArray[lAZY.ordinal()] = 4;
       ointArray = new int[CoroutineStart.values().length];
       m0.b = ointArray;
       ointArray[dEFAULT.ordinal()] = 1;
       ointArray[aTOMIC.ordinal()] = 2;
       ointArray[uNDISPATCHED.ordinal()] = 3;
       ointArray[lAZY.ordinal()] = 4;
    }
}
