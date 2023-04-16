package com.tachikoma.core.TKProviderCollector;
import aq8.e;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import no8.b;
import no8.c;
import no8.d;
import java.util.List;

public final class TKProviderCollector implements e	// class@000d36
{

    public void TKProviderCollector(){
       super();
    }
    public ArrayList collectProviders(){
       ArrayList obj = PatchProxy.apply(null, this, TKProviderCollector.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new b());
       obj.add(new c());
       obj.add(new d());
       return obj;
    }
    public List collectProviders(){
       return this.collectProviders();
    }
}
