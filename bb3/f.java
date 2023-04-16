package bb3.f;
import com.kuaishou.live.lite.layoutmanager.StageType;
import java.lang.Enum;

public final class f	// class@00035f
{
    public static final int[] a;

    static {
       int[] ointArray = new int[StageType.values().length];
       f.a = ointArray;
       ointArray[StageType.Show.ordinal()] = 1;
       ointArray[StageType.MultiChat.ordinal()] = 2;
       ointArray[StageType.PK.ordinal()] = 3;
       ointArray[StageType.MultiLine.ordinal()] = 4;
       ointArray[StageType.VoiceParty.ordinal()] = 5;
       ointArray[StageType.None.ordinal()] = 6;
    }
}
