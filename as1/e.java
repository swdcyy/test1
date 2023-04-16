package as1.e;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleState;
import java.lang.Enum;

public final class e	// class@00029b
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveMultiLinePuzzleState.values().length];
       e.a = ointArray;
       ointArray[LiveMultiLinePuzzleState.QUESTION.ordinal()] = 1;
       ointArray[LiveMultiLinePuzzleState.ANSWER.ordinal()] = 2;
    }
}
