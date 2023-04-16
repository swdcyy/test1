package com.oplus.ocs.roiencode.RoiEncodeClientBuilder;
import com.oplus.ocs.base.common.api.Api$AbstractClientBuilder;
import android.content.Context;
import android.os.Looper;
import com.oplus.ocs.base.internal.ClientSettings;
import java.lang.Object;
import com.oplus.ocs.base.common.api.Api$Client;
import com.oplus.ocs.roiencode.RoiEncodeClient;

public class RoiEncodeClientBuilder extends Api$AbstractClientBuilder	// class@000b39
{

    public void RoiEncodeClientBuilder(){
       super();
    }
    public Api$Client buildClient(Context p0,Looper p1,ClientSettings p2,Object p3){
       return new RoiEncodeClient(p0, p1);
    }
}
