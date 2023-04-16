package cr1.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import java.lang.Enum;

public final class a	// class@001e38
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveMultiLineArenaLiveState.values().length];
       a.a = ointArray;
       ointArray[LiveMultiLineArenaLiveState.IDLE.ordinal()] = 1;
       ointArray[LiveMultiLineArenaLiveState.SHOWING.ordinal()] = 2;
       ointArray[LiveMultiLineArenaLiveState.SHOW_END.ordinal()] = 3;
    }
}
