package a04.e;
import com.kuaishou.merchant.home2.main.predict.PredictStates;
import java.lang.Enum;

public final class e	// class@00000b
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PredictStates.values().length];
       e.a = ointArray;
       ointArray[PredictStates.DEFAULT.ordinal()] = 1;
       ointArray[PredictStates.ON_INITIAL.ordinal()] = 2;
       ointArray[PredictStates.DISABLED.ordinal()] = 3;
       ointArray[PredictStates.INITIALED.ordinal()] = 4;
       ointArray[PredictStates.ON_ACTIVE.ordinal()] = 5;
       ointArray[PredictStates.ACTIVATED.ordinal()] = 6;
       ointArray[PredictStates.NO_MODEL.ordinal()] = 7;
       ointArray[PredictStates.ON_START.ordinal()] = 8;
       ointArray[PredictStates.STARTED.ordinal()] = 9;
       ointArray[PredictStates.ON_RELEASE.ordinal()] = 10;
       ointArray[PredictStates.RELEASED.ordinal()] = 11;
    }
}
