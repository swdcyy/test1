package com.kwai.framework.network.keyconfig.degrade.DegradeConfig;
import java.lang.Object;
import com.kwai.framework.network.keyconfig.TimeRange;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pb6.n$a;
import java.util.Objects;
import pb6.n;
import java.lang.Number;
import o56.c;
import o56.a;
import ta6.a;
import android.content.SharedPreferences;
import java.lang.Boolean;
import yb6.d;

public class DegradeConfig	// class@000c3c
{
    public TimeRange apiDegradeTime;
    public List apiDelayAndRandRequestTimePolicy;
    public int blockingWaitDurationMs;
    public boolean disableAzerothSyncConfig;
    public boolean disableHomeFeedAutoRefresh;
    public boolean disableIMSDKSyncConfig;
    public boolean disableResourcePreloading;
    public boolean disableSpeedTesting;
    public boolean disableYodaSyncConfig;
    public List mApiCdnDegradePolicy;
    public ApiDegradePolicyWrapper mApiDegradePolicy;
    public List mApiMinRequestInterval;
    public List mApiProtoType;
    public boolean mDisableClientLogAbConfig;
    public boolean mDisableFlexSyncConfig;
    public boolean mDisableNebulaCheckUpdate;

    public void DegradeConfig(){
       super();
       this.disableHomeFeedAutoRefresh = false;
       this.disableSpeedTesting = false;
       this.blockingWaitDurationMs = 500;
    }
    public TimeRange a(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, this, DegradeConfig.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = n$a.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, n.class, "2");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          int i1 = 0;
          i = (!a.a().c())? 0: a.a.getInt("TestDegradePolicy", i1);
       }
       if (i == 1) {
          return new TimeRange(0, Long.MAX_VALUE);
       }else if(i == -1){
          return new TimeRange();
       }else if(this.apiDegradeTime == null){
          this.apiDegradeTime = new TimeRange();
       }
       return this.apiDegradeTime;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, DegradeConfig.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a().a(d.a())) {
          return this.disableResourcePreloading;
       }
       return false;
    }
}
