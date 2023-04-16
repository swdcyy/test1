package com.oplus.ocs.hyperboost.HyperBoostUnit;
import java.lang.Object;
import android.content.Context;
import com.oplus.ocs.hyperboost.HyperBoostUnitClient;

public final class HyperBoostUnit	// class@000b2a
{

    public void HyperBoostUnit(){
       super();
    }
    public static HyperBoostUnitClient getHyperBoostClient(Context p0){
       return HyperBoostUnitClient.initialize(p0);
    }
}
