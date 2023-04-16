package btd.f;
import java.util.concurrent.TimeUnit;

public final class f	// class@0002e6
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TimeUnit.values().length];
       f.a = ointArray;
       ointArray[TimeUnit.NANOSECONDS.ordinal()] = 1;
       ointArray[TimeUnit.MICROSECONDS.ordinal()] = 2;
       ointArray[TimeUnit.MILLISECONDS.ordinal()] = 3;
       ointArray[TimeUnit.SECONDS.ordinal()] = 4;
       ointArray[TimeUnit.MINUTES.ordinal()] = 5;
       ointArray[TimeUnit.HOURS.ordinal()] = 6;
       ointArray[TimeUnit.DAYS.ordinal()] = 7;
    }
}
