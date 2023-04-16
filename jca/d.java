package jca.d;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import java.lang.Enum;

public final class d	// class@002a53
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ListHolder$UpdateType.values().length];
       d.a = ointArray;
       ointArray[ListHolder$UpdateType.CHANGE.ordinal()] = 1;
       ointArray[ListHolder$UpdateType.REMOVE.ordinal()] = 2;
       ointArray[ListHolder$UpdateType.INSERT.ordinal()] = 3;
       ointArray[ListHolder$UpdateType.CHANGE_ALL.ordinal()] = 4;
    }
}
