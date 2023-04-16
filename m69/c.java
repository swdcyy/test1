package m69.c;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import java.lang.Enum;

public final class c	// class@002e13
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AICutErrorCode.values().length];
       c.a = ointArray;
       ointArray[AICutErrorCode.DOWNLOAD_MUSIC_FAILED.ordinal()] = 1;
       ointArray[AICutErrorCode.DOWNLOAD_STYLE_FAILED.ordinal()] = 2;
       ointArray[AICutErrorCode.NO_META_DATA.ordinal()] = 3;
       ointArray[AICutErrorCode.DOWNLOAD_YCNN_FAILED.ordinal()] = 4;
       ointArray[AICutErrorCode.TRANS_CODE_FAILED.ordinal()] = 5;
    }
}
