package eub.j;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.lang.Enum;

public final class j	// class@00282a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PostStatus.values().length];
       j.a = ointArray;
       ointArray[PostStatus.ENCODE_CANCELED.ordinal()] = 1;
       ointArray[PostStatus.UPLOAD_CANCELED.ordinal()] = 2;
       ointArray[PostStatus.ENCODE_FAILED.ordinal()] = 3;
       ointArray[PostStatus.UPLOAD_FAILED.ordinal()] = 4;
       ointArray[PostStatus.UPLOAD_COMPLETE.ordinal()] = 5;
    }
}
