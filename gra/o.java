package gra.o;
import com.yxcorp.gifshow.growth.vfc.model.VfcActivityType;
import java.lang.Enum;

public final class o	// class@002bbf
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[VfcActivityType.values().length];
       o.a = ointArray;
       VfcActivityType fOLLOW_FISSI = VfcActivityType.FOLLOW_FISSION;
       ointArray[fOLLOW_FISSI.ordinal()] = 1;
       VfcActivityType aSSIST_FISSI = VfcActivityType.ASSIST_FISSION;
       ointArray[aSSIST_FISSI.ordinal()] = 2;
       ointArray = new int[VfcActivityType.values().length];
       o.b = ointArray;
       ointArray[fOLLOW_FISSI.ordinal()] = 1;
       ointArray[aSSIST_FISSI.ordinal()] = 2;
    }
}
