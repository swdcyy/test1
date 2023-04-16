package cb0.b;
import com.kuaishou.gifshow.smartalbum.ui.loading.SmartAlbumLoadingViewModel$EndAction;
import java.lang.Enum;

public final class b	// class@0002fe
{
    public static final int[] a;

    static {
       int[] ointArray = new int[SmartAlbumLoadingViewModel$EndAction.values().length];
       b.a = ointArray;
       ointArray[SmartAlbumLoadingViewModel$EndAction.ERROR.ordinal()] = 1;
       ointArray[SmartAlbumLoadingViewModel$EndAction.SHOULD_ANIMATE.ordinal()] = 2;
    }
}
