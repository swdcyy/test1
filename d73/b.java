package d73.b;
import com.kuaishou.live.lite.layoutmanager.StageType;
import java.lang.Enum;

public final class b	// class@002483
{
    public static final int[] a;

    static {
       int[] ointArray = new int[StageType.values().length];
       b.a = ointArray;
       ointArray[StageType.MultiChat.ordinal()] = 1;
       ointArray[StageType.MultiLine.ordinal()] = 2;
       ointArray[StageType.PK.ordinal()] = 3;
    }
}
