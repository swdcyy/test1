package d5a.i;
import com.yxcorp.gifshow.detail.presenter.landscape.entity.LandscapeEntrance;
import java.lang.Enum;

public final class i	// class@001e82
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LandscapeEntrance.values().length];
       i.a = ointArray;
       ointArray[LandscapeEntrance.SCREEN.ordinal()] = 1;
       ointArray[LandscapeEntrance.GRAVITY.ordinal()] = 2;
    }
}
