package hp1.a;
import com.kuaishou.live.common.core.component.multichat.core.statemachine.MultiChatState;
import java.lang.Enum;

public final class a	// class@002761
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[MultiChatState.values().length];
       a.a = ointArray;
       MultiChatState iDLE = MultiChatState.IDLE;
       ointArray[iDLE.ordinal()] = 1;
       MultiChatState wATCHING = MultiChatState.WATCHING;
       ointArray[wATCHING.ordinal()] = 2;
       MultiChatState cHATTING = MultiChatState.CHATTING;
       ointArray[cHATTING.ordinal()] = 3;
       ointArray = new int[MultiChatState.values().length];
       a.b = ointArray;
       ointArray[iDLE.ordinal()] = 1;
       ointArray[wATCHING.ordinal()] = 2;
       ointArray[cHATTING.ordinal()] = 3;
    }
}
