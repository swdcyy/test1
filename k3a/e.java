package k3a.e;
import com.yxcorp.gifshow.detail.player.panel.elements.ActionType;
import java.lang.Enum;

public final class e	// class@002bc7
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ActionType.values().length];
       e.a = ointArray;
       ointArray[ActionType.SOUND_EFFECT.ordinal()] = 1;
       ointArray[ActionType.SAVE_TRAFFIC.ordinal()] = 2;
       ointArray[ActionType.ACCESSIBILITY.ordinal()] = 3;
       ointArray[ActionType.MIRROR.ordinal()] = 4;
    }
}
