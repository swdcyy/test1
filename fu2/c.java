package fu2.c;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Enum;

public final class c	// class@0029e5
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Lifecycle$Event.values().length];
       c.a = ointArray;
       ointArray[Lifecycle$Event.ON_RESUME.ordinal()] = 1;
       ointArray[Lifecycle$Event.ON_PAUSE.ordinal()] = 2;
    }
}
