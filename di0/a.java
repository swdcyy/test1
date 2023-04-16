package di0.a;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import java.lang.Enum;

public final class a	// class@001f9f
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[ListHolder$UpdateType.values().length];
       a.a = ointArray;
       ListHolder$UpdateType iNSERT = ListHolder$UpdateType.INSERT;
       ointArray[iNSERT.ordinal()] = 1;
       ListHolder$UpdateType cHANGE = ListHolder$UpdateType.CHANGE;
       ointArray[cHANGE.ordinal()] = 2;
       ListHolder$UpdateType rEMOVE = ListHolder$UpdateType.REMOVE;
       ointArray[rEMOVE.ordinal()] = 3;
       ListHolder$UpdateType cHANGE_ALL = ListHolder$UpdateType.CHANGE_ALL;
       ointArray[cHANGE_ALL.ordinal()] = 4;
       ointArray = new int[ListHolder$UpdateType.values().length];
       a.b = ointArray;
       ointArray[iNSERT.ordinal()] = 1;
       ointArray[cHANGE.ordinal()] = 2;
       ointArray[rEMOVE.ordinal()] = 3;
       ointArray[cHANGE_ALL.ordinal()] = 4;
    }
}
