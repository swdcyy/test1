package com.kuaishou.ark.rtx.TKProviderCollector;
import aq8.e;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ir.a;
import ir.b;
import java.util.List;

public final class TKProviderCollector implements e	// class@000f8d
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
       obj.add(new a());
       obj.add(new b());
       return obj;
    }
    public List collectProviders(){
       return this.collectProviders();
    }
}
