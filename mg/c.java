package mg.c;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.lang.Enum;

public final class c	// class@0025da
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PostStatus.values().length];
       c.a = ointArray;
       ointArray[PostStatus.UPLOAD_COMPLETE.ordinal()] = 1;
       ointArray[PostStatus.UPLOAD_FAILED.ordinal()] = 2;
    }
}
