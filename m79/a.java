package m79.a;
import com.yxcorp.gifshow.album.IAlbumMainFragment$IPreviewIntentConfig$LaunchType;
import java.lang.Enum;

public final class a	// class@002e20
{
    public static final int[] a;

    static {
       int[] ointArray = new int[IAlbumMainFragment$IPreviewIntentConfig$LaunchType.values().length];
       a.a = ointArray;
       ointArray[IAlbumMainFragment$IPreviewIntentConfig$LaunchType.FRAGMENT.ordinal()] = 1;
       ointArray[IAlbumMainFragment$IPreviewIntentConfig$LaunchType.ACTIVITY.ordinal()] = 2;
    }
}
