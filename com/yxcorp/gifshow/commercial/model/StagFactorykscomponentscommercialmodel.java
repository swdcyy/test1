package com.yxcorp.gifshow.commercial.model.StagFactorykscomponentscommercialmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo$TypeAdapter;

public final class StagFactorykscomponentscommercialmodel implements j	// class@001152
{

    public void StagFactorykscomponentscommercialmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentscommercialmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == SplashBaseInfo.class) {
          return new SplashBaseInfo$TypeAdapter(p0);
       }
       return null;
    }
}
