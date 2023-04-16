package o3a.a;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.ActionType;
import java.lang.Enum;

public final class a	// class@003273
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ActionType.values().length];
       a.a = ointArray;
       ointArray[ActionType.ACTION_SMALL_WINDOW_LAST.ordinal()] = 1;
       ointArray[ActionType.ACTION_SMALL_WINDOW_NEXT.ordinal()] = 2;
       ointArray[ActionType.ACTION_SMALL_WINDOW_PLAY.ordinal()] = 3;
       ointArray[ActionType.ACTION_SMALL_WINDOW_PAUSE.ordinal()] = 4;
    }
}
