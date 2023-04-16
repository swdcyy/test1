package com.kuaishou.commercial.splash.record.StagFactoryksfeaturesftcommercialcommercialsplash;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.commercial.splash.record.SplashSummeryData;
import com.kuaishou.commercial.splash.record.SplashSummeryData$TypeAdapter;

public final class StagFactoryksfeaturesftcommercialcommercialsplash implements j	// class@001624
{

    public void StagFactoryksfeaturesftcommercialcommercialsplash(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftcommercialcommercialsplash.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == SplashSummeryData.class) {
          return new SplashSummeryData$TypeAdapter(p0);
       }
       return null;
    }
}
