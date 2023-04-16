package gra.i;
import com.yxcorp.gifshow.growth.vfc.model.VfcInviteSelectorType;
import java.lang.Enum;

public final class i	// class@002bb4
{
    public static final int[] a;

    static {
       int[] ointArray = new int[VfcInviteSelectorType.values().length];
       i.a = ointArray;
       ointArray[VfcInviteSelectorType.NORMAL_INVITE_TYPE.ordinal()] = 1;
    }
}
