package isd.i;
import kotlin.io.FileWalkDirection;
import java.lang.Enum;

public final class i	// class@00150e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[FileWalkDirection.values().length];
       i.a = ointArray;
       ointArray[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
       ointArray[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
    }
}
