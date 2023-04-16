package com.kwai.framework.network.keyconfig.degrade.StagFactorykskernelsframeworknetworknetworkcore;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.network.keyconfig.degrade.DegradeConfig;
import com.kwai.framework.network.keyconfig.degrade.DegradeConfig$TypeAdapter;
import pb6.f;
import com.kwai.framework.network.keyconfig.degrade.ApiRequestIntervalPolicy$TypeAdapter;
import pb6.e;
import com.kwai.framework.network.keyconfig.degrade.ApiProtoType$TypeAdapter;
import com.kwai.framework.network.keyconfig.degrade.ApiDegradePolicyWrapper;
import com.kwai.framework.network.keyconfig.degrade.ApiDegradePolicyWrapper$TypeAdapter;
import pb6.c;
import com.kwai.framework.network.keyconfig.degrade.ApiDegradePolicy$TypeAdapter;
import pb6.a;
import com.kwai.framework.network.keyconfig.degrade.ApiCdnFallbackPolicy$TypeAdapter;

public final class StagFactorykskernelsframeworknetworknetworkcore implements j	// class@000c3f
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
       if (rawType == DegradeConfig.class) {
          return new DegradeConfig$TypeAdapter(p0);
       }
       if (rawType == f.class) {
          return new ApiRequestIntervalPolicy$TypeAdapter(p0);
       }
       if (rawType == e.class) {
          return new ApiProtoType$TypeAdapter(p0);
       }
       if (rawType == ApiDegradePolicyWrapper.class) {
          return new ApiDegradePolicyWrapper$TypeAdapter(p0);
       }
       if (rawType == c.class) {
          return new ApiDegradePolicy$TypeAdapter(p0);
       }
       if (rawType == a.class) {
          return new ApiCdnFallbackPolicy$TypeAdapter(p0);
       }
       return null;
    }
}
