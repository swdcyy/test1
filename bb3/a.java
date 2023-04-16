package bb3.a;
import com.kuaishou.live.lite.layoutmanager.StageType;
import java.lang.Enum;

public final class a	// class@00035a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[StageType.values().length];
       a.a = ointArray;
       ointArray[StageType.MultiChat.ordinal()] = 1;
       ointArray[StageType.PK.ordinal()] = 2;
       ointArray[StageType.MultiLine.ordinal()] = 3;
       ointArray[StageType.VoiceParty.ordinal()] = 4;
    }
}
