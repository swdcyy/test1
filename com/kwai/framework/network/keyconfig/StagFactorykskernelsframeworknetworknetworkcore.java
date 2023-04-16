package com.kwai.framework.network.keyconfig.StagFactorykskernelsframeworknetworknetworkcore;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.network.keyconfig.WebLocationConfigModel;
import com.kwai.framework.network.keyconfig.WebLocationConfigModel$TypeAdapter;
import com.kwai.framework.network.keyconfig.TimeRange;
import com.kwai.framework.network.keyconfig.TimeRange$TypeAdapter;
import com.kwai.framework.network.keyconfig.KeyConfigErrorToastPolicy;
import com.kwai.framework.network.keyconfig.KeyConfigErrorToastPolicy$TypeAdapter;
import com.kwai.framework.network.keyconfig.KeyConfigCdnDegrade;
import com.kwai.framework.network.keyconfig.KeyConfigCdnDegrade$TypeAdapter;
import com.kwai.framework.network.keyconfig.BaseConfig;
import com.kwai.framework.network.keyconfig.BaseConfig$TypeAdapter;
import com.kwai.framework.network.keyconfig.ApiRetryPolicy;
import com.kwai.framework.network.keyconfig.ApiRetryPolicy$TypeAdapter;

public final class StagFactorykskernelsframeworknetworknetworkcore implements j	// class@000c1c
{

    public void StagFactorykskernelsframeworknetworknetworkcore(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykskernelsframeworknetworknetworkcore.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == WebLocationConfigModel.class) {
          return new WebLocationConfigModel$TypeAdapter(p0);
       }
       if (rawType == TimeRange.class) {
          return new TimeRange$TypeAdapter(p0);
       }
       if (rawType == KeyConfigErrorToastPolicy.class) {
          return new KeyConfigErrorToastPolicy$TypeAdapter(p0);
       }
       if (rawType == KeyConfigCdnDegrade.class) {
          return new KeyConfigCdnDegrade$TypeAdapter(p0);
       }
       if (rawType == BaseConfig.class) {
          return new BaseConfig$TypeAdapter(p0);
       }
       if (rawType == ApiRetryPolicy.class) {
          return new ApiRetryPolicy$TypeAdapter(p0);
       }
       return null;
    }
}
