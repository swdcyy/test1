package nsd.t0;
import kotlin.reflect.KVariance;
import java.lang.Enum;

public final class t0	// class@001edc
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KVariance.values().length];
       t0.a = ointArray;
       ointArray[KVariance.INVARIANT.ordinal()] = 1;
       ointArray[KVariance.IN.ordinal()] = 2;
       ointArray[KVariance.OUT.ordinal()] = 3;
    }
}
