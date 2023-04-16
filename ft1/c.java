package ft1.c;
import com.kuaishou.live.lite.pk.MultiPkGameState;
import java.lang.Enum;

public final class c	// class@00239a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[MultiPkGameState.values().length];
       c.a = ointArray;
       ointArray[MultiPkGameState.IDLE.ordinal()] = 1;
       ointArray[MultiPkGameState.VOTE.ordinal()] = 2;
       ointArray[MultiPkGameState.PUNISH.ordinal()] = 3;
       ointArray[MultiPkGameState.POST_PUNISH.ordinal()] = 4;
    }
}
