package ajc.n;
import com.yxcorp.gifshow.share.OperationModel$Type;
import java.lang.Enum;

public final class n	// class@000142
{
    public static final int[] a;

    static {
       int[] ointArray = new int[OperationModel$Type.values().length];
       n.a = ointArray;
       ointArray[OperationModel$Type.PHOTO.ordinal()] = 1;
       ointArray[OperationModel$Type.LIVE_PLAY.ordinal()] = 2;
       ointArray[OperationModel$Type.LIVE_PUSH.ordinal()] = 3;
       ointArray[OperationModel$Type.PROFILE.ordinal()] = 4;
       ointArray[OperationModel$Type.PAGE.ordinal()] = 5;
    }
}
