package gra.c;
import com.yxcorp.gifshow.growth.vfc.model.VfcBtnActionType;
import java.lang.Enum;

public final class c	// class@002ba6
{
    public static final int[] a;

    static {
       int[] ointArray = new int[VfcBtnActionType.values().length];
       c.a = ointArray;
       ointArray[VfcBtnActionType.OPEN_LIVE_CAR.ordinal()] = 1;
       ointArray[VfcBtnActionType.JUMP_LINK_URL.ordinal()] = 2;
    }
}
