package com.oplus.ocs.roiencode.RoiEncodeClient;
import com.oplus.ocs.base.common.api.BaseClient;
import android.content.Context;
import android.os.Looper;
import java.lang.String;

public class RoiEncodeClient extends BaseClient	// class@000b38
{

    public void RoiEncodeClient(Context p0,Looper p1){
       super(p0, p1);
    }
    public String getClientName(){
       return "ROI_CLIENT";
    }
}
