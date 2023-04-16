package gra.k;
import com.yxcorp.gifshow.growth.vfc.model.VfcInviteSelectorType;
import java.lang.Enum;

public final class k	// class@002bb7
{
    public static final int[] a;

    static {
       int[] ointArray = new int[VfcInviteSelectorType.values().length];
       k.a = ointArray;
       ointArray[VfcInviteSelectorType.NORMAL_INVITE_TYPE.ordinal()] = 1;
    }
}
