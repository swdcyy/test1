package gr1.c;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import java.lang.Enum;

public final class c	// class@00256b
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveMultiLineArenaLiveState.values().length];
       c.a = ointArray;
       ointArray[LiveMultiLineArenaLiveState.SHOWING.ordinal()] = 1;
       ointArray[LiveMultiLineArenaLiveState.SHOW_END.ordinal()] = 2;
    }
}
