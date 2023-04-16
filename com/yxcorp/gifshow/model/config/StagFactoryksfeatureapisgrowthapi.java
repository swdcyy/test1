package com.yxcorp.gifshow.model.config.StagFactoryksfeatureapisgrowthapi;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.config.UnLoginPopupConfig;
import com.yxcorp.gifshow.model.config.UnLoginPopupConfig$TypeAdapter;

public final class StagFactoryksfeatureapisgrowthapi implements j	// class@001ee1
{

    public void StagFactoryksfeatureapisgrowthapi(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeatureapisgrowthapi.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == UnLoginPopupConfig.class) {
          return new UnLoginPopupConfig$TypeAdapter(p0);
       }
       return null;
    }
}
