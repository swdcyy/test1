package com.yxcorp.gifshow.featured.feedprefetcher.config.DisablePrefetchPeriodConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;

public class DisablePrefetchPeriodConfig	// class@000fb1
{
    public DisablePrefetchPeriodConfig$Period[] mDisablePrefetchPeriod;

    public void DisablePrefetchPeriodConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DisablePrefetchPeriodConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DisablePrefetchPeriodConfig{disablePrefetchPeriod="+Arrays.toString(this.mDisablePrefetchPeriod)+'}';
    }
}
