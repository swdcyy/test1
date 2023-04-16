package com.oplus.ocs.hyperboost.HyperBoostClient;
import com.oplus.ocs.base.common.api.BaseClient;
import android.content.Context;
import android.os.Looper;
import java.lang.String;

public class HyperBoostClient extends BaseClient	// class@000b27
{

    public void HyperBoostClient(Context p0,Looper p1){
       super(p0, p1);
    }
    public String getClientName(){
       return "HYPER_BOOST_CLIENT";
    }
}
