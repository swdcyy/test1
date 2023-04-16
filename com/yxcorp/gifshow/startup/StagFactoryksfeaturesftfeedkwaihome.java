package com.yxcorp.gifshow.startup.StagFactoryksfeaturesftfeedkwaihome;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.startup.HomeStartupPojo;
import com.yxcorp.gifshow.startup.HomeStartupPojo$TypeAdapter;

public final class StagFactoryksfeaturesftfeedkwaihome implements j	// class@001d81
{

    public void StagFactoryksfeaturesftfeedkwaihome(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftfeedkwaihome.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == HomeStartupPojo.class) {
          return new HomeStartupPojo$TypeAdapter(p0);
       }
       return null;
    }
}
