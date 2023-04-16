package hnd.b;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.state.SubtitleStatus;
import java.lang.Enum;

public final class b	// class@000f90
{
    public static final int[] a;

    static {
       int[] ointArray = new int[SubtitleStatus.values().length];
       b.a = ointArray;
       ointArray[SubtitleStatus.SUCCESS.ordinal()] = 1;
       ointArray[SubtitleStatus.NO_RESULT_MUTE.ordinal()] = 2;
       ointArray[SubtitleStatus.NO_RESULT.ordinal()] = 3;
       ointArray[SubtitleStatus.NO_NETWORK.ordinal()] = 4;
    }
}
