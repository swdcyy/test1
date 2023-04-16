package l79.n;
import com.yxcorp.gifshow.album.vm.viewdata.DataType;
import java.lang.Enum;

public final class n	// class@002cc7
{
    public static final int[] a;

    static {
       int[] ointArray = new int[DataType.values().length];
       n.a = ointArray;
       ointArray[DataType.IMAGE.ordinal()] = 1;
       ointArray[DataType.VIDEO.ordinal()] = 2;
       ointArray[DataType.CUSTOM.ordinal()] = 3;
    }
}
