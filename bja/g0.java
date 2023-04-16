package bja.g0;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.lang.Enum;

public final class g0	// class@0003e6
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PostStatus.values().length];
       g0.a = ointArray;
       ointArray[PostStatus.ENCODE_FAILED.ordinal()] = 1;
       ointArray[PostStatus.UPLOAD_FAILED.ordinal()] = 2;
       ointArray[PostStatus.UPLOAD_COMPLETE.ordinal()] = 3;
       ointArray[PostStatus.ENCODE_CANCELED.ordinal()] = 4;
       ointArray[PostStatus.UPLOAD_CANCELED.ordinal()] = 5;
    }
}
