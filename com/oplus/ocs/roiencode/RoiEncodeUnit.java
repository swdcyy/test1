package com.oplus.ocs.roiencode.RoiEncodeUnit;
import java.lang.Object;
import android.content.Context;
import com.oplus.ocs.roiencode.RoiEncodeUnitClient;

public final class RoiEncodeUnit	// class@000b3a
{

    public void RoiEncodeUnit(){
       super();
    }
    public static RoiEncodeUnitClient getRoiEncodeClient(Context p0){
       return RoiEncodeUnitClient.initialize(p0);
    }
}
