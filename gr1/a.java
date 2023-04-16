package gr1.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import java.lang.Enum;

public final class a	// class@002566
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveMultiLineArenaLiveState.values().length];
       a.a = ointArray;
       ointArray[LiveMultiLineArenaLiveState.SHOWING.ordinal()] = 1;
       ointArray[LiveMultiLineArenaLiveState.SHOW_END.ordinal()] = 2;
    }
}
