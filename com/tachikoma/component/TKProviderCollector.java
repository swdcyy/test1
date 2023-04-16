package com.tachikoma.component.TKProviderCollector;
import aq8.e;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ln8.b;
import ln8.c;
import java.util.List;

public final class TKProviderCollector implements e	// class@000cd7
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
       return obj;
    }
    public List collectProviders(){
       return this.collectProviders();
    }
}
