package com.kuaishou.growth.pendant.model.StagFactoryksfeaturesftgrowthpendantapi;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.pendant.model.PendantReportResponseV2;
import com.kuaishou.growth.pendant.model.PendantReportResponseV2$TypeAdapter;
import com.kuaishou.growth.pendant.model.PendantCommonParamsV2;
import com.kuaishou.growth.pendant.model.PendantCommonParamsV2$TypeAdapter;
import com.kuaishou.growth.pendant.model.PendantStartupResponseV2;
import com.kuaishou.growth.pendant.model.PendantStartupResponseV2$TypeAdapter;
import com.kuaishou.growth.pendant.model.PendantStartupResponse;
import com.kuaishou.growth.pendant.model.PendantStartupResponse$TypeAdapter;

public final class StagFactoryksfeaturesftgrowthpendantapi implements j	// class@00068b
{

    public void StagFactoryksfeaturesftgrowthpendantapi(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftgrowthpendantapi.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == PendantReportResponseV2.class) {
          return new PendantReportResponseV2$TypeAdapter(p0);
       }
       if (rawType == PendantCommonParamsV2.class) {
          return new PendantCommonParamsV2$TypeAdapter(p0);
       }
       if (rawType == PendantStartupResponseV2.class) {
          return new PendantStartupResponseV2$TypeAdapter(p0);
       }
       if (rawType == PendantStartupResponse.class) {
          return new PendantStartupResponse$TypeAdapter(p0);
       }
       return null;
    }
}
