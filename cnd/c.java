package cnd.c;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.state.SubtitleStatus;
import java.lang.Enum;

public final class c	// class@000349
{
    public static final int[] a;

    static {
       int[] ointArray = new int[SubtitleStatus.values().length];
       c.a = ointArray;
       ointArray[SubtitleStatus.IDLE.ordinal()] = 1;
       ointArray[SubtitleStatus.ERROR.ordinal()] = 2;
       ointArray[SubtitleStatus.NO_NETWORK.ordinal()] = 3;
       ointArray[SubtitleStatus.NO_RESULT_MUTE.ordinal()] = 4;
       ointArray[SubtitleStatus.NO_RESULT.ordinal()] = 5;
       ointArray[SubtitleStatus.SUCCESS.ordinal()] = 6;
    }
}
