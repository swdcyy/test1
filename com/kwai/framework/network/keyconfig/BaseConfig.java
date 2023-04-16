package com.kwai.framework.network.keyconfig.BaseConfig;
import java.lang.Object;
import com.kwai.framework.network.keyconfig.ApiRetryPolicy;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.network.keyconfig.degrade.DegradeConfig;
import com.yxcorp.retrofit.model.LocationConfigModel;
import vb6.a;
import com.kwai.framework.network.keyconfig.WebLocationConfigModel;
import com.google.common.base.Optional;
import java.lang.Number;
import ta6.c;
import java.lang.StringBuilder;
import q87.c;

public class BaseConfig	// class@000c15
{
    public JsonObject mAioConfig;
    public ApiRetryPolicy mApiRetryPolicy;
    public String mAzPrefix;
    public DegradeConfig mDegrade;
    public int mDnsTimeoutMs;
    public KeyConfigCdnDegrade mKeyConfigCdnDegrade;
    public KeyConfigErrorToastPolicy mKeyConfigErrorToastPolicy;
    public LocationConfigModel mLocationConfigModel;
    public WebLocationConfigModel mLocationH5Config;
    public ScheduleConfig mSchedule;
    public long mServerTimestamp;
    public String mServiceUnavailableHint;

    public void BaseConfig(){
       super();
       this.mDnsTimeoutMs = 1000;
       this.mServerTimestamp = 0;
    }
    public ApiRetryPolicy a(){
       Object obj = PatchProxy.apply(null, this, BaseConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mApiRetryPolicy == null) {
          this.mApiRetryPolicy = new ApiRetryPolicy();
       }
       return this.mApiRetryPolicy;
    }
    public String b(){
       return this.mAzPrefix;
    }
    public DegradeConfig c(){
       Object obj = PatchProxy.apply(null, this, BaseConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mDegrade == null) {
          this.mDegrade = new DegradeConfig();
       }
       return this.mDegrade;
    }
    public LocationConfigModel d(){
       BaseConfig obj = PatchProxy.apply(null, this, BaseConfig.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLocationConfigModel;
       if (obj != null) {
          obj.mBizTypeModelMap = a.a;
       }
       return obj;
    }
    public WebLocationConfigModel e(){
       return this.mLocationH5Config;
    }
    public Optional f(){
       Object obj = PatchProxy.apply(null, this, BaseConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Optional.fromNullable(this.mSchedule);
    }
    public long g(){
       Object obj = PatchProxy.apply(null, this, BaseConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.mServerTimestamp < 0) {
          Object[] objArray = new Object[0];
          c.C().t("BaseConfig", "Invalid server timestamp: "+this.mServerTimestamp, objArray);
          this.mServerTimestamp = 0;
       }
       return this.mServerTimestamp;
    }
    public String h(){
       if (this.mServiceUnavailableHint == null) {
          this.mServiceUnavailableHint = "";
       }
       return this.mServiceUnavailableHint;
    }
    public void i(long p0){
       this.mServerTimestamp = p0;
    }
}
