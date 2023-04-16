package a5c.k;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Enum;

public final class k	// class@000083
{
    public static final int[] a;

    static {
       int[] ointArray = new int[FragmentEvent.values().length];
       k.a = ointArray;
       ointArray[FragmentEvent.RESUME.ordinal()] = 1;
       ointArray[FragmentEvent.PAUSE.ordinal()] = 2;
    }
}
