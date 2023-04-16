package com.oplus.ocs.hyperboost.HyperBoostClientBuilder;
import com.oplus.ocs.base.common.api.Api$AbstractClientBuilder;
import android.content.Context;
import android.os.Looper;
import com.oplus.ocs.base.internal.ClientSettings;
import java.lang.Object;
import com.oplus.ocs.base.common.api.Api$Client;
import com.oplus.ocs.hyperboost.HyperBoostClient;

public class HyperBoostClientBuilder extends Api$AbstractClientBuilder	// class@000b28
{

    public void HyperBoostClientBuilder(){
       super();
    }
    public Api$Client buildClient(Context p0,Looper p1,ClientSettings p2,Object p3){
       return new HyperBoostClient(p0, p1);
    }
}
