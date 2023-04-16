package bja.f0;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.lang.Enum;

public final class f0	// class@0003e4
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PostStatus.values().length];
       f0.a = ointArray;
       ointArray[PostStatus.ENCODE_FAILED.ordinal()] = 1;
       ointArray[PostStatus.UPLOAD_FAILED.ordinal()] = 2;
    }
}
