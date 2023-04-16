package dra.b;
import com.yxcorp.gifshow.growth.vfc.model.VfcActionSelector;
import java.lang.Enum;
import com.yxcorp.gifshow.growth.vfc.model.VfcInviteDialogType;

public final class b	// class@002501
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[VfcActionSelector.values().length];
       b.a = ointArray;
       ointArray[VfcActionSelector.LINK_URL.ordinal()] = 1;
       ointArray[VfcActionSelector.SHARE_TOKEN_DIALOG.ordinal()] = 2;
       ointArray[VfcActionSelector.ERROR_DIALOG.ordinal()] = 3;
       ointArray = new int[VfcInviteDialogType.values().length];
       b.b = ointArray;
       ointArray[VfcInviteDialogType.SHARE_AWARD_DIALOG.ordinal()] = 1;
       ointArray[VfcInviteDialogType.SHARE_DIALOG.ordinal()] = 2;
       ointArray[VfcInviteDialogType.ERROR_SHARE_DIALOG.ordinal()] = 3;
       ointArray[VfcInviteDialogType.NON_DIALOG.ordinal()] = 4;
    }
}
