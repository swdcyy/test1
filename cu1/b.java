package cu1.b;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkLayoutViewType;
import java.lang.Enum;

public final class b	// class@001e4e
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[LiveMultiPkLayoutViewType.values().length];
       b.a = ointArray;
       ointArray[LiveMultiPkLayoutViewType.MULTI_PK_BEST_AREA.ordinal()] = 1;
       ointArray[LiveMultiPkLayoutViewType.MULTI_PK_SELF_CELL.ordinal()] = 2;
       LiveMultiPkLayoutViewType mULTI_PK_SEL = LiveMultiPkLayoutViewType.MULTI_PK_SELF_SIMPLE_CELL;
       ointArray[mULTI_PK_SEL.ordinal()] = 3;
       ointArray[LiveMultiPkLayoutViewType.MULTI_PK_OTHER_CELL.ordinal()] = 4;
       LiveMultiPkLayoutViewType mULTI_PK_OTH = LiveMultiPkLayoutViewType.MULTI_PK_OTHER_SIMPLE_CELL;
       ointArray[mULTI_PK_OTH.ordinal()] = 5;
       ointArray[LiveMultiPkLayoutViewType.MULTI_PK_TEAM_FRAME.ordinal()] = 6;
       ointArray[LiveMultiPkLayoutViewType.MULTI_PK_SCORE_WITH_RANK.ordinal()] = 7;
       LiveMultiPkLayoutViewType mULTI_PK_SCO = LiveMultiPkLayoutViewType.MULTI_PK_SCORE_WITH_RANK_SIMPLE;
       ointArray[mULTI_PK_SCO.ordinal()] = 8;
       ointArray[LiveMultiPkLayoutViewType.MULTI_PK_SCORE_ONLY_TEXT.ordinal()] = 9;
       LiveMultiPkLayoutViewType mULTI_PK_SCO1 = LiveMultiPkLayoutViewType.MULTI_PK_SCORE_ONLY_TEXT_SIMPLE;
       ointArray[mULTI_PK_SCO1.ordinal()] = 10;
       ointArray = new int[LiveMultiPkLayoutViewType.values().length];
       b.b = ointArray;
       ointArray[mULTI_PK_SEL.ordinal()] = 1;
       ointArray[mULTI_PK_OTH.ordinal()] = 2;
       ointArray[mULTI_PK_SCO1.ordinal()] = 3;
       ointArray[mULTI_PK_SCO.ordinal()] = 4;
    }
}
