package fpa.a;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin$LoginShowType;
import java.lang.Enum;

public final class a	// class@0029ae
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[GrowthUserLoginPlugin$LoginShowType.values().length];
       a.a = ointArray;
       GrowthUserLoginPlugin$LoginShowType tHREE_DAY = GrowthUserLoginPlugin$LoginShowType.THREE_DAY;
       ointArray[tHREE_DAY.ordinal()] = 1;
       GrowthUserLoginPlugin$LoginShowType oNE_DAY = GrowthUserLoginPlugin$LoginShowType.ONE_DAY;
       ointArray[oNE_DAY.ordinal()] = 2;
       ointArray = new int[GrowthUserLoginPlugin$LoginShowType.values().length];
       a.b = ointArray;
       ointArray[oNE_DAY.ordinal()] = 1;
       ointArray[tHREE_DAY.ordinal()] = 2;
    }
}
