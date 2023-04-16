package nsd.v0;
import kotlin.reflect.KVariance;
import java.lang.Enum;

public final class v0	// class@001ee1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KVariance.values().length];
       ointArray.a = ointArray;
       ointArray[KVariance.INVARIANT.ordinal()] = 1;
       ointArray[KVariance.IN.ordinal()] = 2;
       ointArray[KVariance.OUT.ordinal()] = 3;
    }
}
