package com.yxcorp.gifshow.retrofit.degrade.StagFactorykskernelsframeworkmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegrade;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegrade$TypeAdapter;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegradeConfig;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegradeConfig$TypeAdapter;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$TypeAdapter;

public final class StagFactorykskernelsframeworkmodel implements j	// class@00131e
{

    public void StagFactorykskernelsframeworkmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykskernelsframeworkmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == DegradeConfig$UrlDegrade.class) {
          return new DegradeConfig$UrlDegrade$TypeAdapter(p0);
       }
       if (rawType == DegradeConfig$UrlDegradeConfig.class) {
          return new DegradeConfig$UrlDegradeConfig$TypeAdapter(p0);
       }
       if (rawType == DegradeConfig.class) {
          return new DegradeConfig$TypeAdapter(p0);
       }
       return null;
    }
}
