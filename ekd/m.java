package ekd.m;
import android.content.Context;
import android.telephony.CellLocation;
import com.yxcorp.utility.c;
import android.telephony.gsm.GsmCellLocation;
import android.telephony.cdma.CdmaCellLocation;

public final class m	// class@000d61
{

    public static int a(Context p0){
       CellLocation uCellLocatio = c.b(p0);
       if (uCellLocatio instanceof GsmCellLocation) {
          return uCellLocatio.getLac();
       }
       if (uCellLocatio instanceof CdmaCellLocation) {
          return uCellLocatio.getNetworkId();
       }
       return -1;
    }
}
