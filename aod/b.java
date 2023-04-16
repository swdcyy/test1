package aod.b;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;
import java.lang.Enum;

public final class b	// class@00020d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ItemLoadingStatus.values().length];
       b.a = ointArray;
       ointArray[ItemLoadingStatus.IDLE.ordinal()] = 1;
       ointArray[ItemLoadingStatus.ITEM_LOADING_FAILED.ordinal()] = 2;
       ointArray[ItemLoadingStatus.ITEM_LOADING.ordinal()] = 3;
       ointArray[ItemLoadingStatus.ITEM_LOADING_FINISH.ordinal()] = 4;
    }
}
