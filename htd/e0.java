package htd.e0;
import kotlinx.coroutines.channels.TickerMode;
import java.lang.Enum;

public final class e0	// class@000fc3
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TickerMode.values().length];
       e0.a = ointArray;
       ointArray[TickerMode.FIXED_PERIOD.ordinal()] = 1;
       ointArray[TickerMode.FIXED_DELAY.ordinal()] = 2;
    }
}
