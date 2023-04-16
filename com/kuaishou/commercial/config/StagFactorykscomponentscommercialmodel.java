package com.kuaishou.commercial.config.StagFactorykscomponentscommercialmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.commercial.config.StartUpAdConfig$IdMapping;
import com.kuaishou.commercial.config.StartUpAdConfig$IdMapping$TypeAdapter;
import com.kuaishou.commercial.config.StartUpAdConfig;
import com.kuaishou.commercial.config.StartUpAdConfig$TypeAdapter;

public final class StagFactorykscomponentscommercialmodel implements j	// class@0014a0
{

    public void StagFactorykscomponentscommercialmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentscommercialmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == StartUpAdConfig$IdMapping.class) {
          return new StartUpAdConfig$IdMapping$TypeAdapter(p0);
       }
       if (rawType == StartUpAdConfig.class) {
          return new StartUpAdConfig$TypeAdapter(p0);
       }
       return null;
    }
}
